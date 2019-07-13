import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortingToolWord {

    protected void sortingToolWord() {
        ArrayList<Mapa> wordList= new ArrayList<>();
        int i =0;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            final String word = scanner.next();
            i++;
            boolean flag = true;
            for (Mapa e: wordList){
                if(e.getWord().equals(word))
                {e.addData();  flag=false;    }
            }
            if (flag){
            Mapa newWord = new Mapa(word,1);
            wordList.add(newWord);}
        }
        Collections.sort(wordList,Mapa.WordComparable);
        Collections.sort(wordList);
        int summa=0;
        for (Mapa e: wordList){
            summa+=e.getData();
        }
        System.out.println("Total words: "+ i +".");
        for (Mapa e: wordList){
            e.outWord(summa);
        }
      }
      public void naturalWord(){
          ArrayList<Mapa> wordList= new ArrayList<>();
          Scanner scanner = new Scanner(System.in);
          while (scanner.hasNext()) {
              final String word = scanner.next();
              Mapa newWord = new Mapa(word,1);
              wordList.add(newWord);
      }
          Collections.sort(wordList,Mapa.WordComparable);
          System.out.println("Total words: "+ wordList.size()+".");
          System.out.print("Sorted data:");
          for (Mapa e: wordList)
              System.out.print(" "+e.getWord());
      }
    }
