package com.alejandroaguila;

public class Main {

    public static void main(String[] args) {
	// write your code here


        int numbers[] = new int[10];

        numbers[0] = 3;
        numbers[1] = 12;
        numbers[2] = 9;
        numbers[3] = 27;
        numbers[4] = 15;
        numbers[5] = 35;
        numbers[6] = 26;
        numbers[7] = 123;
        numbers[8] = 6;
        numbers[9] = 80;

        System.out.println("Before Sorting:");
        PrintArray(numbers);

        System.out.println("\n\nAfter Bubble Sort:");
        BubbleSort(numbers);
        PrintArray(numbers);

        OriginalOrder(numbers);

        System.out.println("\n\nAfter Selection Sort:");
        SelectionSort(numbers);
        PrintArray(numbers);

        OriginalOrder(numbers);

        System.out.println("\n\nAfter Modified Selection Sort:"); //descending order//
        ModifiedSelectionSort(numbers);
        PrintArray(numbers);


    }

    private static void PrintArray(int arr[])
    {
        for (int j : arr) {
            System.out.print(j + ", ");
        }
    }

    private static void OriginalOrder(int arr[])
    {
        arr[0] = 3;
        arr[1] = 12;
        arr[2] = 9;
        arr[3] = 27;
        arr[4] = 15;
        arr[5] = 35;
        arr[6] = 26;
        arr[7] = 123;
        arr[8] = 6;
        arr[9] = 80;
    }

    private static void BubbleSort(int arr[]) {

        for (int lastSortedIndex = arr.length -1; lastSortedIndex > 0; lastSortedIndex--)
        {
            for (int i = 0; i < lastSortedIndex; i++)
            {
                if (arr[i] < arr[i + 1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
    }

    private static void SelectionSort(int arr[]){

        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            int biggerIndex = 0;

            for (int i = 1; i <= lastSortedIndex; i++)
            {
                if (arr[i] < arr[biggerIndex])
                {
                    biggerIndex = i;
                }
            }

            int temp = arr[lastSortedIndex];
            arr[lastSortedIndex] = arr[biggerIndex];
            arr[biggerIndex] = temp;
        }
    }

    private static void ModifiedSelectionSort(int arr[])
    {

        for (int lastSortedIndex = 0; lastSortedIndex < 9; lastSortedIndex++)
        {
            int biggerIndex = 9;

            for (int i = 9; i >= lastSortedIndex; i--)
            {
                if (arr[i] > arr[biggerIndex])
                {
                    biggerIndex = i;
                }
            }

            int temp = arr[lastSortedIndex];
            arr[lastSortedIndex] = arr[biggerIndex];
            arr[biggerIndex] = temp;
        }

        }
    }
