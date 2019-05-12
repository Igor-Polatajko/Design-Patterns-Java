package creational.factoryMethod;

import creational.factoryMethod.models.MobilePhone;

public interface IMobilePhoneFactory {
    MobilePhone createPhone(String brand);
}
