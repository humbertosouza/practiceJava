package hackerHank;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ChaosYear {

	/**
2
8
1 2 5 3 7 8 6 4
2 
	 
	 * @param q
	 */

	// Complete the minimumBribes function below.
	static void minimumBribes(int[] q) {

		int bribes = 0;
		int t = 0;		
        int testConst = (int)Math.pow(10,5);

		for(int i = 0; i <q.length ; i++){
			t = q[i];
        	//Check Constraints
			System.out.print("p " + t);
			
            if (t > testConst || t<1){
            	
				System.out.println("Invalid queue position value");				
				return;
				
			}
            if(i+3 == t){
            	bribes+=2;
                System.out.println("2 bribes: current is " + bribes + " - i+1:"+ (i + 1) + " - t:"+ t);                
            } else if(i+2 == t){
            	bribes++;
                System.out.println("1 bribe : current is " + bribes+ " - i+1:"+ (i + 1) + " - t:"+ t);                
//            }else if((i+1 > t+2) || (t < i-1) ) {
              }else if((i+3 < t)  ) {
                System.out.println("Too chaotic "+ " - i+1:"+ (i + 1) + " - t:"+ t);           
                //System.out.println("Too chaotic");
                return;
            	
            }


		}
		System.out.println(bribes);

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int t = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int tItr = 0; tItr < t; tItr++) {
			int n = scanner.nextInt();
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			int[] q = new int[n];

			String[] qItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int i = 0; i < n; i++) {
				int qItem = Integer.parseInt(qItems[i]);
				q[i] = qItem;
			}

			minimumBribes(q);
		}

		scanner.close();
	}
}



