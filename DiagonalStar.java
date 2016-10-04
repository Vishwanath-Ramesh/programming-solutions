/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class DiagonalStar
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int x,y=num-3;
		StringBuffer[] a = new StringBuffer[num*2];
		StringBuffer c = new StringBuffer();
		StringBuffer[] b = new StringBuffer[num*2] ;
		for(int i = 1;i <= num;i++){
		        for(int j = 1;j <=i && (i % 2) != 0;j++){
		            for(x = y;x>=1;x--){
		                c.append(" ");
		            }
		            y--;
		            c.append("*");
		            a[i] = new StringBuffer(c);};
		        b[i]=b[(num*2)-i]=a[i];
		        c.delete(0,c.length());
        }
        for(int k = 1;k <= num*2;k++){
            if((k % 2) != 0){
               // for(int l = 1;l <)
             System.out.println(b[k]);
            }
        }
	}
}
