import { Injectable } from '@angular/core';
import { ActivatedRouteSnapshot, CanActivate, Router, RouterStateSnapshot } from '@angular/router';
import { LoginService } from './login.service';

@Injectable({
  providedIn: 'root'
})
export class RouteGuardService implements CanActivate{
  constructor(private ls: LoginService,private router:Router) { }
  canActivate(route: ActivatedRouteSnapshot, state: RouterStateSnapshot) {
    if (this.ls.isUserLoggedIn()) {

      return true;
    }
    else{
      this.router.navigate(['login']);
      return false;
    }
  }
}
