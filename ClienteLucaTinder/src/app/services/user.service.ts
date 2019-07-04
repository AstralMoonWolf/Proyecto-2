import { Injectable } from '@angular/core';

//Nuevo
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { User } from '../models/user';
import { Observable } from 'rxjs';

//Nuevo
const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};


@Injectable({
  providedIn: 'root'
})
export class UserService {
  [x: string]: any;
  //Todo lo de la clase es nuevo
  //public API = '//localhost:4200';

  private isUserLoggedIn;
  public UserLogged: User;

  constructor(private http: HttpClient) { }

  private userUrl = 'http://localhost:8080/lucatinder';
  //private userUrl = '/api';


  public getUsers() {
    return this.http.get<User[]>(this.userUrl + "/listausuarios");
  }

  //http://localhost:8080/user-portal/users/5
  public deleteUser(user) {
    return this.http.delete(this.userUrl + "/" + user.id);
  }

  public getUser(id) {
    return this.http.get<User>(this.userUrl + "/profile/" + id);
  }
  public createUser(user) {
    return this.http.post<User>(this.userUrl + "/new", user);
  }

  // LISTADO
  getAll(): Observable<any> {
    return this.http.get(this.userUrl + '/listausuarios');
  }

  /*Login Jesus*/
  setPerfilLoggedIn(user: User) {
    this.isUserLoggedIn = true;
    this.UserLogged = user;
    localStorage.setItem('currentUsuario', JSON.stringify(user));
  }

  getPerfilLoggedIn() {
    return JSON.parse(localStorage.getItem('currentUsuario'));
  }


  addLike(id1:number, id2:number){
    return this.http.get(this.userUrl + "/" + id1 + "/" + id2);
  }


}

