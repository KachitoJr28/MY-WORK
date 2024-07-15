let username;
function clickButton() {
    username = document.getElementById("inp").value;
    console.log(username);
    document.getElementById("new").innerHTML = username;
  }