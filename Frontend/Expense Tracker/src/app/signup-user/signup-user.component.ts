import { SignupService } from './../service/signup.service';
import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { LoginService } from '../service/login.service';

@Component({
  selector: 'app-signup-user',
  templateUrl: './signup-user.component.html',
  styleUrls: ['./signup-user.component.css']
})
export class SignupUserComponent implements OnInit {
  ValidSignup:boolean=true;
  constructor(private router:Router, private svc:SignupService) { }
  errorMessage:string="Invalid Signup"
  signinForm:FormGroup;
  RoleList=[];
  ngOnInit(): void {
    this.signinForm=new FormGroup({
      'username' :  new FormControl(null,[Validators.required,Validators.minLength(3)]),
      'email'    : new FormControl(null,[Validators.email]),
      'userRole' : new FormControl(null,[Validators.required]),
      'password': new FormControl(null,[Validators.required,Validators.minLength(3),Validators.maxLength(20)]),
      'confirmPassword': new FormControl(null,[Validators.required])
   });

   this.svc.getRoleList().subscribe((list)=>{this.RoleList=list

    console.log(list);
  });

  }

  checkPasswords(){
    return this.signinForm.get('password').value===this.signinForm.get('confirmPassword').value
  }

  handleSignup(){
    let userDetails={
      userName:this.signinForm.get('username').value,
      email:this.signinForm.get('email').value,
      password:this.signinForm.get('password').value,
      roleId:this.signinForm.get('userRole').value
    }
    this.svc.signup(userDetails).subscribe(
      data=>{
        if(data===""){
          this.ValidSignup=true
         }
        else{
         alert("successfully Signed up, Now you can Login");
          this.router.navigate(['login']);
        }

      }
    )
 }

}
