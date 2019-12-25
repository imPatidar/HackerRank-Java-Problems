import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.String;
import java.util.stream.Collectors;

class Document1{
    int id;
    String title;
    String folderName;
    int pages;


    @Override
    public String toString() {
        return
                id +
                " " + title +
                " " + folderName +
                " " + pages;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFolderName() {
        return folderName;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}

public class oddPages {

    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        ArrayList<Document1> ar = new ArrayList<Document1>();



        while(sc.hasNextLine()){
            Document1 d1= new Document1();
            d1.setId(sc.nextInt());
            d1.setTitle(sc.next());
            d1.setFolderName(sc.next());
            d1.setPages(sc.nextInt());
            ar.add(d1);

        }

        ar.stream().filter(document1 -> document1.getPages() %2 != 0).forEach(document1 -> System.out.println(document1.toString()));


        }

    }