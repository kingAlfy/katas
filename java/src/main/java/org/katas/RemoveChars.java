package org.katas;

public class RemoveChars {
    public static String remove(String str) {

        // Creación de un array con las letras de la palabra
        char[] charArray = str.toCharArray();

        // Creación de un array con las letras de la palabra final
        char[] charsToConvertToString = new char[charArray.length-2];

        // Añadimos las letras que necesitamos en el array que convertiremos a string
        for (int i = 1; i < charArray.length-1; i++ ){
            charsToConvertToString[i-1] = charArray[i];
        }

        // Convertimos el array de letras en una palabra
        String finalString = String.valueOf(charsToConvertToString);

        return finalString;
    }
}