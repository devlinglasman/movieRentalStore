public class Rental {
    private Movie _movie;
    private int _daysRented;

    public Rental(Movie movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
    }

    public Movie get_movie() {
        return _movie;
    }

    public int get_daysRented() {
        return _daysRented;
    }

    int getFrequentRenterPoints() {
      return _movie.getFrequentRenterPoints(_daysRented);
    }

    double getCharge() {
        return _movie.getCharge(_daysRented);
    }

}
