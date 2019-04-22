import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;                             //Needed to use java.util.ArrayList

public class Rocket implements Main.SpaceShip {

    int totalCargoWeight = 0;
    int linesRead = 0;

    int rocketCost;                                   // Remove. Already present in U1.
    int rocketWeight;                               // Remove. Already present in U1.
    int maxWeightWithCargo;                         // Remove. Already present in U1.
    int maxCargoWeight; // Remove. Already present in U1.

    File file = new File("phase-1.txt");



   // U1 u1 = new U1();                                  // Why is U1 instantiated in main method not recognized here???
    //Rocket rocket = new Rocket();

    public boolean launch(Rocket rocket, int cargoCarried){
        return true;
    }
    public boolean land(Rocket rocket, int cargoCarried) {
        return true;
    }
    public boolean canCarry(Item item, Rocket rocket) {
        boolean canCarryItem = false;
        try {
            int i = 0;
            Scanner fileScanner = new Scanner(file);
            ArrayList fileInput = new ArrayList();
            while (fileScanner.hasNextLine()){
                String line = fileScanner.nextLine();
                int weightIndex = line.indexOf('=', -1);
                int weight = java.lang.Short.valueOf(line.substring(weightIndex));
                System.out.println("Weight = "+weight);
                linesRead = linesRead +1;
                System.out.println("Lines read = " +linesRead);
                fileInput.add(line);
                i=i+1;
            }

        }
        catch (FileNotFoundException e) {
            System.out.println("phase-1 file was not found.");
        }
        if (totalCargoWeight < rocket.maxCargoWeight) {      // Made code generic to also check for U2
            canCarryItem = true;
        }
        return canCarryItem;
    }
    public int carry(Item item, Rocket rocket) {
        totalCargoWeight = totalCargoWeight + item.weight;
        return totalCargoWeight;
    }





}
