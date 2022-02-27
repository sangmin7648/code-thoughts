public class Love {

    boolean iLoveHer;

    boolean sheLovesMe;

    public String getRelationship() {
        if (iLoveHer) {
            return "She's not interested";
        } else if (sheLovesMe) {
            return "I'm not interested";
        } else {
            return "We are friends";
        }
    }

}
