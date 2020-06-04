package com.grassfish;

public class User {


    long money = 0;
    long lastBetMoney = 1;
    boolean lastBetResult = false;
    long betCount = 0;

    public long getMoney() {
        return money;
    }
    public long getLastBetMoney() {
        return lastBetMoney;
    }

    public long getBetCount() {
        return betCount;
    }

    public void setMoney(long money) {
        this.money = money;
    }
    public void setLastBetMoney(long lastBetMoney) {
        this.lastBetMoney = lastBetMoney;
    }


    private long countNextBetMoney(long lastBetMoney,boolean lastBetResult,long minBetMoney, long maxBetMoney){
        if (!lastBetResult)
            return minBetMoney;
        if (lastBetMoney == 0){
            return minBetMoney;
        }else if (lastBetMoney*3<=maxBetMoney)
            return lastBetMoney*3;
        else
            return minBetMoney;
    }

    public long payforBet(){
        long betmoney = countNextBetMoney(lastBetMoney,lastBetResult,1,729);
        if (betmoney<=money){
            betCount++;
            System.out.println("~~~~~~第 "+ betCount +" 次Bet~~~~~~");
            lastBetMoney = betmoney;
            money = money - betmoney;
            return betmoney;
        }else {
            System.out.println("哦 莫得钱了！ 账户余额: "+this.money+" 本次理论要下注: "+betmoney);
            return 0;
        }
    }

    public void winback(long money){
        if (money > 0){
            this.money = this.money + money;
            lastBetResult = true;
            System.out.println("本次赢 "+money/2+" 账户余额 "+ this.money);
        }else {
            lastBetResult = false;
            System.out.println("本次输 "+lastBetMoney+" 账户余额 "+ this.money);
        }
    }

}
