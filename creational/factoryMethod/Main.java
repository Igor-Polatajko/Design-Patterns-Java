package creational.factoryMethod;

import creational.factoryMethod.models.MobilePhone;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        IMobilePhoneFactory phoneFactory = new MobilePhoneFactory();

        Scanner sc = new Scanner(System.in);

        while (true) {

            MobilePhone mobilePhone = null;

            System.out.print("Enter phone brand: ");

            if (sc.hasNextLine()) {
                String brand = sc.nextLine();

                mobilePhone = phoneFactory.createPhone(brand);
            }

            if (mobilePhone != null) {
                mobilePhone.showDescription();
            }
            else {
                System.out.println("We don't have description for this phone!");
            }
        }
    }
}
