import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.scss']
})
export class UserComponent implements OnInit {

  public nombre = 'tomas';
  public password = '';
  constructor() { }

  ngOnInit(): void {
  }

  validarForm() {
    // simulamos que le hace click
    this.password = '12345678';
  }

}
