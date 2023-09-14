import {Shape} from './shape';

export class Square extends Shape
{
        area:number;
        length:number

        constructor(l:number){
            super();
            this.length=l;
            this.area=0;

        }

        override myarea(): void {
            this.area=this.length*this.length
        }

        display(){
            console.log(`
                ------- Circle Area ----------
                Length  :: ${this.length}
                Area    :: ${this.area}
            `)
        }

}
