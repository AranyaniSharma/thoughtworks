/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

class PythagoreanTriplet{
    
	static void pythagoreanTriplets(int limit)
	{

		int a, b, c = 0;

		int m = 2;

		while (c < limit) {

			for (int n = 1; n < m; ++n) {

				a = m * m - n * n;
				b = 2 * m * n;
				c = m * m + n * n;

				if (c > limit)
					break;
                if(a+b+c==limit){
                    System.out.println(a + " " + b + " " + c);
                }
				
			}
			m++;
		}
	}

	
}







    class Codechef{
	    public static void main (String[] args) throws java.lang.Exception{
        PythagoreanTriplet p=new PythagoreanTriplet();
		int limit = 108;
		p.pythagoreanTriplets(limit);
	
	}
}
