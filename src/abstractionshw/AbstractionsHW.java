package abstractionshw;

import abstractionshw.Abs1.Wisconsin;
import abstractionshw.Abs2.WaterBottle;
import abstractionshw.Abs3.EmpireStateBuilding;

public class AbstractionsHW {
    public static void main(String[] args) {
        
        Wisconsin wi = new Wisconsin();
        WaterBottle dasani = new WaterBottle();
        EmpireStateBuilding ESB = new EmpireStateBuilding();
        
        System.out.println("Wisconsin");
        wi.landmass();
        wi.numberOfCities();
        System.out.println("Dasani Water bottle");
        dasani.thickness();
        dasani.volume();
        System.out.println("Empire State Building");
        ESB.numberOfFloors();
        ESB.coordinates();
    }
    
}
