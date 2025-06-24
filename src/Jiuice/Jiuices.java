package Jiuice;

import java.security.PublicKey;
import java.util.Scanner;
public class Jiuices {
	Scanner input = new Scanner(System.in);
	String []listJiuice= {"orange","apple","pomegranate"};
	double []listJiuicePrice= {0.5,0.75,1.0};
	//int choice=1;
	Jiuices(){
		
	}
	Jiuices(String []listJiuice,double []listJiuicePrice){
		this.listJiuice=listJiuice;
		this.listJiuicePrice=listJiuicePrice;
		
	}
	public void print() {
		for(int i=0;i<listJiuice.length;i++) {
			System.out.println("we have  " + listJiuice[i]+"  Jiuice");
			System.out.println("  and it is price   " + listJiuicePrice[i]+"  JD");
			
			
		}
		
	}
public void choiceCustomer() {
	for(int i=0;i<listJiuice.length;i++) {
	System.out.println("if you want   " + listJiuice[i]+"  Jiuice");
	System.out.println("please Enter :  " +(i+1)+ "  and  price jiuice   where   "+listJiuicePrice[i]);
	
	
	}
	int choice= input.nextInt();
	double customerMoney=input.nextDouble();
	
	for(int i=1;i<=listJiuice.length;i++) {
	if(choice==i && customerMoney>=listJiuicePrice[i-1]  ) {
		System.out.println(" you want   " + listJiuice[i-1]+"  Jiuice" + "  and  price jiuice  "+listJiuicePrice[i-1]
			+	"   your maney :   "+  customerMoney+ "    money remaining  :    "+ (customerMoney-listJiuicePrice[i-1]));
		
	}
		
	
	}
	System.out.println("  your money not enough  or your choice is in correct  ");
}
}
