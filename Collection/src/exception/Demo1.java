package exception;

public class Demo1{
	public static void main(String[] args) {
	System.out.println("Program Started");
	int a=8;
	int b=0;
	try{
		int c=a/b;
		System.out.println(c);
	}catch(Exception ex){
		System.out.println("Divide by zero is not possible");
	}
	System.out.println("Program Ended");
}

}
