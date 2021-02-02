/**
 * @author linzhiji
 * @description
 * @date 2021/1/30
 **/

public class Circle extends Shape{
    public  Circle(String color){
        super(color);
    }

    @Override
    public void draw(){
        System.out.println("draw circle ,color = " + color);
    }
}
