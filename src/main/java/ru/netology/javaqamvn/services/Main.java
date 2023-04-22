package ru.netology.javaqamvn.services;


public class Main {
    public static void main(String[] args) {
        CalculateService services = new CalculateService();
        int result = services.calculate(10_000, 3_000, 20_000);
        System.out.println(result);
    }
}