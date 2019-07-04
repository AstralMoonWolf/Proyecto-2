import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ProfileComponent } from './components/profile/profile.component';
import { ListaUsuariosComponent } from './components/listausuarios/listausuarios.component';

const routes: Routes = [
  { path: 'profiles', component: ProfileComponent },
  { path: 'listausuarios', component: ListaUsuariosComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
