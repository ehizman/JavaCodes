package chapterFifteen.fileMatching;

import lombok.Data;
import org.assertj.core.internal.bytebuddy.dynamic.scaffold.FieldRegistry;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.Formatter;
import java.util.NoSuchElementException;
import java.util.Scanner;

@Data
public class Account implements Serializable {
    private int account;
    private String firstName;
    private String lastName;
    private double balance;

    public Account(){
        this(0, "", "",0.0);
    }

    public Account(int account, String firstName, String lastName, double balance){
        this.account = account;
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    public void combine(TransactionRecord transactionRecord){
        balance += transactionRecord.getAmount();
    }

    @Override
    public String toString() {
        return "Account{" +
                "account=" + account +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
