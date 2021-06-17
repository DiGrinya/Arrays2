package com.company;

public class Main {

    public static void main(String[] args) {
	int [] arr = {10, 10, 10, 10, 10};


        System.out.println(task2(arr));

    }

    public static int task2(int[] array) {
        int max = array[0];
        int count = 0;
        int first = 0;
        int latest = 0;
        int dist = 0;
        for (int i = 1; i <array.length ; i++) {
            if (max<array[i]) {
                max = array[i];
            }
        }
        for (int i = 0; i <array.length ; i++) {
            if (max == array[i]) {
                count++;
            }
        }
        if (count>1) {
            for (int i = 0; i < array.length; i++) {
                if (max == array[i]) {
                    first = first + i;
                    break;
                }
            }
            for (int i = 1; i < array.length; i++) {
                if (max == array[array.length - i]) {
                    latest = latest + i;
                    break;
                }
            }
            if (latest==1){
                dist = array.length-1 - first;
            } else dist = array.length - (latest +first);
        }
        return dist;
    }
}
