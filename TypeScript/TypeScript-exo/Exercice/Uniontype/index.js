"use strict";
//1er point
let person1 = {
    nom: "Toto Dupont",
    age: 35,
    occupation: "Facteur"
};
let person2 = {
    nom: "Jeanne Doe",
    age: 25,
    role: "Admin",
};
let person3 = {
    nom: "Michael Flinch",
    age: 23,
    occupation: "Lutteur",
};
let person4 = {
    nom: "Michael Flinch",
    age: 64,
    role: "Gérant",
};
let tableau = [person1, person2, person3, person4];
//4eme point
for (let i = 0; i < tableau.length; i++) {
    console.log(tableau[i].nom + " " + tableau[i].age);
}
