var emp={
    ename: 'smith',
    age: 40,
    job:'manager'
};

var dept={
    dname: 'sales',
    loc: 'banglore'

}
Object.assign(emp,dept)
console.log(Object.freeze(emp))// will not allow to override value
console.log(Object.entries(emp))// for array format
Object.seal(emp)//entry close only to lock the code

emp.id=101


//emp.sal=900000;

emp.ename='allen'
//delete obj.age;

console.log(emp)
console.log(Object.keys(emp))// only for keys
console.log(Object.values(emp))// only for values



