package app3;
public class App3{
	public static void main(String[] args){
		String[] copyFrom = {
		    "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
		    "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
		    "Marocchino", "Ristretto" };
		String[] copyTo = java.util.Arrays.copyOfRange(copyFrom,0,copyFrom.length);
		for(int i = 0; i < copyTo.length; i++){	
			System.out.println(copyTo[i]);
		}
	}
	
}






////////package app3;
////////public class App3{
////////	public static void main(String[] args){
////////		arrD1 = new int[10];
////////		arrD1[0] = 5;
////////		System.out.println(arrD1[0]);
////////		
////////		String d2 = "2"; 
////////		int intD2= Integer.parseInt(d2); // Wrapper class 
////////		//arry
////////		//int[] arrD2 = new int[10];
////////		int[] arrD2 =  {22,23};
////////	
////////		
////////		//multidimensional array 
////////		int[][] arrD3 ={ {33,44},{55,66}};
////////		System.out.println(arrD3.length);
////////	}
////////}

////////package app3;
////////public class App3{
////////	public static void main(String[] args){
////////		String[] copyFrom = {
////////		    "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
////////		    "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
////////		    "Marocchino", "Ristretto" };
////////		for (int i = 0;i < copyFrom.length; i++ ){
////////			System.out.println(copyFrom.length);
////////			System.out.println(i);
////////			System.out.println(copyFrom[i]);
////////		}
////////	}
////////}


////////package app3;
////////public class App3{
////////	public static void main(String[] args){
////////		String[] copyFrom = {
////////		    "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
////////		    "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
////////		    "Marocchino", "Ristretto" };
////////		String[] copyTo = new String[copyFrom.length];

////////                String[] tempArr = copyFrom; //shallow copy 
////////		System.arraycopy(copyFrom, 0, copyTo,0,copyFrom.length); // deep copy 
//			if(copyFrom == copyTo) // Shallow! Queries whether it is in the same place in the rem. 
////////		for(int i = 0; i < copyTo.length; i++){	
////////			System.out.println(copyTo[i]);
////////		}
////////	}
////////	
////////}




