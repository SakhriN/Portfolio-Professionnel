
// 1er point
let userName:string = "Paul"


// 2eme point
let userAge: number = 12

// 3eme point
let isLogin:boolean = false


// 4eme point
let userNames : string[] = [] 
userNames.push(userName)
console.log(userNames)

// 5eme point
let person: object = {
    firstName: "Dupont",
    age: 20,
    isLogin: true,
}
// Est-il possible d'afficher la valeur age via console.log :
// Reponse : oui
// console.log(person.age)



// 6eme point
let person1: { firstName: string; age: number; isLogin: boolean } = {
    firstName: "Dupont",
    age: 20,
    isLogin: true,
};
console.log(person1.age)

//7eme point
let person2 = {
    firstName: "Dupont",
    age: 20,
    isLogin: true,
};


console.log(person2.age)


