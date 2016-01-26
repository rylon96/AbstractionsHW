package abstractionshw.Abs3;

public class EmpireStateBuilding extends Building{

    @Override
    public void numberOfFloors() {
        System.out.println(102 + " Floors");
    }

    @Override
    public void coordinates() {
        System.out.println("Coordinates: " + 40.7484 + " N, " + 73.9857 + " W");
    }
    
    
}
