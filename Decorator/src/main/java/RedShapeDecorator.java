/**
 * @author linzhiji
 * @description
 * @date 2021/2/2
 **/

public class RedShapeDecorator extends ShapeDecorator{

    public RedShapeDecorator(Shape shape){
        super(shape);
    }

    @Override
    public void draw(){
        super.draw();
        addShapeRedBorder();
    }

    public void addShapeRedBorder(){
        System.out.println("add red border");
    }

}
