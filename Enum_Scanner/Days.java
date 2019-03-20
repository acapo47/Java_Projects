/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.enums;

/**
 *
 * @author Anthony
 */
public enum Days {
    SUNDAY("Sunday", true),
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"){
        @Override
        public String toString() {
            return getDayName() + 
                    "\tBuck Night at Duffy's";
        }
        
    },
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday", true);
    
    private String dayName;
    private boolean weekEnd;

    private Days(String dayName) {
        this.dayName = dayName;
    }

    private Days(String dayName, boolean weekEnd) {
        this.dayName = dayName;
        this.weekEnd = weekEnd;
    }

    @Override
    public String toString() {
        return getDayName();
    }

    /**
     * @return the dayName
     */
    public String getDayName() {
        return dayName;
    }

    /**
     * @return the weekEnd
     */
    public boolean isWeekEnd() {
        return weekEnd;
    }

}
