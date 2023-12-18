function addClass() {
  document.getElementById("mydropdown").classList.toggle("poop");
}

window.onclick = function(event) {
  if (!event.target.matches(".dropbtn")) {
    var mydropdown = document.getElementsByClassName("mydropdown");
    var i;
  
    for (i = 0; i < mydropdown.length; i++) {
      var newdrop = mydropdown[i];
      if (newdrop.classList.contains("poop")) {
        newdrop.classList.remove("poop");
      }
    }
  }
};