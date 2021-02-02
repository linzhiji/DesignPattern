import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RedShapeDecoratorTest {

    @Test
    void draw() {
        Shape circle = new Circle();
        circle.draw();

        Shape circle2 = new RedShapeDecorator(circle);
        circle2.draw();
    }
}