import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-loginpage',
  templateUrl: './loginpage.component.html',
  styleUrls: ['./loginpage.component.css']
})
export class LoginpageComponent implements OnInit {
   
  output:string="";
  constructor() { }

  ngOnInit(): void {
  }
  onclick(username:any,password:any){
    if(username=="praveen" && password=="prave01"){
        this.output = "Successfully logined";
    }
    else{
      this.output = "Login failed";
    }
  }

}
