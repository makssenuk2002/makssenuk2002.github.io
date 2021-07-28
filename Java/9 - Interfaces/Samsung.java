public class Samsung implements Ecr {
    // Задаємо поля cashID і operatorName
    private int cashID;
    private String operatorName;

    // Задаємо поля totalEcrCash і totalReceiptCash
    private int totalEcrCash = 0;
    private int totalReceiptCash = 0;

    // Конструктор класу Samsung
    public Samsung(int cashID, String operatorName) {
        this.cashID = cashID;
        this.operatorName = operatorName;
    }
    
    // Відкриваємо чек
    @Override
    public void openReceipt(int reseiptID) {
        totalReceiptCash = 0;
        System.out.println("-------------------------------------");
        System.out.printf("%-14s %s%d \n","","Чек №", reseiptID);
        System.out.printf("%-14s %s%d \n","","Каса №", cashID);
        System.out.printf("%-11s %s%s \n","","Касир ", operatorName);
    }
    
    // Виводимо усі продукти з корзини
    @Override
    public void printGood(String name, int quantity, int price) {
        int totalSum = quantity * price;
        totalReceiptCash += totalSum;
        System.out.printf("%-20s %d * %d = %d \n", name, quantity, price, totalSum);
    }
    
    // Закриваємо чек
    @Override
    public void closeReceipt(int cash) {
        totalEcrCash += totalReceiptCash;
        System.out.printf("%-20s %d \n", "Сума до сплати: ", totalReceiptCash);
        System.out.printf("%-20s %d \n", "Внесено готівки: ", cash);
        int change  = cash - totalReceiptCash;
        if (change != 0) {
            System.out.printf("%-20s %d \n", "Здача: ", cash - totalReceiptCash);
        }
        System.out.printf("%-7s %s \n", "", "Дякуюємо за покупку!");
        printDelimiter();
    }
    
    // Денний звіт з поточного касового апарату
    @Override
    public int dailyReport() {
        return totalEcrCash;
    }

    // Друк друк марки апарату і роздільної лінії
    public void printDelimiter() {
        System.out.printf("%-4s %s \n","","[Касовий апарат Samsung]");
        System.out.println("-------------------------------------\n");
    }
}
