import java.util.Scanner;
public class IT24100097LAB6Q1{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number: ");
		double num=input.nextDouble();
		double root= Math.sqrt(num);
		double square= Math.pow(num,2);
		System.out.println("The square of "+ num + " is :"+square);
		System.out.println("The square root of "+ num + " is :"+root);
		
	}
}