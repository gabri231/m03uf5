package Altres;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Car  implements Comparable<Car> {

	 int weight;
	 String name;

	public Car(int w, String n) {
	    weight=w;
	    name=n;
	}

	public boolean equals(Object o){
	    if(o instanceof Car){
	        Car d = (Car)o;
	        return ((d.name.equals(name)) && (d.weight==weight));
	    }
	    return false;

	}

	public int hashCode(){
	    return weight/2 + 17;
	}

	public String toString(){
	    return "I am " +name+ " !!!";
	}


	//	public int compareTo(Car d){
	//	    if(this.weight>d.weight)
	//	        return 1;
	//	    else if(this.weight<d.weight)
	//	        return -1;
	//	    else
	//	        return 0;
	//	}

	public int compareTo(Car d){
	    return this.name.compareTo(d.name);
	}

	
	public static void main(String[] args) {
	    Car d1 = new Car(100, "a");
	    Car d2 = new Car(110, "b");
	    Car d3 = new Car(110, "c");
	    Car d4 = new Car(100, "a");

	    Map<Car, Integer> m = new HashMap<Car, Integer>();
	    m.put(d1, 1);
	    m.put(d2, 2);
	    m.put(d3, 3);
	    m.put(d4, 16);

	    for(Map.Entry<Car, Integer> me : m.entrySet())
	    System.out.println(me.getKey().toString() + " " +me.getValue());

	    TreeMap<Car, Integer> tm = new TreeMap<Car, Integer>(m);
	    System.out.println("After Sorting: ");
	    for(Map.Entry<Car, Integer> me : tm.entrySet())
	        System.out.println(me.getKey().toString() + " " +me.getValue());
	}
}