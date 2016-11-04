package ds.algo.journey;

import java.util.Comparator;

/**
 * Created by sp1ffygeek on 11/4/16.
 */
public class ItineraryComparator implements Comparator<JourneyLeg> {

    @Override
    public int compare(JourneyLeg o1, JourneyLeg o2) {

        if (null == o1 || null == o2) {
            return -1;
        }
        //Objects.requireNonNull(o1,"object 1 cannot be null");
        //Objects.requireNonNull(o2,"object 2 cannot be null");
        //-1, 0, 1
        if (o1.getOrigination().equalsIgnoreCase(o2.getOrigination())) {
            return 0;
        } else if (o2.getOrigination().equalsIgnoreCase(o1.getDestination())) {
            return 1;
        } else {
            return -1;
        }
    }
}
