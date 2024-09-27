package com.exception;

public class ExceptionDemo3 {

	public static void main(String[] args) {
		
		
		
		String str = "abc";
		try {
		System.out.println(str);
		for(int i=0;i<str.length();i++) {
			System.out.println(str.charAt(i));
		}
		
		}
//		catch (IndexOutOfBoundsException e) {
//			// TODO: handle exception
//		}
		catch (StringIndexOutOfBoundsException e) {
			
			System.out.println("no more char..");
		}
		finally {
			System.out.println("done..");
		}
		
		
		try {
			/// 50 file oppen... 
			//45 open, .....excepton...
			
			//closing...///50 ....
		}
		catch(Exception e) {
			//closing......
			
		}
		
		finally {
			//closing...
			///transcation management...
		}
		
		///close....
		
		
	}
}
