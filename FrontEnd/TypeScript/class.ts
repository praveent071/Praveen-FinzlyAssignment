export class MyClass{
    id :number;
    name:string;
    age:number;
    constructor(id:number,name:string,age:number){
        this.id=id;
        this.name=name;
        this.age=age;
    
    
    }
    display(){
        console.log(`
         ID         =  ${this.id}
         Name       =  ${this.name}
         Age        =  ${this.age}

        `)
    }    
}
export let obj = new MyClass(1,"praveen",22);
obj.display()

export let show:string[] =["praveen","arun"];

 
