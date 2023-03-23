import java.util.Scanner;
public class composta2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
        int Hora;
        
             System.out.println("Quantas horas?");
        Hora = sc.nextInt();
        if(Hora < 12) {
        	 System.out.println("Bom Dia");
        }
        else if (Hora <18) {
        	System.out.println("Boa Tarde");
        }
        else { 
        	System.out.println("Boa Noite");
        }
        sc.close();
	}

}
