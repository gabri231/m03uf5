package examplesStreams;
class Exemple1transparencies {
 public static void main(String[] args){
   int count = 0;
   try {
      while (System.in.read() !=-1)
          count++;
   }catch (java.io.IOException e) {}
   System.out.println("L'entrada te " + count + " caracters.");
 }
}