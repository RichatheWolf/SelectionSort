 import java.util.ArrayList;
import java.util.List;

public class MovieRunner {
    private static List<Movie> movies = new ArrayList<Movie>();

    public static void addMovies() {
        movies.add(new Movie("Spiderman: Into the Spiderverse", 2018, "Sony Pictures"));
        movies.add(new Movie("Big Hero 6", 2014, "Disney"));
        movies.add(new Movie("Enchanted", 2007, "Disney"));
        movies.add(new Movie("Puss In Boots: The Last Wish", 2022, "Dreamworks"));
        movies.add(new Movie("WALL-E", 2008, "PIXAR"));
        movies.add(new Movie("Suzume", 2022, "Toho"));
        movies.add(new Movie("Belle", 2021, "Toho"));
        movies.add(new Movie("Ratatouille", 2007, "PIXAR"));
        movies.add(new Movie("Spiderman: Across the Spiderverse", 2023, "Sony Pictures"));
        movies.add(new Movie("How to Train Your Dragon", 2010, "Dreamworks"));
    }

    public static void print() {
        System.out.println();
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }
    
    public static void selectionSortByTitle(List<Movie> movies, int sort){
        for(int i = 0; i < movies.size()-1; i++){
            int position = i;
            for(int j = i+1; j < movies.size(); j++){
                if(sort ==1){
                    if(movies.get(j).getTitle().compareTo(movies.get(position).getTitle()) < 0){
                        position = j;
                    }
                } else if (sort == 2) {
                    if(movies.get(j).getTitle().compareTo(movies.get(position).getTitle()) > 0){
                        position = j;
                    }
                }
            }
            Movie movie = movies.get(position);
            movies.set(position, movies.get(i));
            movies.set(i, movie);
        }
    }
    
    public static void selectionSortByStudio(List<Movie> movies, int sort){
        for(int i = 0; i < movies.size()-1; i++){
            int position = i;
            for(int j = i+1; j < movies.size(); j++){
                if(sort ==1){
                    if(movies.get(j).getStudio().compareTo(movies.get(position).getStudio()) < 0){
                        position = j;
                    }
                } else if (sort == 2) {
                    if(movies.get(j).getStudio().compareTo(movies.get(position).getStudio()) > 0){
                        position = j;
                    }
                }
            }
            Movie movie = movies.get(position);
            movies.set(position, movies.get(i));
            movies.set(i, movie);
        }
    }
    
    public static void selectionSortByYear(List<Movie> movies, int sort){
        for(int i = 0; i < movies.size()-1; i++){
            int position = i;
            for(int j = i+1; j < movies.size(); j++){
                if(sort ==1){
                    if(movies.get(j).getYear() < movies.get(position).getYear()){
                        position = j;
                    }
                } else if (sort == 2) {
                    if(movies.get(j).getYear() > movies.get(position).getYear()){
                        position = j;
                    }
                }
            }
            Movie movie = movies.get(position);
            movies.set(position, movies.get(i));
            movies.set(i, movie);
        }
    }

    public static void main(String[] args) {
        addMovies();
        print();
        System.out.println();
        System.out.println("Sorting your list of movies by their Title A-Z:");
        selectionSortByTitle(movies, 1);
        print();
        System.out.println();
        System.out.println("Sorting your list of movies by the name of the Studio A-Z:");
        selectionSortByStudio(movies, 1);
        print();
        System.out.println();
        System.out.println("Sorting your list of movies by Year released oldest-newest:");
        selectionSortByYear(movies, 1);
        print();
        System.out.println();
        System.out.println("Sorting your list of movies by their Title Z-A:");
        selectionSortByTitle(movies, 2);
        print();
        System.out.println();
        System.out.println("Sorting your list of movies by the name of the Studio Z-A:");
        selectionSortByStudio(movies,2);
        print();
        System.out.println();
        System.out.println("Sorting your list of movies by Year released newest-oldest:");
        selectionSortByYear(movies, 2);
        print();
    }
} 