import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ProfileComponent } from './components/profile/profile.component';
import { ListaUsuariosComponent } from './components/lista-usuarios/lista-usuarios.component';
import { NewComponent } from './components/new/new.component';
import { LoginComponent } from './components/login/login.component';

const routes: Routes = [
  { path: 'profiles', component: ProfileComponent },
  { path: 'lista', component: ListaUsuariosComponent},
  { path: 'login', component: LoginComponent},
  { path: 'new', component: NewComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
