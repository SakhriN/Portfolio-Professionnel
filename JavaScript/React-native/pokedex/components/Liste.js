import axios from "axios";
import { useEffect, useState } from "react";
import { View, Text, FlatList, Image, StyleSheet, Pressable } from "react-native";




export default function Liste({ navigation }) {
    const [pokemonList, setPokemonList] = useState([])

    const typeStyle = (type) => {
        switch (type) {
            case "Plante":
                return styles.grass;
            case "Combat":
                return styles.fighting;
            case "Vol":
                return styles.flying;
            case "Poison":
                return styles.poison;
            case "Sol":
                return styles.ground;
            case "Roche":
                return styles.rock;
            case "Insecte":
                return styles.bug;
            case "Spectre":
                return styles.ghost;
            case "Acier":
                return styles.steel;
            case "Feu":
                return styles.fire;
            case "Eau":
                return styles.water;
            case "Électrik":
                return styles.electric;
            case "Psy":
                return styles.psychic;
            case "Glace":
                return styles.ice;
            case "Dragon":
                return styles.dragon;
            case "Ténèbres":
                return styles.dark;
            case "Féé":
                return styles.fairy;
            default:
                return styles.normal;
        }
    }


    async function fetchPokemon() {
        try {
            const response = await axios.get("https://pokeapi.co/api/v2/pokemon?offset=0&limit=493")
            const data = await response.data.results
            let pokemonlisto = []
            // data.forEach(async element => {
            //     // const response2 = await axios.get(element.url)
            //     // const pokemonData = response2.data;
            //     // const { name } = pokemonData
            //     // const sprite = pokemonData.sprites.front_default
            //     // const type = pokemonData.types[0].type.name
            //     // const type2 = pokemonData.types[1]?.type.name
            //     // const bloup = [type]
            //     // if (type2) {
            //     //      bloup.push(type2)
            //     // }
            //     // pokemonlisto.push({name, sprite, bloup})
            //     // console.log(pokemonlisto)
            // });


            const pojemons = await Promise.all(data.map(async element => {
                const response2 = await axios.get(element.url)
                const pokemonData = response2.data;
                const { id } = pokemonData
                const sprite = pokemonData.sprites.front_default

                const Species = await axios.get(pokemonData.species.url);
                const SpecData = Species.data;
                const nomFR = SpecData.names.find(
                    (entry) => entry.language.name === 'fr'
                );
                const name = nomFR.name;

            const element1 = pokemonData.types[0].type.url
            const element2 = pokemonData.types[1]?.type.url
            let type;
            let type2;
            const typeResponse = await axios.get(element1);
            const typeData = typeResponse.data
            const type1FR = typeData.names.find(
              (entry) => entry.language.name === 'fr'
            );
            type = type1FR.name
            if(element2){
                const type2Response = await axios.get(element2);
                const type2Data = type2Response.data
                const type2FR = type2Data.names.find(
                    (entry) => entry.language.name === 'fr'
                );
                type2 = type2FR.name
            }

                const bloup = [type]
                if (type2) {
                    bloup.push("/")
                    bloup.push(type2)
                }
                return { name, id, sprite, bloup }
            }))
            setPokemonList(pojemons)

        } catch (error) {
            console.error("Erreur lors de la récupération des données :", error);
        }
    }
    useEffect(() => {
        fetchPokemon()
    }, [])



    return (
        <View>
            <FlatList numColumns={2} data={pokemonList} renderItem={({ item }) =>
                <Pressable style={[styles.container,typeStyle(item.bloup[0])]} onPress={() => { navigation.navigate("Detail", { id: item.id }) }}>
                    <Image style={styles.image} source={{ uri: item.sprite }} />
                    <Text style={styles.text}>{item.name}</Text>
                    <Text style={styles.text}>{item.bloup}</Text>
                </Pressable>}
                keyExtractor={(item, index) => index} />
        </View>

    )
}


const styles = StyleSheet.create({
    container: {
        borderWidth: 1,
        borderColor: "black",
        borderRadius: 15,
        margin: 15,
    },
    image: {
        width: 150,
        height: 150,
    },
    text: {
        color: "white",
        textAlign: "center"
    },
    grass: {
        backgroundColor: "#7AC850",
    },

    fighting: {
        backgroundColor: "#c02f27",
    },

    flying: {
        backgroundColor: "#a890ef",
    },
    poison: {
        backgroundColor: "#9f40a0",
    },
    ground: {
        backgroundColor: "#e2c069",
    },
    rock: {
        backgroundColor: "#b89f38",
    },
    bug: {
        backgroundColor: "#A8B81E",
    },
    ghost: {
        backgroundColor: "#705899",
    },
    steel: {
        backgroundColor: "#B7B8D0",
    },
    fire: {
        backgroundColor: "#F08030",
    },
    water: {
        backgroundColor: "#6692F0",
    },
    electric: {
        backgroundColor: "#F8D030",
    },
    psychic: {
        backgroundColor: "#F85887",
    },
    ice: {
        backgroundColor: "#98D8D7",
    },
    dragon: {
        backgroundColor: "#7038F7",
    },
    dark: {
        backgroundColor: "#705847",
    },
    fairy: {
        backgroundColor: "#ED9BAD",
    },
    normal: {
        backgroundColor: "#A8A979",
    },





}

)
