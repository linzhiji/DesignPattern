/**
 * @author linzhiji
 * @description
 * @date 2021/1/30
 **/

public class BlueShapeFactory implements ShapeFactory{
    @Override
    public Shape getCircle() {
        return new Circle("blue");
    }

    @Override
    public Shape getSquare() {
        return new Square("blue");
    }
}
