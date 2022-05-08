package bankexamp; 
import javax.ejb.Local; 
@Local 
public interface BankTransactLocal { 
    int withdraw(int amount); 
    int deposit(int amount); 
}