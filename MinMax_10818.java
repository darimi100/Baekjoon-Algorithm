import java.util.Scanner;

class MinMax_10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[sc.nextInt()];
        
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();
        
        int min = nums[0];
        int max = nums[0];
        for (int i = 1; i< nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        System.out.print(min + " " + max);
    }
}