package attractions;

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity, ITicketed {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    public boolean isAllowedTo(Visitor visitor){
        if (visitor.getAge() > 12 && visitor.getHeight() > 145){
            return true;
        }
        else{
            return false;
        }
    }

    public double defaultPrice(){
        return 8.40;
    }

    public double priceFor(Visitor visitor){
        if (visitor.getHeight() > 200){
            return 16.80;
        }
        else {
            return 8.40;
        }
    }
}
