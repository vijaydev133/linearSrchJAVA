package LinearSrch;

public class LinearSrch1 {
    public static void main(String[] args) {
        int[] arr = {1,3,34,432,4,23,8};
        int target = 23;
        System.out.println( lSrch(arr,target));;
    }

    private static int lSrch(int[] arr, int target) {
        for(int i = 0; i < arr.length; i++){
            if(target == arr[i]){
                return i;
            }
        }
        return -1;
    }
}
