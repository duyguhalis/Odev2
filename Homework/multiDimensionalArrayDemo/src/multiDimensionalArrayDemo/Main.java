package multiDimensionalArrayDemo;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		String [][] sehirler = new String [3][3];
		
		sehirler[0][0]= "Turku";
		sehirler[0][1]="Salo";
		sehirler[0][2]="Raisio";
		sehirler[1][0]="Tampere";
		sehirler[1][1]="Nokia";
		sehirler[1][2]="Toijala";
		sehirler[2][0]="Helsinki";
		sehirler[2][1]="Espoo";
		sehirler[2][2]="Vantaa";
		
		for (int i = 0; i<=2; i++) {
		for(int j=0;j<=2;j++){
			System.out.println(sehirler[i][j]);
			
			
		}System.out.println(".................");
	}System.out.println("WELLDONE");

}}
