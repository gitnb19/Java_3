public class Item implements Comparable<Item>
{
      String name;
      int weight;
      Item(String name,int weight){
            this.name = name;
            this.weight = weight;
            /*System.out.println("Item Class:");
            System.out.println("Item name = " +this.name);
            System.out.println("Item weight = " +this.weight);*/
      }
      public int compareTo(Item item) {
            return weight > item.weight?1:-1;
      }
}
