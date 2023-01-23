package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor person;
    Visitor person2;
    Visitor person3;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        person = new Visitor(13, 165.00, 10.00);
        person2 = new Visitor(22, 130.00, 10.00);
        person3 = new Visitor(900, 600.00, 10.00);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void canAllowVisit(){
        assertEquals(true, rollerCoaster.isAllowedTo(person));
    }

    @Test
    public void cannotAllowVisit(){
        assertEquals(false, rollerCoaster.isAllowedTo(person2));
    }

    @Test
    public void canChargeTicket(){
        assertEquals(8.40, rollerCoaster.defaultPrice(), 0.0);
    }

    @Test
    public void canChargeTicketForSpecificVisitor(){
        assertEquals(8.40, rollerCoaster.priceFor(person), 0.0);
    }

    @Test
    public void canDoubleTicketForSpecificVisitor(){
        assertEquals(16.80, rollerCoaster.priceFor(person3), 0.0);
    }
}
