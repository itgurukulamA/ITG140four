import { Component, Inject, OnInit } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { HttpClient, HttpParams } from '@angular/common/http';
import { Message } from '@angular/compiler/src/i18n/i18n_ast';

@Component({
    selector: 'app-calculator',
    templateUrl: './calculator.component.html',
    styleUrls: ['./calculator.component.css']
})

export class CalculatorComponent implements OnInit {

    //message: string;
    expr: string = '';
    result: any;
    constructor(private http: HttpClient) {

    }

    ngOnInit(): void {
    }


    adder(myexpr: string) {
        if (myexpr == '') {
            this.expr = '';
        }
        if (myexpr == '1' || myexpr == '2' || myexpr == '3' || myexpr == '4' || myexpr == '5' || myexpr == '6' || myexpr == '7' || myexpr == '8' || myexpr == '9' || myexpr == '0' || myexpr == '.') {
            this.expr += myexpr;
        }
        switch (myexpr) {
            case '+':
                if (this.expr.charAt(this.expr.length - 1) == '+') {
                    console.log("same operator at tail +")
                }
                else {
                    this.expr += myexpr;
                    console.log(this.expr);
                }
                return;
            case '-':
                if (this.expr.charAt(this.expr.length - 1) == '-') {
                    console.log("same operator at tail -")
                }
                else {
                    this.expr += myexpr;
                    console.log(this.expr);
                }
                return;
            case '*':
                if (this.expr.charAt(this.expr.length - 1) == '*') {
                    console.log("same operator at tail *")
                }
                else {
                    this.expr += myexpr;
                    console.log(this.expr);
                }
                return;
            case '/':
                if (this.expr.charAt(this.expr.length - 1) == '/') {
                    console.log("same operator at tail *")
                }
                else {
                    this.expr += myexpr;
                    console.log(this.expr);
                }
                return;
        }
        console.log(this.expr);
    }
    eval() {
        if (this.expr.charAt(this.expr.length - 1) == '/' || this.expr.charAt(this.expr.length - 1) == '*' || this.expr.charAt(this.expr.length - 1) == '-' || this.expr.charAt(this.expr.length - 1) == '+') {
            this.expr = this.expr.substring(0, this.expr.length - 1);
        }
        this.http.post("http://localhost:8080/eval",
            {
                "eval": this.expr,
            })
            .subscribe(
                (val) => {
                    console.log("POST call successful value returned in body",
                        val);
                    this.result = val;
                },
                response => {
                    console.log("POST call in error", response);
                },
                () => {
                    console.log("The POST observable is now completed.");
                });
    }
}
function data(data: any) {
    throw new Error('Function not implemented.');
}

function $http(arg0: { url: string; method: string; data: { eval: string; }; }) {
    throw new Error('Function not implemented.');
}

