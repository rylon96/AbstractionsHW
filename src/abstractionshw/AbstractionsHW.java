package abstractionshw;

import abstractionshw.Abs1.Wisconsin;
import abstractionshw.Abs2.WaterBottle;

public class AbstractionsHW {
    public static void main(String[] args) {
        
        Wisconsin wi = new Wisconsin();
        WaterBottle dasani = new WaterBottle();
                
        wi.landmass();
        wi.numberOfCities();
        
        dasani.thickness();
        dasani.volume();
    }
    
}
