package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("animalsCageBean") //Данная аннатация используется для (Сканирования) регистрации бинов.
public class AnimalsCage {

    @Autowired            // Данная аннатация используется для внедрения зависимости.
    @Qualifier("dogBean") // Данная аннатация используется для уточнения(какой бин использовать).
    private Animal animal;

    @Autowired
    private Timer timer;

    public Timer getTimer() {
        return timer;
    }

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(new Timer().getTime());
        System.out.println("________________________");
    }
}
