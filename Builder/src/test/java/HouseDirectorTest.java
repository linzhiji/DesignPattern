import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HouseDirectorTest {

    @Test
    void buildHouse() {
        HighHouseBuilder highHouseBuilder = new HighHouseBuilder();
        HouseDirector director = new HouseDirector(highHouseBuilder);
        House house = director.buildHouse();

        CommonHouseBuilder commonHouseBuilder = new CommonHouseBuilder();
        director.setHouseBuilder(commonHouseBuilder);
        House commonHouse = director.buildHouse();

    }
}