package abstractionshw.Abs6;

public class Gandalf extends Wizard {

    @Override
    public void magicType() {
        System.out.println("Magic Type:  Light Magic");
    }

    @Override
    public void race() {
        System.out.println("Race:   Human");
    }

    @Override
    public void speak() {
        System.out.println("You shall not pass!");
    }
    
}
