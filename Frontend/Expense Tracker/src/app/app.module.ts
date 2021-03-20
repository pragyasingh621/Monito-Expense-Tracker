import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavBarComponent } from './nav-bar/nav-bar.component';
import { LoginUserComponent } from './login-user/login-user.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { SignupUserComponent } from './signup-user/signup-user.component';
import { FeaturesComponent } from './features/features.component';
import { UploadExpensesComponent } from './upload-expenses/upload-expenses.component';
import { ReportComponent } from './report/report.component';

@NgModule({
  declarations: [
    AppComponent,
    NavBarComponent,
    LoginUserComponent,
    SignupUserComponent,
    FeaturesComponent,
    UploadExpensesComponent,
    ReportComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
