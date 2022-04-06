package com.bridgelabz;

public class Gambler {

    public static final int AMOUNT =100;
    public static final int BET=1;

    public static void main(String[] args) {
        int won = 0;
        int bet = (int) (Math.floor(Math.random()*10)%2);
        if(bet ==1){
            System.out.println("You Won 1$");
            System.out.println("Initial Stake is: $" +AMOUNT+",Won 1$"+" and Total is 100$");
        }
        else{
            System.out.println("You Lost 1$");
            System.out.println("Initial Stake is: $" +AMOUNT+",Lost 1$"+" and Total is 99$");
        }


    }
}
