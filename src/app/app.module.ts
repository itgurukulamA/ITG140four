import { NgModule, OnInit } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

//PrimeNG import statements
import {AccordionModule} from 'primeng/accordion';     //accordion and accordion tab
import {MenuItem} from 'primeng/api';
import { HumanresourceComponent } from './Employeesection/humanresource/humanresource.component';
import { TeamleadsComponent } from './Employeesection/teamleads/teamleads.component';
import { ResourcesComponent } from './Employeesection/resources/resources.component';
import { MainComponent } from './main/main.component';
import { CalculatorComponent } from './calculator/calculator.component'; 

import { HttpClientModule } from '@angular/common/http';
import { FormdatacollectComponent } from './formdatacollect/formdatacollect.component';





@NgModule({
  declarations: [
    AppComponent,
    HumanresourceComponent,
    TeamleadsComponent,
    ResourcesComponent,
    MainComponent,
    CalculatorComponent,
    FormdatacollectComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { 
  
}
