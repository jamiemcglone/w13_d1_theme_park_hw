package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor person;
    Visitor person2;

    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1);
        person = new Visitor(12, 130.00, 10.00);
        person2 = new Visitor(22, 130.00, 10.00);
    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }

    @Test
    public void canAllowVisit(){
        assertEquals(true, tobaccoStall.isAllowedTo(person2));
    }

    @Test
    public void cannotAllowVisit(){
        assertEquals(false, tobaccoStall.isAllowedTo(person));
    }
}
