package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    Playground playground;
    Visitor person;
    Visitor person2;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
        person = new Visitor(12, 130.00, 10.00);
        person2 = new Visitor(17, 130.00, 10.00);
    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void canAllowVisit(){
        assertEquals(true, playground.isAllowedTo(person));
    }

    @Test
    public void cannotAllowVisit(){
        assertEquals(false, playground.isAllowedTo(person2));
    }
}