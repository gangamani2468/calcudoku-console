package main;

import java.util.Scanner;
import java.util.Stack;

import gameBoard.board;
import gamelogic.numbersGeneration;
import winning.winning;

public class mainClass {
	static Scanner sc =new Scanner(System.in);
	public static int[][] answerList;
	public static Stack<String> movesList=new Stack<String>();
	public mainClass() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String []args) {
		board br=new board();
		answerList=numbersGeneration.numbersGeneration();
		int[][] answerList1=answerList;
		for(int i=0;i<4;i++) {
			for (int j=0;j<4;j++) {
				System.out.print(answerList1[i][j]);
			}
			System.out.println();
		}
		System.out.println("welcome");
		br.helpBoard();
		int lock=0;
		while(true) {
			System.out.println("press1-->start game\nany key-->exit");
			String press= sc.nextLine();
			if(press.equals("1")) {
				while(lock!=-2) {
					br.cage(answerList);
					br.selectNumber();
					br.playersMove();
					br.board();
					System.out.println("run");
					br.options();
					
					if(movesList.size()==16) {
						winning.rowColCheck();
						break;
					}
					
					
				}
				break;
			}else {
				break;
			}	
		}
		System.out.println("thank you!! :)");
	}
}
