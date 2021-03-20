import { ReportComponent } from './report/report.component';
import { UploadExpensesComponent } from './upload-expenses/upload-expenses.component';
import { RouteGuardService } from './service/route-guard.service';
import { FeaturesComponent } from './features/features.component';
import { LoginUserComponent } from './login-user/login-user.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { SignupUserComponent } from './signup-user/signup-user.component';


const routes: Routes = [
  {path:'login',component:LoginUserComponent},
  {path:'signup',component:SignupUserComponent},
  {path:'features',component:FeaturesComponent,canActivate:[RouteGuardService]},
  {path:'features/uploadExpenses',component:UploadExpensesComponent,canActivate:[RouteGuardService]},
  {path:'features/report',component:ReportComponent,canActivate:[RouteGuardService]},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
