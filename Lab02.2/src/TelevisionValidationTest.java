class TelevisionValidationTest {

    public static void main(String[] args) {

        Television tv = new Television();

        tv.setVolume(Television.MAX_VOLUME + 1);
        tv.setBrand("Sammy");
        System.out.println(tv);
//
        tv.setBrand("Sony");
        tv.setVolume(Television.MIN_VOLUME);
        System.out.println(tv);
//
        tv.setBrand("Samsung");
        tv.setVolume(Television.MAX_VOLUME);
        System.out.println(tv);

        tv.setBrand("Toshiba");
        tv.setVolume(Television.MIN_VOLUME -1);
        tv.setDisplay(DisplayType.OLED);
        tv.mute();
        System.out.println(tv);
        tv.setVolume(45);
        System.out.println(tv);

    }
}