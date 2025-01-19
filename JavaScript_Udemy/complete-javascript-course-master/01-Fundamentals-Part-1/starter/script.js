/*
let js = "amazing";
console.log(40 + 8 + 23 - 10);

console.log("Jonas");
console.log(23);

let firstName = "Hi";
console.log(firstName);
console.log(firstName);
console.log(firstName);
console.log(firstName);

// convensions and rules for naming
// use camelCase always -- firstNameAndLastName
// variable in java kan never start with numbers
// reserved keywords kan not be used as variableName
// always use lower case letters for naming variables
// always use descriptive name for naming variables
let myFirstJob = "Store_selder";
console.log('My first job was ' + myFirstJob);

// Assignment - variables
let country = "Somalia";
let continent = "Africa";
let population = 21000000;
console.log(country);
console.log(continent);
console.log(population);


let anwarIsFather = true;
console.log(typeof anwarIsFather);
let firstName = "Anwar";
console.log(typeof firstName);

firstName = "Hassan";
console.log(firstName);

*/

// mutating variable


// using const must be initialised
// const age; -- throws error

function lifeInWeeks(age) {

  /************Don't change the code above************/

  //Write your code here.

  const dayInYear = 0;
  const weekInYear = 0;
  const monthInYear = 0;

  const lifeTime = 90;

  dayInYear += (lifeTime - age) * 365;
  weekInYear += (lifeTime - age) * 52;
  monthInYear += (lifeTime - age) * 12;

  alert("You have " + dayInYear + " days, " + weekInYear + " weeks, and " + monthInYear + " months left");

  // days, weeks, months
  // 90 years
  // You have x days, y weeks and z months left.
  // 365 days in a year, 52 weeks in a year and 12 months in a year. 
  /*************Don't change the code below**********/
}

lifeInWeeks(30);