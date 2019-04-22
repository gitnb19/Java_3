import java.util.List;

public class Main {
public static void main(String[] args) {
    System.out.println("This is the main method");
    //Item item = new Item("a", 20);
    //Rocket rocket = new Rocket();
    //boolean launchingSuccessful = rocket.launch(Rocket rocket, int cargoCarried);
    //System.out.println("Launch Successful: " +launchingSuccessful);
  //  Item item2 = new Item("a",20);

    //U2 u2 = new U2();
    //class Rocket implements SpaceShip{}
    //U1 u1 = new U1(); Moved to Simulation.java
    U2 u2 = new U2();
   // System.out.println("U1 object " +u1.rocketCost + " " + u1.rocketWeight + " " + u1.launchCrashProbability + " " + u1.landingCrashProbability );
    System.out.println("U2 object " +u2);
    Simulation simulation = new Simulation();
    List[] loadItemsU1 = simulation.loadItems();
    List[] loadItemsU2 = simulation.loadItems();
    System.out.println("loadU1 = " + loadItemsU1.toString());
    List [] loadU1 =  simulation.loadU1(loadItemsU1);
    }
    public interface SpaceShip{
        boolean launch(Rocket rocket, int cargoCarried);
        boolean land(Rocket rocket, int cargoCarried); //Rocket rocket, int cargoCarried
        boolean canCarry(Item item, Rocket rocket);
        int carry(Item item, Rocket rocket);
    }


}
