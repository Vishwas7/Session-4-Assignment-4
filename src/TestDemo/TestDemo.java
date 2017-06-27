package TestDemo;

import java.util.Scanner;

public class TestDemo {
	
	

		public static void main(String[] args) {
		

			int n1 = Integer.parseInt(args[0]);// we are taking argument from command line. 
			if (n1 == 0) {
				System.out.println("You have entered ZERO "); 
				String char1 = null;
				System.out.println("ASCII value of n1 is" + (char) n1);
			} else if (n1 < 0) {
				System.out.println("You have entered Negetive value ");
			} else {
				System.out.println("You have entered positive value ");
			}
			Scanner in = new Scanner(System.in);  //here I'm taking Input from user. 

			System.out.print("Enter the marks of P ");
			int num1 = in.nextInt();

			System.out.print("Enter the marks of C ");
			int num2 = in.nextInt();

			System.out.print("Enter the marks of M");
			int num3 = in.nextInt();

			int p = num1, c = num2, m = num3,average;
			average = (p + c + m) / 3;
			if (average >= 70) {
				System.out.println("Grade A");
			}
			
				if ((average >= 61) && (average < 70)) {
					System.out.println("Grade B");
				}
					if (average < 61) {
						System.out.println("Grade C");
					}

					}

				
			}

