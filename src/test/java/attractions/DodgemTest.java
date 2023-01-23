package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;

    Visitor person;
    Visitor person2;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5);
        person = new Visitor(13, 165.00, 10.00);
        person2 = new Visitor(6, 130.00, 10.00);
    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void canChargeTicket(){
        assertEquals(4.50, dodgems.defaultPrice(), 0.0);
    }

    @Test
    public void canChargeTicketForSpecificVisitor(){
        assertEquals(4.50, dodgems.priceFor(person), 0.0);
    }

    @Test
    public void canHalfTicketForSpecificVisitor(){
        assertEquals(2.25, dodgems.priceFor(person2), 0.0);
    }
}
