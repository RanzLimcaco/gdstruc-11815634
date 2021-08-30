package com.raphaellimcaco;

public class Main {

    public static void main(String[] args) {

        int[] numbers = new int[5];

        numbers[0] = 70;
        numbers[1] = 80;
        numbers[2] = 75;
        numbers[3] = 650;
        numbers[4] = 30;

        int index = -1;

        for (int i = 0; i < numbers.length; i++)
        {
            if (numbers[i] == 75)
            {
                index = i;
                break;
            }

        }
        System.out.println(index);
    }
}
