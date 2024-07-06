// package Leetcode;
// import java.util.ArrayList;
// import java.util.Arrays;

// public class main {
//     static int removeme(int nums[]) {

//         int count = 0;
//         int size = nums.length;
//         int newarrayp[] = new int[size];
//         for (int i = 0; i < size; i++) {
//             for (int j = i + 1; j < size; j++) {
//                 if (nums[i] != nums[j]) {
//                     newarrayp[count++] = nums[i];
//                 }
//             }
//         }
//         System.out.println(Arrays.toString(newarrayp));
//         return 0;
//     }

//     public static void main(String[] args) {
//         int array[] = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
//         System.out.println(removeme(array));

//     }
// }

// find the find the index-

// import java.util.Scanner;

// public class main {

//     static int findtheword(String heystack, String needle) {
//         char[] heystackchar = heystack.toCharArray();
//         char[] needlehcar = needle.toCharArray();

//         for (int i = 0; i < heystack.length(); i++) {
//             for (int j = 0; j < needle.length(); j++) {
//                 if (needlehcar[j] == heystackchar[i]) {
//                     return i;
//                 }
//             }
//         }

//         return -1;
//     }

//     public static void main(String[] args) {
//         String heystack;
//         String needle;
//         Scanner in = new Scanner(System.in);
//         System.out.println("Enter heystack-> ");
//         heystack = in.nextLine();

//         System.out.println("Enter needle-> ");
//         needle = in.nextLine();

//         System.out.println(findtheword(heystack, needle));

//     }

// }

// print the 2d array in spiral order

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;

// public class main {
//     static boolean sort(int array[]) {
//         HashSet<Integer> hs = new HashSet<>();
//         for (int i = 0; i < array.length; i++) {
//             if (hs.contains(array[i])) {
//                 return true;
//             }
//             hs.add(array[i]);
//         }
//         return false;
//     }

//     public static void main(String[] args) {
//         int array[] = { 1, 1, 11, 2, 2, };
//         System.out.println(sort(array));
//     }
// }

// public class main {

//     static Boolean findsum(int num[], int num2[]) {
//         boolean status = true;
//         if (num.length == num2.length) {
//             for (int i = 0; i < num.length; i++) {
//                 if (num[i] != num2[i]) {
//                     status = false;
//                 }
//             }
//         } else {
//             return false;
//         }

//         return status;
//     }

//     public static void main(String[] args) {
//         int array[] = { 1, 2, 4 };
//         int array2[] = { 1, 2, 4 };
//         System.out.println(findsum(array, array2));
//     }
// }

// find the missing number in the array.
// eg : {1,2,4,5} , ans: 3;

// reverse a string 

// public class main {
//     static void reverse(char[] s) {
//         int start  = 0;
//         int end = s.length-1;
//         while(start>=end){
//             char temp;
//             temp = s[start];
//             s[end]=s[start];
//             s[end]=temp; 
//             start++;
//             end--;
//         }
//     }

//     public static void main(String[] args) {
//         char[] s = { 'h', 'e' };
//         reverse(s);
//     }
// }

// bubble sort{}

// public class main {

//     static int[] bubble(int array[]) {
//         for (int i = 0; i < array.length - 1; i++) {
//             boolean swapped = false; // Flag to track if swaps occurred
//             for (int j = 0; j < array.length - 1 - i; j++) {
//                 if (array[j] > array[j + 1]) {
//                     int temp = array[j]; 
//                     array[j] = array[j + 1];
//                     array[j + 1] = temp;
//                     swapped = true;
//                 }
//             }
//         }
//         return array;
//     }

//     public static void main(String[] args) {
//         int array[] = { 2, 3, 1, 4 };
//         int result[] = bubble(array);
//         for (int i = 0; i < result.length; i++) {
//             System.out.print(result[i] + " ");
//         }
//     }
// }

// public class main {
//     static int repeatingchars(String s) {
//         char[] c = s.toCharArray();
//         System.out.println(c.length + " " + s.length());
//         int count = 0;
//         for (int i = 0; i < c.length - 1; i++) {
//             if (c[i] == ' ') {
//                 continue;
//             }
//             for (int j = i + 1; j < c.length; j++) { // Changed from j < c.length - 1 to j < c.length
//                 if (c[i] == c[j]) {
//                     count++;
//                     break; // Ensure that each character is counted only once
//                 }
//             }
//         }
//         return count;

//     }

//     public static void main(String[] args) {
//         String s = "kartik doda";
//         System.out.print(repeatingchars(s)); // Expected output: 3
//     }
// }

// public class main {
//     static int[] sort(int array[]) {

//         for (int i = 0; i < array.length; i++) {
//             for (int j = 0; j < array.length; j++) {
//                 if (array[i] < array[j]) {
//                     int temp = array[i];
//                     array[i] = array[j];
//                     array[j] = temp;
//                 } else if (array[i] == array[j]) {
//                     continue;
//                 }
//             }
//         }
//         return array;
//     }

//     public static void main(String[] args) {
//         int array[] = { 2, 0, 2, 1, 1, 0 };

//         int result[] = sort(array);

//         for (int i = 0; i < result.length; i++) {
//             System.out.print(result[i] + " ");
//         }

//     }

// }

// -------------------------------------------------------------------------------

// public class main {
//     static int secondlargestelemet(int array[]) {
//         int largest = array[0];

//         for (int i = 0; i < array.length; i++) {

//             if (array[i] > largest) {
//                 largest = array[i];
//             }

//         }

//         int secondl = -1;

//         for (int i = array.length - 2; i >= 0; i--) {
//             if (array[i] > secondl && array[i] != largest) {
//                 secondl = array[i];
//             }
//         }

//         return secondl;
//     }

//     public static void main(String[] args) {
//         int array[] = { 2, 1 };

//         System.out.println(secondlargestelemet(array));
//     }
// };

// finding the secondlargest element in an array.

// public class main {

// static int findsecondsmall(int array[], int n) {
// int samllest = array[0], secondsmall = Integer.MAX_VALUE;

// for (int i = 0; i < n; i++) {
// if (array[i] < samllest) {
// secondsmall = samllest;
// samllest = array[i];
// } else if (array[i] != samllest && array[i] < secondsmall) {
// secondsmall = array[i];
// }
// }
// return secondsmall;
// }

// static int findsecondl(int array[], int n) {
// int largest = array[0], secondl = -1;

// for (int i = 0; i < n; i++) {
// if (array[i] > largest) {
// secondl = largest; // current largest;
// largest = array[i];
// } else if (array[i] < largest && array[i] > secondl) {
// secondl = array[i];
// }
// }
// return secondl;
// }

//     static int findsecondsmall(int array[], int n) {
//         int samllest = array[0], secondsmall = Integer.MAX_VALUE;

//         for (int i = 0; i < n; i++) {
//             if (array[i] < samllest) {
//                 secondsmall = samllest;
//                 samllest = array[i];
//             } else if (array[i] != samllest && array[i] < secondsmall) {
//                 secondsmall = array[i];
//             }
//         }
//         return secondsmall;
//     }

//     static int findsecondl(int array[], int n) {
//         int largest = array[0], secondl = -1;

//         for (int i = 0; i < n; i++) {
//             if (array[i] > largest) {
//                 secondl = largest; // current largest;
//                 largest = array[i];
//             } else if (array[i] < largest && array[i] > secondl) {
//                 secondl = array[i];
//             }
//         }
//         return secondl;
//     }

//     public static int[] getSecondOrderElements(int n, int[] a) {
//         int slargest = findsecondl(a, n);
//         int ssmallest = findsecondsmall(a, n);

//         a[0] = slargest;
//         a[1] = ssmallest;
//         return a;

//     }

//     public static void main(String[] args) {
//         int array[] = { 3, 4, 51, 3, 4, 5 };
//         int result[] = getSecondOrderElements(array.length, array);

//         for (int i = 0; i < result.length; i++) {
//             System.out.println(result[i]);
//         }

//     }
// }

// Remove the element from an array: 

// public class main {
//     static int getoff(int nums[], int val) {
//         int j = 0;
//         for (int i = 0; i < nums.length - 1; i++) {
//             if (nums[i] != val) {
//                 j++;
//             }
//         }
//         return j;
//     }

//     public static void main(String[] args) {
//         int array[] = { 1,2,2,3,3,4,4,5,5 };
//         // int result[] = getoff(array, 3);
//         System.out.println(getoff(array, 10));
//         // for (int i = 0; i < result.length; i++) {
//         // System.out.print(result[i] + " ");
//         // }
//     }
// }

// Left rotation by K places.

// public class main {

//     static void reverse(int arr[], int start, int end) {
//         while (start <= end) {
//             int temp = arr[start];
//             arr[start] = arr[end];
//             arr[end] = temp;
//             end--;
//             start++;
//         }
//     }

//     static int[] rightrotate(int array[], int k, int n) {
//         k = k % n; // It means: k rotations + more than n length rotations.
//         reverse(array, 0, n - 1);
//         reverse(array, 0, k - 1);
//         reverse(array, k, n - 1);

//         return array;
//     }

//     public static void main(String[] args) {
//         int arr[] = { 1, 2, 3, 4, 5, 6 };
//         Scanner in = new Scanner(System.in);
//         System.out.println("Enter K: ");
//         int k = in.nextInt();

//         int n = arr.length;
//         int result[] = rightrotate(arr, k, n);

//         for (int i = 0; i < result.length; i++) {
//             System.out.print(result[i] + " ");
//         }
//     }
// }

// Move the zeros to the end.

// public class main {
// static void swap(int arr[], int var1, int var2) {
// int temp = arr[var1];
// arr[var1] = arr[var2];
// arr[var2] = temp;
// }

// static int[] movezerostoend(int arr[], int n) {

// int j = 0;
// for (int i = 0; i < n; i++) {
// if (arr[i] != 0) {
// swap(arr, i, j);
// j++;
// }
// }
// return arr;

// }

//     public static int linearSearch(int n, int num, int[] arr) {
//         int result = 0;
//         for (int i = 0; i < n; i++) {
//             if (arr[i] == num) {
//                 result = i;
//                 break;
//             } else {
//                 result = -1;
//             }
//         }
//         return result;
//     }

//     public static void main(String[] args) {
//         int arr[] = { 1, 7, 8, 4, 1 };
//         System.out.println(linearSearch(arr.length, 1, arr));
//         // int result[] = movezerostoend(arr, arr.length);
//         // for (int i = 0; i < result.length; i++) {
//         // System.out.print(result[i] + " ");
//         // }
//     }
// }

// public class main {
//     static ArrayList<Integer> intersection(ArrayList<Integer> arr1, ArrayList<Integer>arr2) {
//         int n = arr1.size(), m = arr2.size();
//         int i = 0, j = 0;

//         ArrayList<Integer> result = new ArrayList<>();
//         while (i < n && j < m) {
//             if (arr1.get(i)<arr2.get(j)) {
//                 i++;
//             } else if (arr2.get(j) < arr1.get(i)) {
//                 j++;
//             } else {
//                 result.add(arr1.get(i));
//                 i++;
//                 j++;
//             }
//         }
//         return result;

//     }
//     public int[] intersection(int[] nums1, int[] nums2) {
//         Set<Integer> set1 = new HashSet<>();
//         for(int i:nums1){
//          set1.add(i);   
//         }

//         Set<Integer> set2 = new HashSet<>();
//         for(int j:nums2){
//          if(set1.contains(j)){
//              set2.add(j);
//          }
//         }

//         int in=0;
//         int result[] = new int[set2.size()];
//         for(int k:set2){
//          result[in++] = k;
//         }

//         return result;

//      }

//     public static void main(String[] args) {
//         int a[] = { 1, 1, 2, 3, 2 };
//         int b[] = { 1, 2, 3, 4, 5, 6 };

//         int result[] = intersection(a, b);
//         for (int i = 0; i < result.length; i++) {
//             System.out.print(result[i] + " ");
//         }

//     }
// }

// public class main {
//         static int max(int a, int b) {
//             int result;
//             if (a > b) {
//                 result = a;
//             } else {
//                 result = b;
//             }
//             return result;
//         }

//     static int findMaxConsecutiveOnes(int[] nums) {
//         int max = 0, count = 0;

//         for (int i = 0; i < nums.length; i++) {
//             if (nums[i] == 1) {
//                 count++;
//                 max = max(max, count);
//             } else {
//                 count = 0;
//             }
//         }
//         return max;
//     }

//     public static void main(String[] args) {
//         int array[] = { 1, 1, 0, 1, 1, 1 };
//         System.out.println(findMaxConsecutiveOnes(array));
//     }

// }

// public class main {
//     static int consecutiveones(int nums[]) {
//         int n = nums.length;
//         int xor1 = 0, xor2 = 0;
//         // XOR all elements in the array
//         for (int i = 0; i < n - 1; i++) {
//             xor2 = xor2 ^ nums[i]; // because of a missing number.
//             xor1 = xor1 ^ (i + 1);
//         }
//         xor1 = xor1 ^ n; //

//         // Return the XOR of the two results
//         return xor1 ^ xor2;
//     }

//     public static void main(String[] args) {
//         int array[] = { 3, 0, 1 };
//         System.out.print(consecutiveones(array) + " :missing");
//     }
// }

// find the number that appears ones and other twice 

// first find the number that appears ones.

// public class main {
//     static int max(int a, int b) {
//         int result;
//         if (a <= b) {
//             result = b;
//         } else {
//             result = a;
//         }
//         return result;
//     }

//     static int longsubarraywithk(int a[], int k) {
//         int n = a.length;
//         int sum = 0, len = 0;
//         for (int i = 0; i < n; i++) {
//             for (int j = i; j < n; j++) {
//                 sum += a[j];
//                 if (sum == k) {
//                     len = max(len, j - i + 1);
//                 }
//             }
//         }
//         return len;
//     }

//     public static void main(String[] args) {
//         int array[] = { 1, 1, 1, 2  , 3, 4, 5 };
//         System.out.print("Result: " + longsubarraywithk(array, 3) + " ");

//     }
// }
// public class main {

//     static int max(int a, int b) {
//         int result;
//         if (a <= b) {
//             result = b;
//         } else {
//             result = a;
//         }
//         return result;
//     }

//     static int subarraySum(int[] nums, int k) {
//             int right = 0, left = 0;
//             int sum = nums[0], n = nums.length;
//             int len = 0;

//             while (right < n) {

//                 while (sum > k && left <= right) {
//                     sum -= nums[left];
//                     left++;
//                 }

//                 if (sum == k) {
//                     len = max(len, right - left + 1);
//                 }

//                 right++;
//                 if (right < n)
//                     sum += nums[right];

//             }
//             return len;

//     }

//     public static void main(String[] args) {
//         int array[] = { 1, 1, 1, 1, 2, 2, 2, 3 };
//         System.out.print(subarraySum(array, 4));
//     }

// }

// 2 sum: 

// public class main {

//     static int[] twosum(int nums[], int target) {
//         Map<Integer, Integer> map = new HashMap<>();

//         for (int i = 0; i < nums.length; i++){ // check for weather the number exists or not.
//             Integer comp = map.get(nums[i]);
//             if (comp != null) {
//                 return new int[] { i, comp };
//             }
//             map.put(target - nums[i], i);
//         }

//         return nums;
//     }

//     public static void main(String[] args) {

//         int array[] = { 3, 2, 4 };
//         Scanner in = new Scanner(System.in);
//         System.out.println("Enter a target: ");
//         int target = in.nextInt();

//         int result[] = twosum(array, target);

//         for (int i = 0; i < result.length; i++) {
//             System.out.print(result[i] + " ");
//         }

//     }

// }

// sorting: 

// public class main {
//     static void swap(int array[], int a, int b) {
//         int temp = array[a];
//         array[a] = array[b];
//         array[b] = temp;
//     }
//     static int[] sort(int array[]){
//         for(int i=0;i<array.length;i++){
//             for(int j = i+1; j<array.length;j++){
//                 int tmp = 0;  
//                 if (array[i] > array[j])   
//                 {  
//                 tmp = array[i];  
//                 array[i] = array[j];  
//                 array[j] = tmp;  
//                 }  
//             }
//         }
//         return array;
//     }
//     public static void main(String[] args) {
//         int array[] = { 4, 3, 2, 1 };
//         int result[] = sort(array);

//         for (int i = 0; i < array.length; i++) {
//             System.out.print(result[i] + " ");
//         }
//     }
// }

// public class main {
//     static void swap(ArrayList<Integer> arr, int i, int j) {
//         int temp = arr.get(i);
//         arr.set(i, arr.get(j));
//         arr.set(j, temp);
//     }

//     static List<Integer> sort(ArrayList<Integer> arr, int n) {
//         int low =0, mid =0, high = n-1;

//         while(mid<=high){
//             if(arr.get(mid)==0){
//                 swap(arr,low, mid);
//                 low++; mid++;
//             }
//             else if((mid)==1){
//                 mid++;
//             }
//             else{
//                 swap(arr,arr.get(mid), arr.get(high));
//                 high--;
//             }
//         }

//         return arr;

//     }

//     public static void main(String[] args) {
//         ArrayList<Integer> arr = new ArrayList<>();
//         Collections.addAll(arr, 2, 2,2,2,0,0,1,0);

//         System.out.println(sort(arr, arr.size()));

//     }
// }

//  Majority elements.

// public class main {
//     static int majorityelements(int nums[]) {
//         int count1 = 0;
//         int found = 0;

//         for (int i = 0; i < nums.length; i++) {
//             if (count1 == 0) {
//                 count1 = 1;
//                 found = nums[i];
//             } else if (nums[i] == found) {
//                 nums[i] = found;
//                 count1++;
//             } else {
//                 count1--;
//             }
//         }
//         int count2 = 0;
//         for (int i = 0; i < nums.length; i++) {
//             if (nums[i] == found) {
//                 count2++;
//             }
//         }
//         if (count2 > (nums.length / 2)) {
//             return found;
//         }
//         return -1;

//     }

//     public static void main(String[] args) {
//         int array[] = { 1, 1 };
//         System.out.print(majorityelements(array));
//     }
// }

// Max subarray sum{}

// public class main {
//     static int maxsubsum(int nums[]) {

//         int sum = 0, max = Integer.MIN_VALUE;
//         int start=0, end=0;
//         for (int i = 0; i < nums.length; i++) {
//             if(sum==0){
//                 start = i;
//             }

//             sum += nums[i];
//             if (sum > max) {
//                 max = sum;
//             end = i;

//             }
//             if (sum < 0) {
//                 sum = 0;
//             }

//         }
//         int largest = nums[0];
//         if (max < 0) {
//             for (int i = 1; i < nums.length; i++) {
//                 if (largest < nums[i]) {
//                     largest = nums[i];
//                 }
//             }
//             return largest;
//         }
//         System.out.println("Start: " + start + "\nEnd: "+ end+" ");
//         return max;
//     }

//     public static void main(String[] args) {
//         int array[] = {1,2,2,2,3};
//         System.out.print(maxsubsum(array));

//     }
// }

// Rearrange array elements.
// Best time to buy and sell stocks.

// public class main {
//     static int[] alternateNumbers(int[] a) {
//         int n = a.length;
//         Vector<Integer> positive, negative;


//         for(int i=0;i<n;i++){
//             if (a[i]>0) {
//                 positive.addElement(a[i]);
//             }
//             else{
//                 negative.addElement(a[i]);
//             }
//         }

//         if (positive.size() > negative.size()) {
//             for (int i = 0; i < n; i++) {
//                 a[i * 2] = positive.get(i);
//                 a[i * 2 + 1] = negative.get(i);
//             }

//             int index = negative.size() * 2;
//             for (int i = negative.size(); i < positive.size(); i++) {
//                 a[index] = a[i];
//                 index++;
//             }
//         }

//         else {
//             for (int i = 0; i < n; i++) {
//                 a[i * 2] = positive.get(i);
//                 a[i * 2 + 1] = negative.get(i);
//             }

//             int index = positive.size() * 2;
//             for (int i = positive.size(); i < negative.size(); i++) {
//                 a[index] = a[i];
//                 index++;
//             }
//         }

//         return a;

//     }

//     public static void main(String[] args) {
//         int array[] = { -1, 1, 2, -2 };
//         int result[] = alternateNumbers(array);

//         for (int i = 0; i < result.length; i++) {
//             System.out.print(result[i] + " ");
//         }
//     }

// }


public class main{
    static void func(){}
    public static void main(String[] args){

    }
}