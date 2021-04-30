package music;

class Wind extends Instrument {
    //重写接口方法
    public void play(Note n){
        System.out.println("music.Wind.play()"+n);
    }
    String what() {
        return "music.Wind"; }
    void adjust() {
        System.out.println("Adjusting music.Wind"); }
}
