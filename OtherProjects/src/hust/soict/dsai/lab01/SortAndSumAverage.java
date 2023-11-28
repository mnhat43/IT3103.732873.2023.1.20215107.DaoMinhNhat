package hust.soict.dsai.lab01;

import java.util.Scanner;
public class SortAndSumAverage {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int n = sc.nextInt();
        System.out.println("Enter array of length " + n);
        double[] arr = new double[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextDouble();
        }
        for (int i = 0; i < n - 1; i++){
            for (int j = i; j < n; j++){
                if (arr[i] > arr[j]){
                    double temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        double sum = 0;
        for(int i = 0; i < n; i++) {
        	sum += arr[i];
        }
        double aver = sum/n;
        System.out.print("Sort array:");
        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Sum of array: " + sum);
        System.out.println("Average of array: " + aver);
        
        sc.close();

	}
}