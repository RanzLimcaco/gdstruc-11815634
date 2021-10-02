package com.module1;

public class Main {

    public static void main(String[] args) {
        // write your code here

        int[] numbers = new int[10];

        numbers[0] = 55;
        numbers[1] = 5;
        numbers[2] = 15;
        numbers[3] = 95;
        numbers[4] = 75;
        numbers[5] = 35;
        numbers[6] = 25;
        numbers[7] = 59;
        numbers[8] = -57;
        numbers[9] = 17;


        System.out.println("Numbers:");
        printArrayElements(numbers);

        System.out.println("\n\n After bubble sort: ");
        bubbleSort(numbers);
        printArrayElements(numbers);

        System.out.println("\n\n Descending bubble sort: ");
        decendingBubbleSort(numbers);
        printArrayElements(numbers);


        selectionSort(numbers);


        System.out.println("\n\n Modified selection sort: ");
        modifiedSelectionSort(numbers);
        printArrayElements(numbers);



    }

    private static void bubbleSort(int[] arr)
    {
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            for (int i = 0; i < lastSortedIndex; i++)
            {
                if (arr[i] > arr[i+1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }

    private static void decendingBubbleSort(int[] arr)
    {
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            for (int i = 0; i < lastSortedIndex; i++)
            {
                if (arr[i] < arr[i+1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }

    private static void selectionSort(int[] arr)
    {
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            int largesIndex = 0;
            for  (int i = 1; i <= lastSortedIndex; i++)
            {
                largesIndex = i;
            }

            int temp = arr[lastSortedIndex];
            arr[lastSortedIndex] = arr[largesIndex];
            arr[largesIndex] = temp;

        }
    }
//need to put it in the back :/
    private static void modifiedSelectionSort(int[] arr)
    {
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            int smallestIndex = lastSortedIndex;
            for  (int i = lastSortedIndex + 1; i < lastSortedIndex; i++)
            {
                smallestIndex = i;
            }

            int temp = arr[lastSortedIndex];
            arr[lastSortedIndex] = arr[smallestIndex];
            arr[smallestIndex] = temp;

        }
    }
    private static void printArrayElements(int[] arr)
    {
        for (int j : arr)
        {
         System.out.print(j + " ");
        }
    }

}
