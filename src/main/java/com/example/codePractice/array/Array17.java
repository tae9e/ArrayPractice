package com.example.codePractice.array;
//배열 값 교환하기
//교환을 위한 임시 공간 필요
public class Array17 {
    public static void main(String[] args) {
        //기존 값
        int[] num = {2,5,8,4,6,15};

        for(int i=0; i<num.length; i++){
            System.out.print(num[i]);
        }
        System.out.println();

        //임시 변수 선언
        int temp;

        //임시 변수에 바꾸려는 값 넣기
        temp = num[2];

        //바꿀 값 넣기
        num[2] = num[0];

        //비어있는 코드에 임시 변수값 넣기
        num[0] = temp;

        for(int i=0; i<num.length; i++){
            System.out.print(num[i]);
        }




    }
}
