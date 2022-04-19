package command.reciever;

public class Stereo {

    private String room;

    public Stereo(String room) {
        this.room = room;
    }

    public void on(){
        System.out.println("Stereo in " + room + " is on!");
    }

    public void off(){
        System.out.println("Stereo in " + room + " is off!");
    }

    public void setCD() {
        System.out.println("Set CD");
    }

    public void setDVD() {
        System.out.println("Set DvD");
    }

    public void setRadio() {
        System.out.println("Set radio");
    }

    public void setVolume(int volume) {
        System.out.println("Volume is " + volume);
    }
}
