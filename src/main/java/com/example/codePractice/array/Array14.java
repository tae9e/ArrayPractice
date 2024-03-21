package com.example.codePractice.array;
//배열 값 이동하기
public class Array14 {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7};

        //기존 배열 출력
        for(int i=0;i<7;i++)
            System.out.printf("%d",num[i]);

        System.out.println();

        //nums[7] = 8; 배열 크기 오류, 배열은 확장이 불가능

        //더 큰 공간의 배열 생성
        int[] temp = new int[10];

        //기존 배열을 새 배열에 복사
        for(int i=0; i<num.length; i++) {
            temp[i] = num[i];
        }

            num = temp; //num배열을 temp 배열로 교체

        num[7] = 8; //새 요소 추가


            for(int i=0; i<8; i++)
                System.out.printf("%d",num[i]);
            }
        }






