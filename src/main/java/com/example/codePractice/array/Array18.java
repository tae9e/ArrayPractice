package com.example.codePractice.array;

import java.util.Random;

//배열에 랜덤 값 채우기
public class Array18 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] nums = new int[6];

        for(int i=0; i<nums.length; i++)
            nums[i] = random.nextInt(45)+1;


        for(int i=0; i<6; i++){
            System.out.printf("%d ",nums[i]);
        }
    }



    }

