package structural.composite;

public class Client {
    public static void main(String[] args) {
        BusinessesManager businessesManager = new BusinessesManager();

        businessesManager.addBusiness(new CoffeeShop());
        businessesManager.addBusiness(new BookShop());
        businessesManager.addBusiness(new Restoraunt());

        System.out.println(businessesManager.getDailyProfit());
    }
}
