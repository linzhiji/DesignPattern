import lombok.Getter;
import lombok.Setter;

/**
 * @author linzhiji
 * @description
 * @date 2021/1/30
 **/
@Setter
@Getter
public class HouseDirector {
    HouseBuilder houseBuilder;
    public HouseDirector(HouseBuilder houseBuilder){
        this.houseBuilder = houseBuilder;
    }

    public House buildHouse(){
        if(null == houseBuilder){
            return null;
        }
        houseBuilder.buildWall();
        houseBuilder.buildRoofed();
        houseBuilder.buildFoundation();
        return houseBuilder.buildHouse();
    }
}
