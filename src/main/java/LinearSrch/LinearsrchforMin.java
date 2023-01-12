package LinearSrch;

public class LinearsrchforMin {
    public static void main(String[] args) {
        int[] arr={1,44,33,11,7,99,4};
        System.out.println(srchforMin(arr));
    }

    private static int srchforMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for(int n: arr){
            if(n < min){
                min = n;
            }
        }
        return min;
    }
}
