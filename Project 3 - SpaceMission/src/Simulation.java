import java.io.File;
import java.io.FileNotFoundException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.*;
import java.util.stream.Stream;
import java.util.Collections;

/*public class Simulation implements Comparable{*/
    public class Simulation{
    List[] loadItems() {
        File file_phase1 = new File("phase-1.txt");
        //System.out.println(file_phase1.exists());
        File file_phase2 = new File("phase-2.txt");
        //System.out.println(file_phase2.exists());
        ArrayList<Item> fileInput_phase1 = new ArrayList<>();
        ArrayList<Item> phase1_reverseOrder = new ArrayList();
        ArrayList<Item> fileInput_phase2 = new ArrayList<>();
        try {
            Scanner fileScanner_phase1 = new Scanner(file_phase1);
            while (fileScanner_phase1.hasNextLine()) {
                String line = fileScanner_phase1.nextLine();
                String lineSplit[] = line.split("=");
                Item item = new Item(lineSplit[0],Integer.valueOf(lineSplit[1]));
               fileInput_phase1.add(item);
            }

            phase1_reverseOrder = fileInput_phase1;
            //System.out.println("*******phase1_reverseOrder :");
            //System.out.println(phase1_reverseOrder);
            //System.out.println("*******************************************");
            //Iterator it = phase1_reverseOrder.iterator();
            //System.out.println("*********it " + it.next());
            Collections.sort(phase1_reverseOrder, Collections.reverseOrder());

            System.out.println("**************Phase1 file in sorted order:");
            System.out.println(fileInput_phase1);

            //fileInput_phase1 = sortArrayList.sortDescending(fileInput_phase1);
        } catch (FileNotFoundException e) {
            System.out.println("Phase1 file was not found");
        }
        try {
            Scanner fileScanner_phase2 = new Scanner(file_phase2);
            while (fileScanner_phase2.hasNextLine()) {
                String line = fileScanner_phase2.nextLine();
                String lineSplit[] = line.split("=");
                Item item = new Item(lineSplit[0], Integer.valueOf(lineSplit[1]));
                fileInput_phase2.add(item);
            }
            int noOfItems_phase1 = fileInput_phase1.size();
            int noOfItems_phase2 = fileInput_phase2.size();
            //System.out.println("ArrayList contents: Phase 2 " + fileInput_phase2);
        } catch (FileNotFoundException e) {
                System.out.println("Phase2 file was not found");
            }

        //return new List[] {fileInput_phase1, fileInput_phase2};
        return new List[] {phase1_reverseOrder, fileInput_phase2};
    }

    List [] loadU1(List[] loadItemsU1) {

        ArrayList<U1> fileInput_loadU1_phase1 = new ArrayList<>();
        ArrayList<U1> fileInput_loadU1_phase2 = new ArrayList<>();

        //fileInput_loadU1_phase1 = Collections.sort(fileInput_loadU1_phase1,Comparator.comparingInt(loadItemsU1[0]::sort(Comparator weight)));



        Object itemRead0 = (Item) loadItemsU1[0].get(0);
        Object itemRead1 = (Item) loadItemsU1[0].get(1);

       /* @Override*/
       /* public int compareTo(Item) {*/
            /*return 0;*/
            /*(this.getAge() < candidate.getAge() ? -1 :
                    (this.getAge() == candidate.getAge() ? 0 : 1));*/
        /*}*/

        //System.out.println("itemRead = " + itemRead);
        //System.out.println("itemRead = " + itemRead.toString());
        //System.out.println("1st Item Object in Simulation Class - Load U1 method " + itemRead);
        //System.out.println("Reading from fileInput_phase1 Arraylist:");
        //System.out.println("**********************" + ((Item) loadItemsU1[0].get(0)).weight);


        if (loadItemsU1[0].size() > 0) {
            U1 u1 = new U1();
            int totalWeightOfCargo = 0;
            int newWeightOfCargo = 0;
            Iterator<ArrayList> loadItemsU1_phase1_iterator = loadItemsU1[0].iterator();
            int itemCount = 0;
            int newCount;
            int u1Count = 1;
            System.out.println("U1 max cargo weight = " + u1.maxCargoWeight);
            try{

            while (loadItemsU1_phase1_iterator.hasNext()) {
                    /*if (itemCount > 14) {
                        System.out.println("ItemCount at beginning of while loop" +itemCount);
                    }*/
                    Object item1 = loadItemsU1[0].get(itemCount);
                    System.out.println("***********************Item Count = " +itemCount);
                    System.out.println("**********************" + ((Item) loadItemsU1[0].get(itemCount)).weight);
                    //int itemWeight = ((Item) loadItemsU1[0].get(itemCount)).weight);
                    //String name1 = item1.name;
                    //System.out.println(loadItemsU1[1]);

                    totalWeightOfCargo = totalWeightOfCargo + ((Item) loadItemsU1[0].get(itemCount)).weight;
                    System.out.println("Total Weight of Cargo = " + totalWeightOfCargo);
                    if (totalWeightOfCargo < u1.maxCargoWeight) {
                        fileInput_loadU1_phase1.add(u1);
                        //u1 = null;
                    } else {
                        System.out.println("Else executed");
                       /* newCount = itemCount;
                        while (loadItemsU1_phase1_iterator.hasNext()) {
                            item1 = loadItemsU1[0].get(newCount);
                            System.out.println("***********************New Count = " +newCount);
                            System.out.println("**********************" + ((Item) loadItemsU1[0].get(newCount)).weight);
                            newWeightOfCargo  = ((Item) loadItemsU1[0].get(itemCount)).weight + newWeightOfCargo;
                            if () {}
                            else {}
                        }*/
                        u1 = new U1();
                        u1Count = u1Count + 1;
                        totalWeightOfCargo = 0;
                    }
                    itemCount = itemCount +1;
                    loadItemsU1_phase1_iterator.next();
                }
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Please enter a valid input");
            }
                System.out.println("Number of U1 rockets needed for Phase 1 = " +u1Count);
            }
            return new List[]{fileInput_loadU1_phase1, fileInput_loadU1_phase2};
        }
    }

