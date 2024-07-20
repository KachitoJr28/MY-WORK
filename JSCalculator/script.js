let num1=0,num2=0,result=0,operator=''
//let screen=document.getElementById("screen")

function appendToScreen(inp) {
    var screen=document.getElementById("screen")
    screen.value+=inp
}

function cls() {
    var screen=document.getElementById("screen")
    screen.value=""
}

function calculate() {
    var screen=document.getElementById("screen")
    let result=eval(screen.value)
    console.log(result);
    screen.value=result
}

function negate() {
    var screen=document.getElementById("screen")
    let temp=screen.value
    temp*=-1
    screen.value=temp
}

function factorial() {
    var screen=document.getElementById("screen")
    let temp=screen.value
    let y=1;
    for ( i = temp; i >= 1; i--) {
        y = y * i;
    }
    screen.value=y
}

function sqrt() {
    var screen=document.getElementById("screen")
    let temp=screen.value
    temp=Math.pow(temp,1/2)
    screen.value=temp
}

function sqr() {
    var screen=document.getElementById("screen")
    let temp=screen.value
    temp=Math.pow(temp,2)
    screen.value=temp
}

function sin() {
    var screen=document.getElementById("screen")
    let temp=screen.value
    // temp=(temp*Math.PI)/180
    temp=(temp*3.1415926536)/180
    temp=Math.sin(temp)
    screen.value=temp
}

function cos() {
    var screen=document.getElementById("screen")
    let temp=screen.value
    // temp=(temp*Math.PI)/180
    temp=(temp*3.1415926536)/180
    temp=Math.cos(temp)
    screen.value=temp
}

function tan() {
    var screen=document.getElementById("screen")
    let temp=screen.value
    // temp=(temp*Math.PI)/180
    temp=(temp*3.1415926536)/180
    temp=Math.tan(temp)
    screen.value=temp
}

function log() {
    var screen=document.getElementById("screen")
    let temp=screen.value
    temp=Math.log10(temp)
    screen.value=temp
}

function del() {
     var screen=document.getElementById("screen")
    screen.value=screen.value.slice(0,-1)
}

function tanInverse() {
    var screen=document.getElementById("screen")
    let temp=screen.value
    temp=Math.pow(temp,2)
    screen.value=temp
}

function cosInverse() {
    var screen=document.getElementById("screen")
    let temp=screen.value
    temp=Math.pow(temp,2)
    screen.value=temp
}

function sinInverse() {
    var screen=document.getElementById("screen")
    let temp=screen.value
    temp=Math.pow(temp,2)
    screen.value=temp
}


function shift() {
    const tan=document.getElementById("tanButton"),cos=document.getElementById("cosButton"),sin=document.getElementById("sinButton"),shift=document.getElementById("shiftButton")

   if (tan.innerHTML=="tan") {
    tan.innerHTML="tan<sup>-1</sup>"
    tan.setAttribute("onclick","tanInverse()")
    cos.innerHTML="cos<sup>-1</sup>"
    cos.setAttribute("onclick","cosInverse()")
    sin.innerHTML="sin<sup>-1</sup>"
    sin.setAttribute("onclick","sinInverse()")
   }else if (tan.innerHTML=="tan<sup>-1</sup>") {
    tan.innerHTML="tan"
    tan.setAttribute("onclick","tan()")
    cos.innerHTML="cos"
    cos.setAttribute("onclick","cos()")
    sin.innerHTML="sin"
    sin.setAttribute("onclick","sin()")
   }
}