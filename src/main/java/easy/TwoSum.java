package easy;


/*
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 */


public class TwoSum {
    public static void main(String[] args) {
        int [] nums = {3, 3};
        int target = 6;
        int [] result = {0, 1};
        for (int i=0; i<nums.length; i++) {
            for (int j=i+1; j<nums.length; j++) {
                if (nums[i]+nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        for (int i : result) System.out.print(i + " ");
    }
}
