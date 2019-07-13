import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortingToolLong {

     public void sortingToolLong() {
         ArrayList<Mapa> longList = new ArrayList<>();
         Scanner scanner = new Scanner(System.in);
         int i=0;
         while (scanner.hasNextLong()) {
             final long Long = scanner.nextLong();
             i++;
             boolean flag = true;
             for (Mapa e : longList) {
                 if (e.getLong()==Long) {
                     e.addData();
                     flag = false;
                 }
             }
             if (flag) {
                 Mapa newList = new Mapa(Long, 1);
                 longList.add(newList);
             }
         }
         Collections.sort(longList,Mapa.LongComparable);
         Collections.sort(longList);
         int summa=0;
         for (Mapa e: longList){
             summa+=e.getData();
         }
         System.out.println("Total numbers: "+ i +".");
         for (Mapa e: longList){
             e.outLong(summa);
         }
     }
     public void naturalLong(){
         ArrayList<Mapa> longList = new ArrayList<>();
         Scanner scanner = new Scanner(System.in);
         while (scanner.hasNextLong()) {
             final long Long = scanner.nextLong();
                 Mapa newList = new Mapa(Long, 1);
                 longList.add(newList);
         }
         Collections.sort(longList,Mapa.LongComparable);
         System.out.println("Total numbers: "+ longList.size()+".");
         System.out.print("Sorted data:");
         for (Mapa e: longList)
             System.out.print(" "+e.getLong());
     }
}
