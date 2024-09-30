// VARIABLES
// 1. Variables should be defined using camel case (e.g. myVariableName)
// 2. Variables using let can be reassigned, but const variables can't
// 3. Variables should always be declared const unless they need to be changed
// 4. Variables are case-sensitive
// 5. Variables using let or const cannot be redeclared with the same scope
// 6. Arrays/objects using const can have their values modified, just not reassigned

// Variables using let
let letNumber = 5; // a number
let letFloat = 3.14; // a decimal (float)
let letBoolean = true; // a boolean
let letString = "Hello World!"; // a string
let letArray = []; // an empty array
let letObject = {}; // an empty object

// Variables using const
const constNumber = 5; // a constant number
const constFloat = 3.14; // a constant decimal (float)
const constBoolean = true; // a const boolean
const constString = "Hello World!"; // a const string
const constArray = []; // an empty const array
const constObject = {}; // an empty const object

// STRINGS
// 1. Strings have many helper functions built into them like toUpperCase and split
// 2. Use template literals when merging variables instead of the + operator
// 3. When variables are added to a string, JavaScript converts them to strings
// 4. Strings can include any character, including space, and have no size limit

const firstName = "Bill";
const lastName = "Gates";
const fullName = firstName + " " + lastName; // the addition operator with strings means concatenation
const fullNameTemplate = `${firstName} ${lastName}`; // this uses a template literal
const firstNameUpper = firstName.toUpperCase();
const firstNameLower = firstName.toLowerCase();
const nameSplit = fullName.split(" "); // returns an array: ["Bill", "Gates"]

// MATHEMATICAL OPERATORS
// 1. Mathematical operators should only be used with integers or decimals
// 2. JavaScript supports addition, subtraction, division, multiplication and modulus (remainder)
// 3. Wherever possible, use x++ ++x, x-- and --x for variable incrementation or decrementation by 1

let x = 5;
x = x + 5; // adds 5 to the existing variable value and replaces it with the result
x = x - 5; // subtracts 5 from the existing variable value and replaces it with the result
x = x * 5; // multiplies 5 to the existing variable value and replaces it with the result
x = x / 5; // divides 5 to the existing variable value and replaces it with the result
x = x % 5; // mods 5 to the existing variable value and replaces it with the result

// A better way to write the above code
x += 5;
x -= 5;
x *= 5;
x /= 5;
x %= 5;

// If you need to increment or decrement by 1
x = x + 1; // don't do this!
x += 1; // better but not good enough
x++; // Perfect!

// BOOLEAN OPERATORS
// 1. Boolean operators should only be used in expressions that should result in true or false
// 2. They can work with just about any type, if used correctly
// 3. It is important to note that JavaScript has "truthy" and "falsy" values

let a = 6;
let b = 10;
let c = true;
let d = false;
a > b; // checks if a is greater than b
a < b; // checks if a is less than b
a >= b; // checks if a is greater than or equal to b
a <= b; // checks if a is less then or equal to b
a == b; // checks if a is equal to b; if types are different JavaScript will coerce the variables
a === b; // checks if a is equal to be and of the same type; no coercion
c & d; // checks c AND d
c && d; // checks c AND d, but uses short-circuit logic (i.e. if c is false, d is not checked)
c | d; // checks c OR d
c || d; // checks c OR d, but uses short-circuit logic (i.e. if c is true, d is not checked)

// FUNCTIONS
// 1. Functions are blocks of code that are executed upon invocation
// 2. They can take parameters/arguments, if necessary
// 3. They can only return a single value, if necessary
// 4. They can be written using the "function" keyword or with arrow syntax "=>"

// A Pythagorean Theorem function that takes two arguments and returns a value
function pythagoreanTheorem1(a, b) {
    return Math.sqrt(a * a + b * b);
}

// The same function as above using arrow syntax
const pythagoreanTheorem2 = (a, b) => {
    return Math.sqrt(a * a + b * b);
}

// Executing/calling the above functions and storing their results in variables
const c1 = pythagoreanTheorem1(2, 1);
const c2 = pythagoreanTheorem2(2, 1);

// ARRAYS
// 1. Arrays can contain a set values
// 2. Normally they contain values of the same type, but they can be mixed
// 3. The values can be unique or duplicates
// 4. Each value is indexed starting from 0 and ending at length - 1
// 5. They can use the spread operator "..." and be destructured
// 6. They have useful built-in functions like map, filter and reduce

const array1 = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]; // an array of integers
const array2 = [2, 4.3, "6", true, [1, 2, 3], {}]; // an array of mixed types
const array3 = [...array1, ...array2]; // spreads the contents of array1 and array2 into a new array
let [first, second, ...rest] = array1; // destructures the 1st, 2nd and remaining values into variables called first, second and rest, respectively
const length = array1.length; // determines the length (size) of array1
array1[0]; // gets the value at index 0 (first) from array1
array1[9]; // gets the value at index 9 (last) from array1
array1[0] = 10; // changes the value at index 0 of array1 to 10
array1[9] = 20; // changes the value at index 9 of array1 to 10

// the map function will loop through array1 and multiply all its values by 10; it returns a new array
const map = array1.map((value) => {
  return 10 * value;
});

// the filter function will loop through array1 and only keep values that are even; it returns a new array
const filter = array1.filter((value) => {
  return value % 2 === 0;
});

// the reduce function will loop through array1 and sum all the values with the sum starting at 10; it returns a new array
const reduce = array1.reduce((prev, cur) => {
  return prev + cur;
}, 10);

array1.pop(); // removes the last value in the array and returns it
array1.push(10); // adds 10 to the end of the array
array1.shift(); // removes the first value in the array and returns it
array1.unshift(10); // adds 10 to the front of the array
