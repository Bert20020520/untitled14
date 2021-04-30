package music;

public class Instrument {
    void play(Note n){
        System.out.print("music.Instrument.play()"+n);
    }
    String What() {
        return "music.Instrument"; }
    void adjust() {
        System.out.println("Adjusting music.Instrument");
    }
    public String toString(){
        return What();
    }
}