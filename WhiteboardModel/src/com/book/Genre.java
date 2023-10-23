package com.book;

public enum Genre {
    FICTION("Fiction"),
    NARRATIVE("Narrative"),
    SCIENCE_FICTION("Science-Fiction"),
    NOVEL("Novel"),
    MYSTERY("Mystery"),
    HISTORICAL_FICTION("Historical-Fiction"),
    FANTASY_FICTION("Fiction-Fantasy"),
    ROMANCE("Romance"),
    THRILLER("Thriller"),
    HISTORY("History"),
    HUMOR("Humor"),
    SELFHELP("Self-Help"),
    MEMOIR("Memoir"),
    BIOGRAPHY("Biography"),
    ACTION_AND_ADVENTURE("Action and Adventure"),
    ANTHOLOGY("Anthology"),
    CLASSIC("Classic"),
    COMIC_AND_GRAPHIC_NOVEL("Comic and Graphic-Novel"),
    CRIME_AND_DETECTIVE("Crime and Detective"),
    DRAMA("Drama"),
    FABLE("Fable"),
    FAIRY_TALE("Fairy-Tale"),
    HORROR("Horror"),
    YOUNG_ADULT("Young-Adult"),
    VAMPIRE("Vampire"),
    MAGIC_SCHOOL_FANTASY("Magic School-Fantasy"),
    ADULT_FANTASY("Adult-Fantasy"),
    EPIC_FANTASY("Epic-Fantasy"),
    HIGH_FANTASY("High-Fantasy");

    private final String display;

    Genre(String display){
        this.display = display;
    }

    public String display(){
        return display;
    }
    public String toString(){
        return display();
    }
}