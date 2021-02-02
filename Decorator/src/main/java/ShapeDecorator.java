/**
 * @author linzhiji
 * @description
 * @date 2021/2/2
 **/

public abstract class ShapeDecorator implements Shape{
    protected Shape shape;
    public ShapeDecorator(Shape shape){
        this.shape = shape;
    }


    @Override
    public void draw() {
        if(null != shape){
            shape.draw();
        }
    }
}
