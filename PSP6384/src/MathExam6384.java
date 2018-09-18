import java.util.Random;
import java.util.Scanner;

public class MathExam6384 {

public static void main(String[] arg) {

	int x,y,i,t=0,q,p;
	//Scanner sc = new Scanner(System.in);
	//int n = sc.nextInt();
	//x=(int)(10+Math.random()*50);

	//System.out.println(x);

	Random ne=new Random();
	int[] a = new int[1000];
	int[] b = new int[1000];
	if(Integer.parseInt(arg[1])==1)
	{
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
		System.out.println("-----------------标准答案-----------------");
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
	if(Integer.parseInt(arg[1])==2)
	{
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
			if(x%4==0)
			{
				System.out.println("("+i+")"+" "+x+" "+"+"+" "+y+" "+"=");
			}
			else if(x%4==1)
			{
				System.out.println("("+i+")"+" "+x+" "+"-"+" "+y+" "+"=");
			}
			else if(x%4==2)
			{
				System.out.println("("+i+")"+" "+x+" "+"×"+" "+y+" "+"=");
			}
			else if(x%4==3)
			{
				System.out.println("("+i+")"+" "+x+" "+"÷"+" "+y+" "+"=");
			}
		}
		System.out.println("-----------------标准答案-----------------");
		for(i=1;i<=Integer.parseInt(arg[0]);i++)
		{
			if(a[i]%4==0)
			{
				System.out.println("("+i+")"+" "+a[i]+" "+"+"+" "+b[i]+" "+"="+" "+(a[i]+b[i]));
			}
			else if(a[i]%4==1)
			{
				System.out.println("("+i+")"+" "+a[i]+" "+"-"+" "+b[i]+" "+"="+" "+(a[i]-b[i]));
			}
			else if(a[i]%4==2)
			{
				System.out.println("("+i+")"+" "+a[i]+" "+"×"+" "+b[i]+" "+"="+" "+(a[i]*b[i]));
			}
			else if(a[i]%4==3)
			{
				p=a[i]/b[i];
				q=a[i]%b[i];
				System.out.println("("+i+")"+" "+a[i]+" "+"÷"+" "+b[i]+" "+"="+" "+p+"..."+q);
			}
		}
		}
	}
}