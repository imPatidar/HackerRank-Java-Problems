import java.util.Scanner;

class solution3 {
    public static void main(String[] args) {
        movie[] m = new movie[4];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < m.length; i++) {
            String movieName = sc.nextLine();
            String company = sc.nextLine();
            String genre = sc.nextLine();
            int budget = sc.nextInt();
            sc.nextLine();
            m[i] = new movie(movieName, company, genre, budget);
        }
        String searchString = sc.nextLine();
        getMovieByGenre(m, searchString);

    }

    public static void getMovieByGenre(movie[] m, String searchString) {

        movie[] temp = new movie[4];
        int j = 0;

        for (int i = 0; i < m.length; i++) {
            if (m[i].getGenre().toLowerCase().equals(searchString.toLowerCase())) {

                if(m[i].getBudget() < 80000000){
                    System.out.println(" Low Budget Movie");
                }else {
                    System.out.println(" High Budget Movie");
                }
            }
        }
    }
}

public class movie {
    String movieName;
    String company;
    String genre;
    int budget;

    public movie(String movieName, String company, String genre, int budget) {
        this.movieName = movieName;
        this.company = company;
        this.genre = genre;
        this.budget = budget;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getCompany() {
        return company;
    }

    public String getGenre() {
        return genre;
    }

    public int getBudget() {
        return budget;
    }


}
