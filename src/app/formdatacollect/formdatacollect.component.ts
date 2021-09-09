import { Component, OnInit } from '@angular/core';
import { FormGroup, FormsModule, ReactiveFormsModule } from '@angular/forms';

@Component({
  selector: 'app-formdatacollect',
  templateUrl: './formdatacollect.component.html',
  styleUrls: ['./formdatacollect.component.css']
})
export class FormdatacollectComponent implements OnInit {

  email: String;
  password: String;
  re: RegExp = /[a-zA-Z0-9!-/_]+@+(gmail|yahoo|miraclesoft)+.+(com|in|us|uk)/g;
  pass: RegExp = /[a-zA-Z0-9!-/_]/g;
  constructor() { }

  ngOnInit(): void {
    this.email="";
    this.password = "";
  }
  checkEmail(): boolean {
    if (this.email.match(this.re)) {
      return true;
    }
    else {
      return false;
    }
  }
  checkpass(): boolean {
    if (this.password.match(this.pass) && this.password.length>6) {
      return true;
    }
    else {
      return false;
    }
  }



}

