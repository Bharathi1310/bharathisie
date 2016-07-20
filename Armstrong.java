# bharathisie
 import java.util.Scanner;
public class Armstrong {
public static void main(String[] args) {
	    int mod;
	    int b=0;
		Scanner in=new Scanner(System.in);
		System.out.println("enter the integer");
		int num=in.nextInt();
		 int f=num;
		 while(num>0)
		{
		mod=num%10; 
		b=b+(mod*mod*mod);
        num=num/10;
		}System.out.println(" "+b);
        if(b==f)
        {
        	System.out.println("armsntrong number:"+b);
        }
		else
        {
        	System.out.println("not armstrong number");
        }
	    
        }}
