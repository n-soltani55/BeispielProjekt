
public class Beispiel {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] firstAndLastName = new String[6][2];
		
		firstAndLastName [0][0] = "Hanz";
		firstAndLastName [0][1] = "Franz";
		
		firstAndLastName [1][0] = "Peter";
		firstAndLastName [1][1] = "Gauland";
		
		firstAndLastName [2][0] = "Bub";
		firstAndLastName [2][1] = "Jush";
		
		firstAndLastName [3][0] = "Ebram";
		firstAndLastName [3][1] = "Abraha";
		
		firstAndLastName [4][0] = "Tower";
		firstAndLastName [4][1] = "Tescha";
		
		firstAndLastName [5][0] = "Qiser";
		firstAndLastName [5][1] = "Rom";
		
		//Äußere Forschleife ZeilenIndex i
		//Innere Forschleife ZeilenIndex j
		
		for(int i = 0; i< firstAndLastName.length; i++) {
			
			// i in der [i] steht für die Zeilen-Anzahl mal length der Spalte (in welcher Zeile man sich befindet)
			for (int j = 0; j< firstAndLastName[i].length; j++) {
				
				System.out.print(firstAndLastName[i][j] + " ");
				
			}
			System.out.println();
			
		}
	}
}



