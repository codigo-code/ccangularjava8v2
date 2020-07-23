import { Component, OnInit } from '@angular/core';


// TypeScript --->  javascript -> NO es orientado a objetos , Pero SI a Prototype
// TypeScript es un sub-lenguaje,, Transpilar a Javascript
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit {
  public nombre: string;
  public num1: number;
  public num2: number;
  public persona: string;

  constructor() { // inyeccion de variables

  }

  ngOnInit(): void {
    this.nombre = 'Dante OnInit tres sarasa';
    this.num1 = 4;
    this.num2 = 6;
  }




}
