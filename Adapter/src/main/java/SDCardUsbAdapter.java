import lombok.Getter;
import lombok.Setter;

/**
 * @author linzhiji
 * @description
 * @date 2021/2/2
 **/
@Getter
@Setter
public class SDCardUsbAdapter extends SDCardHandle implements USB {

    @Override
    public void use() {
        super.readData();
    }
}
