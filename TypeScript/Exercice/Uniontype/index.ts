
//1er point

interface User  {
    nom: string | number
    age: number
    occupation : string
}
//2eme point
interface Admin {
    nom: string
    age: number
    role : string
}
//3eme point
type Personne = {
    nom: string,
    age: number,
    occupation? : string,
    role? : string,
}

let person1: Personne = {
    nom: "Toto Dupont",
    age: 35,
    occupation:"Facteur"
}

let person2:  Personne = {
    nom: "Jeanne Doe",
    age: 25,
    role:"Admin",
}

let person3: Personne = {
    nom: "Michael Flinch",
    age: 23,
    occupation:"Lutteur",
}

let person4: Personne = {
    nom: "Michael Flinch",
    age: 64,
    role:"Gérant",
}

let tableau = [person1, person2, person3, person4]

//4eme point
for(let i=0; i<tableau.length;i++){
    console.log(tableau[i].nom + " " + tableau[i].age)
}



