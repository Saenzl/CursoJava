package main;

public class OverloadingEx {
	public static int sum(int a, int b){
		return a+b;
	}
	
	public static void forceException() throws Exception {
		throw new Exception();
	}
	
	public static int sum(int a, int b, int c){
		return a+b+c;
	}
	
	public static void ExceptionTest(int a, int b){
		try{
			System.out.println(a/b); 
		}catch(Exception e){
			System.out.println(e.getMessage());
			System.out.println("Cant divide by 0");
		}finally {
			System.out.println();
		}
	}
}
