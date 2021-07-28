public class CashierARM {
    // Універсально підключаємо касові апарати
    private Ecr ecr;

    // Створюємо масив товарів
    private Good[] goodsForSale;

    // Створюємо двовимірний масив для товарів вибраних покупцем
    private int[][] userGoods;
    private int userGoodsCount;

    // Айдішнік чеку
    private int receiptID;

    // Реалізуємо масив товарів
    public CashierARM() {
        receiptID = 0;
        goodsForSale = new Good[4];

        // Заповнюємо товарами
        goodsForSale[0] = new Good(17, "Апельсини");
        goodsForSale[1] = new Good(54, "Фісташки");
        goodsForSale[2] = new Good(26, "Молоко");
        goodsForSale[3] = new Good(12, "Вода");
    }

    // Підключення апарату
    public void connectErc(Ecr newEcr) {
        receiptID = 0;
        ecr = newEcr;
    }

    // Фінальний друк чеку
    public void printReceipt(int cash) {
        ecr.openReceipt(receiptID);
        for (int[] userGoods : userGoods) {
            Good good = goodsForSale[userGoods[0]];
            int quantity = userGoods[1];
            if (quantity != 0) {
                ecr.printGood(good.getName(), quantity, good.getPrice());
            }
        }
        ecr.closeReceipt(cash);
    }

    // Звіт
    public int doReport() {
        return ecr.dailyReport();
    }

    // Метод додавання товару
    public void addGoodsToBascket(int id, int quantity) {
        userGoods[userGoodsCount] [0] = id;
        userGoods[userGoodsCount] [1] = quantity;
        userGoodsCount++;
    }

    // Новий покупець
    public void newBuyer() {
        receiptID++;
        userGoodsCount = 0;
        userGoods = new int[4][2];
    }
}