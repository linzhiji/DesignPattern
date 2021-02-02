import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeFactoryTest {
    @Test
    void factoryTest(){
        ShapeFactory factory = new RedShapeFactory();
        Shape circle = factory.getCircle();
        circle.draw();
        Shape square = factory.getSquare();
        square.draw();

        ShapeFactory factory1 = new BlueShapeFactory();
        circle = factory1.getCircle();
        circle.draw();
        square = factory1.getSquare();
        square.draw();
    }
}