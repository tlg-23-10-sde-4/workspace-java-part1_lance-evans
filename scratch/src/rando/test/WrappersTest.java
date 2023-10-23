package rando.test;

class WrappersTest {
    public static void main(String[] args) {
        String ageInput = "31";
        int age = Integer.parseInt(ageInput);
        Integer ageInteger = Integer.valueOf(ageInput);

        String brainCellsInput = "86511511511";
        long brainCells = Long.parseLong(brainCellsInput);
        Long brainCellsLong = Long.valueOf(brainCellsInput);

        String shoeSizeInput = "14.0";
        double shoeSize = Double.parseDouble(shoeSizeInput);
        Double shoeSizeDouble = Double.valueOf(shoeSizeInput);

        String sunnyInput = "True";
        boolean isSunny = Boolean.parseBoolean(sunnyInput);
        Boolean isSunnyBoolean = Boolean.valueOf(sunnyInput);


    }
}