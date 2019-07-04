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

  /*public login(id: number){
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
  
  }*/

  ngOnInit() {
  }

login(id: number, event: Event) {
  event.preventDefault(); // Avoid default action for the submit button of the login form
  // Calls service to login user to the api rest
  this.userService.getUser(id).subscribe(

    res => {
      let p: User = {id: id, nombre:null, genero:null, edad:null, poblacion:null, idintereses:null, descripcion:null};
      this.userService.setPerfilLoggedIn(p);
    },
    error => {
      console.error(error);

    },
    () => this.navigate()
  );
  }
  navigate() {
    this.router.navigateByUrl('/profiles');
  }



}
