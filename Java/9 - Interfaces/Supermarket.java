public class Supermarket {

    public static void main(String[] args) {
        // Зміні для збереження остаточних даних
        int samsungSum = 0;
        int rfSum = 0;
        int totalMoney = 0;
        CashierARM kassa = new CashierARM();

        // Підключаємо касовий апарат Samsung
	    Ecr aparatEcr = new Samsung(1, "Ivanova");
	    kassa.connectErc(aparatEcr);

        /*       Перший покупець        */
	    kassa.newBuyer();

	    // Додаємо продукти у корзину
	    kassa.addGoodsToBascket(1, 2);
	    kassa.addGoodsToBascket(2,1);
	    kassa.addGoodsToBascket(3, 8);

	    // Бюджет покупця
	    int userCash = 1000;

	    // Друк чеку
	    kassa.printReceipt(userCash);

        /*       Другий покупець        */
	    kassa.newBuyer();

	    // Додаємо продукти у корзину
        kassa.addGoodsToBascket(1, 5);
        kassa.addGoodsToBascket(3,2);
        kassa.addGoodsToBascket(2, 1);

        // Бюджет покупця
        userCash = 1500;

        // Друк чеку
        kassa.printReceipt(userCash);

        // До загальної суми додаємо поточну суму з апарату Samsung
        samsungSum += kassa.doReport();

        // Підключаємо касовий апарат RF
        aparatEcr = new RF(2, "Golovatyuk");
        kassa.connectErc(aparatEcr);

        /*       Третій покупець        */

        kassa.newBuyer();

        // Додаємо продукти у корзину
        kassa.addGoodsToBascket(2, 4);
        kassa.addGoodsToBascket(1, 3);
        kassa.addGoodsToBascket(2, 8);

        // Бюджет покупця
        userCash = 500;

        // Друк чеку
        kassa.printReceipt(userCash);

        // До загальної суми додаємо поточну суму з апарату RF
        rfSum += kassa.doReport();

        // Підсумовуємо готівку із двох апаратів
        totalMoney = samsungSum + rfSum;

        /*    Відображення статистики    */

        // Текстове відображення готівки з кожного апарату і загальну суму за робочий день
        System.out.println("Сума зароблена з Samsung: " + samsungSum);
        System.out.println("Сума зароблена з RF: " + rfSum);
        System.out.println("\n-----------------------------------------------------");
        System.out.printf("%-20s %s \n%s %d\n","","[Підсумок]", "Сума зароблена за сьогодні (з двох апаратів): ", totalMoney);
        System.out.println("-----------------------------------------------------");

    }
}
