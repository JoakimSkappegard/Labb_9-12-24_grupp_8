public class RedShapeDocorator extends ShapeDocorator {
    public RedShapeDocorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        super.draw();
        setRedBorder();
    }

    private void setRedBorder(){
        System.out.println("Red border");
    }
}
