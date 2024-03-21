package com.example.codePractice.array;

import java.util.Scanner;

//예외 항목
public class Array4 {
    public static void main(String[] args) {
        //,가 없었으면....
        //else가 기본흐름
        for(int i=0; i<5; i++){
           if(i==4) //특수한 경우
               System.out.printf("%c",'A'+i);
           else //기본 출력
               System.out.printf("%c,",'A'+i);
        }

    }


}
