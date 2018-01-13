package main;

public class OverloadingTest {
	public static void main(String[] args)  {
		int result = OverloadingEx.sum(3, 2);
		System.out.println(result);


		try {
			OverloadingEx.forceException();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(result);

		result = OverloadingEx.sum(5, 5, 5);
		System.out.println(result);

		OverloadingEx.ExceptionTest(6, 0);
	}
}
