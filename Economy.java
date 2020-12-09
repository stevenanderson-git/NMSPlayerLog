public abstract class Economy implements Comparable {
    // Economy Strength Scores
    public static final int LOW = 0;
    public static final int MEDIUM = 1;
    public static final int HIGH = 2;

    private int economyType;
    private int economyStrength;

    public void setEconomyType(int economyType) {
        this.economyType = economyType;
    }

    public int getEconomyType() {
        return economyType;
    }

    public void setEconomyStrength(int economyStrength) {
        this.economyStrength = economyStrength;
    }

    public int getEconomyStrength() {
        return economyStrength;
    }

    @Override
    public int compareTo(Object o) {
        // TODO: COmplete
        return 0;
    }

}
