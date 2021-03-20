import { Router } from '@angular/router';
import { Injectable } from '@angular/core';
import { BehaviorSubject } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class LoginService {
  username = 'abc@gmail.com';
  password = '1234';
  _url='http://localhost:8070/login';
  constructor(private router:Router,private http:HttpClient) { }

  // authenticate(username: string, password: string){
  //   if (username === this.username && password === this.password)
  //     {
  //       this.isValidLogin.next(true);
  //       let user={username:username};
  //       localStorage.setItem('authenticatedUser',JSON.stringify(user));
  //       this.router.navigate(['features']);
  //     }
  //   else
  //     this.isValidLogin.next(false);

  // }

  authenticate(username: string, password: string){
    console.log({email:username,password:password});
    return this.http.post(this._url,{email:username,password:password},{responseType:'text' as 'json'});
  }

  isUserLoggedIn(){
    let user=localStorage.getItem('authenticatedUser');

    return !(user===null);
  }

  getUserId(){
    console.log(JSON.parse(localStorage.getItem('authenticatedUser')));
    return JSON.parse(localStorage.getItem('authenticatedUser')).user_id;
  }

  userLogout(){
    localStorage.removeItem('authenticatedUser');
  }
}
