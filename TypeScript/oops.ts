//json
let obj = {
    id :2,
    fname :'praveen' 
}
//Dot operator
console.log(`
       ID          =   ${obj.id}
       FirstName   =    ${obj.fname}

`)
//square  operator
console.log(`
      ID   = ${[obj.id]}
`)

//Arrayofobj
let Arrobj =[{
    id :2,
    fname :'praveen' ,
    country:{
        cid:1,
        cname:'India'
    }
    
},
{
    id :3,
    fname :'arun',
    country:{
        cid:3,
        cname:'Japan'
    } 
},

]
for(let i=0;i<=Arrobj.length;i++){
    console.log(`
        ID      = ${Arrobj[i].id}
        FName   =${Arrobj[i].fname}
        Counrty =${Arrobj[i].country.cname}
    `)
}

Arrobj.forEach((value:object)=>{
console.log(value)
})