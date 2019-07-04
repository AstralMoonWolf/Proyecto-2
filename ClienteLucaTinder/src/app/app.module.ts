import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ProfileComponent } from './components/profile/profile.component';
import { ListaUsuariosComponent } from './components/listausuarios/listausuarios.component';

import { NewComponent } from './components/new/new.component';

@NgModule({
  declarations: [
    AppComponent,
    ProfileComponent,
    ListaUsuariosComponent,
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
