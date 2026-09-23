/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity_01;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
/**
 *
 * @author Moiz
 */
public class Part_A {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;        
    }
 
    // ---------- Part B: Binary Search ----------
    
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
 
        while (low <= high) {
            int mid = (low + high) / 2;
 
            if (arr[mid] == target) {
                return mid;             
            } else if (arr[mid] < target) {
                low = mid + 1;         
            } else {
                high = mid - 1;        
            }
        }
        return -1;                     
    }
 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.print("Enter the size of an Array:  ");
        int size = sc.nextInt();
         int[] linearArray = new int[size];
        for (int i = 0; i < size; i++) {
            linearArray[i] = rand.nextInt(500) + 1;
        }
 
        int[] binaryArray = linearArray.clone();
        Arrays.sort(binaryArray);
 
        System.out.println("\nUnsorted Array :  " + Arrays.toString(linearArray));
        System.out.println("Sorted (for Binary Search): " + Arrays.toString(binaryArray));
 
      
        System.out.print("\nEnter target value to search: ");
        int target = sc.nextInt();
 
        int linearResult = linearSearch(linearArray, target);
        int binaryResult = binarySearch(binaryArray, target);
 
        System.out.println();
        System.out.println("Target value: " + target);
 
        if (linearResult != -1) {
            System.out.println("Linear Search: Found at index " + linearResult);
        } else {
            System.out.println("Linear Search: Not found");
        }
 
        if (binaryResult != -1) {
            System.out.println("Binary Search: Found at index " + binaryResult);
        } else {
            System.out.println("Binary Search: Not found");
        }
 
        System.out.println();
        System.out.println("Why Binary Search needs a sorted array:");
        System.out.println("Binary Search decides whether to go left or right by comparing");
        System.out.println("the target with the middle element. That decision is only valid");
        System.out.println("if everything to the left is smaller and everything to the right");
        System.out.println("is larger, i.e. the array is sorted. On an unsorted array it could");
        System.out.println("skip over the target and give a wrong (or missed) result.");
 
        sc.close();
    }
}