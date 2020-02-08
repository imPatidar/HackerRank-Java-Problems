import java.util.Scanner;

class solution7 {
    public static void main(String[] args) {

        bookByTitle[] b = new bookByTitle[4];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < b.length; i++) {

            int id = sc.nextInt();
            sc.nextLine();
            String title = sc.nextLine();
            String author = sc.nextLine();
            double price = sc.nextDouble();
            sc.nextLine();
            b[i] = new bookByTitle(id, title, author, price);
        }

        String searchString = sc.nextLine();
        bookByTitle[] result = searchBook(b, searchString);
        for (int i = 0; i < result.length; i++) {
            if (result[i] != null) {
                System.out.println(result[i].getId());
            }

        }

    }

    public static bookByTitle[] searchBook(bookByTitle[] b, String searchString) {
        bookByTitle[] temp = new bookByTitle[4];
        int j = 0;

        for (int i = 0; i < b.length; i++) {
            if (b[i].getTitle().toLowerCase().contains(searchString)) {
                temp[j++] = b[i];
            }

        }

        //Sort in Ascending order

        for (int i = 0; i < j - 1; i++) {
            for (int k = 0; k < j - i - 1; k++) {
                if (temp[k].getId() > temp[k + 1].getId()) {
                    //Swap
                    bookByTitle bs = temp[k];
                    temp[k] = temp[k + 1];
                    temp[k + 1] = bs;
                }
            }
        }
        return temp;
    }
}


public class bookByTitle {
    int id;
    String title;
    String author;
    double price;

    public bookByTitle(int id, String title, String author, double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
