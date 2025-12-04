package com.gdstruc.quiz5;

public class Main
{
    public static void main(String[] args)
    {                  //  0  1   2   3    4   5    6
        int[] numbers = { 60, 33, 12, 64, 17, 105, -53};

        System.out.println(kerispiralSearch(numbers, 105));  // should find it
        System.out.println(kerispiralSearch(numbers, 420)); // should not find it (returns -1)
    }

    public static int kerispiralSearch(int[] input, int value)
    {
        int middle = input.length / 2;

        // check middle
        if (input[middle] == value)
        {
            return middle;
        }

        int step = 1;

        while (middle - step >= 0 || middle + step < input.length)
        {

            // check right side (middle + step)
            int right = middle + step;
            if (right < input.length && input[right] == value)
            {
                return right;
            }

            // check left side (middle - step)
            int left = middle - step;
            if (left >= 0 && input[left] == value)
            {
                return left;
            }

            step++;
        }

        return -1;
    }
}