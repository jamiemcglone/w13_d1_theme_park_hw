import attractions.RollerCoaster;
import behaviours.IReviewed;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    RollerCoaster rollerCoaster;
    ArrayList<IReviewed> attractionsAndStalls;
    Visitor visitor;

    @Before
    public void before(){
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        attractionsAndStalls = new ArrayList<IReviewed>();
        attractionsAndStalls.add(rollerCoaster);
        themePark = new ThemePark(attractionsAndStalls);
        visitor = new Visitor(13, 165.00, 10.00);
    }

    @Test
    public void canReturnAllReviewableObjects(){
        assertEquals(attractionsAndStalls, themePark.getAllReviewed());
    }

    @Test
    public void canUpdateVisit(){
        themePark.visit(visitor, rollerCoaster);
        assertEquals(1, visitor.getAmountOfAttractions());
        assertEquals(1, rollerCoaster.getVisitCount());
    }

}
