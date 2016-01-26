package abstractionshw;

import abstractionshw.Abs1.Wisconsin;
import abstractionshw.Abs2.WaterBottle;

public class AbstractionsHW {
    public static void main(String[] args) {
        
        Wisconsin wi = new Wisconsin();
        WaterBottle dasani = new WaterBottle();
        
        System.out.println("Wisconsin");
        wi.landmass();
        wi.numberOfCities();
        System.out.println("Dasani Water bottle");
        dasani.thickness();
        dasani.volume();
    }
    
}
