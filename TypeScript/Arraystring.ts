let a1 = ()=>{
    console.log("Good")
    }
    a1()
    
    let d = (a,b)=>{
        console.log("TypeScript " + (a+b))
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

    //--------------------
    
    
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
     
//---------------

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

 console.log(show)
show.forEach((aa,i) => {
    console.log(aa)
});
