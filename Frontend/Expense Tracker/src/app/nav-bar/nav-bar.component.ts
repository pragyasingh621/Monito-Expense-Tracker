import { Component, OnInit } from '@angular/core';
import { LoginService } from '../service/login.service';

@Component({
  selector: 'app-nav-bar',
  templateUrl: './nav-bar.component.html',
  styleUrls: ['./nav-bar.component.css']
})
export class NavBarComponent implements OnInit {

  constructor(private ls:LoginService) { }

  ngOnInit(): void {
  }

  userLoggedIn(){
    return this.ls.isUserLoggedIn();
  }

  userLogOut(){
    this.ls.userLogout();
    alert("Thanks for Visiting");
  }

}
