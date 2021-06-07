package com.task.week1;

public class Vowels {
	public static void main(String[] args) {
		String word = "NeeeEtwoork";
		int a = 0, e = 0, i = 0, o = 0, u = 0;
		for (int j = 0; j < word.length(); j++) {
			switch (word.charAt(j)) {
			case 'a':
			case 'A':	
				a++;
				break;
			case 'e':
			case 'E':	
				e++;
				break;
			case 'i':
			case 'I':	
				i++;
				break;
			case 'o':
			case 'O':	
				o++;
				break;
			case 'u':
			case 'U':	
				u++;
				break;
			default:
				break;
			}
		}
		System.out.println("count of a : "+ a);
		System.out.println("count of e : "+ e);
		System.out.println("count of i : "+ i);
		System.out.println("count of o : "+ o);
		System.out.println("count of u : "+ u);
	}

}
