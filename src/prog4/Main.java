package prog4;

import java.io.File;
import java.util.Scanner;

public class Main {
	public static void main(String[] arg){
		
		File f1 = new File(arg[0]);
        File f2 = new File(arg[1]);
		
        Scanner sc = new Scanner(System.in);
		Algorithm a1 = new ROT11();
		Algorithm a2 = new Polibiusz();
		Cryptographer c = new Cryptographer();
		boolean war=true; 
		int wybor1, wybor2;
		while(war){
			System.out.println(
					"1.Szyfrowanie\n"+
					"2.Deszyfrowanie\n"+
					"3.Wyjœcie"		
					);
			wybor1=sc.nextInt();
			if(wybor1==3)
				break;
			System.out.println(
					"1.Algorytm ROT11\n"+
					"2.Algorytm Polibiusza\n"		
					);
			wybor2=sc.nextInt();
			switch(wybor1){
				case 1:
					switch(wybor2)
					{
						case 1:
							c.cryptfile(f1, f2, a1);
							break;
						case 2:
							c.cryptfile(f1, f2, a2);
							break;
					}
					break;
					
				case 2:
					switch(wybor2)
					{
					case 1:
						c.decryptfile(f1, f2, a1);
						break;
					case 2:
						c.decryptfile(f1, f2, a2);
						break;
					}
					break;
			}
			
		}
		
	}
}
