import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class HorseTest {

    @Test
     public void exeptionNullArgumentInHorseConstructorTest() {
        assertThrows(IllegalArgumentException.class, () -> {
            Horse newHorseWithNullName = new Horse(null, 10, 15);
        });
    }

    @Test
    public void exeptionMessegeIfNameNull(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Horse newHorseWithNullName = new Horse(null, 10, 15);
        });
        String expectedMessage = "Name cannot be null.";
        String actualMessage = exception.getMessage();
        assertEquals(expectedMessage, actualMessage);
    }
}