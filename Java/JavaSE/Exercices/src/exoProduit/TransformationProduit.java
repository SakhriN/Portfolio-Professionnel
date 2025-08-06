package exoProduit;

@FunctionalInterface
public interface TransformationProduit {

    Produit transformation(Produit produit, int numero);

}
