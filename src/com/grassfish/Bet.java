package com.grassfish;

public class Bet {

    public static long go(long money){

        if (ifWin()){
            System.out.println("betmoney: "+money+" 收益 "+money*2);
            return money*2;
        }else
            System.out.println("betmoney: "+money+" 收益 -"+money);
            return 0;

    }

    private static boolean ifWin(){
        return Math.random() > 0.5 ? true : false;
    }
}
