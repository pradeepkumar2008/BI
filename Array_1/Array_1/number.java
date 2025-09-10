package Array.Array_Level1;
import java.util.Scanner;
public class number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = new int[5];
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < nums.length; i++)
        {
            nums[i] = input.nextInt();
        }
        for (int num : nums)
        {
            if (num > 0)
            {
                if (num % 2 == 0)
                {
                    System.out.println(num + " is a positive even number.");
                }
                else
                {
                    System.out.println(num + " is a positive odd number.");
                }
            }
            else if (num < 0)
            {
                System.out.println(num + " is a negative number.");
            }
            else
            {
                System.out.println(num + " is zero.");
            }
        }
        int first = nums[0];
        int last = nums[nums.length - 1];
        if (first > last) {
            System.out.println(first +" is greater than the last element " + last);
        }
        else if (first < last)
        {
            System.out.println(first + " is less than the last element " + last);
        }
        else
        {
            System.out.println(first +" is equal to the last element " + last);
        }
    }
}
