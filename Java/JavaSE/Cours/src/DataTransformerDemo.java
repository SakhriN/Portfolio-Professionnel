import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DataTransformerDemo {

    public static void main(String[] args) {
        DataTransformer<Integer> doubleValeur = num ->num*10;
        System.out.println("décuple de 4 : " +doubleValeur.transform(4));

        DataTransformer<String> ajoutPrefixe = str ->"taf"+str;
        System.out.println("Avec préfixe : "+ajoutPrefixe.transform("fiole"));

        DataTransformer<List<Integer>> sortList = list ->{
            Collections.sort(list);
            return list;
        };

        List<Integer> numéros = Arrays.asList(3,6,45,12,48,50,1);
        System.out.println("Les numéros du loto sont : " + sortList.transform(numéros));
    }
}
