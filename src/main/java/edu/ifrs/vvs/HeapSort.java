/**
 * @License
 * Copyright 2020 Heap Sort Application
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package edu.ifrs.vvs;

import java.util.Scanner;

/**
 * Heap Sort.
 */
public class HeapSort {

    private Scanner scanner = new Scanner(System.in);

    /**
     * Method to sort the array with HeapSort.
     *
     * https://www.geeksforgeeks.org/heap-sort/
     */
    public void sort(int[] arr) {
        int n = arr.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }


        // One by one extract an element from heap
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    /**
     * To heapify a subtree rooted with node i which is an index in arr[]. n is size of heap
     */
    @SuppressWarnings({"jacoco.complexity", "jacoco.method", "jacoco.branch"})
    void heapify(int[] arr, int n, int i) {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < n && arr[l] > arr[largest]) {
            largest = l;
        }

        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest]) {
            largest = r;
        }

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }

    /**
     * Reads the numbers of the array.
     *
     * @return the numbers of the array
     */
    public int[] read() {
        int size = this.size();
        int[] values = new int[size];
        for (int i = 0; i < values.length; i++) {
            System.out.print("Value " + i + ": ");
            values[i] = Integer.valueOf(this.scanner.next());
        }
        return values;
    }

    /**
     * Reads the size of the array.
     *
     * @return the size of the array
     */
    private int size() {
        System.out.print("Size of array: ");
        int size = Integer.valueOf(this.scanner.next());
        return size;
    }

    /**
     * A utility function to print array of size n.
     * @param arr the array
     */
    static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
