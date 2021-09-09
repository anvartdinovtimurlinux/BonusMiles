package com.anvartdinov;

public class Main {

    public static void main(String[] args) {
        int ticketPrice = 23_999;
        int costOneMile = 20;

        int bonusMiles = ticketPrice / costOneMile;
        System.out.println("Купив билет стоимостью " + ticketPrice + "р.");
        System.out.println("Вы получите " + bonusMiles + " бонусных миль.");
    }
}
