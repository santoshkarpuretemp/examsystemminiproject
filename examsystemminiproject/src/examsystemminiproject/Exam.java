package examsystemminiproject;

import java.util.Random;
import java.util.Scanner;

public class Exam {
	public int score=0;
	Scanner sc =new Scanner(System.in);
	int[] array =new int[10];
	Random random=new Random();
	Database database =new Database();
	
	 void startExam() {
		 System.out.println("hi"+Database.getName());
		 System.out.println("Are you ready for exam press 1");
		 int i=sc.nextInt();
		 if(i==1){
			this.generateQuestionOrder();
			this.getQuestionPaper();
			System.out.println("*************END OF YOUR EXAM**************");
			Index.optionNumber();
		 }else {
			 Index.optionNumber();
		 }
		 }
	void generateQuestionOrder() {
		for(int i=0;i<array.length;i++) {
			array[i]=1+random.nextInt(10);
			for(int j=0; j<i;j++) {
				if(array[i]==array[j]) {
					i--;
					break;
				}
			}
			
		}
		
	}
	void getQuestionPaper() {
		for(int i=0;i<10;i++) {
			
			int number=array[i];
			String s= Integer.toString(number);
			int j=i+1;
			boolean b=database.getQuestion(s,j);
			if(b){
				score=score+1;
								
			}
			
			}
		String s =this.grade();
		System.out.println("hi"+Database.getName()+"your marks is "+score+s);
		
	}
	String grade() {
		if(score <5) {
			return "your class is  D fail";
		}
		if(score==5) {
			return"your class is c";
		}
		if(score==6||score<8) {
			return"your class is  B";
		}
		
			return"your class is  A";
		
		
	}
	
	
	
		
	}


