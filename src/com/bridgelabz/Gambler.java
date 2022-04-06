package com.bridgelabz;

public class Gambler {

    public static final int AMOUNT = 100;
    public static final int BET = 1;

    public static void main(String[] args) {
        int stake = 100;
        while (stake > (0.5 * AMOUNT) && stake < (1.5 * AMOUNT)) {
            int bet = (int) (Math.floor(Math.random() * 10) % 2);
            if (bet == 1) {
                System.out.println("You Won 1$");
                System.out.println("Initial Stake is: $" + stake + ",Won 1$" + " and Total is" + "$" + (stake + BET));
                stake++;
            } else {
                System.out.println("You Lost 1$");
                System.out.println("Initial Stake is: $" + stake + ",Lost 1$" + " and Total is" + "$" + (stake - BET));
                stake--;
            }
        }
    }
}





