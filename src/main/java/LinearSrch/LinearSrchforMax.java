package LinearSrch;

public class LinearSrchforMax {
    public static void main(String[] args) {
        int[] arr={5,44,77,33,88,11,55,9};
        System.out.println(srchforMax(arr));
    }

    private static int srchforMax(int[] arr) {
        int max = 0;
        for(int n: arr){
            if(n > max){
                max = n;
            }
        }
        return max;
    }
}
