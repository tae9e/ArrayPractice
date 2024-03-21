package com.example.codePractice.array;
//반복을 나누어 반복하기
public class Array6 {
    public static void main(String[] args) {
        for(int i=0; i<9; i++){
            System.out.printf("%d",i+1);
            if(i%3 == 2)
                System.out.println();
        }

        for(int n=0; n<3; n++){
            for(int m=1; m<=3; m++)
                System.out.print(n*3+m);
            System.out.println();

        }
    }
}
