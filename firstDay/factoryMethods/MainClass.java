package firstDay.factoryMethods;

public class MainClass {
	 public static void main(String[] args) {
		 
//		 simple factory method
	        Shape shape1 = ShapeFactory.getShape("CIRCLE");
	        shape1.draw();

	        Shape shape2 = ShapeFactory.getShape("SQUARE");
	        shape2.draw();
	        
//	        factory methods
	        AbsShapefactory factory;
	        factory = new CircleFactory();
	        Shape circle = factory.createShape();
	        circle.draw();

	        factory = new SquareFactory();
	        Shape square = factory.createShape();
	        square.draw();
	 }  
}
