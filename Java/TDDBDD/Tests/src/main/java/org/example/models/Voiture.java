package org.example.models;

import org.example.models.exceptions.RobertException;

public class Voiture {
    int RentDueIn, Condition;
    String type;

    boolean isOld;

    public int getRentDueIn() {
        return RentDueIn;
    }

    public void setRentDueIn(int rentDueIn) {
        RentDueIn = rentDueIn;
    }

    public int getCondition() {
        return Condition;
    }

    public void setCondition(int condition) {
        Condition = condition;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isOld() {
        return isOld;
    }

    public void setOld(boolean old) {
        isOld = old;
    }

    @Override
    public String toString() {
        return "Voiture{" +
                "RentDueIn=" + RentDueIn +
                ", Condition=" + Condition +
                ", type='" + type +
                ", isOld=" + isOld +
                '}';
    }

    public void dailyRoutine(Voiture voiture) {
        if (voiture.getCondition() > 100 || voiture.getCondition() < 0) {
            throw new RobertException("Aller hop, on a un petit rigolo ici, a Auschwitz !!!");
        } else {
            if (voiture.getType().equals("luxe")) {
                voiture.Condition = voiture.Condition + 1;
            } else {
                if (voiture.getRentDueIn() == 0) {
                    if (voiture.isOld) {
                        if (voiture.getCondition() > 4) {
                            voiture.Condition = voiture.Condition - 4;
                        } else {
                            voiture.setCondition(0);
                        }
                    } else {
                        if (voiture.getCondition() > 2) {
                            voiture.Condition = voiture.Condition - 2;
                        } else {
                            voiture.setCondition(0);
                        }
                    }
                } else {
                    if (voiture.isOld) {
                        if (voiture.getCondition() > 2) {
                            voiture.Condition = voiture.Condition - 2;
                        } else {
                            voiture.setCondition(0);
                        }
                    } else {
                        voiture.Condition = voiture.Condition - 1;
                    }
                }
                voiture.setRentDueIn(voiture.getRentDueIn() - 1);
            }
        }
    }
}
