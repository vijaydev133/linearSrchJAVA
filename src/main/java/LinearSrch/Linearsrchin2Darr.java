package LinearSrch;

public class Linearsrchin2Darr {
    public static void main(String[] args) {
        int[][] arr = {
                {1,5,3,7,5},
                {77,66,55,44,9},
                {65,78,45,99}
        };
        System.out.println(srchforMax(arr));
    }

    private static int srchforMax(int[][] arr) {
        int max = 0;
        for(int[] n: arr){
            for(int l: n){
                if(l > max){
                    max = l;
                }
            }
        }
        return max;
    }
}
