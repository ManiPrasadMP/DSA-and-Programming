package firstDay.factoryMethods;

class SquareFactory extends AbsShapefactory {
    public Shape createShape() {
        return new Square();
    }
}
