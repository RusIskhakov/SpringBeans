package app.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class AnimalsCage {

    @Qualifier("dog")
    private Animal animal;
    private final Timer timer;


    public AnimalsCage(@Qualifier("dog")Animal animal, Timer timer) {
        this.timer = timer;
        this.animal = animal;
    }

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(new Timer().getTime());
        System.out.println("________________________");
    }

    public Timer getTimer() {
        return timer;
    }
}
