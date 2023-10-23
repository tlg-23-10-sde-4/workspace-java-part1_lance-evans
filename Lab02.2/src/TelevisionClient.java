class TelevisionClient {
    //application starting point - at runtime the app starts here
    public static void main(String[] args) {
        System.out.println(Television.getInstanceCount() + " instances have been created.");
        // Creating each Television instance using setter methods
        Television t1 = new Television();
        t1.setBrand("Sony"); // assigning value to brand and volume for each instance
        t1.setVolume(12);

        // Creating object instance with brand arg and setter
        Television t2 = new Television("Samsung", Television.MIN_VOLUME);

        // Creating instance with default values
        Television t3 = new Television();

        // Creating instance with ctor 2 args
        Television t4 = new Television("Toshiba", Television.MAX_VOLUME, DisplayType.OLED);

        // Calling each method for each instance
        t1.turnOn();
        t1.turnOff();
        t2.turnOn();
        t2.turnOff();
        t3.turnOn();
        t3.turnOff();
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        t4.turnOff();
        t4.turnOn();
        System.out.println(t4);
        System.out.println(Television.getInstanceCount() + " instances.");
    }
}