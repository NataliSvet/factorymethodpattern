package factorymethod;

public class MovieActor implements Artist{
    @Override
    public void display() {
        System.out.println("Я киноактёр");
    }
    @Override
    public void play_a_role() {
        System.out.println("Я пришёл на съёмку фильма");
    }

    @Override
    public void stop_a_role() {
        System.out.println("Сцена снята. Съёмка закончена");
    }
}
