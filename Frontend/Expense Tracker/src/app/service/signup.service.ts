import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { BehaviorSubject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class SignupService {
  username = 'abc@gmail.com';
  password = '1234';
  isValidSignup=new BehaviorSubject(true);
  obs=this.isValidSignup.asObservable();
  constructor(private http:HttpClient) { }
  _url='http://localhost:8070/signUp';
  _url2='http://localhost:8070/role';
  signup(userDetails){
    return this.http.post(this._url,userDetails,{responseType:'text' as 'json'});
  }

  getRoleList(){
    return this.http.get<Array<any>>(this._url2);
  }

}
