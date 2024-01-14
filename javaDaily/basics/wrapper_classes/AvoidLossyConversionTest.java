import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AvoidLossyConversionTest {

    @Test
    void getNum() {
        AvoidLossyConversion avoidLossyConversion = new AvoidLossyConversion();
        assertEquals(24,avoidLossyConversion.getNum(24L));
    }
}