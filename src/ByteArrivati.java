
import java.util.*;

public class ByteArrivati {

	public ByteArrivati() {
	}
	
	public int calcolo(int bytes, int memoria, int canali) {
		int byteAllaVolta=0;
		int byteRestanti=0;
		for(int i=0;i<canali;i++) {
			byteAllaVolta=(bytes/memoria);
			byteRestanti=(bytes%memoria);
			ArrayList<Integer> pacchetti = new ArrayList<Integer>();
			for(int j=0;j<byteAllaVolta;j++) {
				pacchetti.add(memoria);	
			}
			if(byteRestanti!=0)
				pacchetti.add(byteRestanti);
			bytes=0;
			for(int k=0;k<pacchetti.size();k++) {
				bytes=bytes+(pacchetti.get(k)-1);
			}
			if(bytes==0)
				return bytes;
			//System.out.println(bytes);
			
		}
		return bytes;
	}
	
}
