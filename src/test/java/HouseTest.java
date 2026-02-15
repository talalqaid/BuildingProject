import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HouseTest {

    @Test
    void getNumOfHousesTest() {
        House.setZeroHouses();
        House h1=new House("Ali","112 Main Street",2,false);
        assertEquals(1,House.getNumOfHouses());
    }

    @Test
    void setNumOfRooms() {
        House h1=new House("Talal","112 Main Street",2,false);
        h1.setNumOfRooms(3);
        assertEquals(3,h1.getNumOfRooms());
    }

    @Test
    void setHasGarage() {
        House h1=new House("Ahmed","112 Main Street",2,false);
        h1.setHasGarage(true);
        assertTrue(h1.isHasGarage());
    }
    @Test
    void createTest(){
        House h1=new House("Ali","112 Main Street",2,false);
        assertEquals("Ali",h1.getOwner());
        assertEquals("112 Main Street",h1.getAddress());
        assertFalse(h1.isHasGarage());
        assertEquals(2,h1.getNumOfRooms());
    }

}