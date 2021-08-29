package chapterFifteen.fileMatching;

import lombok.Data;


@Data
public class TransactionRecord {
    private int accountNumber;
    private double amount;
    public TransactionRecord(int accountNumber, double amount){
        this.accountNumber = accountNumber;
        this.amount = amount;
    }
    public String toString(){
        return this.accountNumber + " " + this.amount;
    }
}
