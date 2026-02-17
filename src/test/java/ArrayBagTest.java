import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayBagTest {

    @Test
    void addTest() {
        ArrayBag<Building> ar=new ArrayBag<>();
        Building b1=new Building("Peter","111 Main St");
        ar.add(b1);
        assertTrue(ar.contains(b1));
    }
    @Test
    void removeTest() {
        ArrayBag<Building> ar=new ArrayBag<>();
        Building b1=new Building("Peter","111 Main St");
        ar.add(b1);
        ar.remove(b1);
        assertFalse(ar.contains(b1));
    }
    @Test
    void getTest() {
        ArrayBag<Building> ar=new ArrayBag<>();
        Building b1=new Building("Peter","111 Main St");
        ar.add(b1);
        assertTrue(b1.equals(ar.get(ar.size()-1)));
    }
    @Test
    void sizeTest() {
        ArrayBag<Building> ar=new ArrayBag<>();
        Building b1=new Building("Peter","111 Main St");
        ar.add(b1);
        assertEquals(1,ar.size());
    }

    @Test
    void isEmptyTest() {
        ArrayBag<Building> ar=new ArrayBag<>();
        assertTrue(ar.isEmpty());
        Building b1=new Building("Peter","111 Main St");
        ar.add(b1);
        assertFalse(ar.isEmpty());
    }
    @Test
    void containsTest() {
        ArrayBag<Building> ar=new ArrayBag<>();
        Building b1=new Building("Peter","111 Main St");
        assertFalse(ar.contains(b1));
        ar.add(b1);
        assertTrue(ar.contains(b1));
    }

    @Test
    void clearTest(){
        ArrayBag<Building> ar=new ArrayBag<>();
        Building b1=new Building("Peter","111 Main St");
        ar.add(b1);
        ar.add(b1);
        ar.clear();
        assertTrue(ar.isEmpty());
    }
    @Test
    void createTest(){
        ArrayBag<Building> ar=new ArrayBag<>();
        assertTrue(ar.isEmpty());
        assertEquals(0,ar.size());
    }
}