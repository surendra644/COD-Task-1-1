package simplecalculator;
import java.util.Scanner;
public class sc {

	public static void main(String[] args) {
		System.out.println("enter name");
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		System.out.println("welcome "+name+" to simple calculator");
		System.out.println("operations\n1.addition\n2.subtraction\n3.multiplication\n4.division\n5.modulo-division\n6.factorial\n7.squareroot\n8.GCD calculation\n9.LCM calculation\n10.percentage-calculation\n11Trigomentric calculation");
		
		while(true)
		{
			System.out.println("enter choice");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1: System.out.println("enter value of a and b");
			         System.out.println("enter value of a");
			        int a=sc.nextInt();
			        System.out.println("enter value of b");
			        int b=sc.nextInt();
			        System.out.println("sum is"+(a+b));
			        break;
			case 2: System.out.println("enter value of a and b");
	                System.out.println("enter value of a");
	                int a1=sc.nextInt();
	                 System.out.println("enter value of b");
	                 int b1=sc.nextInt();
	                 System.out.println("subtraction is"+(a1-b1));
	                 break;
			case 3: System.out.println("enter value of a and b");
	               System.out.println("enter value of a");
	                int a2=sc.nextInt();
	               System.out.println("enter value of b");
	               int b2=sc.nextInt();
	               System.out.println("multiplication is"+(a2*b2));
	               break;
			case 4: System.out.println("enter value of a and b");
	                 System.out.println("enter value of a");
	                 int a3=sc.nextInt();
	                  System.out.println("enter value of b");
	                 int b3=sc.nextInt();
	                 System.out.println("division is"+(a3/b3));
	                 break;
			case 5: System.out.println("enter value of a and b");
                    System.out.println("enter value of a");
                    int a4=sc.nextInt();
                    System.out.println("enter value of b");
                    int b4=sc.nextInt();
                    System.out.println("modulo-division is"+(a4%b4));
                    break;
			case 6: System.out.println("enter number to get factorial");
			       int number=sc.nextInt();
			       int fact=1;
			       for(int i=1;i<=number;i++)
			       {
			    	   fact=fact*i;
			       }
			       System.out.println("the factorial of given number is "+fact);
			       break;
			case 7:System.out.println("enter number to find square root"); 
			       int square=sc.nextInt();
			       double ans=Math.sqrt(square);
			       System.out.println("square root of number is "+ans);
			       break;
			case 8:System.out.println("enter two numbers to find G.C.D");
			       System.out.println("enter first number");
		       int num_1=sc.nextInt();
		       System.out.println("enter second  number");
		       int num_2=sc.nextInt();
		       int gcd=(num_1>num_2)?num_1:num_2;
		       while(true)
		       {
		    	   if(gcd%num_1==0&&gcd%num_2==0)
		    	   {
		    		  
		    		   break;
		    	   }
		    	   gcd++;	    	   
		       }
		       int gcd_1=(num_1*num_2)/gcd;
		       System.out.println("gcd of two numbers is "+gcd_1);
		       
		       break;
			
			case 9:System.out.println("enter two numbers to calculate LCM");
			       System.out.println("enter first number");
			       int num1=sc.nextInt();
			       System.out.println("enter second  number");
			       int num2=sc.nextInt();
			       int lcm=(num1>num2)?num1:num2;
			       while(true)
			       {
			    	   if(lcm%num1==0&&lcm%num2==0)
			    	   {
			    		   System.out.println("lcm of two numbers is "+lcm);
			    		   break;
			    	   }
			    	   lcm++;
			       }
			       break;
			case 10:System.out.println("enter percentage for calculate");
			        float percent=sc.nextFloat();
			        percent=percent/100;
			        System.out.println("enter value to get percentaged value");
			        float amount=sc.nextFloat();
			        float per_amt=percent*amount;
			        System.out.println("the percentaged amount is "+per_amt);
			        break;
			case 11:System.out.println("1.sin\n2.cosine\n3.tangent\n");
			        while(true)
			        {
			        	System.out.println("enter 1 or 2 or 3 for trigomentric functions");
			        	int tri_ch=sc.nextInt();
			        	switch(tri_ch)
			        	{
			        	case 1:   System.out.println("enter a number to find sin of a value");
			        	          double val1=sc.nextDouble();
			        	          double sin1=Math.sin(val1);
			        	          System.out.println("sin of value is "+sin1);
			        	          break;
			        	case 2:   System.out.println("enter a number to find cos of a value");
	        	                   double val2=sc.nextDouble();
	        	                  double cos1=Math.sin(val2);
	        	                  System.out.println("sin of value is "+cos1);
	        	                  break;
			        	case 3:   System.out.println("enter a number to find tangent of a value");
	        	                  double val3=sc.nextDouble();
	        	                  double tan1=Math.sin(val3);
	        	                   System.out.println("sin of value is "+tan1);
	        	                    break;          
			        	}
			        	System.out.println("do you want to end finding trigomentric values [Y|N]");
			        	String tri_check=sc.next();
			        	if(tri_check.equalsIgnoreCase("Y"))
			        	{
			        		 break;
			        	}
			        }
			}
			System.out.println("enter exit to exit [Y|N]");
			String ex=sc.next();
			if(ex.equalsIgnoreCase("Y"))
			{
				break;
			}		
		
		}
		
		

	}

}
