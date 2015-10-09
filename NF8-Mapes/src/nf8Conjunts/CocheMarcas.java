package nf8Conjunts;
import java.util.Comparator;

public class CocheMarcas implements Comparator<Coche>{
 	@Override
	public int compare(Coche a, Coche b) {
 		// TODO Auto-generated method stub
        if(a.getCilindres()> b.getCilindres()){
            return 1;
        } else {
            return -1;
        }
	}
}