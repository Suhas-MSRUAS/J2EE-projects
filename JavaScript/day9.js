function a(){
    return function b(){
        console.log('welcome')
    }
}
a()()// higher order function calling

var d=a()
d()// higher order function

var lab=(rn)=>{
    if(rn===1){
        return function(topic){
            console.log(`hai roll number ${rn} plz write the given ${topic}`)
        }
    }
    if(rn===2){
        return function(topic){
            console.log(`hai roll number ${rn}, plz write the given ${topic}`)
        }
    }
    if(rn===3){
        return function(topic){
            console.log(`hai roll number ${rn}, plz write the given ${topic}`)
        }
    }
    if(rn===4){
        return function(topic){
            console.log(`hai roll number ${rn}, plz write the given ${topic}`)
        }
    }
    else{
        return function(){
            console.log('plz enter valid rollnumer')
        }
    }
}

lab(1)('palindrome')
lab(2)('reverse')
lab(20)('tiklu')





var p1=(friend, callback)=>{
    console.log(`hai ${friend} im busy ill call u back`)
}

var p2=()=>{
    console.log('am calling')
}

p1('manja', p2())




































