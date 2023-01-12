package LinearSrch;

import java.util.Arrays;

public class Linearsrch2Darr1 {
    public static void main(String[] args) {
        int[][] arr = {
                {1,4,5,3,6},
                {33,44,77,11},
                {87,96,83}
        };
        System.out.println(Arrays.toString(srch(arr)));
    }

    private static int[] srch(int[][] arr) {
        int[] a = new int[2];
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){

            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                    a[0] = i;
                    a[1] = j;
                }
            }
        }

        return a;
    }
}
