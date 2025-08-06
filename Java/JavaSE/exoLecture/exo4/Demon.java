package exo4;

public class Demon {
    private String name;
    private int force;
    private long hp;
private String description;



    public Demon(String name, int force, long hp, String description) {
        this.name = name;
        this.force = force;
        this.hp = hp;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public long getHp() {
        return hp;
    }

    public void setHp(long hp) {
        this.hp = hp;
    }

    public int attaque(){
return (int)(Math.random()*force);
    }

    public void subis(long dmg){
        setHp(getHp() - dmg);
    }

    public String toString(){
        return name + ", force : " + force + ", PV : " + hp + ".\n" + description+"\n";
    }
}
