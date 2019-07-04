import { Component, OnInit } from '@angular/core';


import { Router } from '@angular/router';
import { User } from '../../models/user';
import { UserService } from '../../services/user.service';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent implements OnInit {

  user: User;

  constructor(private router: Router, private userService: UserService) {

  }

  ngOnInit()
  {
    this.userService.getUser(this.user.id)
      .subscribe( data => {
        this.user = this.user;
      })
    //this.userService.getUser(this.user.idusuario)
  }

}
