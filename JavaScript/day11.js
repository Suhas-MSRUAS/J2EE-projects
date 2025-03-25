/*function add(...a){
    console.log(a)
   total=0;
    for(let i of a){
        console.log(i)
        total+=i;
    }
    console.log(total)
}
add(10,20,30,40)


function fun(a,b,...c){
    console.log(`${a} ${b}`)
    console.log(c)
    console.log(c[0])
    console.log(c.length)
}

fun('allen','martin', 'king', 'james','scott')



function add(a,b,c){
    console.log(a+b+c)
}

let arr=[1,2,3]
add(...arr)


function suh(m,n){
    for(i=m; i<=n;i++){
        console.log(i)
    }

}

suh(1,10)*/

function print(m,n){
    setTimeout(()=>{
        for(i=m; i<=n;i++)
        console.log(i)
    },3000)
}

function success(){
    console.log('no printed successfully')
}

print(1,10)
success()