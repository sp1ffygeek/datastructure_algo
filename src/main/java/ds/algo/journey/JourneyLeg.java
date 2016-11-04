package ds.algo.journey;

/**
 * Created by sp1ffygeek on 11/4/16.
 */
public class JourneyLeg {
    public String origination;
    public String destination;

    public JourneyLeg(String o, String d) {
        this.origination = o;
        this.destination = d;
    }

    public String getOrigination() {
        return origination;
    }

    public String getDestination() {
        return destination;
    }
}
