package com.alejandroaguila;

public class Main {

    public static void main(String[] args) {
	// write your code here

        float[] numbers = new float[5];

        numbers[0] = 1f;
        numbers[1] = 2f;
        numbers[2] = 3f;
        numbers[3] = 4f;
        numbers[4] = 5f;

        int index = -1;

        for (int i = 0; i < numbers.length; i++)
        {
            if (numbers[i] == 4)
            {
                index = i;
                break;
            }
        }

        System.out.println(index);
    }
}
