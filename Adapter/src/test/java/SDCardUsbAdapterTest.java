import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SDCardUsbAdapterTest {

    @Test
    void use() {

        USB usb1 = new Mouse();
        usb1.use();

        USB usb2 = new SDCardUsbAdapter();
        usb2.use();
    }
}