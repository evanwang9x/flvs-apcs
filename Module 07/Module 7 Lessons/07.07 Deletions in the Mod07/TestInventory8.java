/**
 * The TestInventory8 class demonstrations deleting 
 * elements from an ArrayList.
 *
 * @author Jean E. Sammet
 * @version 06/16/17
 */
import java.util.*;
public class TestInventory8
{
    public static void main(String[] args)
    {
        List<InventoryItemV4> inventory = new ArrayList<InventoryItemV4>();
        // create inventory
        inventory.add( new InventoryItemV4("Towel", 200));
        inventory.add( new InventoryItemV4("Cleaning Cart", 30));
        inventory.add( new InventoryItemV4("Toiletry Sets", 100));
        inventory.add( new InventoryItemV4("Coffee Set", 300));
        inventory.add( new InventoryItemV4("Pillows", 50));

        System.out.println("   Inventory List (before deletions) ");
        System.out.println("_____________________________________");
        printInventory(inventory);
        System.out.println();
        System.out.println();

        deleteByLoc(inventory, 2);
        System.out.println("<< Delete item at index 2 >>");
        System.out.println();
        System.out.println("    Inventory List (after deletion)        ");
        System.out.println("____________________________________");
        printInventory(inventory);
        System.out.println();
        System.out.println();

        deleteByName(inventory, "Towel");
        System.out.println("<< Delete Towel item >>");
        System.out.println();
        System.out.println("    Inventory List (after deletion)        ");
        System.out.println("____________________________________");
        printInventory(inventory);
    }

    public static void printInventory(List<InventoryItemV4> itemList) 
    {
        for(InventoryItemV4 item: itemList)
            System.out.println(item);
    }
    
    public static void changeItem(List<InventoryItemV4> itemList, String find, String replace)
    {
       for(int index = 0; index < itemList.size(); index++)
           if(itemList.get(index).getName().equals(find))
               itemList.get(index).setName(replace);
    }
    
    public static void insertItem1(List<InventoryItemV4> itemList, int location, String addN, int addS)
    {
        // insert item into ArrayList
        itemList.add(location, new InventoryItemV4(addN, addS));
    }

    public static void insertItem2(List<InventoryItemV4> itemList, String find, String addN, int addS)
    {
        int location = 0;

        // find location of item you want to insert before
        for(int index = 0; index < itemList.size(); index++)
            if(itemList.get(index).getName().equals(find))
                location = index;

        // insert item into ArrayList
        itemList.add(location, new InventoryItemV4(addN, addS));
    }

    public static void deleteByLoc(List<InventoryItemV4> itemList, int location)
    {
        // delete item from ArrayList
        itemList.remove(location);
    }

    public static void deleteByName(List<InventoryItemV4> itemList, String find)
    {
        int location = 0;
        int index;

        // find location of item you want to delete
        for(index = 0; index < itemList.size(); index++)
        {
            if(itemList.get(index).getName().equals(find))
            {
                location = index;
                break;
            }
        }
        
        // delete item from ArrayList
        if (index != itemList.size())
            itemList.remove(location);
    }
}