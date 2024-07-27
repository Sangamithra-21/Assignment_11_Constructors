package Assignment_11_Constructors;

import java.util.ArrayList;

class Movie {

    String movieName;
    String hero;
    String heroine;
    double budjet;
    String director;

    Movie(String name,String hero,String heroine,double budjet,String director)
    {
        this.movieName=name;
        this.hero=hero;
        this.heroine=heroine;
        this.budjet=budjet;
        this.director=director;
    }

    void display()
    {
        System.out.println("Movie Name      : "+movieName);
        System.out.println("Hero            : "+hero);
        System.out.println("Heroine         : "+heroine);
        System.out.println("Budget          : "+budjet);
        System.out.println("Director        : "+director);
    }

}

public class MovieDemo {
    public static void main(String[] args) {
        ArrayList<Movie> movieList = new ArrayList<>();
        Movie m1 = new Movie("Gilli", "Vijay", "Trisha", 700000, "Dharani");
        Movie m2 = new Movie("Aadhavan", "Surya", "Thamana", 800000, "Ravi kumar");
        movieList.add(m1);
        movieList.add(m2);
        for (Movie m : movieList) {

            m.display();
            System.out.println("-------------------------------------------------------");
        }

    }
}
