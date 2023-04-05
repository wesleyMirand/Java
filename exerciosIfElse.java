import java.util.Scanner;
public class composta {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
        int Numero;
        
             System.out.println("Qual numero?");
        Numero = sc.nextInt();
        if(Numero >= 10) {
        	 System.out.println("Negativo");
        }
        else if (Numero <= 8 ) {
        	System.out.println("Nao Negativo");
        }
        
        sc.close();
	}

}

