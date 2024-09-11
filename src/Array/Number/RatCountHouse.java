/*
Problem Description :
The function accepts two positive integers ‘r’ and ‘unit’ and a positive integer array ‘arr’
of size ‘n’ as its argument ‘r’ represents the number of rats present in an area, ‘unit’ is
 the amount of food each rat consumes and each ith element of array ‘arr’ represents the
 amount of food present in ‘i+1’ house number, where 0 <= i

Note:

Return -1 if the array is null
Return 0 if the total amount of food from all houses is not sufficient for all the rats.
Computed values lie within the integer range.

Example:

Input:

r: 7
unit: 2
n: 8
arr: 2 8 3 5 7 4 1 2

Output : 4
 */
package Array.Number;

import java.util.Scanner;

public class RatCountHouse {

    public static int foodConsume(int arr[], int n, int r, int unit) {
        if (n == 0) return -1;

        int totalFoodRequired = r * unit;
        int tillNowFood = 0;
        int house = 0;

        for(int i = 0; i < n; i++) {
            tillNowFood += arr[i];
            if(tillNowFood >= totalFoodRequired) {
                house = i;
                break;
            }
        }

        if(tillNowFood <= totalFoodRequired) {
            return 0;
        }

        return house + 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[8];

        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();

        System.out.print("\nEnter the number of rats : ");
        int r = sc.nextInt();

        System.out.println("\nEnter the amount of food each rat consume : ");
        int unit = sc.nextInt();

        System.out.println("Emetr the amount of food present in ‘i+1’ house number : ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println(foodConsume(arr, n, r, unit));

    }
}
