package org.example;

////define a tester class with main() method where you:
////create 4 new SmartphonePrice objects: 2 for Producer and 2 for Retail
////create 2 new Smartphone objects, using the 4 newly created SmartphonePrice objects
////print in console all the details of the 2 newly created Smartphone objects
////check if the first smartphone is equal to the second smartphone, informing the user
////use a try{ ... } catch(Exception exception) { ... } to:
////get a new Smartphone object by cloning the second Smartphone
////print in console all the details of the newly cloned object
////check if the second smartphone is equal to the newly cloned object, informing the user
////inside the catch(Exception exception) { ... } scope:
////print the stack trace of the exception
////inform the user about the error
public class Tester {

    public static void main(String[] args) {

        SmartphonePrice smartphonePrice1 = new SmartphonePrice("Producer", 100);
        SmartphonePrice smartphonePrice2 = new SmartphonePrice("Retailer", 600);
        SmartphonePrice smartphonePrice3 = new SmartphonePrice("Producer", 200);
        SmartphonePrice smartphonePrice4 = new SmartphonePrice("Retailer", 800);
        Smartphone smartphone1 = new Smartphone("Samsung", "Galaxy S10", 3000, new SmartphonePrice("Producer", 90), new SmartphonePrice("Retailer", 300));
        Smartphone smartphone2 = new Smartphone("Samsung", "Galaxy S20", 3300, new SmartphonePrice("Producer", 300), new SmartphonePrice("Retailer", 1200));

        System.out.println(smartphone1 + smartphonePrice1.toString());
        System.out.println(smartphone2 + smartphonePrice2.toString());
        if (smartphone1.equals(smartphone2)) {
            System.out.println("The first smartphone is equal to the second smartphone");
        } else {
            System.out.println("The first smartphone is not equal to the second smartphone");
        }
        try {
            Smartphone clonedSmartphone = (Smartphone) smartphone2.clone();
            System.out.println("Cloned Smartphone: " + clonedSmartphone);

            if (smartphone2.equals(clonedSmartphone)) {
                System.out.println("The second smartphone is equal to the cloned smartphone");
            } else {
                System.out.println("The second smartphone is not equal to the cloned smartphone");
            }
        } catch (CloneNotSupportedException exception) {
            exception.printStackTrace();
            System.out.println("Error: Cloning not supported");
        }
    }

}