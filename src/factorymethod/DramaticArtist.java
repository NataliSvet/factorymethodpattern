package factorymethod;

public class DramaticArtist implements Artist {
    @Override
    public void display() {
        System.out.println("Я артист театра драмы");
    }
    @Override
    public void play_a_role() {
        System.out.println("Я вышел на сцену");
    }

    @Override
    public void stop_a_role() {
        System.out.println("Я ушёл со сцены");
    }

}
