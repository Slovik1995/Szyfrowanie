package prog4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Cryptographer {

	public static void cryptfile(File source, File destin, Algorithm algo){
		StringBuilder build = new StringBuilder();
		FileReader fr=null;
		try {
			fr = new FileReader(source);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedReader br = new BufferedReader(fr);
		String str;
		try {
			while((str=br.readLine())!=null){
				build.append(str);
				build.append("\n");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String s = build.toString();
		Scanner scan = new Scanner(s);
		StringBuilder build2 = new StringBuilder();
		
		FileWriter fw=null;
		try {
			fw = new FileWriter(destin);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedWriter bw = new BufferedWriter(fw);
		
		while(scan.hasNext()){
			String st = scan.nextLine();
			Scanner sca = new Scanner(st);
			while(sca.hasNext()){
			build2.append(algo.crypt(sca.next()));
			build2.append(" ");
			}
			
			try {
				bw.write(build2.toString());
				bw.write(System.getProperty( "line.separator" ));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			build2.delete(0, build2.length());
			
			
		}
		try {
			bw.flush();
			bw.close();
			fw.close();
			br.close();
			fr.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		
		
	}
	
	public static void decryptfile(File source, File destin, Algorithm algo){
			StringBuilder build = new StringBuilder();
			FileReader fr=null;
			try {
				fr = new FileReader(source);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			BufferedReader br = new BufferedReader(fr);
			String str;
			try {
				while((str=br.readLine())!=null){
					build.append(str);
					build.append("\n");
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String s = build.toString();
			Scanner scan = new Scanner(s);
			StringBuilder build2 = new StringBuilder();
			
			FileWriter fw=null;
			try {
				fw = new FileWriter(destin);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			BufferedWriter bw = new BufferedWriter(fw);
			
			while(scan.hasNext()){
				String st = scan.nextLine();
				Scanner sca = new Scanner(st);
				while(sca.hasNext()){
				build2.append(algo.decrypt(sca.next()));
				build2.append(" ");
				}

				try {
					bw.write(build2.toString());
					bw.write(System.getProperty( "line.separator" ));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				build2.delete(0, build2.length());
				
				
			}
			try {
				bw.flush();
				bw.close();
				fw.close();
				br.close();
				fr.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	  
	}
	
}
