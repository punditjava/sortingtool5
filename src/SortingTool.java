public class SortingTool {

    public static void main( String[] args) {

        SortingToolWord sortword = new SortingToolWord();
        SortingToolLine sortline = new SortingToolLine();
        SortingToolLong sortlong = new SortingToolLong();
        if (args.length==1) {
            if (args[0].equals("-sortingType"))
                System.out.println("No sorting type defined!");
            else System.out.println("No data type defined!");
        }
        if (args.length==3){
            if(args[2].equals("-sortingType"))
                System.out.println("No sorting type defined!");
            else System.out.println("No data type defined!");
        }
        if (args.length>3){
            final char dm = (char) 34;
            for (int i=4;i<args.length;i++)
                System.out.println( dm+args[i]+dm+ " isn't a valid parameter. It's skipped.");
        }
        if (args.length < 3 && args.length!=1) {
            switch (args[1]){
                case "line": sortline.naturalLine();
                case "word": sortword.naturalWord();
                case "long": sortlong.naturalLong();
            }
        }else{ if(args.length!=3 && args.length!=1) {
            if (args[1].equals("long") || args[3].equals("long")) {
                if (args[3].equals("natural") || args[1].equals("natural"))
                    sortlong.naturalLong();
                else sortlong.sortingToolLong();
            }
            if (args[1].equals("word") || args[3].equals("word")) {
                if (args[3].equals("natural") || args[1].equals("natural"))
                    sortword.naturalWord();
                else sortword.sortingToolWord();
            }
            if (args[1].equals("line") || args[3].equals("line")) {
                if (args[3].equals("natural") || args[1].equals("natural"))
                    sortline.naturalLine();
                else sortline.sortingToolLine();
            }
        }
        }


    }
}

