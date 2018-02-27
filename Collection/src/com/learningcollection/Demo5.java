package com.learningcollection;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo5 {

	public static void main(String[] args) throws IOException {
		FileReader in=new FileReader("C:\\Users\\testyantra\\Desktop\\ABC\\test.txt");
		BufferedReader buffIn=new BufferedReader(in);
		String line=buffIn.readLine();
		while(line!=null)
		{
			System.out.println(line);
			line=buffIn.readLine();
		}
		buffIn.close();
	}

}