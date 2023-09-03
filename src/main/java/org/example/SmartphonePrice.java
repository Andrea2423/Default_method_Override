package org.example;

//define a SmartphonePrice class that implements Cloneable and has:
//2 attributes:
//a string priceType
//a double priceInEuros
//[using IntelliJ] an override of the clone() method (that will have to be public) where:
//a clonedSmartphonePrice is generated using super.clone()
//the return value is a SmartphonePrice object
//[using IntelliJ] an override of the toString() method for returning an informative String about the 2 SmartphonePrice attributes
//[using IntelliJ] an override of the equals() method that check the 2 attributes to establish if two SmartphonePrice objects are equal
//[using IntelliJ] an override of the hashCode(), using the 2 attributes
//a constructor method that accepts 2 params (type, price) and assign the right values to the object
public class SmartphonePrice implements Cloneable {
    protected String priceType;
    protected double priceInEuros;

    public int hashCode() {
        int result = 17; // Inizia con un valore primo, ad esempio 31 - 17
        result = 17 * result + priceType.hashCode();
        long temp = Double.doubleToLongBits(priceInEuros);
        result = 17 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        SmartphonePrice otherPrice = (SmartphonePrice) obj;
        return Double.compare(otherPrice.priceInEuros, priceInEuros) == 0 && priceType.equals(otherPrice.priceType);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "The price for " + this.priceType + " is: " + this.priceInEuros + "€";
    }

    public SmartphonePrice(String priceType, double priceInEuros) {
        this.priceType = priceType;
        this.priceInEuros = priceInEuros;

    }
}
