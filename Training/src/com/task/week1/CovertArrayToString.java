package com.task.week1;

public class CovertArrayToString {

	// 6.Convert String array to String String[] input1=["Vikas","Lokesh",Ashok]
	// Expected output String: "Vikas,Lokesh,Ashok"

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String actualString="";
		String[] input1= {"Vikas","Lokesh","Ashok"};
		for (int i = 0; i < input1.length; i++) {
			actualString+= input1[i]+", ";
		}
		System.out.println(actualString);
	}

}
