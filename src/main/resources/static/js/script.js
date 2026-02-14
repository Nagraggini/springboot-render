//A prompt a felugró ablak. A "name" egy címke, a "Bobby" egy input mező.
//var name = window.prompt("What's your name?", "Bobby");
//window.alert("Hello " + name + "!");
// console.log("hello " + n)

//for ciklus:
// for (var j=0; j<10; j++){
//     console.log(j)
// }

// for (let i=0; i<10; i++){
//     console.log(i)
// }
// console.log(i)//Hibaüzenetet kapunk, mert a let-el deklarált változó, csak a scope-n belül létezik.

// A böngészőben van egy JS objektumom (objects):
//Adatcserére jó.

var person = {
    name: "bobby",
    age: 42,
    email: "bobbyc@sfu.ca",
    address: {
        number: "123",
        street: "fake st",
    },
    speak: function (words) {
        console.log(words);
    },
};

// functions

// var a = 9

// function myfunc(){
//     console.log('hello world')
//     console.log(a) //Az 'a' változó elérhető ebben a scope-ban (kapcsos zárójelek között) is.
// }

// var myfunc2 = function(){
//     console.log('hello world 2')
// }

// myfunc2() //Függvény meghívás.

// callbacks

// function asc(a,b) {
//     return a-b
// }
// var i = 0
// var inter = window.setInterval(function(){
//     console.log(i)
//     i++
// },1000)

// person.speak("hello")

// window.addEventListener('keypress',processKey)

// function processKey(evt){
//     console.log(evt.key)
// }

var button = document.querySelector('input[value="SuBmIt"]');
button.addEventListener("click", function (evt) {
    evt.preventDefault();
    var text = document.getElementById("fname").value;
    document.getElementsByTagName("legend")[0].innerHTML = text;
});
