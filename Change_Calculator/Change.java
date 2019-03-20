/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.change;

/**
 *
 * @author Anthony
 */
public enum Change {
    //HALFBUCK("Half Dollar", 50),
    QUARTER ("Quarter", 25),
    DIME ("Dime", 10),
    NICKEL ("Nickel", 5),
    PENNY ("Penny", 1);

    private int coinValue;
    private String coinName;
    
    private Change(String coinName, int coinValue) {
        this.coinName = coinName;
        this.coinValue = coinValue;
    }
    

    @Override
    public String toString() {
        return  coinName;
    }

    /**
     * @return the coinValue
     */
    public int getCoinValue() {
        return coinValue;
    }

    
    
}
