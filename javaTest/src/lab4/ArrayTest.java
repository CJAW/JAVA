package lab4;

import java.util.Scanner;

public class ArrayTest {
	
	 static Scanner str;
	
	
	public static void main(String[] args){
		
		String[] name = new String[8];
		
		str = new Scanner(System.in);
		
		for(int i=0;i<name.length;i++){
			
			System.out.println("输入姓名");
			name[i]=str.nextLine();
		}
		
	
	
	int[][] score ={{50,60,70,80,10,30,50},{70,68,84,85,84,80,80},{50,50,50,60,60,70,78,82},{45,85,96,58,48,89,56,80},{80,68,56,78,68,52,48},
			         {62,58,55,48,83,45,80},{85,84,85,48,48,51,84},{78,89,54,45,15,78,85}};
	

	System.out.println("输入姓名");
	String Studentname=str.nextLine();
	for(int i=0;i<8;i++){
	if(name[i].equals(Studentname)){
		System.out.print(name[i]);
		System.out.println("java"+score[i][0]+"sql"+score[i][1]+"englist"+score[1][2]+"math"+score[i][3]+"chinese"+score[i][4]+"music"+score[i][5]+"play"+score[i][6]);
	

 }
}
	
	String[] playscial ={"java","sql","english","math","chinese","music","play"};
	
	System.out.println("输入科目");
	String playscialName = str.nextLine();
	for(int i=0;i<7;i++){
		if(playscial[i].equals(playscialName)){
			for(int k=0;k<7;k++){
	for(int j=0;j<8;j++){
		if(score[k][j]<60){
			int n=0;
			System.out.println(playscial[i]+name[i]+n++);
			
		}
		
	}
 
	}
		}
	}
		}	
}
			


