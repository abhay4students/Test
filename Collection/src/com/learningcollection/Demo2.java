package com.learningcollection;
import java.io.File;
import java.io.IOException;
public class Demo2
 {
	public static void main(String[] args) {
		System.out.println("Demo1 to create directory");
		File f1=new File("C:\\Users\\testyantra\\Desktop\\ABC");
		boolean retVal=f1.mkdir();
		System.out.println("Created ->"+retVal);
		File f2=new File("C:\\Users\\testyantra\\Desktop\\ABC\\test.txt");
		try {
			f2.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String path=f1.getAbsolutePath();
		System.out.println(path);
		boolean res=f1.exists();
		System.out.println(res);
		//f1.delete();
		//res=f1.exists();
		//System.out.println("Directory exists?"+res);
	}

}
