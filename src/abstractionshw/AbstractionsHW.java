package abstractionshw;

import abstractionshw.Abs1.Wisconsin;
import abstractionshw.Abs2.WaterBottle;
import abstractionshw.Abs3.EmpireStateBuilding;
import abstractionshw.Abs4.OptimusPrime;
import abstractionshw.Abs5.LukeSkywalker;
import abstractionshw.Abs6.Gandalf;

public class AbstractionsHW {
    public static void main(String[] args) {
        
        Wisconsin wi = new Wisconsin();
        WaterBottle dasani = new WaterBottle();
        EmpireStateBuilding ESB = new EmpireStateBuilding();
        OptimusPrime OP = new OptimusPrime();
        LukeSkywalker LS = new LukeSkywalker();
        Gandalf gandalf = new Gandalf();
        
        System.out.println("Wisconsin");
        wi.landmass();
        wi.numberOfCities();
        System.out.println("");
        System.out.println("Dasani Water bottle");
        dasani.thickness();
        dasani.volume();
        System.out.println("");
        System.out.println("Empire State Building");
        ESB.numberOfFloors();
        ESB.coordinates();
        System.out.println("");
        System.out.println("Optimus Prime");
        OP.intellegence();
        OP.weaponry();
        System.out.println("");
        System.out.println("Luke Skywalker");
        LS.lightsaberColor();
        LS.higherPower();
        System.out.println("");
        System.out.println("Gandalf");
        gandalf.race();
        gandalf.magicType();
        gandalf.speak();
        
    }
    
}
