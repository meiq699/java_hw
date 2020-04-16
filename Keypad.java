package myjava.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Keypad {
	
	private BufferedReader br;
	public int Input;

	// initializes 
	public Keypad (){
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	public int getGetInput(){

		try{
			this.Input=Integer.valueOf(br.readLine());
		}catch(Exception e){
		//	new Screen().displayMessageLine("Please enter a Interger");
			this.Input=-1;
		}
			return this.Input;
	}


	/*
	 *  This function may throw some Exception if the user enters non-integer input.
	 *  You must use try...catch to deal with it.
	 */

		/* Fill your code here */

	
}
