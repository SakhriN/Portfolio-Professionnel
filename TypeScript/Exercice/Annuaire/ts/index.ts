import 'bootstrap/dist/css/bootstrap.min.css'; // Importez les styles CSS de Bootstrap
import 'bootstrap/dist/js/bootstrap.bundle.min.js'; // Importez le JavaScript Bootstrap

let persons: HTMLElement[];

let person1 = document.getElementById("button1") as HTMLElement;
let person2 = document.getElementById("button2") as HTMLElement;
let person3 = document.getElementById("button3") as HTMLElement;

persons = [person1, person2, person3]

let fName = document.getElementById("firstName") as HTMLTextAreaElement;
let lName = document.getElementById("lastName") as HTMLTextAreaElement;
let bDay = document.getElementById("dateBirth") as HTMLTextAreaElement;
let mail = document.getElementById("email") as HTMLTextAreaElement;
let nPhone = document.getElementById("phone") as HTMLTextAreaElement;

persons[0].addEventListener("click", () => {
    activation(persons[0],test1);
})
persons[1].addEventListener("click", () => {
    activation(persons[1],test2);
})
persons[2].addEventListener("click", () => {
    activation(persons[2],test3);
})

let test1 = {
    firstName: "Albert",
    lastName: "DUPONT",
    dateBirth: "22/03/1964",
    email: "e.martin@example.com",
    phone: +3320152461,
}
let test2 = {
    firstName: "John",
    lastName: "SMITH",
    dateBirth: "22/03/1964",
    email: "j.smith@example.com",
    phone: +3320152461,
}
let test3 = {
    firstName: "Clara",
    lastName: "GOMEZ",
    dateBirth: "22/03/1964",
    email: "c.gomez@example.com",
    phone: +3320152461,
}
let tableau= [test1,test2,test3]

function activation(btn: any, test:any) {
    for (let i = 0; i < persons.length; i++) {

        if (persons[i].classList.contains("active")) {
            persons[i].classList.remove("active")
        }
    }
    btn.classList.add("active")
    affichage(test);
}

function affichage(test:any) {
    fName.value = test.firstName;
    lName.value = test.lastName;
    bDay.value = test.dateBirth;
    mail.value = test.email;
    nPhone.value = test.phone.toString();
}

