import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-button',
  templateUrl: './button.component.html',
  styleUrls: ['./button.component.css']
})
export class ButtonComponent implements OnInit {

  
  value:any ="";
  constructor() { }

  ngOnInit(): void {
  }
  onClick(input:any){
    this.value=input;
  }
 
  
   
}
