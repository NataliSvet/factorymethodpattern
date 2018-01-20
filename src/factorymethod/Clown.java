package factorymethod;

public class Clown implements Artist {
    @Override
    public void display() {
        System.out.println("Я клоун - артист цирка");
    }

    @Override
    public void play_a_role() {
        System.out.println("Я начинаю шутить");
    }

    @Override
    public void stop_a_role() {
        System.out.println("Я закончил шутить");
    }
}
