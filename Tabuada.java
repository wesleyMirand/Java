import java.util.*<
  
  class Tabuada {
    public static void main(String args []) {
      int num;
      Scanner lerTeclado= new Scanner(System.in);
      
      System.out.println(".......PROGRAMA QUE EXIBE TABUADA DE UM NUMERO.........");
      System.out.println();
      
      System.out.print("informe o numero: ");
      num=lerTeclado.nextInt();
      
      for(int i=0; i<=12; i++) {
        System.out.println("    "+num + " X " + i + " = " + (num*i));
        }
   }
}
