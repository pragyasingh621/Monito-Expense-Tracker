import { LoginService } from './../service/login.service';
import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login-user',
  templateUrl: './login-user.component.html',
  styleUrls: ['./login-user.component.css']
})
export class LoginUserComponent implements OnInit {

  ValidLogin:boolean=true;
  constructor(private router:Router, private ls:LoginService) { }
  errorMessage:string="Invalid Login"
  signinForm:FormGroup;
  ngOnInit(): void {
    this.signinForm=new FormGroup({
      'username' :  new FormControl(null,[Validators.required]),
      'password': new FormControl(null,[Validators.required,Validators.minLength(3),Validators.maxLength(20)])
   });
  }

  handleLogin(){

    this.ls.authenticate(this.signinForm.get('username').value,this.signinForm.get('password').value).subscribe(
      data=>{
        if(data===""){
          console.log(data);
          this.ValidLogin=false;
         }
        else{
          this.ValidLogin=true;
          console.log(data);
          let userDetails={
            username:this.signinForm.get('username').value,
            user_id:data
         }
         localStorage.setItem('authenticatedUser',JSON.stringify(userDetails));
          this.router.navigate(['features']);
        }

      }
    )

 }

}
