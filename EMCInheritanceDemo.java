// Parent class (Blueprint)
class EMCCorp1 {
    private String dataCenter;
    private String badgeAccessAuthority;
    private String rnDSection;
    private String storage;

    // Constructor
    public EMCCorp1(String dataCenter, String badgeAccessAuthority, String rnDSection, String storage) {
        this.dataCenter = dataCenter;
        this.badgeAccessAuthority = badgeAccessAuthority;
        this.rnDSection = rnDSection;
        this.storage = storage;
    }

    // Getters
    public String getDataCenter() { return dataCenter; }
    public String getBadgeAccessAuthority() { return badgeAccessAuthority; }
    public String getRnDSection() { return rnDSection; }
    public String getStorage() { return storage; }
}

// Child class (Inheritance)
class EMCGlobal extends EMCCorp1 {
    private String globalPresence;

    // Child constructor calls parent constructor using super()
    public EMCGlobal(String dataCenter, String badgeAccessAuthority, String rnDSection, String storage, String globalPresence) {
        super(dataCenter, badgeAccessAuthority, rnDSection, storage); // parent fields
        this.globalPresence = globalPresence; // child-specific field
    }

    // Child-specific getter
    public String getGlobalPresence() { return globalPresence; }
}

// Main class
public class EMCInheritanceDemo {
    public static void main(String[] args) {
        EMCGlobal emcGlobal = new EMCGlobal(
                "GlobalDataCenter",
                "AccessControl",
                "AdvanceSoftwareEngineering",
                "Enterprise-level data storage solutions",
                "Presence in 60+ countries"
        );

        System.out.println("EMC DataCenter: " + emcGlobal.getDataCenter());
        System.out.println("EMC BadgeAccessAuthority: " + emcGlobal.getBadgeAccessAuthority());
        System.out.println("EMC RnDSection: " + emcGlobal.getRnDSection());
        System.out.println("EMC Storage: " + emcGlobal.getStorage());
        System.out.println("EMC GlobalPresence: " + emcGlobal.getGlobalPresence());
    }
}


