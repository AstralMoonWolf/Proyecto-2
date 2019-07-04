import { Component, OnInit } from '@angular/core';

import { Router } from '@angular/router';
import { User } from '../../models/user';
import { UserService } from '../../services/user.service';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  perfilService: any;
  user: User;
  constructor(private router: Router, private userService: UserService) { }

  public login(id: number){
    console.log(id)
  
    this.userService.getUser(id).subscribe((user: any) => {
      if (user) {
        this.user = user;
        this.userService.getUser(id);
        console.log(user);
      } else {
        console.log(`Usuario no encontrado`);
        //this.gotoList();
      }
    });
  
  }


  ngOnInit() {
  }

}
