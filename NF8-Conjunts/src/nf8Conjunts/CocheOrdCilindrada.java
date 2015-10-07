package nf8Conjunts;
import java.util.Comparator;

public class CocheOrdCilindrada implements Comparator<Coche>{
 	@Override
	public int compare(Coche a, Coche b) {
		// TODO Auto-generated method stub
        if(a.getCilindrada()> b.getCilindrada()){
            return 1;
        } else {
            return -1;
        }
	}
}