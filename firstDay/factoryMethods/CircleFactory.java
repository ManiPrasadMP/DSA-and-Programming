package firstDay.factoryMethods;

class CircleFactory extends AbsShapefactory {
    public Shape createShape() {
        return new Circle();
    }
}
