package dsa.sort;

public class BubbleSort {
    public static void main(String[] args) {
         int nums[] = {6, 5, 2, 8, 9, 4};
         int temp = 0;

         System.out.println("Before sorting");
         for(int num : nums) {
             System.out.print(num + " ");
         }

         for (int i = 0; i < nums.length; i++) {
             for (int j = 0; j < nums.length - i - 1; j++) {
                 if (nums[j] > nums[j + 1]) {
                     temp = nums[j];
                     nums[j] = nums[j + 1];
                     nums[j + 1] = temp;
                 }
             }
         }

        System.out.println("\nAfter sorting");
        for(int num : nums) {
            System.out.print(num + " ");
        }
    }
}
