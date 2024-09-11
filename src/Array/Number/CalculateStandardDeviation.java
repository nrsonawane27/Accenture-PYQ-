/*
     Given an array arr of n positive integers as its argument. You are Required to calculate
     the Standard deviation of N positive integers in array and return the same.
        Standard deviation for data set arr[0], arr[1], arr[2]... is equal to the
        Sqrt {[(arr[0]-A)^2+(arr[1]-A)^2+........]/N} where A is the average of all
        The elements of the array. You are required to complete the Standard Deviation function
        which takes arr as input and returns ans
 */

package Array.Number;

public class CalculateStandardDeviation {

    public static double calSD(int arr[]) {
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        int avg = sum / n;
        int variance = 0;
        for(int i = 0; i < n; i++) {
            variance += Math.pow(arr[i] - avg , 2);
        }

        double sd = Math.sqrt(variance/n);

        return sd;
    }

    public static void main(String[] args) {
        int arr[] = {3, 8, 4, 2, 5, 6, 7};
        System.out.println(calSD(arr));

    }

}
