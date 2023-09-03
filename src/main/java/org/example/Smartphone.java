package org.example;
//Define a Smartphone class that implements Cloneable and has:
//
//5 attributes:
//a string brandName
//a string modelName
//an int batterymAh
//an attribute producerPrice of type SmartphonePrice
//an attribute retailPrice of type SmartphonePrice
//[using IntelliJ] an override of the toString() method in order to print all the attributes of a Smartphone object
//[using IntelliJ] an override of the equals() method that check all the 5 attributes to establish if two Smartphone objects are equal
//[using IntelliJ] an override of the hashCode(), using all the 5 attributes
//[using IntelliJ] an override of the clone() method (that will have to be public) where:
//a clonedSmartphone is generated using super.clone()
//there's an assignment to the clonedSmartphone.producerPrice
//there's an assignment to the clonedSmartphone.retailPrice
//the return value is a Smartphone object
//a constructor method that accepts 5 params (brand, model, battery, prodP, retailP) and assign the right values to the object
class Smartphone implements Cloneable {
 protected String brandName;
 protected String modelName;
 protected int battery;
 protected SmartphonePrice producerPrice;
 protected SmartphonePrice retailPrice;
    public Smartphone(String brandName, String modelName, int battery, SmartphonePrice producerPrice, SmartphonePrice retailPrice) {
        this.brandName = brandName;
        this.modelName = modelName;
        this.battery = battery;
        this.producerPrice = producerPrice;
        this.retailPrice = retailPrice;
    }



    @Override
    public int hashCode() {
        int result = brandName.hashCode();
        result = 17 * result+ modelName.hashCode();
        result = 17 * result+ battery;
        result = 17 * result+ producerPrice.hashCode();
        result = 17 * result+ retailPrice.hashCode();
    return result ;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Smartphone smartphone = (Smartphone) obj;
        return battery == smartphone.battery &&
                brandName.equals(smartphone.brandName) &&
                modelName.equals(smartphone.modelName) &&
                producerPrice.equals(smartphone.producerPrice) &&
                retailPrice.equals(smartphone.retailPrice);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Smartphone clonedSmartphone = (Smartphone) super.clone();
        clonedSmartphone.producerPrice = (SmartphonePrice) this.producerPrice.clone();
        clonedSmartphone.retailPrice = (SmartphonePrice) this.retailPrice.clone();
        return clonedSmartphone;
    }

    @Override
    public String toString() {
        return   brandName + ", model name is " + modelName+
                " and the capacity of the battery is " + battery + " mAh." + "\n"
                ;
    }


}

