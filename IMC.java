/**
*Calcular o IMC "Indice de massa corporal"
*@author Dorenalto Mangueira Couto

*         Calculo do IMC
* IMC=Peso / (Altura)²
	 < 20: Abaixo do Peso;
	20-25: Peso Ideal;
	25-30: Sobrepeso ;
	30-35: Obesidade Moderada;
	35-40: Obesidade Severa;
	40-45: Obesidade Morbida;
	 > 50: Super Obesidade;

*/

import javax.swing.JOptionPane;


public class IMC{

	public static void main (String[]args) {
		
		
		String peso = JOptionPane.showInputDialog("Qual o seu peso?");
		String altura = JOptionPane.showInputDialog("Qual o sua altura? \"/separado com ponto exemplo 1.70\"/");
		
		double PesoEmQuilogramas = Double.parseDouble (peso);	
		double AlturaEmMetros = Double.parseDouble (altura);
		double imc = PesoEmQuilogramas / (AlturaEmMetros * AlturaEmMetros);
		String msg = (imc >= 20 && imc <=25) ? "Com Peso Ideal":"Fora do Peso Ideal" ;
		
		
		
	System.out.println("IMC = " + imc);
	System.out.println(msg);
	JOptionPane.showMessageDialog(null,"IMC = " + imc +  "\n Voce esta " + msg );
	
	
	
	}

}