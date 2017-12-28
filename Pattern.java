
package javabasic;

 
import java.util.Scanner;
/**
 * 
 * @author madhav madan
 *
 */
public class Pattern {

	public static void main(String[] args) {
		int i,j,k,l,p,x,ch,ch1,inf;
	    Scanner scanner = new Scanner(System.in);
		for(inf=1;inf>0;inf++)
		{
		System.out.println("how many peaks do yo want? ");
		ch = scanner.nextInt();
		
		ch1=ch-1;
		System.out.println();
		int m=1;
		for(i=4;i>=0;i--)
		{	
			x=0;
		for(j=0;j<i;j++)
		{
		System.out.print(" ");
     }
		
		System.out.print("*");
		      
			while(x<ch1)
			{
			if(i<4)
		
		{  
		 for(k=2;k<m;k++)
		{
			System.out.print(" ");
			
		}
		
		
		
		
			System.out.print("*");
		
		
	}
			
	 	 
	 	for(p=0;p<2*i-1;p++)
		{
		System.out.print(" ");	
		}
	 	
		if(i>0)
		System.out.print("*");
		
		x++;
		
		}
		m=m+2;
		System.out.println();
		
		}}
scanner.close();
		
}




}
