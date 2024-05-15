////////////////////////////////////////////////////////////////////
// Yuri Lunardon 2079244
// Andrea Perozzo 2082849
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import java.lang.StringBuilder;

public class IntegerToRoman {
    public static String convert(int number) {
        StringBuilder romanNumber = new StringBuilder();

        if (number > 0) {
            while(number > 0) {
            romanNumber.append("I");
            number--;
            }
        
        return romanNumber.toString();
        }

    return "";
   }
 }