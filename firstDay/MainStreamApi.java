package firstDay;

import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MainStreamApi {
	
	public static void main(String[] args) {
		
		
		
		/*IntStream.range(1, 11).forEach((i)->System.out.println(9+" * "+i+" = "+(9*i)));
		 * 
		 *	9 * 1 = 9
			9 * 2 = 18
			9 * 3 = 27
			9 * 4 = 36
			9 * 5 = 45
			9 * 6 = 54
			9 * 7 = 63
			9 * 8 = 72
			9 * 9 = 81
			9 * 10 = 90 */
		
		int c =(int) IntStream.rangeClosed(2, (int)Math.sqrt(9)).filter((t)->9%t==0).count();
		if(c == 0)
			System.out.println("prime "+c);
		else
			System.out.println("not prime "+c);
//		not prime 1
		
//		count of factors 
		int fc =(int) IntStream.rangeClosed(1, 57).filter((t)->57%t==0).count();
		System.out.println("No. of factors for 57 are : "+fc);
		IntStream.rangeClosed(1, 57).filter((t)->57%t==0).forEach(System.out::println);
		
//		 perfect or not
		int sum = IntStream.rangeClosed(1, 24/2).filter((t)->24%t==0).sum();
		System.out.println(" it is perfect number : "+(sum==21));
		
		   
	}

}
