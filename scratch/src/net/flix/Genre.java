package net.flix;

public enum Genre {
    ACTION("Action"),
    HORROR("Horror"),
    HISTORICAL("Historical"),
    COMEDY("Comedy"),
    SPORTS_ROMANCE("Sports Romance"),
    WESTERN("Western");

    private final String display;

    Genre(String display){
        this.display = display;
    }

    public String display(){ //Standard getter method, just not named  "get..."
        return display;
    }
    public String toString(){
        return display();
    }
}