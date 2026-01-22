package WorkshopWeek12;
import java.util.*;

public class WarmUp {

    static ArrayList<Integer> nums = new ArrayList<>();
    static ArrayList<String> names = new ArrayList<>();

    public static void main(String[] args) {
        addData();
        displayUsingForEach();
        displayUsingIterator();
        showSize();
        modifyList();
    }

    public static void addData() {
        names.add("Sai");
        names.add("Ing");
        names.add("Vector");
        names.add("Kar");
        names.add("Sae");

        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
    }

    public static void displayUsingForEach() {
        for (int x : nums) {
            System.out.println("Number: " + x);
        }

        for (String y : names) {
            System.out.println("Name: " + y);
        }
    }

    public static void displayUsingIterator() {
        Iterator<Integer> numIterator = nums.iterator();
        Iterator<String> nameIterator = names.iterator();

        while (numIterator.hasNext()) {
            System.out.println("Iteration: " + numIterator.next());
        }

        while (nameIterator.hasNext()) {
            System.out.println("Iteration: " + nameIterator.next());
        }
    }

    public static void showSize() {
        System.out.println("Size of names: " + names.size());
        System.out.println("Size of numbers: " + nums.size());
    }

    public static void modifyList() {
        names.remove(2);   
        nums.clear();      
    }
}
