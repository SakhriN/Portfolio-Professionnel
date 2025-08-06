package exoProduit;

@FunctionalInterface
public interface OperationProduit {

void transformation(Produit produit, TransformationProduit transformationProduit, FiltreProduit filtreProduit);

}
