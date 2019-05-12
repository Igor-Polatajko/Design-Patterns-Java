package creational.factoryMethod;

import creational.factoryMethod.models.*;

public class MobilePhoneFactory implements IMobilePhoneFactory {

    public MobilePhone createPhone(String brand) {

        switch (brand) {
            case "Samsung":
                return new Samsung("S9", "Black");
            case "IPhone":
                return new IPhone("X", "White");
            case "Huawei":
                return new Huawei("p20", "Blue");
            case "Lenovo":
                return new Lenovo("k6", "White");
            default:
                return null;
        }
    }
}
