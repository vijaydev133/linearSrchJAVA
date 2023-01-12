package LinearSrch;

public class LinearSrch2 {
    public static void main(String[] args) {
        int[] arr = {1,4,21,5,26,55,7,9};
        int target = 7;
        int startI=3;
        int endI=7;
        System.out.println(lSrch(arr,startI,endI,target));
    }

    private static int lSrch(int[] arr, int startI, int endI, int target) {
        for (int i = startI; i < endI; i++) {
            if(target == arr[i]){
                return i;
            }
        }
        return -1;
    }
}
