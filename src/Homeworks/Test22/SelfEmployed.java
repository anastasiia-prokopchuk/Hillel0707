package Homeworks.Test22;

import java.util.Scanner;

public class SelfEmployed extends Client {
    public SelfEmployed(double accountSum) {
        super(accountSum);
    }

    double withdrawalFeePercentage = 0;
    double refillFeePercentage = 1;
    double feePercentageForLargerRefill = 0.5;
    int boundarySum = 1000;

    @Override
    void refillAccount() {
        System.out.print("Введите сумму пополнения: ");
        int refillSum = new Scanner(System.in).nextInt();

        if (refillSum < boundarySum) {
            accountSum += refillSum * (1 - refillFeePercentage * 0.01);
        } else {
            accountSum += refillSum * (1 - feePercentageForLargerRefill * 0.01);
        }
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
        System.out.println("Процент комиссии на пополнение суммы менее " + boundarySum + " грн - " + refillFeePercentage + "%");
        System.out.println("Процент комиссии на пополнение суммы более или равной " + boundarySum + " грн - " + feePercentageForLargerRefill + "%");
        System.out.println("Процент комиссии на вывод - " + withdrawalFeePercentage + "%");


        printBalance();
    }
}