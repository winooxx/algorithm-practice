package com.lawrence.algorithms;

/**
 * Created by Lawrence on 9/24/2016.
 */

public class quicksort {

    public static void sort(int[] a, int low, int high) {
        if (high <= low) {
            return;
        }
        int sample = partitaion(a, low, high);
        sort(a, low, sample - 1);
        sort(a, sample + 1, high);
    }

    private static int partitaion(int[] a, int low, int high) {
        int i = low;
        int sample = a[low];
        int j = high + 1;

        while (true)
        {
            while (a[++i] < sample) {
                if (i == high) {
                    break;
                }
            }
            while(sample < a[--j]){
                if(j == low){
                    break;
                }
            }
            if(i >= j){
                break;
            }
            exchange(a,i,j);
        }
        exchange(a,low,j);
        return j;
    }

    private static void exchange(int[] a,int i,int j)
    {
        int temp = a[i];
        a[i]=a[j];
        a[j]=temp;
    }

    private static void show(int[] a)
    {
        for(int i = 0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }

    public static void main(String[] args)
    {
        int[] a = new int[10];

        for(int i = 0; i < 10; i++)
        {
            a[i] = (int)(Math.random() * 10  + 1);
        }

        sort(a,0,a.length-1);
        show(a);
    }
}
