import { NgModule, OnInit } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import {AccordionModule} from 'primeng/accordion'; 
import { HumanresourceComponent } from './Employeesection/humanresource/humanresource.component';
import { TeamleadsComponent } from './Employeesection/teamleads/teamleads.component';
import { ResourcesComponent } from './Employeesection/resources/resources.component';
import { MainComponent } from './main/main.component';
import { CalculatorComponent } from './calculator/calculator.component'; 
import { FormsModule,ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { FormdatacollectComponent } from './formdatacollect/formdatacollect.component';
import {ButtonModule} from 'primeng/button';




@NgModule({
  declarations: [
    AppComponent,
    HumanresourceComponent,
    TeamleadsComponent,
    ResourcesComponent,
    MainComponent,
    CalculatorComponent,
    FormdatacollectComponent
   
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    AccordionModule,
    ButtonModule,
    FormsModule,
    ReactiveFormsModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { 
  
}

