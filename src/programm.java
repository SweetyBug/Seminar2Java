public class programm {
    public static void main(String[] args) {
        int[] nums = new int[] {1,7,3,6,5,6};
        for (int i = 0; i < nums.length; i++ ) {
            if (i != 0) {
                int sumDo = 0;
                int sumPo = 0;
                for (int j = 0; j < i; j++) {
                    sumDo += nums[j];
                }
                for (int k = i+1; k < nums.length; k++) {
                    sumPo += nums[k];
                }
                if (sumDo == sumPo) {
                    System.out.println(i);
                }
            }
        }
    }
}
