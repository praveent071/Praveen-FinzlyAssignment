import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-classbinding',
  templateUrl: './classbinding.component.html',
  styleUrls: ['./classbinding.component.css']
})
export class ClassbindingComponent implements OnInit {


  isItalic:boolean =  false;
  isOrange:boolean = false;
  constructor() { }

  ngOnInit(): void {
  }
  click(){
    this.isItalic=!this.isItalic;
    this.isOrange=!this.isOrange;
  }

}
