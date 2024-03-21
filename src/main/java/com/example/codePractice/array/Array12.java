package com.example.codePractice.array;
//배열 참조변수 선언과 초기화
public class Array12 {
    public static void main(String[] args) {
        //배열 선언
        int[] nums = new int[5];
        for(int i=0; i<5; i++)
            nums[i]=i+1;

        //배열을 초기화 해서 생성
        int[] num = new int[]{1,2,3,4,5,6,7};
        int[] number = {1,2,3,4,5,6,7}; //일반적으로 사용

        for(int n=0;n<7;n++)
            System.out.printf("%d",number[n]);


    }
}
