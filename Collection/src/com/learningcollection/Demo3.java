package com.learningcollection;

import java.io.FileWriter;
import java.io.IOException;

public class Demo3 {
	 
	public static void main(String[] args) {
		FileWriter out=null;
		try {
			out = new FileWriter("C:\\Users\\testyantra\\Desktop\\ABC\\test.txt");
			out.write("This is created by using File Class.\r\n");
			out.write("This is my first Program for filehandling.\r\n");	
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}finally{
			try {
				out.flush();
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	
	}
}
	


