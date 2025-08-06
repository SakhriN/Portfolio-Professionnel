package org.example.models;

public class Product {

    int sellin, quality;
    String name;

    public int getSellin() {
        return sellin;
    }

    public void setSellin(int sellin) {
        this.sellin = sellin;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "sellin=" + sellin +
                ", quality=" + quality +
                ", name='" + name + '\'' +
                '}';
    }

    public void Update(Product product) {
        if (product.getSellin() == 0) {
            product.setQuality(product.getQuality() - 2);
            if(product.getQuality()<0){
                product.setQuality(0);
            }
            System.out.println("Qualité du produit : " + quality);
        } else {
            product.setSellin(product.getSellin() - 1);
            product.setQuality(product.getQuality() - 1);
            if(product.getQuality()<0){
                product.setQuality(0);
            }
            System.out.println("Nombre de jours restants pour le vendre : " + product.sellin +
                    "\n Qualité du produit : " + product.quality);
        }
    }

    public void UpdateWithName(Product product) {
        if (product.getName() == "Brie vieilli") {
            if (product.getSellin() == 0) {
                product.setQuality(product.getQuality() + 2);
                if (product.getQuality()>50){
                    product.setQuality(50);
                }
                System.out.println("Qualité du produit : " + quality);
            } else {
                product.setSellin(product.getSellin() - 1);
                product.setQuality(product.getQuality() + 1);
                if (product.getQuality()>50){
                    product.setQuality(50);
                }
                System.out.println("Nombre de jours restants pour le vendre : " + sellin +
                        "\n Qualité du produit : " + quality);

            }
        } else {
            if (product.getSellin() == 0) {
                product.setQuality(product.getQuality() - 2);
                if(product.getQuality()<0){
                    product.setQuality(0);
                }
                System.out.println("Qualité du produit : " + quality);
            } else {
                product.setSellin(product.getSellin() - 1);
                product.setQuality(product.getQuality() - 1);
                if(product.getQuality()<0){
                    product.setQuality(0);
                }
                System.out.println("Nombre de jours restants pour le vendre : " + sellin +
                        "\n Qualité du produit : " + quality);

            }
        }
    }
}

