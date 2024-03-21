package com.example.codePractice.array;

import org.springframework.http.converter.json.GsonBuilderUtils;

//별 찍기
public class Array {
    public static void main(String[] args) {
        for(int i=0; i<5; i++) {
            System.out.println("*");
            //세로로 5개 찍기
        }

        System.out.println("---------------------------------");

        for(int j=0; j<5; j++){
            System.out.print("*");
            //가로로 5개 찍기
        }

        System.out.println();
        System.out.println("---------------------------------");

        for(int m=0; m<=4; m++){
            for(int n=0; n<m; n++){
                System.out.print("*");
            }
            System.out.println();
            //한 개의 *부터 4개의 *까지 차례대로 정렬
        }

    }



}
