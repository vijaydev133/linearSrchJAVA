package LinearSrch;

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,21,6,7896};
        System.out.println(srch(nums));
    }

    private static int srch(int[] nums) {
        int evN = 0;

        for(int n: nums){
            int digCnt=0;

            while(n > 0){
                digCnt++;
                n = n / 10;

            }
            if(digCnt%2==0){
                evN++;
            }
        }



        return evN;
    }
}
