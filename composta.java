import java.util.Scanner;
public class composta {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Hora;
		
		         System.out.println("Quantas Horas");
		Hora = sc.nextInt();
		if(Hora <12) { 
			     System.out.println("Bom Dia");
		}
		else {
			     System.out.println("Boa Tarde");
		}
		sc.close();
		

	}

}
