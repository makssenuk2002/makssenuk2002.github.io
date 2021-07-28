public interface Ecr {
    // Методи інтерфейса
    void openReceipt(int reseiptID);
    void printGood(String name, int quantity, int price);
    void closeReceipt(int cash);
    int dailyReport();
}