console.log("Praveen")
var a:number =10
console.log(`value of a ${a}`)

var str!:string
console.log(str)

var b =5
while(b!=0){
    console.log(b)
    b--
}

var c:any
c =true
var temp = (<string>c)
var temp1 = (c as string)

console.log(temp+"jhh")
console.log(temp1+"jhh")
// ---------------
let a1 = ()=>{
console.log("Good")
}
a1()

let d = (a,b)=>{
    console.log("Ethuku " + (a+b))
}
d(12,5)

let a2 = ()=>{
    return("gud")
}
console.log(a2())

let a3 = (x,y):number{
    return(x+y)
}
console.log(a3(2,5))


let m = function():number{
    console.log (3+5)
}
let m1=m()

let n =function(x:number,y:number):number{
    console.log(x+y)
}
let n1=n(9,5)
let o = function():number{
    return(6+6)
}
let o1 =console.log(o())

let p = function(x:number,y:number):number{
    return(x+y)
}
let p1 = console.log(p(2,5))
 
let a4 : any[]= [1,"praveen",5.5]
for(let i=0;i<a4.length;i++){
     console.log(a4[i])
    

}
console.log(a4.join(" "))

a4.forEach((mm,i)=>{
    console.log(mm)

})

function m5(a5?number,b5?number){
    console.log(""+ a5+b5)
}
m5()

function m4(str:string,...item:number[]){
    console.log(item)
    console.log(str)
}
m4("praveen",10,25,36,56)

let b2:number[] = [];
b2.push(10,20,30)
console.log(b2)
b2.pop()
console.log(b2)

let show:string[] =["praveen","arun"];
let mm=show.slice(1,2)//slice
 console.log(mm)
 let mn = show.splice(1,0,"efbqbwui")//splice
 show.splice(2,1)
show.push("uibiweu")//push
show.push("ifhvbic")
show.push("rfhbwruin")
show.pop()//pop
show.pop()

let map1 = show.map((value:string)=>{
    return(value+value)
});
console.log(map1)

// console.log(show)
show.forEach((aa,i) => {
    console.log(aa)
});



