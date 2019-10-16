package com.exercise10_1subprogramas.app;
import java.util.Scanner;
public class SubProgramas {

	public static void main(String[] args) {
		// variables
		int num1=0;
		int num2=0;
		int result=0;
		//objetos
		Scanner input = new Scanner(System.in);
		//
		System.out.println(ShowTunnedMessage(" URIEL"));
		//ShowTunnedMessage("Ale");
		
		ShowMessage();
		num1=input.nextInt();
		ShowMessage();
		num2=input.nextInt();
		result=AddNumbers(num1,num2);
	
		result =AddNumbers(num1,num2);
		System.out.println(" Result is: "+result);
	}

	//Method to ask number
	public static void ShowMessage()
	{
		System.out.println(" input a number ");
	}
	//Method to show a tuned message
	public static String ShowTunnedMessage(String mensaje)
	{
		return "Hola" +mensaje;
	}
	//Method to add numbers
	public static int AddNumbers(int num1,int num2) 
	{
		return num1 + num2;
	}
}
