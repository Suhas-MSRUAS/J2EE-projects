let a=document.getElementById("grandparent")
a.addEventListener("click",(l)=>{
    l.stopPropagation()
    console.log("grand parent is clicked")
})

let b=document.getElementById("parent")
b.addEventListener("click",(m)=>{
    m.stopPropagation()
    console.log("parent is clicked")
})

let c=document.getElementById("child")
c.addEventListener("click",(n)=>{
    n.stopPropagation()
    console.log("child is clicked")
})