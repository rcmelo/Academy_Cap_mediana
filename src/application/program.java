package application;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class program {

	public static void main(String[] args) {
			
			List<Float > numeros =  new  ArrayList<>();
			
			numeros.add( 1.0f );
			numeros.add( 3.0f );
			numeros.add( 3.0f );
			numeros.add( 3.0f );
			numeros.add( 4.0f );
			numeros.add( 7.0f );
			numeros.add( 11.0f);
			numeros.add( 5.0f );
			numeros.add( 8.0f );
			numeros.add( 9.0f );
			numeros.add( 9.0f );
			numeros.add( 9.0f );
				
			calcularMediana(numeros);
		}
		
		
		public  static  void  calcularMediana (List<Float >  numeros) {
			
			float resultado =  0.0f ;
			
			if (numeros.size() %  2  !=  0 ) {
				int posicaoNumero = ((numeros.size() +  1 ) /  2 ) -  1 ;
				resultado = numeros.get(posicaoNumero);
			} else {
				int posicaoNumero =  Math.round((numeros.size() +  1 ) /  2 ) -  1 ;
				resultado = (numeros.get(posicaoNumero) + numeros.get(posicaoNumero +  1 )) /  2 ;
			}
			
			System.out.println( " A Mediana dos números citados é "  + resultado);
		}
}		
