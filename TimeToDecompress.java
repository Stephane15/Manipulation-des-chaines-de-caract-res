import java.util.Scanner;

/*
* Author : stephanerheaume
*Date : 7-Jan-2021
*/
public class TimeToDecompress
	{

		public static void main(String[] args)
			{
				Scanner sc = new Scanner(System.in);
				
				int L = 0;
				L = sc.nextInt();
				for(int i=0;i<L;i++);
					{
						int Deux = 0;
						Deux = sc.nextInt();
						String CaractersN = "";
						CaractersN = sc.nextLine();
						for (int j = 0; j<Deux; j++);
							{
								System.out.print(CaractersN);
							}
							int Trois = 0;
							Trois = sc.nextInt();
							String TroisCaractere = "";
							TroisCaractere = sc.nextLine();
							for (int  f = 0; f<Trois; f++);
								{
									System.out.print(TroisCaractere);
								}
						
						sc.close();
					
						
					}
				
				
				
				
			}

	}
