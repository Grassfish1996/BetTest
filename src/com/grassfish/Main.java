package com.grassfish;

public class Main {

    public static void main(String[] args) {
	// write your code here
        howLongloseAll();
    }

    public static long howLongloseAll(){
        User u = new User();
        u.setMoney(10000);
        long betMoeny = u.payforBet();
        while (betMoeny!=0&&u.betCount<100){
            long betMoneyResult = Bet.go(betMoeny);
            u.winback(betMoneyResult);
            betMoeny = u.payforBet();
        }
        return u.getBetCount();
    }
}
