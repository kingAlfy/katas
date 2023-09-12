package org.katas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SheepsCounter {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        int counter = 0;

        // Forma 1 - Programación funcional

        List<Boolean> arrayOfSheepsWithoutNulls = Arrays.asList(arrayOfSheeps).stream().map(n -> n != null ? n : false).collect(Collectors.toList());

        counter = (int) arrayOfSheepsWithoutNulls.stream().filter(Boolean::booleanValue).count();

        // Forma 2
        /*for (int i = 0; i < arrayOfSheeps.length; i ++){
            if (arrayOfSheeps[i] == null){
                arrayOfSheeps[i] = false;
            }
        }*/


        /*for (int i = 0; i < arrayOfSheeps.length; i ++){
            if (arrayOfSheeps[i]){
                counter++;
            }
        }*/

        return counter;
    }
}
