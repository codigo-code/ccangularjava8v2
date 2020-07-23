import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule } from '@angular/forms';
import { PersonaComponent } from './components/persona/persona.component';
import { VehiculoComponent } from './components/vehiculo/vehiculo.component';
import { DescripcionPersonaComponent } from './components/descripcion-persona/descripcion-persona.component';
import { PersonaService } from './services/persona.service';
import { HttpClientModule } from '@angular/common/http';


@NgModule({
  declarations: [
    AppComponent,
    PersonaComponent,
    VehiculoComponent,
    DescripcionPersonaComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [PersonaService], // declaro un servicio cross a todos los componentes
  bootstrap: [AppComponent]
})
export class AppModule { }
