//arr1=[10,20,30,40,50,60]

//arr1.forEach(myfun)

//function myfun(i,j){
//    console.log(i,j)
//}
    

let a=new Promise((resolved,reject)=>{
    let w=1+1;
    if(w==2){
        resolved('success')
    }
    else{
        reject('failed')
    }
})

a.then((message)=>{
    console.log('this belongs to then'+ message)
}).catch((message)=>{
    console.log('this belongs to catch'+ message)
})
