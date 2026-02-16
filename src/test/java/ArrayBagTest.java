import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayBagTest {

    @Test
    void add() {
        ArrayBag<Building> ar=new ArrayBag<>();
        Building b1=new Building("Peter","111 Main St");
        ar.add(b1);
        assertTrue(ar.contains(b1));
    }
    @Test
    void remove() {
        ArrayBag<Building> ar=new ArrayBag<>();
        Building b1=new Building("Peter","111 Main St");
        ar.add(b1);
        ar.remove(b1);
        assertFalse(ar.contains(b1));
    }
}