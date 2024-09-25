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
