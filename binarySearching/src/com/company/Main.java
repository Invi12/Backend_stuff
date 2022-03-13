package com.company;

public class Main {

    public static void main(String[] args) {
        double array[]={1,2,3,4,5,6,7,8,9,10};
        var index = searchbinary(array, 4);
        System.out.println("Numer found at index: "+ index);
	// write your code here
    }
    public static int searchbinary (double array[], int value)
    {
        var index = 0;
        var limit = array.length - 1;
        while (index <= limit) {
            var point = Math.ceil((index + limit) / 2);
            var entry = array[(int) point];
            if (value > entry) {
                index = (int) point + 1;
                continue;
            }
            if (value < entry) {
                limit = (int) point - 1;
                continue;
            }
            return (int) point; // value == entry
        }
        return -1;
    }

    }

