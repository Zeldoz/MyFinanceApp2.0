package zeldoz.git.uppgifter;

public interface TransactionSaver {
    void saveTransaction(TransactionSaver transaction);
    void loadTransaction(TransactionSaver transaction);
    void addTransaction(int userID);
    void deleteTransaction(int userID);
}
