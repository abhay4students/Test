package com.learningcollection;

import java.util.ArrayList;

public class Demo1 {

	public static void main(String[] args) {
		ArrayList group1=new ArrayList();
		Double d1=12.5;
		group1.add(123);
		group1.add(d1);
		group1.add("Puja");
		
		Integer a=(Integer)group1.get(0);
		
		for(int i=0;i<group1.size();i++)
		{
			System.out.println(group1.get(i));
		}
		
		


	}

}
