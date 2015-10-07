package nf8Conjunts;
import java.util.Comparator;

public class CocheOrdPotenciaFiscal implements Comparator<Coche>{
 	@Override
	public int compare(Coche a, Coche b) {
		// TODO Auto-generated method stub
        if(a.potenciaFiscal()> b.potenciaFiscal()){
            return 1;
        } else {
            return -1;
        }
	}
}