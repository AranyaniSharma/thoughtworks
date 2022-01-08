/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
class RnaTranscription {

    String transcribe(String dnaStrand) {
        String rnaStrand=dnaStrand;
        rnaStrand=dnaStrand.replace('T','a');
        rnaStrand=rnaStrand.replace('A','u');
        rnaStrand=rnaStrand.replace('G','c');
        rnaStrand=rnaStrand.replace('C','g');
        rnaStrand=rnaStrand.toUpperCase();
        return rnaStrand;

        
    }

}
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		RnaTranscription r = new RnaTranscription();
		 System.out.println(r.transcribe("TAGCTAGC"));
	}
}
