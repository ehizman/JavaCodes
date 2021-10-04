package chapterFifteen.fileMatching;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.*;

public class FileMatch {
    static Formatter formatterToMasterFile;

    static {
        try {
            formatterToMasterFile = new Formatter("/home/ehizman/IdeaProjects/Dietel-How-To-Program-In-Java/src" +
                    "/chapterFifteen/fileMatching/newmast.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    static Formatter formatterToLogFile;

    static {
        try {
            formatterToLogFile = new Formatter("/home/ehizman/IdeaProjects/Dietel-How-To-Program-In-Java/src" +
                    "/chapterFifteen/fileMatching/log.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public FileMatch() {
    }

    private static List<TransactionRecord> readTransactionRecord() throws IOException {
        Scanner transRecordReader = new Scanner(Paths.get("/home/ehizman/IdeaProjects/Dietel-How-To-Program-In-Java" +
                "/src" +
                "/chapterFifteen/fileMatching/trans.txt"));
        List<TransactionRecord> transactionRecordList = new ArrayList<>();
        while(transRecordReader.hasNext()){
            int accountNumber = transRecordReader.nextInt();
            double transactionAmount = transRecordReader.nextDouble();
            TransactionRecord transactionRecord = new TransactionRecord(accountNumber, transactionAmount);
            transactionRecordList.add(transactionRecord);
        }
        transRecordReader.close();
        return transactionRecordList;
    }


    private static List<Account> readMasterFile() throws IOException {
        Scanner masterRecordReader = new Scanner(Paths.get("/home/ehizman/IdeaProjects/Dietel-How-To-Program-In-Java" +
                "/src" +
                "/chapterFifteen/fileMatching/oldmast.txt"));
        List<Account> listOfAccounts = new ArrayList<>();
        while ((masterRecordReader.hasNext())){
            Account account = new Account();
            account.setAccount(masterRecordReader.nextInt());
            account.setFirstName(masterRecordReader.next());
            account.setLastName(masterRecordReader.next());
            account.setBalance(masterRecordReader.nextDouble());
            listOfAccounts.add(account);
        }

        masterRecordReader.close();
        return listOfAccounts;
    }

    public static void main(String[] args) throws IOException {
        List<Account> listOfAccounts = readMasterFile();
        List<TransactionRecord> listOfTransactionRecords = readTransactionRecord();
        for (TransactionRecord record: listOfTransactionRecords) {
            boolean isFound = false;
            for (Account account: listOfAccounts) {
                if (record.getAccountNumber() == account.getAccount()){
                    account.combine(record);
                    isFound = true;
                }
            }
            if(!isFound){
                formatterToLogFile.format("%3d %.2f%n", record.getAccountNumber(), record.getAmount());
            }
        }
        for (Account account: listOfAccounts) {
            formatterToMasterFile.format("%3d %15s %.2f%n", account.getAccount(),
                    account.getFirstName() + " " + account.getLastName(), account.getBalance());
        }
        formatterToLogFile.close();
        formatterToMasterFile.close();
    }
}