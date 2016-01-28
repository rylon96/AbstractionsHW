package abstractionshw.Abs1;

public class Wisconsin extends State {

    @Override
    public void getNumberOfCities() {
        System.out.println(106 + " Cites");
    }

    @Override
    public void getLandmass() {
        System.out.println(1+","+ 500 +","+ 100 + " SqFt");        
    }
    
}
