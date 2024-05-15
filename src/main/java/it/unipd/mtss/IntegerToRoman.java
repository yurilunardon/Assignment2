////////////////////////////////////////////////////////////////////
// Yuri Lunardon 2079244
// Andrea Perozzo 2082849
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import java.lang.StringBuilder;
import java.lang.String;

public class IntegerToRoman {
    public static String convert(int number) {
        StringBuilder romanNumber = new StringBuilder();

        if (number > 0) {
      number = converter(number, 5, "V", romanNumber);
      number = converter(number, 4, "IV", romanNumber);
      number = converter(number, 1, "I", romanNumber);
        
        return romanNumber.toString();
        }

    return "";
   }
     private static int converter
    (int number, int top, String c, StringBuilder sb) {

    while(number/top >= 1) {
      sb.append(c);
      number -= top;
    }

    return number;
  }
 }