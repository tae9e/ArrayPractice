package com.example.codePractice.array;
//다이아몬드 별 찍기
public class Array11 {
    public static void main(String[] args) {
        int n = 3;
        for(int i=0; i<n; i++){ //외부 for 문
            for(int j=0; j<n-i-1; j++) {
                System.out.print(" ");
            }
            for(int j=0; j<2*i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-2; i>=0; i--){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0; j<2*i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
