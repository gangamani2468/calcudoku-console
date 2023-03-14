package gameBoard;

import java.util.Scanner;

 
import gamelogic.numbersGeneration;
import main.mainClass;

public class board {
	public static control calcudoku=new control();
	static Scanner sc =new Scanner(System.in);
	public board() {
		// TODO Auto-generated constructor stub
	
	}
	 public void helpBoard() {
			System.out.println("-------------------------------Help Board--------------------------- \ngive answer like this  ");
			System.out.println(" ___  ___  ___  ___");
			System.out.println("| "+"a1"+" | "+"a2"+" | "+"a3"+" | "+"a4"+" |");
			System.out.println(" ---  ---  ---  ---");
			System.out.println("| "+"b1"+" | "+"b2"+" | "+"b3"+" | "+"b4"+" |");
			System.out.println(" ---  ---  ---  ---");
			System.out.println("| "+"c1"+" | "+"c2"+" | "+"c3"+" | "+"c4"+" |");
			System.out.println(" ---  ---  ---  ---");
			System.out.println("| "+"d1"+" | "+"d2"+" | "+"d3"+" | "+"d4"+" |");
			System.out.println(" ‾‾‾  ‾‾‾  ‾‾‾  ‾‾‾");
	}
	 public void board() {
	
		 	System.out.println(" ___  ___  ___  ___");
			System.out.println("| "+calcudoku.getA1()+" |  "+calcudoku.getA2()+" |  "+calcudoku.getA3()+" |  "+calcudoku.getA4()+" |");
			System.out.println(" ---  ---  ---  ---");
			System.out.println("| "+calcudoku.getB1()+" |  "+calcudoku.getB2()+" |  "+calcudoku.getB3()+" |  "+calcudoku.getB4()+" |");
			System.out.println(" ---  ---  ---  ---");
			System.out.println("| "+calcudoku.getC1()+" |  "+calcudoku.getC2()+" |  "+calcudoku.getC3()+" |  "+calcudoku.getC4()+" |");
			System.out.println(" ---  ---  ---  ---");
			System.out.println("| "+calcudoku.getD1()+" |  "+calcudoku.getD2()+" |  "+calcudoku.getD3()+" |  "+calcudoku.getD4()+" |");
			System.out.println(" ‾‾‾  ‾‾‾  ‾‾‾  ‾‾‾");
			
			
	}
	 public void selectNumber() {
		 System.out.println("select the number");
		 System.out.println("1-->1\n2-->2\n3-->3\n4-->4");
		 String input=sc.nextLine();
		 setSelectNumber(input);
		 
	 }
	 public void setSelectNumber(String input) {
		 switch(input) {
		 case "1":
			 calcudoku.setNum(input);
			 break;
		 case "2":
			 calcudoku.setNum(input);
			 break;
		 case "3":
			 calcudoku.setNum(input);
			 break;
		 case "4":
			 calcudoku.setNum(input);
			 break;
		 default:
				System.out.println("invalid input");
				selectNumber();
				
		 }
	 }
	 public void playersMove() {
		 System.out.println("Select your Choice\na1  a2  a3  a4\nb1  b2  b3  b4\nc1  c2  c3  c4\nd1  d2  d3  d4 ");
		 String choice=sc.nextLine();
		 board br=new board();
		 setPlayersMove(choice);
	 }
	 public void setPlayersMove(String choice) {
		 board br=new board();
		 mainClass.movesList.add(choice);
		 System.out.println(choice);
		 if(choice.equals("a1")&&calcudoku.getA1().equals(" "))
			 calcudoku.setA1(calcudoku.getNum());
		 else if(choice.equals("a2")&&calcudoku.getA2().equals(" "))
			 calcudoku.setA2(calcudoku.getNum());
		 else if(choice.equals("a3")&&calcudoku.getA3().equals(" "))
			 calcudoku.setA3(calcudoku.getNum());
		 else if(choice.equals("a4")&&calcudoku.getA4().equals(" "))
			 calcudoku.setA4(calcudoku.getNum());
		 else if(choice.equals("b1")&&calcudoku.getB1().equals(" "))
			 calcudoku.setB1(calcudoku.getNum());
		 else if(choice.equals("b2")&&calcudoku.getB2().equals(" "))
			 calcudoku.setB2(calcudoku.getNum());
		 else if(choice.equals("b3")&&calcudoku.getB3().equals(" "))
			 calcudoku.setB3(calcudoku.getNum());
		 else if(choice.equals("b4")&&calcudoku.getB4().equals(" "))
			 calcudoku.setB4(calcudoku.getNum());
		 else if(choice.equals("c1")&&calcudoku.getC1().equals(" "))
			 calcudoku.setC1(calcudoku.getNum());
		 else if(choice.equals("c2")&&calcudoku.getC2().equals(" "))
			 calcudoku.setC2(calcudoku.getNum());
		 else if(choice.equals("c3")&&calcudoku.getC3().equals(" "))
			 calcudoku.setC3(calcudoku.getNum());
		 else if(choice.equals("c4")&&calcudoku.getC4().equals(" "))
			 calcudoku.setC4(calcudoku.getNum());
		 else if(choice.equals("d1")&&calcudoku.getD1().equals(" "))
			 calcudoku.setD1(calcudoku.getNum());
		 else if(choice.equals("d2")&&calcudoku.getD2().equals(" "))
			 calcudoku.setD2(calcudoku.getNum());
		 else if(choice.equals("d3")&&calcudoku.getD3().equals(" "))
			 calcudoku.setD3(calcudoku.getNum());
		 else if(choice.equals("d4")&&calcudoku.getD4().equals(" "))
			 calcudoku.setD4(calcudoku.getNum());
		 else {
			 System.out.println("you given input is invalid!!");
			 playersMove();
			 mainClass.movesList.pop();
		 }
		 
		 
	 }
	
	 public void cage(int[][] answerList) {
//		 int[][] answerList=new numbersGeneration().numbersGeneration();
		 System.out.println("a1+b1="+(answerList[0][0]+answerList[1][0]));
		 System.out.println("a2+a3="+(answerList[0][1]+answerList[0][2]));
		 System.out.println("a4="+(answerList[0][3]));
		 System.out.println("b2="+answerList[1][1]);
		 System.out.println("b3+b4="+(answerList[1][2]+answerList[1][3]));
		 System.out.println("c1="+answerList[2][0]);
		 System.out.println("c2+c3="+(answerList[2][1]+answerList[2][2]));
		 System.out.println("c4+d4="+(answerList[2][3]+answerList[3][3]));
		 System.out.println("d1+d2="+(answerList[3][0]+answerList[3][1]));
		 System.out.println("d3="+answerList[3][2]);
	 }
	 public void options() {
		 board move=new board();
			
		 while(true) {
			 
			
		 System.out.println("options \n1-->undo\nany key-->continue");
		 String option=sc.nextLine();
		 if(option.equals("1")) {
			 move.undo();
			 move.board();
			 break;
		 }
		 else {
			 break;
		 }
		 
		 }
	 }
	 public void undo() {
		String choice=mainClass.movesList.pop();
		if(choice.equals("a1")&&!calcudoku.getA1().equals(" "))
			 calcudoku.setA1(" ");
		 else if(choice.equals("a2")&&!calcudoku.getA2().equals(" "))
			 calcudoku.setA2(" ");
		 else if(choice.equals("a3")&&!calcudoku.getA3().equals(" "))
			 calcudoku.setA3(" ");
		 else if(choice.equals("a4")&&!calcudoku.getA4().equals(" "))
			 calcudoku.setA4(" ");
		 else if(choice.equals("b1")&&!calcudoku.getB1().equals(" "))
			 calcudoku.setB1(" ");
		 else if(choice.equals("b2")&&!calcudoku.getB2().equals(" "))
			 calcudoku.setB2(" ");
		 else if(choice.equals("b3")&&!calcudoku.getB3().equals(" "))
			 calcudoku.setB3(" ");
		 else if(choice.equals("b4")&&!calcudoku.getB4().equals(" "))
			 calcudoku.setB4(" ");
		 else if(choice.equals("c1")&&!calcudoku.getC1().equals(" "))
			 calcudoku.setC1(" ");
		 else if(choice.equals("c2")&&!calcudoku.getC2().equals(" "))
			 calcudoku.setC2(" ");
		 else if(choice.equals("c3")&&!calcudoku.getC3().equals(" "))
			 calcudoku.setC3(" ");
		 else if(choice.equals("c4")&&!calcudoku.getC4().equals(" "))
			 calcudoku.setC4(" ");
		 else if(choice.equals("d1")&&!calcudoku.getD1().equals(" "))
			 calcudoku.setD1(" ");
		 else if(choice.equals("d2")&&!calcudoku.getD2().equals(" "))
			 calcudoku.setD2(" ");
		 else if(choice.equals("d3")&&!calcudoku.getD3().equals(" "))
			 calcudoku.setD3(" ");
		 else if(choice.equals("d4")&&!calcudoku.getD4().equals(" "))
			 calcudoku.setD4(" ");
	 }
	 
	 

}
