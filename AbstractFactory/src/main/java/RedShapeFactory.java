/**
 * @author linzhiji
 * @description
 * @date 2021/1/30
 **/

public class RedShapeFactory implements ShapeFactory {

    @Override
    public Shape getCircle(){
       return new Circle("red");
    }

    @Override
    public Shape getSquare(){
        return new Square("red");
    }
}
