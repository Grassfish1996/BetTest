package com.grassfish;

import java.util.ArrayList;
import java.util.List;

public class BetStrategy {
    private Long[] betMoneyArray = null;

    public void setStrategy(long base,long min,long max,long boost){
        List<Long> betMoneyList = new ArrayList<Long>();
        for (long i = min;i<=max;i++){
            betMoneyList.add(i*boost);
        }
    }
}
