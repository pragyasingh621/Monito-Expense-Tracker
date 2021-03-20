import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ExpensesService {

  constructor(private http:HttpClient) { }
  _url1='http://localhost:8070/expense';
  _url2='http://localhost:8070/category';

  getCategoryList(){
    return this.http.get<Array<any>>(this._url2);
  }

  uploadExpenses(expense){
    return this.http.post(this._url1,expense,{responseType:'text' as 'json'});
  }

}
