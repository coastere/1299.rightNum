package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int []arr = {17,18,5,4,6,1};
        int max = arr[arr.length - 1];
        int[] result = new int[arr.length];
        result[arr.length-1]=-1;
        for (int i = arr.length-2;i>=0; i--) {


            max = (max > arr[i+1]) ? max : arr[i+1];
            result[i]=max;
        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(i+" "+result[i]);
        }

    }
}
