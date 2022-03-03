package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random ran = new Random();
        Scanner input = new Scanner(System.in);

        System.out.println("Введите размер массива: ");
        int size = input.nextInt();
        int[] myArr = new int[size];

        System.out.println("Массив :");
        for(int i=0; i<myArr.length; i++)
        {
            myArr[i] = ran.nextInt(20);
            System.out.print(" " + myArr[i]);
        }
        System.out.println();

        int mn = myArr[0];
        double aver = 0;

        for(int i = 0; i<myArr.length; i++){
            if(myArr[i]< mn){
                mn = myArr[i];
            }
        }

        if (myArr.length > 0) {
            double sum = 0;
            for (int j = 0; j < myArr.length; j++) {
                sum += myArr[j];
            }
            aver = sum/myArr.length;
        }
        double sum = aver + mn;

        System.out.println("Минимальный элемент = " + mn +  " среднее арифметическое = "+aver + " сумма = " + sum);
    }
}
