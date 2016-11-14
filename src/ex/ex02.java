package ex;
import java.util.*;
public class ex02 {
	Scanner src = new Scanner(System.in);
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src = new Scanner(System.in);
		int n = src.nextInt();
		int data[] = new int[n];
		int sum=0;
		for (int i = 0; i < n; i++) {
			data[i] = src.nextInt();
			sum=sum+data[i];
		}
		float u=sum/n;
		float ans=fun1(data, n-1,u);
		System.out.print(Math.pow(ans, 0.5));

	}

	public static float fun1(int[] data1,int n1,float u1){
		if(n1==1)
		{
			return 1;
		}
		else
		{
			
//			return (((data1[n1]-u1)*(data1[n1]-u1))/n1)+ ((data1[n1]-u1)*(data1[n1]-u1))/n1;
			return (((data1[n1]-u1)*(data1[n1]-u1))/n1)+ ((data1[n1-1]-u1)*(data1[n1-1]-u1))/n1;
			
		}
	}

}
