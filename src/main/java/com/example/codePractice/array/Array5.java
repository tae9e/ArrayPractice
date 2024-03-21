package com.example.codePractice.array;

public class Array5 {
    //위로 갈수록 촘촘하게, 아래로 갈수록 범용적으로 작성할 것
    public static void main(String[] args) {
        for(int i=0; i<5; i++)
            if(i==4)
                System.out.printf("%c",'A'+i);
            else if(i%2==0)
                System.out.printf("%c, ",' ');
            //배열의 인덱스는 0부터 시작이므로 짝수를 찾아야 홀수가 빈 공백이 된다.
            else
                System.out.printf("%c, ",'A'+ i);
    }


}
