package ds.algo.journey;

import java.util.Arrays;

/**
 * Created by sp1ffygeek on 11/4/16.
 */
public class Itinerary {

    public static JourneyLeg[] setupData() {
        JourneyLeg j[] = new JourneyLeg[10];
        j[0] = new JourneyLeg("EWR", "LAX");
        j[1] = new JourneyLeg("JFK", "BOS");
        j[2] = new JourneyLeg("SJC", "LAX");
        j[3] = new JourneyLeg("BOS", "SJC");
        j[4] = new JourneyLeg("LAX", "JFK");

        return j;
    }

    public static void main(String[] args) {
        JourneyLeg k[] = setupData();
        Arrays.sort(k, new ItineraryComparator());

        System.out.println(k[0].getOrigination() + " -> " + k[0].getDestination());
        System.out.println(k[4].getOrigination() + " -> " + k[4].getDestination());
    }

}

