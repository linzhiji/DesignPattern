/**
 * @author linzhiji
 * @description
 * @date 2021/1/30
 **/

public class HighHouseBuilder extends HouseBuilder{
    @Override
    public void buildFoundation() {
        house.setFoundation("高楼：地基15米");
        System.out.println("高楼：地基15米");
    }

    @Override
    public void buildWall() {
        house.setWall("高楼：墙厚50厘米");
        System.out.println("高楼：墙厚50厘米");
    }

    @Override
    public void buildRoofed() {
        house.setRoofed("高楼：屋顶厚130厘米");
        System.out.println("高楼，屋顶厚130厘米");
    }
}
