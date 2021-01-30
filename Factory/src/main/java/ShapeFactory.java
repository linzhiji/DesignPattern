/**
 * @author linzhiji
 * @description
 * @date 2021/1/30
 **/

public class ShapeFactory {
    public Shape createShape(String shapeType){
        if("Circle".equals(shapeType)){
            return new Circle();
        }else if("Square".equals(shapeType)){
            return new Square();
        }
        return null;
    }
}
