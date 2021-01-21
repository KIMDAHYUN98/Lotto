package lotto;

import java.util.Scanner;

public class LottoApp {
	public static void main(String[] args) {
	      Scanner scn = new Scanner(System.in);
	      System.out.println("금액을 입력하세요.");
	      
	      int money = scn.nextInt();
	      Lotto game = new Lotto(money);
	      game.run();
	      
	      scn.close();
	   }
}
