package hw;
import java.util.*;
public class hw03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src=new Scanner(System.in);
		int n=src.nextInt();
		int m=src.nextInt();
		int nn=fun1(n);
		int mm=fun1(m);
		int nm=fun1(m-n);
		System.out.print(mm/(nn*nm));
	}	
	public static int fun1(int x)
	{
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
