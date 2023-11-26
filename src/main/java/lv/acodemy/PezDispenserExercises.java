package lv.acodemy;

public class PezDispenserExercises {
    public static void main(String[] args) {

        PezDispenser mickeyMouse1 = new PezDispenser(5);
        mickeyMouse1.giveCandies(1);
        mickeyMouse1.giveCandies(10);
        mickeyMouse1.giveCandies(3);

        mickeyMouse1.chargeCandies(1);
        mickeyMouse1.chargeCandies(12);
        mickeyMouse1.chargeCandies(2);
        mickeyMouse1.chargeCandies(4);

        System.out.println(mickeyMouse1);


    }
}