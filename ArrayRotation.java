package com.HackerEarth;

import java.lang.reflect.Array;

public class ArrayRotation {

    public static void main(String[] args)
    {
        RotateArray(new int[]{10, 20, 30, 40, 50},2);
    }

    public static void RotateArray(int[] nElements, int nRotation)
    {
    for(int i=0;i<=nElements.length-1;i++) {
        System.out.println("val is =" + nElements[i]);
    }
    for(int i=0;i<nRotation;i++)
    {
        int j,last;
        last=nElements[nElements.length-1];
        for(j= nElements.length-1;j>0;j--)
        {
            //System.out.println("L val is =" + nElements[j]);
           // System.out.println("p val is =" + nElements[j-1]);
            nElements[j]=nElements[j-1];

        }
        nElements[0]=last;
    }
        for(int i=0;i<=nElements.length-1;i++) {
            System.out.println("new val is =" + nElements[i]);
        }
    }
}
