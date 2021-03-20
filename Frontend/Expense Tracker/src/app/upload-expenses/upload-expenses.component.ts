import { LoginService } from './../service/login.service';
import { ExpensesService } from './../service/expenses.service';
import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, FormGroupDirective, Validators } from '@angular/forms';

@Component({
  selector: 'app-upload-expenses',
  templateUrl: './upload-expenses.component.html',
  styleUrls: ['./upload-expenses.component.css']
})
export class UploadExpensesComponent implements OnInit {
  Title:string='Upload'
  errorMessage:string='In Valid Details'
  CategoryList=[];
  inValid=false;
  createForm:FormGroup;
  constructor(private ex:ExpensesService, private ls:LoginService) { }

  ngOnInit(): void {

    this.createForm=new FormGroup({
      'category' :  new FormControl(null,[Validators.required]),
      'shop': new FormControl(null,[Validators.required,Validators.pattern('[a-zA-Z0-9 ]*'),Validators.minLength(3)]),
      'amount': new FormControl(null,[Validators.required]),
      'expenseDate': new FormControl(null,[Validators.required]),
      'description': new FormControl(null,[Validators.required,Validators.minLength(3)]),
   });

   this.ex.getCategoryList().subscribe(list=>{
     this.CategoryList=list;
   })

  }

  onSubmit(form:FormGroupDirective){
      let expenseDetails={
        categoryId:this.createForm.get('category').value,
        shop:this.createForm.get('shop').value,
        expenseAmount:this.createForm.get('amount').value,
        dateOfExpenses:this.createForm.get('expenseDate').value,
        description:this.createForm.get('description').value,
        userId:this.ls.getUserId()
      }

      this.ex.uploadExpenses(expenseDetails).subscribe(data=>{
        console.log(expenseDetails);
        alert("Expenses Uploaded Successfully");
      });
      form.reset();
  }

}
