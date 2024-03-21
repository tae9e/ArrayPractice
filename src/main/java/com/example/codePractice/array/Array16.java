package com.example.codePractice.array;
//배열 항목 찾기
public class Array16 {
    public static void main(String[] args) {
        int[] nums = {5,4,8,1,0,5};

        int index=-1; //0으로 주면 5이기 때문에 찾지 못했다는 의미로 -1을 줌
        for(int i=0; i<6; i++){
            if(nums[i]==1){
                index = i;
                System.out.println("1은 " + index + "번 인덱스에 존재");
                break;
            }
        }
    }
}
