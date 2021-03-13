/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;*/

//import for Scanner and other utility classes
import java.util.*;


class CeasarCipher {
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);*/

        //Scanner
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(), count = 1, diff1 = 0, diff2 = 0;
	String str1 = new String();
	String str2 = new String();
        for (int i = 0; i < N; i++) {
            str1 = scanner.next();
            str2 = scanner.next();
        	diff1 = Math.abs((char)str1.charAt(0) - (char)str2.charAt(0));
	    while(count < str1.length()){
	       diff2 = Math.abs((char)str1.charAt(count) - (char)str2.charAt(count));
		if((diff1 == diff2)){
			count++;
			if(count == str1.length())
				System.out.println(diff1);
		}
		else{
		    System.out.println("-1");	
		    break;}			      
	    }
	    count = 1;
	}
    }
}
