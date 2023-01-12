package LinearSrch;

public class LinearsrchinString {
    public static void main(String[] args) {
        char[] arr = {'w','t','y','z'};
        char target = 'z';
        System.out.println(lSrch(arr,target));
    }

    private static int lSrch(char[] arr, char target) {
        for(int i = 0; i<arr.length; i++){
            if(target == arr[i]){
                return i;
            }
        }
        return -1;
    }
}
