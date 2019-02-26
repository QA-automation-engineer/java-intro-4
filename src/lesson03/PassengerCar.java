package lesson03;

public class PassengerCar extends Car implements Climatable{

    /*
    private Person[] persons;
    */

    public PassengerCar(String manufacturer, int produceYear, String color) {
        super(manufacturer, produceYear, color);
    }

    public PassengerCar(String manufacturer, int produceYear, String color, Engine engine) {
        super(manufacturer, produceYear, color, engine);
    }

    //Overload
    void summ(int i1, int i2) {
        int res = i1 + i2;
        System.out.println("Summ is:" + res);
    }

    //Overload
    void summ(double d1, double d2) {
        double res = d1 + d2;
        System.out.println("Summ is:" + res);
    }

    @Override
    public void climateControl(int temp) {
        System.out.println("Climate control tries to make temp: " + temp);
    }

    @Override
    protected String getName() {
        return "Passenger car";
    }
}
