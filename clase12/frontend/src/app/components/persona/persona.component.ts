import { Component, OnInit } from '@angular/core';
import { PersonaService } from '../../services/persona.service';
import { Persona } from 'src/app/models/persona';

@Component({
  selector: 'app-persona',
  templateUrl: './persona.component.html',
  styleUrls: ['./persona.component.scss']
})
export class PersonaComponent implements OnInit {

  public persona: Persona = new Persona();
  // quiero inyectar el servicio persona , devuelve la instancia de PerosnaService
  constructor(private personaService: PersonaService) {
    // invocamos al servicio
  }

  ngOnInit(): void {
    this.personaService.getPersonaIMC().subscribe((obj: any) => {
      this.persona.nombre = obj.nombre;
      this.persona.altura = obj.altura;
      this.persona.peso = obj.peso;
    });
  }




}
