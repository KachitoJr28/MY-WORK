function isOdd(num) {
  console.log(typeof num);
  console.log(parseInt(num));
  if (typeof num == "undefined" || num == "" || isNaN(parseInt(num))) {
    return "You've gotta type a number";
  } else if (num % 2 == 0) {
    return "even";
  } else {
    return "odd";
  }
}
pre = prompt("type a number");
console.log(isOdd(pre));