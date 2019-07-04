import { Component, OnInit } from '@angular/core';


import { Router } from '@angular/router';
import { User } from '../../models/user';
import { UserService } from '../../services/user.service';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css'],
  providers: [UserService]
})
export class ProfileComponent implements OnInit {

  user: User;

  constructor(private router: Router, private userService: UserService) {

  }

  ngOnInit()
  {
    //this.user = this.userService.getPerfilLoggedIn();
    //console.log(this.userService.getPerfilLoggedIn());
    /*this.userService.getUser(this.userService.getPerfilLoggedIn().id)
      .subscribe( data => {
        this.user = this.userService.getUser(this.userService.getPerfilLoggedIn().id);
      })*/
    //this.userService.getUser(this.user.idusuario)

    this.userService.getUser(this.userService.getPerfilLoggedIn().id).subscribe((user: any) => {
      if (user) {
        this.user = user;
        this.userService.setPerfilLoggedIn(user);
        console.log(user);
      } else {
        console.log(`Usuario no encontrado`);
        //this.gotoList();
      }
    });

  }

/*
user: User;
constructor(private router: Router, private userService: UserService ) { 

}

ngOnInit() 
{
  this.user = this.userService.getPerfilLoggedIn();
  console.log(this.user);


}*/

}
