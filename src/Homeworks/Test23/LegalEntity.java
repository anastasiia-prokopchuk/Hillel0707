package Homeworks.Test23;

import java.util.Scanner;

public class LegalEntity extends Client {


    public LegalEntity(double accountSum) {
        super(accountSum);
    }

    double withdrawalFeePercentage = 1;
    double refillFeePercentage = 0;

    @Override
    void refillAccount() {
        System.out.print("Введите сумму пополнения: ");
        double refillSum = new Scanner(System.in).nextDouble();
        accountSum += refillSum * (1 - refillFeePercentage * 0.01);
    }

    @Override
    void withdrawalFromAccount() {
        System.out.print("Введите сумму снятия: ");
        double withdrawalSum = new Scanner(System.in).nextDouble();
        accountSum -= withdrawalSum * (1 - withdrawalFeePercentage * 0.01);
    }

    @Override
    void printBalance() {
        System.out.println("На вашем счету " + accountSum + " грн.");
    }

    @Override
    void printTerms() {
        System.out.println("Процент комиссии на пополнение - " + refillFeePercentage + "%");
        System.out.println("Процент комиссии на вывод - " + withdrawalFeePercentage + "%");
        printBalance();
    }
}
