import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CalculatorComponent } from './calculator/calculator.component';
import { HumanresourceComponent } from './Employeesection/humanresource/humanresource.component';
import { ResourcesComponent } from './Employeesection/resources/resources.component';
import { TeamleadsComponent } from './Employeesection/teamleads/teamleads.component';
import { FormdatacollectComponent } from './formdatacollect/formdatacollect.component';



const routes: Routes = [
  //{ path: 'emp', component: EmployeeComponent }
  { path: 'HR', component: HumanresourceComponent },
  { path: 'teamleads', component: TeamleadsComponent },
  { path: 'resources', component: ResourcesComponent },
  { path: 'calculator', component: CalculatorComponent },
  { path: 'formdatacollect', component:FormdatacollectComponent }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
