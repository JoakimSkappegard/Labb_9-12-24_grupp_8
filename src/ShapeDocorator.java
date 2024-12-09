public class ShapeDocorator implements Shape {
    Shape shape;

    public ShapeDocorator(Shape shape) {
        this.shape = shape;
    }

    public void draw() {
        shape.draw();
    }
}
