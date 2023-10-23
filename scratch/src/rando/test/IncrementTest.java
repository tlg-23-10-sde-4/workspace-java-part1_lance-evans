package rando.test;

class IncrementTest {

    public static void main(String[] args) {
        int i = 3;

        while (i < 10){
            // i++ increments after output
            System.out.println("i is equal to " + i);
            i++;
        }
        int j = 1;
        while (j < 10){
            // ++j increments before output
            System.out.println("j is equal to " + ++j);
            j++;
        }

    }
}