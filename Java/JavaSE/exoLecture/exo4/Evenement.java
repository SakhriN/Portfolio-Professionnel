package exo4;

public class Evenement {
    private String description;
    private String type;
    private int montant;
    private String reussite;
    private String echec;

    public Evenement(String description, String type, int montant, String reussite, String echec) {
        this.description = description;
        this.type = type;
        this.montant = montant;
        this.reussite = reussite;
        this.echec = echec;
    }

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }

    public int getMontant() {
        return montant;
    }

    public String getReussite() {
        return reussite;
    }

    public String getEchec() {
        return echec;
    }

    public String toString() {
        return "Evenement : " + description;
    }



}
