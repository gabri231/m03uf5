package nf8Conjunts;
import java.util.SortedMap;
import java.util.TreeMap;
public class Persona {
    public int idPersona; 
    public String nombre; 
    public int altura;
    public SortedMap<String,String> agendatel;
 
    public Persona(int idPersona, String nombre, int altura) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.altura = altura;
        this.agendatel = new TreeMap<String,String>();     //inicialmente el mapa está vacío
    }
 
    @Override
    public String toString() { 
    	return "Persona-> ID: " 
    			+ idPersona 
    			+ " Nombre: " + nombre 
    			+ " Altura: " + altura 
    			+ " \nAgenda:\n" + agendatel.toString().replaceAll(",","\n");
    }
 
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {   return false;  }
        if (getClass() != obj.getClass()) {  return false;   }
        final Persona other = (Persona) obj;
        if (this.idPersona != other.idPersona) {  return false;    }
        return true;
    }
}