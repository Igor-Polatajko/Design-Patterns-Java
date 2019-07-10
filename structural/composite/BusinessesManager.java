package structural.composite;

import java.util.ArrayList;

public class BusinessesManager implements Business {

    private ArrayList<Business> businesses;

    public BusinessesManager() {
        this.businesses = new ArrayList<>();
    }

    public void addBusiness(Business business) {
        businesses.add(business);
    }

    public void removeBusiness(Business business) {
        businesses.remove(business);
    }

    @Override
    public int getDailyProfit() {
        return businesses.stream().mapToInt(Business::getDailyProfit).sum();
    }
}
