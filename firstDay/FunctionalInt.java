package firstDay;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInt {
	public static void main(String[] args) {
		
			Consumer<Integer> c =(t)->System.out.println("value is : "+t);// used prinltn method that accept one argument similarly
//			we can add any method with one arg and no return type Collection interface's forEach() method accepts this
//			Consumer as argument.
			c.accept(10);//value is : 10
			
			Function<Integer, String> f = (t)-> "value after multiplying with 10 is : "+(t*10);// we can use any method that
//			accepts one argument and have return type;
			System.out.println(f.apply(29));//value after multiplying with 10 is : 290

			Predicate<Character> p =(t)->t=='A';// accepts one argument and return type is always boolean we can have any method
//			with an argument and having boolean as return type eg,.. **{@code Object.equals()}** of object class
			System.out.println("Given value is A : "+p.test('A'));//Given value is A : true
			
			Supplier<Double> s =()->Math.random();//return a value no arguments here method is overrided to return random number
			System.out.println("random number is : "+s.get());//random number is : 0.21812043650014246

			
			BiConsumer<Integer, String> bc =(t,u)->System.out.println(t+" : "+u);// accepts two arguments used in Map interface's
//			forEach Method that takes BiConsumer as Argument
			bc.accept(12, "Kohli");//12 : Kohli
			
			BiFunction<Integer, Integer, String> bf = (t,u)->"the sum of this numbers is : "+(t+u); //accepts two args and returns
//			one value
			System.out.println(bf.apply(12, 12));//the sum of this numbers is : 24
			
			BiPredicate<String, Character> bp =(u,t)->u.charAt(2)==t;//similar to Predicate but have 2 args.
			System.out.println("String cat has 't' at second index : "+bp.test("cat", 't'));//String cat has 't' at 
//			second index : true

					
	}

}
