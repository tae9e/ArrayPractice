package com.example.codePractice.array;
//오목판에 오목 출력하기
public class Array9 {
    public static void main(String[] args) {
        for(int i=1; i<=9; i++){
            for(int j=1; j<=9; j++) {
                if(i==4 && j==3)
                    System.out.printf("%c",'*');
                else
                    System.out.printf("%c", '+');
            }
            System.out.println();
        }
    }
}
