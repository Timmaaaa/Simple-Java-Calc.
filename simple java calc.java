import java.util.*;
import java.lang.*;
import java.io.*;;

public class Calculator_v2 {

	public static void main(String[] args) {

		int i1 = 0;
		String o = null;
		int i2 = 0;
		int sum = 0;
		boolean eingabeFehler = false;
		ArrayList<Integer> alZ = new ArrayList<Integer>();
		ArrayList<String>  alO = new ArrayList<String>();		

		System.out.println(" Java Calculator v1.2");
		
		do {
			System.out.println("\n(Only submit numbers with single operators)");
			System.out.print("Please enter calculation: ");
			
			
			@SuppressWarnings({ "resource", "unused" })
			Scanner qeingabe = new Scanner(System.in); 
			//String eingabe = qeingabe.nextLine();
			
			eingabeFehler = false;
			String eingabe = "4*45*4+4+10*4+4";
			// 				  0123456789 -> 10 zeichen/chars
			System.out.println(eingabe);
			
			if (eingabe != null) {
				if (eingabe.length() >= 3) {
					if (eingabe.indexOf('%') < 0) {
						char c = eingabe.charAt(0);
						if (Character.isDigit(c)) {
							for (int i = 0; i-1 < eingabe.length(); i++) {
								System.out.println(i+" / "+ eingabe.length());
								char d1 = eingabe.charAt(i);
								char d2 = '?';
								
								if (Character.isDigit(d1)) {
									do {
										if ( (i+1) <= eingabe.length()) {
											d2 = eingabe.charAt(i+1);
											String tempNr = "";
											
											if (Character.isDigit(d2)) {
												do {
													if (tempNr == "") {
														tempNr = "" + d1 + d2;
													}
													else {
														tempNr = tempNr + d2;
													}
													System.out.println(tempNr);
													i++;
													d2 = eingabe.charAt(i+1);
												}while (Character.isDigit(d2));
												
												alZ.add(Integer.parseInt(tempNr));
												
												d2 = '?';
											}
											else {
												int j = Character.getNumericValue(eingabe.charAt(i));
												alZ.add(j); 
											}
										}		                                         						
									} while (Character.isDigit(d2));
									
									
									// 
									//
									System.out.print(Arrays.toString(alZ.toArray())+"\n");
									//System.out.print("\nZahl " + d1 + "\n");
								} //end if (is d1 a Digit)
						        else if (Character.isLetter(d1)) {
									eingabeFehler = true;
									break;
								}
								else {
									alO.add(String.valueOf(eingabe.charAt(i)));
									System.out.print("Operator\n");
								}
							} //end for
							
							
							
						} else {eingabeFehler = true;}					
					} else {eingabeFehler = true;}
				} else {eingabeFehler = true;}
			} else {eingabeFehler = true;}
			
			
			if (o == "/") { // && oder ^ funktioniert nicht
				if (i2 == 0) {
					eingabeFehler = true;
					System.out.println("\nSomething with your equation is wrong, please try again.");
				}
			} else if (o != null) {
				System.out.println("\n" + i1 + " " + o + " " + i2 + " = " + sum);
			}
			
		} while (eingabeFehler == true);
	} // end main()
}
