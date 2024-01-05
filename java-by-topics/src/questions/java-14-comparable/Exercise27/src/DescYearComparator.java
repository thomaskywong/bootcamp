import java.util.Comparator;

public class DescYearComparator implements Comparator<Movie> {

    @Override
    public int compare(Movie o1, Movie o2) {
        
        return o2.getName().compareTo(o1.getName()) > 0 ? -1 : 1;

    }

}
