// calcAge = [];
//
// function calcAge() {
//
// }
//
// Create a function named increment that takes a number as an argument, increments the number by +1 and returns the result. If input is not numeric, increment should return false.

// num = 5;
// function increment(num) {
//     return num += 1
// }
// console.log(increment(num))

// Define a function named isOdd that takes in a number, return true is that number is odd. Return false if the number is either not a number or even.

isOdd = 13;

function checkIfOdd(isOdd) {
    if(isOdd % 2 !== 0) {
        return true;
    }
    return false;
}

console.log(checkIfOdd(isOdd))



// Write a function named oddArr. Given the array of var arry = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] return the odd numbers.
let array = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]

// let odd = array.filter(n => n % 2 === 1);
// console.log(odd)

// using function to do the oddArr
function oddArr (array) {
    return array.filter(number => {
        return number % 2 !== 0;
    })
}
// console.log((oddArr(array)))



