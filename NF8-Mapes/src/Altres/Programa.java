package Altres;


public class Programa      {
    public static void main (String []args)  {
        Persona p = new Persona(1,"María",167);
        p.agendatel.put("Trabajo", "954825748");
        p.agendatel.put("Oficina", "958746362");
        p.agendatel.put("Móvil","666555444");
        p.agendatel.put("Casa","952473456");
        
        Persona p2 = new Persona(2,"gabriel",169);
        p2.agendatel.put("Trabajo", "2");
        p2.agendatel.put("Oficina", "2");
        p2.agendatel.put("Móvil","3");
        p2.agendatel.put("Casa","1");
        System.out.println("Personas en el mapa: \n"+p+"\n"+p2);
    
}
}