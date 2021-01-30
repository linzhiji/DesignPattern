import org.junit.jupiter.api.Test;

class ShapeFactoryTest {

    @Test
    void createShape() {
        ShapeFactory factory = new ShapeFactory();
        Shape shape1 = factory.createShape("Circle");
        shape1.draw();

        Shape shape2 = factory.createShape("Square");
        shape2.draw();
    }
}