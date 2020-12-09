/**
 * 
 */
public class StarSystem {
    private String systemName;
    private boolean hasBase;
    private Economy economy;

    public StarSystem() {
        systemName = "Default System";
        hasBase = false;
        economy = null;
    }

    public StarSystem(String systemName, boolean hasBase, Economy economy) {
        this.systemName = systemName;
        this.hasBase = hasBase;
        this.economy = economy;
    }
}
