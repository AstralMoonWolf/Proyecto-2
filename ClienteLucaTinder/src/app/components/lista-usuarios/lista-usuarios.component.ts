import { Component, OnInit } from '@angular/core';
import { User } from '../../models/user';
import { UserService } from '../../services/user.service';

import { Router } from '@angular/router';

@Component({
  selector: 'app-lista-usuarios',
  templateUrl: './lista-usuarios.component.html',
  styleUrls: ['./lista-usuarios.component.css'],
  providers: [UserService]
})
export class ListaUsuariosComponent implements OnInit {
  //users: Array<any>;
  users: User[];
 usersesion:User;
  constructor(private router: Router, private userService: UserService) { }

  ngOnInit() {
    this.userService.getAll().subscribe(
      data => {
        this.users = data;
      });


this.usersesion=this.userService.getPerfilLoggedIn();

    };


    addLike(id1:number, id2:number):void{
      this.userService.addLike(id1, id2).subscribe( data => {
        
      });
    }

    disLike(id1:number, id2:number):void{
      this.userService.disLike(id1, id2).subscribe( data => {
        
      });
    }


}
