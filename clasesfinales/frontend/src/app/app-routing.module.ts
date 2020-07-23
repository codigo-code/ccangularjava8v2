import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AboutComponent } from './components/inicio/about/about.component';
import { SigninComponent } from './components/inicio/signin/signin.component';
import { LoginComponent } from './components/inicio/login/login.component';


const routes: Routes = [
  { path: 'login', component: LoginComponent }, // lazy loading
  { path: 'about', component: AboutComponent },
  { path: 'sigin', component: SigninComponent },
  { path: '**', redirectTo: 'login' }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
