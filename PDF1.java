import java.util.Scanner;

/*
* Author : stephanerheaume
*Date : 6-Jan-2021
*/
public class PDF1
	{

		public static void main(String[] args)
			{
				
				
				Scanner sc = new Scanner(System.in);
				
				
				int TroisPointsApple = 0;
				int DeuxPointsApple = 0;
				int UnPointApple = 0;
				
				int TroisPointBan = 0;
				int DeuxPointsBan =0;
				int UnPointBan = 0;
				
				TroisPointsApple = sc.nextInt();
				DeuxPointsApple = sc.nextInt();
				UnPointApple = sc.nextInt();
				
				TroisPointBan = sc.nextInt();
				DeuxPointsBan = sc.nextInt();
				UnPointBan = sc.nextInt();
						
				
				
				int TotalApple = TroisPointsApple*3 + DeuxPointsApple*2 + UnPointApple;
				int TotalBan = TroisPointBan*3 + DeuxPointsBan*2 + UnPointBan;
				
				if(TotalApple>TotalBan) {
					System.out.println("A");
				}
				
				else if (TotalBan>TotalApple){
					
					System.out.println("B");
				}
				else {
					System.out.println("T");
				}
				
				
			}

	}
