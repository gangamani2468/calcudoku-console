package gamelogic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class numbersGeneration {
	public static void main(String []arg) {
		int[][] answerList=numbersGeneration();
		for(int i=0;i<4;i++) {
			for (int j=0;j<4;j++) {
				System.out.print(answerList[i][j]);
			}
			System.out.println();
		}
	}

	public static int[][] numbersGeneration() {
		// TODO Auto-generated constructor stub
		int []answerList[]=new int[4][4];
		for(int i=0;i<4;i++) {
			int row[]=new int[4];
			
			List<Integer> arr=new ArrayList<Integer>();
		
			
			while(arr.size()<4) {
				int random=(int) (Math.floor(Math.random()*4)+1);
				if(arr.contains(random)==false) {
					row[arr.size()]=random;
					arr.add(random);
					
				}
				
			}
			answerList[i]=row;
		}
		HashSet<Integer> col1= new HashSet<Integer>();
		HashSet<Integer> col2= new HashSet<Integer>();
		HashSet<Integer> col3= new HashSet<Integer>();
		HashSet<Integer> col4= new HashSet<Integer>();
		for (int i = 0; i < answerList.length; i++) {			
			        for (int j = 0; j < answerList[i].length; j++) {
			            if (j == 0) {
			            	col1.add(answerList[i][j]);
			                
			            } else if (j == 1) {
			                col2.add(answerList[i][j]);
			            } else if (j == 2) {
			                col3.add(answerList[i][j]);
			
			            } else if (j == 3) {
			                col4.add(answerList[i][j]);
			
			            }
			        }
		}
		if(col1.size()==4&&col2.size()==4&&col3.size()==4&&col4.size()==4) {
			
		}
		else {
			return numbersGeneration();
		}
		
		return answerList; 
		
		
	}

}


//
//function numberGenerate() {
//
//
//
//    answerList = [];
//
//    for (var i = 0; i < 4; i++) {
//        var row = []
//
//        while (row.length < 4) {
//            random = Math.floor(Math.random() * 4) + 1;
//            if (row.indexOf(random) === -1) {
//                row.push(random)
//
//            }
//        }
//        answerList.push(row);
//    }
//    var col1 = [];
//    var col2 = [];
//    var col3 = [];
//    var col4 = [];
//    for (var i = 0; i < answerList.length; i++) {
//
//
//        for (var j = 0; j < answerList[i].length; j++) {
//            if (j == 0) {
//                col1.push(answerList[i][j])
//            } else if (j == 1) {
//                col2.push(answerList[i][j])
//            } else if (j == 2) {
//                col3.push(answerList[i][j])
//
//            } else if (j == 3) {
//                col4.push(answerList[i][j])
//
//            }
//        }
//    }
//   
//
//    var cola = new Set(col1);
//    var colb = new Set(col2);
//    var colc = new Set(col3);
//    var cold = new Set(col4);
//
//
//    if (cola.size == 4 && colb.size == 4 && colc.size == 4 && cold.size == 4) {
//
//    } else {
//        numberGenerate()
//    }
//    startTime=new Date().getTime();
//    countDown();
//
//
//}
