/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg170915;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author Anthony
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Locale[] myLocales;
//        myLocales = Locale.getAvailableLocales();
//        System.out.println(myLocales.length);
//        for (int x = 0; x < myLocales.length; x++){
//            System.out.println(x +": " + myLocales[x]);
//        }//end locales for
        NumberFormat nf, df, ff, cnf, cdf, cff;
        double number;
        DateFormat dnf, ddf, dff;
        Date today = new Date();
        
        
        

        Locale myLocale = Locale.getDefault();
        System.out.println(myLocale);
//        number = 1234567.89;
        number = 1_234_567.89;
        System.out.println(number);
        
        nf = NumberFormat.getNumberInstance();
        nf.setMaximumFractionDigits(3);
        nf.setMinimumFractionDigits(3);
        dnf = DateFormat.getDateInstance(DateFormat.FULL);
        
        cnf = NumberFormat.getCurrencyInstance();
        System.out.println(nf.format(number));
        System.out.println(cnf.format(number));
        System.out.println(dnf.format(today));
        
        
        Locale.setDefault(Locale.GERMANY);
        df = NumberFormat.getNumberInstance();
        ddf = DateFormat.getDateInstance(DateFormat.FULL);
        cdf = NumberFormat.getCurrencyInstance();
                
        System.out.println(df.format(number));
        System.out.println(cdf.format(number));
        System.out.println(ddf.format(today));
        
        Locale.setDefault(Locale.FRANCE);
        ff = NumberFormat.getInstance(Locale.FRANCE);
        dff = DateFormat.getDateInstance(DateFormat.FULL);
        cff = NumberFormat.getCurrencyInstance();
        System.out.println(ff.format(number));
        System.out.println(cff.format(number));
        System.out.println(dff.format(today));
        
        System.out.println("Joe\t\t45");
        System.out.println("Jim\t\t65");
        System.out.println("Hortense\t\t75");

    }

}
