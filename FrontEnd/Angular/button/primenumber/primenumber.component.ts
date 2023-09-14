import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-primenumber',
  templateUrl: './primenumber.component.html',
  styleUrls: ['./primenumber.component.css']
})
export class PrimenumberComponent implements OnInit {
  result:boolean | null  = null
  constructor() { }

  ngOnInit(): void {
  }
  checkPrime(str:string){
    const num:number = parseInt(str)
    if(num <=1 ){
      this.result = false
    }
    else{
      for(let i:number = 2; i <= num/2; i++){
        if(num % i == 0){
          this.result = false
          return;
        }
      }
      this.result = true
    }
  }

}
