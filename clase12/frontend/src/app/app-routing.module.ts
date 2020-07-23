import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { PersonaComponent } from './components/persona/persona.component';
import { VehiculoComponent } from './components/vehiculo/vehiculo.component';


const routes: Routes = [
  { path: 'persona', component: PersonaComponent },
  { path: 'vehiculo', component: VehiculoComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
