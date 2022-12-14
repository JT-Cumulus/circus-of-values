// Alt + left click to multi type

var age = 22;

console.log(age>=16) ? "\nYou can drive" : "\nYou can't drive"

// Fizzbuzz implementation

function fizzBuzz(number){
    for(let i = 1; i < number; i++){
        if(i%3 == 0 & i%5 == 0){
            console.log('FizzBuzz');
        }
        else if(i%3 == 0){
            console.log('Fizz');
        }
        else if(i%5 == 0){
            console.log('Buzz');
        }
        else{
            console.log(i);
        }
    }
}

let answer = parseInt(prompt("Please enter a number"));
fizzBuzz(answer);

// Game implementation
function getComputerChoice(){
    choice = ['Rock', 'Paper', 'Scissors']
    return choice[Math.floor(Math.random() * 2)]
}

function playRound(playerSelection, computerSelection){
    let outcome = ['Lose', 'Draw', 'Win']
    if(/playerSelection/.test('rock')){
        let playernum = 'Rock';
    }
    if(/playerSelection/.test('paper')){
        let playernum = 'Paper';
    }
    if(/playerSelection/.test('scissors')){
        let playernum = 'Scissors';
    }
    
    // Draw condition
    if(playernum == computerSelection){
        return outcome[1];
    }
   
    // Rock
    if(playernum == 'Rock' & computerSelection == 'Paper'){
        return outcome[0];
    }
    else if(playernum == 'Rock' & computerSelection == 'Scissors'){
        return outcome[2]
    }

    if(playernum == 'Paper' & computerSelection == 'Scissors'){
        return outcome[0];
    }
    else if(playernum == 'Paper' & computerSelection == 'Scissors'){
        return outcome[2]
    }

}

function game(){
    pass
}

const computerSelection = getComputerChoice();
const playerSelection = parseString(prompt('Enter rock, paper, or scissors'))