package org.example;

public class Payment {
    private double amount;
    private PaymentMethod method;

    public double getAmoint() {
        return amount;
    }

    public void setAmoint(double amoint) {
        this.amount = amoint;
    }

    public PaymentMethod getMethod() {
        return method;
    }

    public void setMethod(PaymentMethod method) {
        this.method = method;
    }

    public Payment() {
    }

    public Payment(double amount, PaymentMethod method) {
        this.amount = amount;
        this.method = method;
    }

    public void displayInfo() {
        System.out.println("Количество: " + amount +
                "\nСпособ оплаты: " + this.method.toString());
    }
}
