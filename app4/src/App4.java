//!javac -d bin src/*.java && java -cp bin app4.App4
package app4;

public class App4{
	public static void main(String[] args){
		int a = 0;
		int b = 1;
		//System.out.println(a++); //TODO prints after incementing -> 0 -> 1
		//System.out.println(++a); //TODO prints before incementing ->  2
		//if (a++ == 2 && a == 3 )System.out.println(a+"d");
		boolean result = (a < b) ? false : true;//TODO one line if else 
		System.out.println(a > b);
		
		

	}

}
