let firstString = "Omefome";
console.log(firstString);

let username;

function clickButton() {
  username = document.getElementById("fullname").value;
  console.log(username);
  document.getElementById("paragraph").innerHTML = username;
}

clickButton();
