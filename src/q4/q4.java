
import java.util.*;
import java.io.*;

interface featurable {

    void foregraound();

    void background();

    void font();
}

class tableException extends Exception {

    public tableException(String str) {
        super(str);
    }
}

class DataTable implements featurable {

    public void foregraound() {
        System.out.println();
    }

    public void background() {
        System.out.println();
    }

    public void font() {
        System.out.println();
    }

}

public class q4 {

    static int row, cell;
    static int column;
    static int font, size;
    static int cells[] = null;
    static String color;
    static String c;

    public static void main(String[] args) throws tableException, IOException {

        DataTable obj = new DataTable();

        int ch;
        do {
            System.out.println("1. Add A Table ");
            System.out.println("2. Get Table Details ");
            System.out.println("3.  Edit Number of Rows and Columns ");
            System.out.println("4. Exit");
            Scanner sc = new Scanner(System.in);
            ch = sc.nextInt();
            Hashtable<Integer, Integer> ht1 = new Hashtable<>();
            Hashtable<Integer, String> ht2 = new Hashtable<>();
            switch (ch) {
                case 1:

                    System.out.println("Enter The Number of rows :- ");
                    row = sc.nextInt();

                    System.out.println("Enter the Number of coumns :- ");
                    column = sc.nextInt();

                    //       System.out.println(ht1.values());
                    if (row > 200 && column > 200) {
                        throw new tableException("Row and column cannot be more than 200...");
                    }
                    System.out.println("Enter Values in Cells : ");
                    cell = row * column;

                    cells = new int[cell];

                    for (int i = 0; i < cell; i++) {
                        System.out.println("Enter value of  " + i);
                        cells[i] = sc.nextInt();
                    }

                    System.out.println("Set Color of Table");
                    color = sc.next();

                    System.out.println("Enter Font Size :");

                    size = sc.nextInt();
                    break;
                case 2:
                    for (int i = 0; i < cells.length; i++) {
                        System.out.println("Values in Cells  " + i + " : " + cells[i]);
                    }
                    System.out.println("number of rows and column   " + row + "  " + column);
                    ht1.put(row, column);
                    ht2.put(size, color);

                    for (Map.Entry<Integer, Integer> e : ht1.entrySet()) {
                        System.out.println(" Number of Rows :="+ e.getKey() + " Number of Columns  :="
                                + e.getValue());
                    }
                    for (Map.Entry<Integer, String> e : ht2.entrySet()) {
                        System.out.println( "Font Size  :=" + e.getKey() + " "
                                +"Color  :="  +  e.getValue());
                    }

                    break;

                case 3:
                    System.out.println("Enter The New  Number of rows :- ");
                    row = sc.nextInt();

                    System.out.println("Enter the New  Number of coumns :- ");
                    column = sc.nextInt();
                    
                    
                    //       System.out.println(ht1.values());
                    if (row > 200 && column > 200) {
                        throw new tableException("Row and column cannot be more than 200...");
                    }
                    break;
                case 4:
                    
                        break;
             
            }
        } while (ch != 4);

//        Scanner sc = new Scanner(System.in);
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        Hashtable<Integer, String> ht = new Hashtable<>();
//        else
//        {
//            System.out.println("Enter " + row + " font and color :- ");
//            for(int i=0;i<row;i++)
//            {
//                System.out.println("Enter Font size :- ");
//                font = sc.nextInt();
//                
//                System.out.println("Enter Color :- ");
//                color = br.readLine();
//                
//                ht.put(font, color);
//            }
//            System.out.println();
//            System.out.println("All the Records are :- ");
//            for(Map.Entry m:ht.entrySet())
//            {
//                System.out.println(m.getKey() + " -- " + m.getValue());
//            }
        //    }
    }
}
