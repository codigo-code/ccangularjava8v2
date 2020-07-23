import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Persona } from '../models/persona';
import { prependOnceListener } from 'process';

@Injectable({
  providedIn: 'root'
})
export class PersonaService {

  // debo inyectar el componente http que me permite interactuar contra servicios
  constructor(private http: HttpClient) { }

  public getPersonaIMC(): any {
    // invocacion al api (java )

    return this.http.get('http://localhost:8080/personaIMC');
  }


}
