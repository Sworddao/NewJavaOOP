package WorkshopWeek12;
import java.util.*;

public class ArrayListForIterator{
    public static void main(String[] args){
        
        ArrayList<String> names = new ArrayList<>();
        names.add("Sai");
        names.add("Ing");
        names.add("Vector");
        names.add("Ujjkar");
        names.add("Sae");
        
        for(String x : names){
            System.out.println("Names: " + x);
        }
        
        Iterator<String> namesIterator = names.iterator();
        
        while(namesIterator.hasNext()){
            System.out.println("Iteration: " + namesIterator.next());
        }
        
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        
        for(int y : numbers){
            System.out.println("Numbers: " + y);
        }
        
        Iterator<Integer> numIterator = numbers.iterator();
        
        while(numIterator.hasNext()){
            System.out.println("Iteration: " + numIterator.next());
        }
        
        System.out.println("Names Size: " + names.size());
        System.out.println("Numbers Size: " + numbers.size());
        
        numbers.clear();
        
        names.get(2);
        names.get(4);
        names.remove(2);
        
    }
}