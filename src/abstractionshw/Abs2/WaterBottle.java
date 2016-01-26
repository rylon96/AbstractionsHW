package abstractionshw.Abs2;

public class WaterBottle extends Bottle {

    @Override
    public void volume() {
        System.out.println(16+" oz");
    }

    @Override
    public void thickness() {
        System.out.println(0.3 + " cm Thick");
    }
    
}
