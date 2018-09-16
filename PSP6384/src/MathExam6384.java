import java.util.Random;
import java.util.Scanner;

public class MathExam6384 {

public static void main(String[] arg) {

	int x,y,i,t=0;
	//Scanner sc = new Scanner(System.in);
	//int n = sc.nextInt();
	//x=(int)(10+Math.random()*50);

	//System.out.println(x);

	Random ne=new Random();
	int[] a = new int[1000];
	int[] b = new int[1000];
	for(i=1;i<=Integer.parseInt(arg[0]);i++)
	{
		x=ne.nextInt(100);
		y=ne.nextInt(100-x);
		if(x<y)
		{
			t=x;
			x=y;
			y=t;
		}
		a[i]=x;
		b[i]=y;
		if(x%2==0)
		{
			System.out.println("("+i+")"+" "+x+" "+"+"+" "+y+" "+"=");
		}
		else
		{
			System.out.println("("+i+")"+" "+x+" "+"-"+" "+y+" "+"=");
		}
	}
	System.out.println("-----------------±ê×¼´ð°¸-----------------");
	for(i=1;i<=Integer.parseInt(arg[0]);i++)
	{
		if(a[i]%2==0)
		{
			System.out.println("("+i+")"+" "+a[i]+" "+"+"+" "+b[i]+" "+"="+" "+(a[i]+b[i]));
		}
		else
		{
			System.out.println("("+i+")"+" "+a[i]+" "+"-"+" "+b[i]+" "+"="+" "+(a[i]-b[i]));
		}
	}
}
}