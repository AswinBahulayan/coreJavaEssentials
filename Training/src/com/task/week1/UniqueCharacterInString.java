package com.task.week1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class UniqueCharacterInString {

	/*15.Display unique characters in a string. input:"helloworld" output:"helowrd"*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String generic="helloworld";
		Set<String> unique=new LinkedHashSet<String>();
		for (int i = 0; i < generic.length(); i++) {
			unique.add(Character.toString(generic.charAt(i)));
		}
		ArrayList<String> result=new ArrayList<>();
		result.addAll(unique);
		for (String string : result) {
			System.out.print(string);	
		}

	}

}
