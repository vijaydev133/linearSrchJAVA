package LinearSrch;

public class LinearsrchinString1 {
    public static void main(String[] args) {
        String a = "Vijay";
        char target = 'y';
        System.out.println(lSrch(a,target));
    }

    private static int lSrch(String a, char target) {
        for(int i = 0; i < a.length(); i++){
            if(target == a.charAt(i)){
                return i;
            }
        }
        return -1;
    }
}
