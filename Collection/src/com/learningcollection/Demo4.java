package com.learningcollection;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/*
 * ASCII - American Standard Code for Information Interchange
 */
public class Demo4 {
	public static void main(String[] args) throws IOException {
		FileReader in=new FileReader("C:\\Users\\testyantra\\Desktop\\ABC\\test.txt");
		int x=in.read();
		//System.out.println(x);
		String s1="";
		while(x!=-1)
		{
			char ch=(char)x;
			s1=s1+ch;
			x=in.read();
		}
		System.out.println(s1);
		in.close();
	}

}