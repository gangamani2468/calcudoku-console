package winning;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import gameBoard.board;
import gameBoard.control;
import gamelogic.numbersGeneration;
import main.mainClass;

public class winning {

	public winning() {
		// TODO Auto-generated constructor stub
	}
	static control calcudoku=board.calcudoku;
	static int[][] answerList=mainClass.answerList;
	
	
	public static boolean rowColCheck() {
		int cage1=answerList[0][0]+answerList[1][0];
		int cage2=answerList[0][1]+answerList[0][2];
		int cage3=answerList[0][3];
		int cage4=answerList[1][1];
		int cage5=answerList[1][2]+answerList[1][3];
		int cage6=answerList[2][0];
		int cage7=answerList[2][1]+answerList[2][2];
		int cage8=answerList[2][3]+answerList[3][3];
		int cage9=answerList[3][0]+answerList[3][1];
		int cage10=answerList[3][2];
		boolean valid=false;
		boolean numValid=false;
System.out.println(Integer.parseInt(calcudoku.getA1())+Integer.parseInt(calcudoku.getB1())==cage1);
System.out.println(Integer.parseInt(calcudoku.getA2())+Integer.parseInt(calcudoku.getA3())==cage2);
System.out.println(Integer.parseInt(calcudoku.getA4())==cage3);
System.out.println(Integer.parseInt(calcudoku.getB2())==cage4);
System.out.println(Integer.parseInt(calcudoku.getB3())+Integer.parseInt(calcudoku.getB4())==cage5);
System.out.println(Integer.parseInt(calcudoku.getC1())==cage6);
System.out.println(Integer.parseInt(calcudoku.getC2())+Integer.parseInt(calcudoku.getC3())==cage7);
System.out.println(Integer.parseInt(calcudoku.getC4())+Integer.parseInt(calcudoku.getD4())==cage8);
System.out.println(Integer.parseInt(calcudoku.getD1())+Integer.parseInt(calcudoku.getD2())==cage9);
System.out.println(Integer.parseInt(calcudoku.getD3())==cage10);
		if(Integer.parseInt(calcudoku.getA1())+Integer.parseInt(calcudoku.getB1())==cage1&&Integer.parseInt(calcudoku.getA2())+Integer.parseInt(calcudoku.getA3())==cage2&&Integer.parseInt(calcudoku.getA4())==cage3&&Integer.parseInt(calcudoku.getB2())==cage4&&Integer.parseInt(calcudoku.getB3())+Integer.parseInt(calcudoku.getB4())==cage5&&Integer.parseInt(calcudoku.getC1())==cage6&&Integer.parseInt(calcudoku.getC2())+Integer.parseInt(calcudoku.getC3())==cage7&&Integer.parseInt(calcudoku.getC4())+Integer.parseInt(calcudoku.getD4())==cage8&&Integer.parseInt(calcudoku.getD1())+Integer.parseInt(calcudoku.getD2())==cage9&&Integer.parseInt(calcudoku.getD3())==cage10) {
			valid=true;
		}
		HashSet<Integer> row1=new HashSet<Integer>();
		HashSet<Integer> row2=new HashSet<Integer>();
		HashSet<Integer> row3=new HashSet<Integer>();
		HashSet<Integer> row4=new HashSet<Integer>();
		HashSet<Integer> col1=new HashSet<Integer>();
		HashSet<Integer> col2=new HashSet<Integer>();
		HashSet<Integer> col3=new HashSet<Integer>();
		HashSet<Integer> col4=new HashSet<Integer>();
		Collections.addAll(row1,Integer.parseInt(calcudoku.getA1()),Integer.parseInt(calcudoku.getA2()),Integer.parseInt(calcudoku.getA3()),Integer.parseInt(calcudoku.getA4()));
		Collections.addAll(row2,Integer.parseInt(calcudoku.getB1()),Integer.parseInt(calcudoku.getB2()),Integer.parseInt(calcudoku.getB3()),Integer.parseInt(calcudoku.getB4()));
		Collections.addAll(row3,Integer.parseInt(calcudoku.getC1()),Integer.parseInt(calcudoku.getC2()),Integer.parseInt(calcudoku.getC3()),Integer.parseInt(calcudoku.getC4()));
		Collections.addAll(row4,Integer.parseInt(calcudoku.getD1()),Integer.parseInt(calcudoku.getD2()),Integer.parseInt(calcudoku.getD3()),Integer.parseInt(calcudoku.getD4()));
		Collections.addAll(col1,Integer.parseInt(calcudoku.getA1()),Integer.parseInt(calcudoku.getB1()),Integer.parseInt(calcudoku.getC1()),Integer.parseInt(calcudoku.getD1()));
		Collections.addAll(col2,Integer.parseInt(calcudoku.getA2()),Integer.parseInt(calcudoku.getB2()),Integer.parseInt(calcudoku.getC2()),Integer.parseInt(calcudoku.getD2()));
		Collections.addAll(col3,Integer.parseInt(calcudoku.getA3()),Integer.parseInt(calcudoku.getB3()),Integer.parseInt(calcudoku.getC3()),Integer.parseInt(calcudoku.getD3()));
		Collections.addAll(col4,Integer.parseInt(calcudoku.getA4()),Integer.parseInt(calcudoku.getB4()),Integer.parseInt(calcudoku.getC4()),Integer.parseInt(calcudoku.getD4()));
		System.out.println(row1.size());
		System.out.println(row2.size());
		System.out.println(row3.size());
		System.out.println(row4.size());
		System.out.println(col1.size());
		System.out.println(col2.size());
		System.out.println(col3.size());
		System.out.println(col4.size());
		if(row1.size()==4&&row2.size()==4&&row3.size()==4&&row4.size()==4&&col1.size()==4&&col2.size()==4&&col3.size()==4&&col4.size()==4) {
			numValid=true;
		}
		System.out.println(valid+""+numValid);
		if(valid&&numValid) {
			System.out.println("Congratulations you won this match!!!");
			return true;
		}
		else {
			System.out.println("Better Luck Next Time!!!");
			return false;
		}
		
		
		
		
		
		
	}
	

}
