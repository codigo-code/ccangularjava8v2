import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ProfileComponent } from './usuario/components/profile/profile.component';


const routes: Routes = [
  // { path: 'usuario', pathMatch: 'full', loadChildren: './usuario/components/user.module#UserModule' }
  { path: 'perfile', component: ProfileComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
