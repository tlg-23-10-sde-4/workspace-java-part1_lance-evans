package com.entertainment;

import java.util.Arrays;

/*
 * Business class to model the workings of a television
 */
public class Television {
    //class level shared static variables
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;
    private static int instanceCount = 0;
    public static final String[] VALID_BRANDS = {"Sony", "Samsung", "LG", "Toshiba"};

    public static int getInstanceCount() {
        return instanceCount;
    }

    //FIELDS or INSTANCE VARIABLES
    // Attributes/properties/fields/instance variables
    private String brand;
    private int volume = 1;
    private DisplayType display = DisplayType.LED; // intialize to default displayType of LED
    private boolean isOn;
    // for muting behavior
    private boolean isMute;
    private int storedVolume;

    //constructors
    public Television() {
        instanceCount++;
    }

    public Television(String brand) {
        this();                     //delegate to no-arg ctor for the increment
        setBrand(brand);            //delegate to setter for any validation
    }

    public Television(String brand, int volume) {
        this(brand);                //delegate to 1-arg ctor above for brand
        setVolume(volume);          //handle volume by delegating to the setter for validation
    }

    public Television(String brand, int volume, DisplayType display) {
        this(brand, volume);
        setDisplay(display);
    }

    //BUSINESS METHODS
    // Functions/Operations/methods - what does it do?
    // Function to turn TV on
    private void muted() {
        setMute(true);
        storedVolume = volume;
        setVolume(MIN_VOLUME);
        System.out.println("TV is now muted. Volume: " + volume);
    }

    private void unMute() {
        setMute(false);
        setVolume(storedVolume);
        System.out.println("TV is no longer muted. Volume: " + storedVolume);
    }

    public void mute() {
        if (isMuted()) {
            unMute();
        } else {
            muted();
        }
    }

    public void turnOn() {
        boolean isConnected = verifyInternetConnection();
        if (isConnected) {
            isOn = true;
            System.out.println(getBrand() + " TV is now on and the volume level is at " + getVolume() + ".");
        } else {
            isOn = false;
            System.out.println(getBrand() + " com.entertainment.Television is not connected. Please check your connection.");
        }
    }

    // Function to turn TV off
    public void turnOff() {
        if (isOn) {
            System.out.println(getBrand() + " TV is shutting down...");
            isOn = false;
        } else {
            System.out.println(getBrand() + " TV is not on, therefore, we can not turn it off... Please turn on your TV first.");
        }

    }

    //ACCESSOR METHODS
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (isValidBrand(brand)) {
            this.brand = brand;
        } else {
            System.out.println("Error: invalid brand. Please select from the following: " + Arrays.toString(VALID_BRANDS));
        }
    }

    private static boolean isValidBrand(String brand) {
        boolean valid = false;
        for (String currentBrand : VALID_BRANDS) {
            if (brand.equals(currentBrand)) {
                valid = true;
                break;
            }
        }
        return valid;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        //if (isMute){
        //    unMute();
        //}
        if (volume >= MIN_VOLUME && volume <= MAX_VOLUME) {
            isMute = false;
            this.volume = volume;
        }
        //if (volume < MIN_VOLUME){
        //    this.volume = MIN_VOLUME;
        //}
        //if (volume > MAX_VOLUME){
        //    this.volume = MAX_VOLUME;
        //}
        else {
            System.out.printf("Invalid volume: %s. Must be between %s and %s.\n", volume,
                    MIN_VOLUME, MAX_VOLUME);
            //System.out.println("Error: invalid volume. Number between " + MIN_VOLUME + " and " + MAX_VOLUME);
        }

    }

    private boolean isMuted() {
        return isMute;
    }

    private void setMute(boolean mute) {
        isMute = mute;
    }

    public DisplayType getDisplay() {
        return display;
    }

    public void setDisplay(DisplayType display) {
        this.display = display;
    }

    private boolean verifyInternetConnection() {
        return true; //fake implementation
    }

    // toString()
    public String toString() {
        String volumeString;
        if (volume == 0) {
            volumeString = "<muted>";
        } else {
            volumeString = String.valueOf(getVolume());
        }
        return String.format("com.entertainment.Television: %s; Volume: %s; com.entertainment.DisplayType: %s.", getBrand(),
                volumeString, getDisplay());
        //return "com.entertainment.Television: " + getBrand() + "; Volume: " + volumeString +
        // "; com.entertainment.DisplayType: " + getDisplay();
    }
}