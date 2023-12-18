let arr = new Array();
arr[0] = "hello";
arr[1] = "hello 2";
console.log(typeof arr);

// try array methods at home
/*
EXAMPLES OF ARRAY METHODS
.push()
.pop()
.shift()
.unshift()
.splice()
.slice()
.concat()
.forEach()
.filter()
.map()
*/

let items = [1, 2, 3, 4];
let result = items.push(5); //adds 5 to the end
console.log(items.pop()); //deletes the last item
console.log(items.shift()); //deletes the first item
console.log(items.unshift(1)); //adds 1 to the begining
console.log(items);
// console.log(result)

let users = ["tim", "ted", "jim", "jay", "may"];
users.splice(2, 3, "jack", "jake");
console.log(users);
let su_m = items.concat(users);
console.log(su_m);

function Capitalize(element, index, array) {
    array[index] = element.charAt(0).toUpperCase() + element.slice(1);
}
users.forEach(Capitalize)
console.log(users)

let numbers=[1,2,3,4,5]
console.log(numbers)
let subset=numbers.slice(1,4)
console.log(subset)

var colors=["red","green","blue","yellow","orange"]
colors.splice(2,2,"purple","pink")
console.log(colors)

function isOdd(element) {
    return element%2 !==0
}
let Oddnumbers = numbers.filter(isOdd)
console.log(Oddnumbers)