import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShopTest {

    @Test
    void setAverageTurnoverTest() {
        Shop s1=new Shop("Nabeel","111 main st",5,500.4);
        s1.setAverageTurnover(50.1);
        assertEquals(50.1,s1.getAverageTurnover(),0.1);
    }

    @Test
    void setNumOfEmployeesTest() {
        Shop s1=new Shop("Nabeel","111 main st",5,500.4);
        s1.setNumOfEmployees(3);
        assertEquals(3,s1.getNumOfEmployees());
    }

    @Test
    void setNumOfShopsTest() {
        Shop.setZeroShops();
        assertEquals(0,Shop.getNumOfShops());
        Shop s1=new Shop("Nabeel","111 main st",5,500.4);
        assertEquals(1,Shop.getNumOfShops());
    }

    @Test
    void createTest() {
        Shop s1=new Shop("Nabeel","111 main st",5,500.4);
        assertEquals(5,s1.getNumOfEmployees());
        assertEquals(500.4,s1.getAverageTurnover(),.1);
    }
}