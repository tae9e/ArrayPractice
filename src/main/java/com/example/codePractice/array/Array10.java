package com.example.codePractice.array;
//오목판의 외곽선 꾸미기
public class Array10 {
    public static void main(String[] args) {
            for(int i=1; i<=9; i++){    //외부for문의 시작과 끝, 외부 for문 이후 내부 for문 돌고 다시 외부 for문으로.. 줄바꿈을 위해 내부 for문 전체를 { 로 감싸기
                for(int j=1; j<=9; j++){    //내부 for문, 테이블로 치면 행(가로)
                    if(i==4 && j==3) {  //for문에서 조건문의 값에 해당하는 부분(작음)
                        System.out.printf("%c", '*');
                    }
                    else if(i == 1){    //외곽선에 첫 가로줄에 해당
                        System.out.printf("%c",'ㅜ');
                    }
                    else if(i==9){      //외관선의 마지막 가로줄에 해당
                        System.out.printf("%c",'ㅗ');
                    }
                    //for문의 시작은 외부 for문이기 때문에 외관선 표현 시 왼쪽 윗부분의 모양은 외부 for문에 해당하는 변수를 표시
                    else if(j==1){      //첫 가로줄 이후 왼쪽 세로줄
                        System.out.printf("%c",'ㅏ');
                    }
                    else if(j==9){      //첫 가로줄 이후 오른쪽 세로줄
                        System.out.printf("%c",'ㅓ');
                    }
                    else {  //for문에서 가장 많이 써야 하는 것, 범용적인 것
                        System.out.printf("%c", '+');
                    }
                }
                System.out.println();

            }
        }

    }

