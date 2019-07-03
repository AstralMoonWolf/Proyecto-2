import { Component, OnInit } from '@angular/core';
import { User } from '../../models/user';
import { UserService } from '../../services/user.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-new',
  templateUrl: './new.component.html',
  styleUrls: ['./new.component.css']
})
export class NewComponent implements OnInit {

  user: User = new User();

  constructor(private router: Router, private userService: UserService) {

   }

   createUser(): void {
    this.userService.createUser(this.user)
        .subscribe( data => {
          alert("Usuario generado de forma correcta.");
        });

  };

  ngOnInit() {
  }

}
