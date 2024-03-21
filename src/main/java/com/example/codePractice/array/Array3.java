package com.example.codePractice.array;
    //반복문
public class Array3 {
        public static void main(String[] args) {
            //ABCDE
            for(int i=0; i<=4; i++){
                System.out.printf("%c",'A'+i);
            }

            System.out.println();

            //규칙 반복
            for(int n=1;n<=5;n++){
                System.out.println(1+(n-1)*5);
            }
        }
}
