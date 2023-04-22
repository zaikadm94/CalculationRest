package ru.netology.javaqamvn.services;

public class CalculateService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 1; month <= 12; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                money = (money - expenses) / 3;
                System.out.println("Пойду отдыхать! После отдыха денег " + money);
            } else {
                money = money + income - expenses;
                System.out.println("месяц " + month + " денег " + money + " заработал " + income + " потратил " + threshold);
            }
        }
        return count;
    }
}