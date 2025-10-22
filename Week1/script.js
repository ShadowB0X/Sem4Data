"use strict"

window.addEventListener("DOMContentLoaded", main);

function main(){
    console.log("JavaScript Kører!");

    document.querySelector("#submitGuess").addEventListener("click", buttonClicked )

}


function buttonClicked(){
    
    console.log("der blev klikket på knappen"); 
    const guess = document.querySelector("#guess").value
    console.log(guess);

    if (guess > number){
        console.log("det var for højt")
    }
}