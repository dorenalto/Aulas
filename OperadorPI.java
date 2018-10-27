/**
*Apresentar os conceitos de Operadores.
*@author Dorenalto Mangueira Couto

*/
import java.util.Scanner;

public class OperadorPI{

public static void main (String[]args) {
	
	Scanner s = new Scanner (System.in);
	System.out.println ("Informe o valor do raio");
	double raio = s.nextDouble();
	
	
	// Diâmetro : 2r
	//double raio = 10;
	double diametro = 2 * raio;
	
	System.out.println ("Diametro = " + diametro);
	
	
	// Circunferencia : 2 PI r
	double pi = Math.PI;
	double circunferencia = 2 * pi * raio;
	System.out.println ("Circunferencia = " + circunferencia);
	
	// Area : PI r²
	double area= pi * (raio * raio);
	System.out.println ("Area = " + area);
	
	
   }
}

 