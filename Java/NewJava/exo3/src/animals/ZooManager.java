package animals;

import interfaces.ZooAction;

import java.util.List;

public class ZooManager implements ZooAction {

    private  Bird bird;
    private  Mammal mammal;
    private  Enclosure enclosure;

    public ZooManager(){
    }

    public Bird CreateBird(String name,String species){
        return new Bird(name,species);
    }

    public Mammal CreateMammal(String name, String species){
        return new Mammal(name,species);
    }

    public Enclosure CreateEnclosure(String name){
        return new Enclosure(name);
    }


    @Override
    public void MakeAllAnimalsEats() {
        bird.eat();
        mammal.eat();
    }
}
