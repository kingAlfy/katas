package org.katas;

import java.util.Arrays;
import java.util.List;

public class TwoSum {
    public static int[] twoSum(int[] numbers, int target) {

        int[] positions = new int[2];

        int cnt = 0;
        while ( cnt < numbers.length ){
            for (int j = 0; j < numbers.length; j++){
                if (cnt == j){
                    continue;
                }

                if (numbers[cnt] + numbers[j] == target){
                    positions[0] = cnt;
                    positions[1] = j;
                    cnt = numbers.length+2;
                    break;
                }
            }

            cnt++;
        }

        return positions;
    }

}
