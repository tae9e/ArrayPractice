package com.example.codePractice.fruitArray;


import org.springframework.stereotype.Service;

@Service
public class FruitService {
    public String Fruit(String[] str) {
        StringBuilder result = new StringBuilder(); //과일 배열의 문자열 결합을 위해 StringBuilder 선언
        for (int i = 0; i < str.length; i++) {
            result.append(str[i]); //문자열 더하기
            if (i < str.length - 1) {
                result.append(", "); //문자열 사이에 ,추가하기
            }
        }
        return result.toString();
    }

    public String index(String[] nums) {
        StringBuilder number = new StringBuilder();

        for (int i = 0; i < nums.length; i++) {
            int indexNum = Integer.parseInt(nums[i]);
            number.append(indexNum);
        }
        return number.toString();
    }


    public String combine2(String[] selectNum, String[] selectFruit){
        //index 배열 새로운 배열에 할당하기
       String[] indexFruits = {index(selectNum)};

       //문자열을 생성하기 위해 StringBuilder 사용
        StringBuilder result = new StringBuilder();
        //새로운 배열의 크기만큼 for문 크기 설정
        for(int i = 0; i<indexFruits.length; i++){
            result.append(". ").append(selectFruit[i]); //과일 이름 할당
            if(i<indexFruits.length-1){
                result.append(", ");
            }

        }

        return result.toString();


    }

    public String combine3(String[] selectNum, String[] selectFruit){

        //문자열을 생성하기 위해 StringBuilder 사용
        StringBuilder result = new StringBuilder();
        //새로운 배열의 크기만큼 for문 크기 설정
        for(int i = 0; i<selectNum.length; i++){
            if(i%2==0) { //배열의 index는 0부터 시작이라 i%2==0이어야 홀수
                int indexNum = Integer.parseInt(selectNum[i])-1; //인덱스는 0부터 시작이므로 -1
                if(indexNum >= 0 && indexNum< selectFruit.length) { //인덱스가 0보다 크고 과일 배열보다 작아야 함
                    if (result.length()>0) { // 결과값이 0보다 클 경우 쉼표 추가
                        result.append(", ");
                    }
                    result.append(i/2+1).append(". ").append(selectFruit[indexNum]);  //홀수만 처리하기 위해 i/2+1
                }
            }

        }

        return result.toString();


    }






    //인덱스. 과일..으어..
    public String combineIndexFruit(String[] selectIndexs, String[] fruits) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < selectIndexs.length; i++) {
            int index = Integer.parseInt(selectIndexs[i]);
            if (index >= 0 && index < fruits.length) { // 인덱스 유효성 검증
                if (result.length() > 0) {
                    result.append(", "); // 요소 사이에 쉼표와 공백 추가
                }
                result.append(index + 1).append(". ").append(fruits[index]); // 인덱스와 과일 이름 조합
            }
        }
        return result.toString();
    }

    public String indexes(String[] userIndexs, String[] fruits) {
        StringBuilder num = new StringBuilder();
        for (int i = 0; i < userIndexs.length; i++) {
            try {
                int userIndex = Integer.parseInt(userIndexs[i]);
                if (userIndex <= fruits.length && userIndex > 0) {
                    int indexNumber = userIndex - 1;
                    num.append(userIndex).append(" ").append(fruits[indexNumber]);
                    if (i < userIndexs.length - 1)
                        num.append(", ");
                } else {
                    num.append("인덱스 범위를 벗어남");
                    break;
                }
            }catch (NumberFormatException e){
                num.append("유효하지 않은 입력값").append(userIndexs[i]);
                break;
            }

        }
        return num.toString();

    }


}
