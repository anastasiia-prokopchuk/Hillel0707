package Homeworks.Test22;

import java.util.Scanner;

public class LegalEntity extends Client {


    public LegalEntity(double accountSum) {
        super(accountSum);
    }

    int withdrawalFeePercentage = 1;
    int refillFeePercentage = 0;

    @Override
    void refillAccount() {
        System.out.print("Введите сумму пополнения: ");
        int refillSum = new Scanner(System.in).nextInt();
        accountSum += refillSum * (1 - refillFeePercentage * 0.01);
    }

    @Override
    void withdrawalFromAccount() {
        System.out.print("Введите сумму снятия: ");
        int withdrawalSum = new Scanner(System.in).nextInt();
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
