/**
 * @author linzhiji
 * @description
 * @date 2021/1/30
 **/

public class CommonHouseBuilder extends HouseBuilder{

    @Override
    public void buildFoundation() {
        house.setFoundation("普通房子：地基5米");
        System.out.println("普通房子：地基5米");
    }

    @Override
    public void buildWall() {
        house.setWall("普通房子：墙厚30厘米");
        System.out.println("普通房子：墙厚30厘米");
    }

    @Override
    public void buildRoofed() {
        house.setRoofed("普通房子：屋顶厚30厘米");
        System.out.println("普通房子，屋顶厚30厘米");
    }
}
