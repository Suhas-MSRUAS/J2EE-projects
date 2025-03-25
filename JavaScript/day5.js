var a=[ 'krishna', 'radhe', 'rukmini', 'blackie']
console.log(typeof a)

console.log(a)//['krishna','radhe', 'rukmini']

console.log(a.length);

a.push("allen")// to add element from last
console.log(a)
a.pop("allen")//to remove element from end
console.log(a)


a.unshift("blackie")// to add element at start
console.log(a)


a.shift("blackie")// to remove element from start
console.log(a)

var arr=Array.isArray(a)// to chect whether it is arry or not
console.log(arr)


var arr=a.includes('krishna',1)// to check whether element present or not
console.log(arr)

var arr=a.indexOf('krishna') //to get the index value of element
console.log(arr)

var arr=a.join(' <-> ')//to join special characters
console.log(arr)

/*loops in js
   While loop, do-while loop, for loop, for-of loop, for-in loop

*/

/*var a=Number(prompt('enter the name'))
while(a%2==0)

console.log(a+'is a even number')*/




