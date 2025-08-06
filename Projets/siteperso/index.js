let one = document.getElementById("one")
let two = document.getElementById("two")
let three = document.getElementById("three")
let four = document.getElementById("four")
let five = document.getElementById("five")
let six = document.getElementById("six")
let seven = document.getElementById("seven")
let eight = document.getElementById("eight")
let nine = document.getElementById("nine")
let ten = document.getElementById("ten")
let eleven = document.getElementById("eleven")
let twelve = document.getElementById("eljdsglmszkghzlrekghfkldghardfghkgdfkugvqsdjvfsqvfjkfgher")
let test = document.getElementById("test")

const tab = ["DEPRESSION", "MORT", "POISON", "COLERE", "BITE", "HOMME BLANC CISGENRE HETERO",`<img src="Vash-the-Gunman-1.gif" />`]
const src = "Vash-the-Gunman-"
const  srcEnd = ".gif"
const Max = 6
let randomtab
let randomWord

function randomizedWord(endroit){
    randomtab = Math.floor(Math.random()*tab.length)
    console.log(randomtab)
    randomWord = tab[randomtab]
    console.log(randomWord)
    endroit.innerHTML = randomWord
}

function randomized(nb){
    let random = Math.floor((Math.random()*Max)+ 1)
    let resultat = src + random + srcEnd  
    nb.src = resultat
}

randomized(one)
randomized(two)
randomized(three)
randomized(four)
randomized(five)
randomized(six)
randomized(seven)
randomized(eight)
randomized(nine)
randomized(ten)
randomized(eleven)
randomized(twelve)
randomizedWord(test)
