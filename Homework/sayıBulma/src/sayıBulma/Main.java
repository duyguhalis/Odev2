package sayıBulma;

public class Main {

	public static void main(String[] args) {
	int[] numbers= new int[] {1,2,3,4,5};
	int call=9;
	
	Boolean present= false;
	for(int nu:numbers) {if (nu==call) {present=true;
	break;
	} }
	if(present) {System.out.println("There is number"+call);}
	else {System.out.println("No number"+call);}
	

	}

}
