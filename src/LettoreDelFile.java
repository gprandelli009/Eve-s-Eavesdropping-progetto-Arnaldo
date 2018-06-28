
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class LettoreDelFile {

	public LettoreDelFile() {
	}
	
	public static void Lettura_Scrittura(String Input, String Output) throws FileNotFoundException {

		double tempoInizio=System.currentTimeMillis();
		int i;
		ArrayList<Integer> Contenitore = new ArrayList<Integer>();
		ArrayList<Integer> Byte = new ArrayList<Integer>();
		ArrayList<Integer> Memoria = new ArrayList<Integer>();
		ArrayList<Integer> Canali = new ArrayList<Integer>();
		File file = new File(Input); 
		PrintWriter uscita = new PrintWriter(Output);


		try {
			Scanner Acquisisci = new Scanner(file);
			while (Acquisisci.hasNextLine()) {
				i=Acquisisci.nextInt();
				Contenitore.add(i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		for(int j=0; j<Contenitore.get(0)*3;j++) {
			switch((j+1)%3) {
			case 1:
				Byte.add(Contenitore.get(j+1));	
				break;
			case 2:
				Memoria.add(Contenitore.get(j+1));	
				break;
			case 0:
				Canali.add(Contenitore.get(j+1));	
				break;
			}
		}

		for(int k=0; k<Contenitore.get(0);k++) {
			ByteArrivati totale = new ByteArrivati();
		    System.out.println(totale.calcolo(Byte.get(k), Memoria.get(k), Canali.get(k)));
		    uscita.println(totale.calcolo(Byte.get(k), Memoria.get(k), Canali.get(k)));
		}


		double tempoFine=System.currentTimeMillis();
		uscita.println((tempoFine/1000)-(tempoInizio/1000));
		System.out.println((tempoFine/1000)-(tempoInizio/1000));
		uscita.close();
	}

}
