import { Injectable } from '@angular/core';

//Nuevo
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { User } from '../models/user';
import { Observable } from 'rxjs/internal/Observable';


//Nuevo
const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable({
  providedIn: 'root'
})
export class UserService {
  //Todo lo de la clase es nuevo

  constructor(private http:HttpClient) {}

  private userUrl = 'http://localhost:8080/lucatinder';
  //private userUrl = '/api';

  public getAll(): Observable<User> {
    return this.http.get(this.getUsers + '/listausuarios');
  }

  public getUsers() {
    return this.http.get<User[]>(this.userUrl + "/listausuarios");
  }

  //http://localhost:8080/user-portal/users/5
  public deleteUser(user) {
    return this.http.delete(this.userUrl + "/"+ user.id);
  }

  public getUser(user) {
    return this.http.get<User>(this.userUrl + "/profile/"+ user.id);
  }


}

