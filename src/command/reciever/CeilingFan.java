package command.reciever;

public class CeilingFan {

    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String location;
    int speed;


    public CeilingFan(String room) {
        this.location = room;
        speed = OFF;
    }

    public void high() {
        speed = HIGH;
    }

    public void medium() {
        speed = MEDIUM;
    }

    public void low() {
        speed = LOW;
    }

    public int getSpeed() {
        return speed;
    }

    public void on() {
        System.out.println("Ceiling Fan in " + location + " is on!");
    }

    public void off() {
        System.out.println("Ceiling Fan in " + location + " is off!");
        speed = OFF;
    }
}
