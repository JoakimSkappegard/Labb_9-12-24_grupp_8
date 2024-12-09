import java.awt.*;

public class DecorePatternDemo {
    public static void main(String[] args){
        Rectangel rectangel = new Rectangel();
        rectangel.draw();
        System.out.println("");
        ShapeDocorator shapeDocorator = new ShapeDocorator(new Circel());
        shapeDocorator.draw();
        System.out.println("");
        RedShapeDocorator redShapeDocorator = new RedShapeDocorator(new Rectangel());
        redShapeDocorator.draw();
    }
}
