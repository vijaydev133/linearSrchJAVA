package LinearSrch;

import java.util.Arrays;

public class Linearsrchin2D {
    public static void main(String[] args) {
        int[][] arr = {
                {1,4,6,2,7},
                {44,66,24,78},
                {66,3,7}
        };
    int target = 3;
        System.out.println(Arrays.toString(srch(arr, target)));
    }

    private static int[] srch(int[][] arr, int target) {
        int a[] = new int[2];
        for(int i =0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++) {
                if(target == arr[i][j]){
                    a[0] = i;
                    a[1] = j;
                }
            }
        }
        return a;
    }
}
