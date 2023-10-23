package net.flix;

public class Movie {
    // Fields or instance variables\
    private String title;
    private Integer releaseYear;
    private Double revenue;
    private Rating rating;
    private Genre genre;

    //Constructors(ctor) - these get called when user calls "new"
    public Movie(String title){
        setTitle(title);
    }
    public Movie(String title, Integer releaseYear){
        this(title); // Delegate to the one arg string ctor for title
        setReleaseYear(releaseYear); // handle release year by delegating to setter
    }

    public Movie(String title, Integer releaseYear, Double revenue){
        this(title, releaseYear); //Delegate to ctor above for title, releaseYear
        setRevenue(revenue); //handle revenue myself, by delegating to its setter
    }
    public Movie(String title, Integer releaseYear, Double revenue, Rating rating){
        this(title, releaseYear, revenue); //Delegate to ctor above for title, releaseYear
        setRating(rating);
    }

    //Business or Action Methods
    //pause(), play(), rewind(), fastForward(), skipTo(), etc...


    //Accessor methods - provides "controlled access" to the object's fields
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public Rating getRating() {
        return rating;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    //toString()
    public String toString(){
        String s = getRevenue() == null ? "%s" : "%,.2f";
            return String.format("net.flix.Movie: title = %s; releaseYear = %s; revenue = " + s + ""+
                    "; rating = %s; genre = %s", getTitle(), getReleaseYear(), getRevenue(), getRating(), getGenre());
    }
}