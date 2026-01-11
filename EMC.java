
//Bleuprint
class EMCCorp {
    private String dataCenter;
    private String badgeAccessAuthority;
    private String rnDSection;
    private String storage;


    //constructor
    public EMCCorp(String dataCenter, String badgeAccessAuthority, String rnDSection,String storage) {
        this.dataCenter = dataCenter;
        this.badgeAccessAuthority = badgeAccessAuthority;
        this.rnDSection = rnDSection;
        this.storage= storage;
    }
        //Getters

        public String getRnDSection(){
            return rnDSection;
        }
    public String getDataCenter(){
        return dataCenter;
    }
    public String getBadgeAccessAuthority(){
        return badgeAccessAuthority;
    }
    public String getStorage(){
        return storage;
    }

}

public class EMC {
    public static void main(String[] args) {
        EMCCorp emc =new EMCCorp("GlobalDataCenter","AccessControl","AdvanceSoftwareEngineering","enterprise-level data storage solutions");
        System.out.println("EMC DataCenter:" +" "+ emc.getDataCenter());
        System.out.println("EMC BadgeAccessAuthority:"+" " + emc.getBadgeAccessAuthority());
        System.out.println("EMC RnDSection:" + " "+emc.getRnDSection());
        System.out.println("EMC Storage:" + " " +emc.getStorage());
    }
}