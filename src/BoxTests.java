import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BoxTests {
    Box box = new Box(1,2,3);

    /**
     *  Tests the volume method of box
     */
    @Test
    public void testGetVolume() {
        assertEquals("6", box.getVolume());
    }

    /**
     *  Tests the surface area method of box
     */
    @Test
    public void testGetSurfaceArea() {
        assertEquals("2.0", box.getSurfaceArea());
    }

    /**
     *  Tests the toString method of box and all of the set methods
     */
    @Test
    public void testToString() {

        // Test the toString itself
        assertEquals(" Length: 1.0\n" + " Width: 2.0\n" + " Height: 3.0", box.toString());

        // Check that the toString updates with the set methods
        box.setLength(3);
        box.setWidth(2);
        box.setHeight(1);

        assertEquals(" Length: 3.0\n" + " Width: 2.0\n" + " Height: 1.0", box.toString());
    }

}
