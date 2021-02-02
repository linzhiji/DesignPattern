/**
 * @author linzhiji
 * @description
 * @date 2021/1/30
 **/

public class Square extends Shape{
    public Square(String color){
        super(color);
    }

    @Override
    public void draw(){
        System.out.println("draw square, color = " + color);
    }
}
