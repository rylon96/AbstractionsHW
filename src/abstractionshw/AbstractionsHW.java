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
        wi.getLandmass();
        wi.getNumberOfCities();
        System.out.println("");
        System.out.println("Dasani Water bottle");
        dasani.getThickness();
        dasani.getVolume();
        System.out.println("");
        System.out.println("Empire State Building");
        ESB.getNumberOfFloors();
        ESB.getCoordinates();
        System.out.println("");
        System.out.println("Optimus Prime");
        OP.getIntellegence();
        OP.getWeaponry();
        System.out.println("");
        System.out.println("Luke Skywalker");
        LS.getLightsaberColor();
        LS.getHigherPower();
        System.out.println("");
        System.out.println("Gandalf");
        gandalf.getRace();
        gandalf.getMagicType();
        gandalf.speak();
        
    }
    
}
