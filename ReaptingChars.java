package com.jsp.Stringpack;

public class ReaptingChars {

	

	public static void main(String[] args) {
		
		String a="abbbcccdgffff";
		int count;
		int  i=0;
	      char[] ch=a.toCharArray();
	      char c;
	      
		String s="";
		while( i<a.length()) {
			c=ch[i];//a,b,c
			count =1;
		
			while( i<a.length()-1 && ch[i+1]==c ) {
				count++;
				i++;
				
			}
			s=s+count+c;//1a,3b,3c
			i++;;
//			System.out.println(s);
			
			
		}
		System.out.println(s);
	

	}

}
