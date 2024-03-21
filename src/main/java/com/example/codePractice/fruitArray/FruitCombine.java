package com.example.codePractice.fruitArray;

import java.util.Scanner;



public class FruitCombine {

    public String fruit(String[] fruits) {
        StringBuilder fruitResult = new StringBuilder();
        for (int i = 0; i < fruits.length; i++) {
            fruitResult.append(fruits[i]);
            if (i < fruits.length - 1) {
                fruitResult.append(", ");
            }
        }
        return fruitResult.toString();
    }

    //이건 index가 순차적으로 나타남...
    public String index(String[] indexs) {
        StringBuilder index = new StringBuilder();
        for (int i = 0; i < indexs.length; i++) {
            index.append(i + 1).append(". ").append(indexs[i]);
        }
        return index.toString();

    }

    //index를 입력한 순서대로 사용하기..
    public String indexes(String[] fruits, int[] userIndexs) {
        StringBuilder num = new StringBuilder();
        for (int i = 0; i < userIndexs.length; i++) {
            if (userIndexs[i] <= fruits.length && userIndexs[i] > 0) {
                int indexNumber = userIndexs[i] - 1;
                num.append(userIndexs[i]).append(". ").append(fruits[indexNumber]);
                if (i < userIndexs.length - 1)
                    num.append(", ");
            } else {
                num.append("인덱스 범위를 벗어남");
                break;
            }

        }
        return num.toString();

}

    public static void main(String[] args) {
        FruitCombine fruit = new FruitCombine();
        Scanner sc = new Scanner(System.in);

        System.out.println("과일 수 입력");
        int count = sc.nextInt();
        sc.nextLine();

        String[] fruits = new String[count];
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + "번째 과일 입력:");
            fruits[i] = sc.nextLine();
        }

        String fruitList = fruit.fruit(fruits);
        System.out.println("입력한 과일: " + fruitList);



    }
}
