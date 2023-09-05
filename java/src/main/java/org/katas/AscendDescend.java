package org.katas;

public class AscendDescend {
    public static String ascendDescend(int length, int minimum, int maximum) {

        if (minimum > maximum || length == 0){
            return "";
        }

        String finalNumber = "";

        if (minimum == maximum) {
            for (int i = 0; i < length; i++){
                finalNumber += String.valueOf(minimum);
            }
        }

        while ( finalNumber.toCharArray().length < length){

            // Ascendente
            for (int j = minimum; j < maximum; j++) {
                finalNumber += String.valueOf(j);
            }

            // Descendente
            for (int x = maximum; x > minimum; x--){
                finalNumber += String.valueOf(x);
            }
        }

        finalNumber = finalNumber.substring(0, length);


        /*
        boolean asc = true;
        int number = minimum;
        for(int i = 0 ; i < length ;i++){
            finalNumber += asc ? number++ : number --;
            if (number>=maximum || number <= minimum) asc = !asc;
        }*/

        return finalNumber;
    }
}