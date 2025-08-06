import axios from "axios";
import { useEffect, useState } from "react";
import { View, Text, StyleSheet, Image, useColorScheme } from "react-native";

const Detail = ({ navigation, route }) => {
    const [pokemonne, setPokemonne] = useState(null);
    const id = route.params?.id ?? Math.floor((Math.random()*151)+1);
    const colorScheme = useColorScheme();
    const styles = getStyles(colorScheme); 
    // console.log(id)
    const fetchData = async () => {
        try {

            // Récupérer les données du Pokémon
            const pokemonResponse = await axios.get(`https://pokeapi.co/api/v2/pokemon/${id}/`);
            const pokemonData = pokemonResponse.data;
            const { name } = pokemonData;
            const sprite = pokemonData.sprites.front_default;
            element1 = pokemonData.types[0].type.url;
            element2 = pokemonData.types[1]?.type.url;
            let type;
            let type2;

            const typeResponse = await axios.get(element1);
            const typeData = typeResponse.data;
            const type1FR = typeData.names.find(
              (entry) => entry.language.name === 'fr'
            );
            
            type = type1FR.name;
            if(element2){
                const type2Response = await axios.get(element2);
                const type2Data = type2Response.data;
                const type2FR = type2Data.names.find(
                    (entry) => entry.language.name === 'fr'
                );
                type2 = type2FR.name;
            }

            // const type = pokemonData.types[0].type.name
            // const type2 = pokemonData.types[1]?.type.name



            // Récupérer les données de l'espèce du Pokémon
            const speciesResponse = await axios.get(`https://pokeapi.co/api/v2/pokemon-species/${id}/`);
            const speciesData = speciesResponse.data;

            const nomFR = speciesData.names.find(
              (entry) => entry.language.name === 'fr'
            );
            
            const entryFR = speciesData.flavor_text_entries.find(
                (entry) => entry.language.name === 'fr'
            );

            // Faire quelque chose avec les données récupérées


            // console.log("Données du Pokémon :", pokemonData);
            // console.log("Données de l'espèce du Pokémon :", speciesData);
            // console.log(type)

            const bloup = [type];
            if (type2) {
                bloup.push(type2);
            }
            const poke = {
                pokemonName: nomFR.name ?? "Pokémon inconnu...",
                pokemonSprite: sprite,
                pokemonDescription: entryFR.flavor_text ?? "Pas de description pour ce Pokémon...",
                pokemonType: bloup
            }

            setPokemonne(poke);

            // Tu peux maintenant utiliser les données comme tu le souhaites
        } catch (error) {
            console.error("Erreur lors de la récupération des données :", error);
        }
    };


    useEffect(() => {
        fetchData();
    }, []);


    return (
        <View style={styles.container}>
            {pokemonne &&
                <>
                    <Text style={styles.title}>{pokemonne.pokemonName}</Text>
                    <Image style={styles.image} source={{ uri: pokemonne.pokemonSprite }} />
                    <View>
                        {pokemonne.pokemonType.length == 2 ? <Text style={styles.text}>{pokemonne.pokemonType.join(" ")}</Text> : <Text style={styles.text}>{pokemonne.pokemonType}</Text>}

                    </View>
                    <Text style={styles.text}>{pokemonne.pokemonDescription}</Text>
                </>
            }
        </View>
    );

}


const getStyles = (theme) => StyleSheet.create({
    container: {
        flex: 1,
        justifyContent: 'center',
        alignItems: 'center',
        backgroundColor: theme === 'dark' ? "rgb(0, 200, 200)" :"rgb(255, 255, 255)",
    },
    title: {
        fontSize: 72,
        textTransform: 'capitalize',
        color: theme === 'dark' ? "rgb(255, 255, 255)" :"rgb(0, 0, 0)"
    },
    text: {
        color: theme === 'dark' ? "rgb(255, 255, 255)" :"rgb(0, 0, 0)"
    },
    image: {
        width: 200,
        height: 200,
    },
});

export default Detail