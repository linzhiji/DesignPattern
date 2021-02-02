/**
 * @author linzhiji
 * @description
 * @date 2021/1/30
 **/

public abstract class HouseBuilder {
    House house = new House();
    public abstract void buildFoundation();
    public abstract void buildWall();
    public abstract void buildRoofed();

    public House buildHouse(){
        if(null == house){
            house = new House();
        }
        return house;
    }
}
