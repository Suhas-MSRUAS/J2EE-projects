/*function demo(){
    console.log('hello')
}

console.log(demo)*/


function add(a,b){
    var res=a+b;
    console.log(res)
}


add(1,3)

var city='mysore'
function demo(name) {
    console.log(`${name} is from ${city}`)
}

demo('suhas')
var a=10;
function demo() {
    let a=30;
    console.log(a);
    console.log(this.a);
}

demo()