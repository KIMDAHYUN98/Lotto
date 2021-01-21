package lotto;

import java.util.Arrays;
import java.util.Random;

public class Lotto {
	 private int money;
	   private int[][] lotto ;
	   private int row;
	   private int col;
	   
	   public Lotto(int money) {  //생성시 금액을 입력받음
	      this.money = money;
	      this.row = money / 1000;  //배열요소는 0 부터 시작
	      this.col = 6;
	   }
	   
	   private int num() {   //난수 하나를 발생시킴ㅂ
	      Random random = new Random();      
	      return random.nextInt(44) + 1;  //1 ~ 45까지 범위 발생
	   }
	   
	   private void createLotto() {
	      
	      lotto = new int[row][col];
	      
	      for(int i = 0; i < row; i++) {
	         for(int j = 0; j < col; j++) { //한줄 생성
	            lotto[i][j] = num();
	            for(int k = 0; k < j; k++) {  //중복제거
	               if(lotto[i][j] == lotto[i][k]) {
	                  j--;
	               }
	            }
	         }
	         Arrays.sort(lotto[i]);
	      }
	   }
	   
	   private void toPrint() {
	      System.out.println("입금한 금액 : " + money);
	      System.out.println("게임수 : " + row);
	      for(int i = 0; i < row; i++) {
	         for(int j = 0; j < col; j++) {
	            System.out.print(lotto[i][j] + " ");
	         }
	         System.out.println();
	      }
	   }
	   
	   public void run() {
	      createLotto();
	      toPrint();
	   }
	   
	}

