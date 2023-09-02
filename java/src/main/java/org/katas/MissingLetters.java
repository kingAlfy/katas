package org.katas;

public class MissingLetters {
    public static char findMissingLetter(char[] array)
    {
        char missingLetter = 0;

        for ( int i = 0; i < array.length; i++){
            if ( array[i+1] != array[i] + 1){
                missingLetter = (char) (array[i] + 1);
                break;
            }
        }
        return missingLetter;
    }

}
