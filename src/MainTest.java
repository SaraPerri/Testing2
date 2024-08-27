import org.junit.Test;
//import org.testng.annotations.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    private Main testing = new Main();
    OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");
    @Test
    public void formatDate() {
        int result = testing.printYear(dateTime);
        assertEquals(2023, result);
    }
    @Test
    public void formatDate1() {
        int result = testing.printDay(dateTime);
        assertEquals(1, result);
    }

}