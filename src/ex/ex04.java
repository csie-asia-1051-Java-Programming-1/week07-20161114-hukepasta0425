package ex;

import java.util.*;

public class ex04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src = new Scanner(System.in);
		int n = src.nextInt();
		System.out.print(fun1(n));
	}

	public static int fun1(int x){
			if(x==1)
			{
				return 1;
			}
	else
			{
				return x*fun1(x-1);
			}
	}
}    				

