public class Main {
    public static void main(String[] args) {

        Dog bigBoy = new Dog();
        bigBoy.setName("Biba");
        bigBoy.setSize(100);

        Dog smallBoy = new Dog();
        smallBoy.setName("Captain Waffle");
        smallBoy.setSize(10);

        System.out.println("Weight is " + bigBoy.getSize() + " and name is " + bigBoy.getName());
        bigBoy.bark(2);
        System.out.println("Weight is " + smallBoy.getSize() + " and name is " + smallBoy.getName());
        smallBoy.bark(10);

        Value [] values = new Value[6];
        int number = 1 ;
        int i = 0;
        while (i < 6){
            values[i] = new Value();
            values[i].intValue = number;
            number *= 10;
            i += i;
        }

        int result = 0;
        i = 6;
        while (i > 0){
            i = i - 1;
            result = result + values[i].doStuff(i);
        }
        System.out.println("result " + result);

    }
}
