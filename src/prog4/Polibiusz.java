package prog4;

public class Polibiusz implements Algorithm{

	private char[][] table = new char[][]{
		{'a','b','c','d','e'},
		{'f','g','h','i','k'},
		{'l','m','n','o','p'},
		{'q','r','s','t','u'},
		{'v','w','x','y','z'}
	};
	
	@Override
	public String crypt(String word) {
		char znak;
		int index;
		String wynik="";
		for(int i=0; i<word.length(); i++)
		{
			index=-1;
			znak=word.charAt(i);
			if(Character.isUpperCase(znak))
				znak=Character.toLowerCase(znak);
			if(znak=='j')
				znak='i';
			for(int j=0; j<table.length; j++)
				for(int k=0; k<table[0].length; k++)
				{
					if(znak==table[j][k])
					{
						index=10*j+k;
						k=100;
						j=100;
					}
				}
			if(index<10)
				wynik+=0;
			wynik+=index+" ";
			
	}
		return wynik;
}

	@Override
	public String decrypt(String word) {
		String wynik;
		String row, col;
		int row2, col2;
		row=Character.toString(word.charAt(0));
		col=Character.toString(word.charAt(1));
		row2=Integer.parseInt(row);
		col2=Integer.parseInt(col);
		
		wynik=Character.toString(table[row2][col2]);
		return wynik;
		
	}

}
