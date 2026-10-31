package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        for (; ; ) {
            System.out.println("1 - задание №1\n" +
                    "2 - задание №2\n" +
                    "3 - задание №3\n" +
                    "0 - выход\n" +
                    "Выберите действие: ");
            int choise = in.nextInt();

            switch (choise) {
                case 1:
                    Ticket ticket = new Ticket("Театр", 11, 300);
                    System.out.print("Введите скидку в процентах: ");
                    int disc = in.nextInt();
                    System.out.println("Билет без скидки: " + ticket.getPrice());
                    ticket.applyDiscount(disc);
                    System.out.println("Билет со скидкой: " + ticket.getPrice());
                    break;
                case 2:
                    Aircraft[] aircrafts = {
                            new Aircraft("Boing-747", 300, 1000032400),
                            new Aircraft("Boing-748", 100, 10430000),
                            new Aircraft("Boing-749", 550, 100450000),
                            new Aircraft("Boing-751", 133, 100032000),
                            new Aircraft("Boing-711", 310, 1004320000),
                            new Aircraft("Boing-99", 50, 1000234000)
                    };

                    int maxCapacity = aircrafts[0].getCapacity();
                    int maxRange = aircrafts[0].getRange();

                    int indexMaxCapacity = -1;
                    int indexMaxRange = -1;

                    for (int i = 1; i < aircrafts.length; i++) {
                        if (aircrafts[i].getCapacity() > maxCapacity) {
                            maxCapacity = aircrafts[i].getCapacity();
                            indexMaxCapacity = i;
                        }
                        if (aircrafts[i].getRange() > maxRange) {
                            maxRange = aircrafts[i].getRange();
                            indexMaxRange = i;
                        }
                    }

                    System.out.println("Самолет с максимальной вместимостью: " + aircrafts[indexMaxCapacity].getModel());
                    System.out.println("Самолет с максимальной дальностью полета: " + aircrafts[indexMaxRange].getModel());
                    break;
                case 3:
                    Payment[] payments = {
                            new Payment(33.3, PaymentMethod.CASH),
                            new Payment(53.3, PaymentMethod.CRYPTO),
                            new Payment(13.1, PaymentMethod.CASH),
                            new Payment(663.3, PaymentMethod.TRANSFER),
                            new Payment(3433.6, PaymentMethod.CARD),
                    };

                    for (Payment p : payments) {
                        if (p.getMethod() == PaymentMethod.CARD) {
                            p.displayInfo();
                        }
                    }
                    break;
                case 0:
                    return;
                default:
                    System.out.println("мимо");
                    break;
            }
        }

    }
}
