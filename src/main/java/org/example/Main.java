package org.example;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 6, 8, 9};
        System.out.println(Arrays.toString(sortedSquaredArraySort(array)));             // O(nLog(n)) time | O(n) space
        System.out.println(Arrays.toString(sortedSquaredArrayReverseFill(array)));      // O(n) time | O(n) space
    }

    // O(nLog(n)) time | O(n) space
    public static int[] sortedSquaredArraySort(int[] array) {
        int[] sortedAndSquared = new int[array.length];     // O(n) space
        for(int i = 0; i < array.length; i++) {     // O(n) time
            sortedAndSquared[i] = array[i] * array[i];
        }
        Arrays.sort(sortedAndSquared);      // O(nLog(n)) time
        return sortedAndSquared;
    }

    // O(n) time | O(n) space
    public static int[] sortedSquaredArrayReverseFill(int[] array) {
        int[] sortedAndSquared = new int[array.length];     // O(n) space
        int left = 0;
        int right = array.length - 1;
        for(int i = array.length - 1; i >= 0; i--) {        // O(n) time
            if(Math.abs(array[left]) > Math.abs(array[right])) {
                sortedAndSquared[i] = array[left] * array[left];
                left++;
            }
            else {
                sortedAndSquared[i] = array[right] * array[right];
                right--;
            }
        }
        return sortedAndSquared;
    }
}