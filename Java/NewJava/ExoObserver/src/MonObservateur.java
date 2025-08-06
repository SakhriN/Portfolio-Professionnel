import java.util.List;

public class MonObservateur implements Observateur {

private String name;

public MonObservateur(String name) {
    this.name = name;
}

    @Override
    public void react(String message) {
    int random = (int) (Math.random() * 10);
    switch (random) {
        case 1->{
            System.out.println(this.name + " adore l'événement suivant : " + message);
        }
        case 2->{
            System.out.println(this.name + " aime beaucoup l'événement suivant : " + message);
        }
        case 3->{
            System.out.println(this.name + " aime bien l'événement suivant : " + message);
        }
        case 4->{
            System.out.println(this.name + " aime un peu l'événement suivant : " + message);
        }
        case 5->{
            System.out.println(this.name + " est mitigé a propos de l'événement suivant : " + message);
        }
        case 6->{
            System.out.println(this.name + " s'en fout de l'événement suivant :  " + message);
        }
        case 7->{
            System.out.println(this.name + " n'aime pas vraiment l'événement suivant :  " + message);
        }
        case 8->{
            System.out.println(this.name + " n'aime pas l'événement suivant :  " + message);
        }
        case 9->{
            System.out.println(this.name + " n'aime vraiment pas l'événement suivant :  " + message);
        }
        default->{
            System.out.println(this.name + " trouve que l'événement suivant pue la merde : " + message);
        }
    }

    }
}
