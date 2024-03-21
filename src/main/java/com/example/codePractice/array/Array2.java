package com.example.codePractice.array;
//뒤집어서 별 찍기
public class Array2 {
    public static void main(String[] args) {
       for(int i=4;i>0;i--) {
           for (int j = 0; j < i; j++) {
               System.out.print("*");
           }
           System.out.println();
       }

       for(int n=0; n<7; n+=2){
           for(int m=1; m<n; m++){
               System.out.print("*");
           }
           System.out.println();
       }

    }
}
