import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ProfileComponent } from './components/profile/profile.component';
import { ListaUsuariosComponent } from './components/lista-usuarios/lista-usuarios.component';
import { LikeComponent } from './components/like/like.component';
import { DislikeComponent } from './components/dislike/dislike.component';
import { NewComponent } from './components/new/new.component';

@NgModule({
  declarations: [
    AppComponent,
    ProfileComponent,
    ListaUsuariosComponent,
    LikeComponent,
    DislikeComponent,
    NewComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
