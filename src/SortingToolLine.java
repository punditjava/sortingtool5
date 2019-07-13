import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortingToolLine {

    public void sortingToolLine() {

        ArrayList<Mapa> lineList = new ArrayList<>();
        int i=0;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            final String line = scanner.nextLine();
            i++;
            boolean flag = true;
            for (Mapa e : lineList) {
                if (e.getWord().equals(line)) {
                    e.addData();
                    flag = false;
                }
            }
            if (flag) {
                Mapa newList = new Mapa(line, 1);
                lineList.add(newList);
            }
        }
        Collections.sort(lineList,Mapa.WordComparable);
        Collections.sort(lineList);
        int summa=0;
        for (Mapa e: lineList){
            summa+=e.getData();
        }
        System.out.println("Total lines: "+ i +".");
        for (Mapa e: lineList){
            e.outWord(summa);
        }
    }
    public void naturalLine(){
        ArrayList<Mapa> lineList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            final String line = scanner.nextLine();
            Mapa newList = new Mapa(line, 1);
            lineList.add(newList);
        }
        Collections.sort(lineList,Mapa.WordComparable);
        System.out.println("Total lines: "+ lineList.size()+".");
        System.out.println("Sorted data:");
        for (Mapa e: lineList)
            System.out.println(" "+e.getWord());
    }
}