import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.scss']
})
export class ProfileComponent implements OnInit {

  public archivo: File;
  private b64: any;
  public imagenLoca: any;


  constructor(private http: HttpClient) { }

  ngOnInit(): void {
  }

  pressMe(archivo: FileList) {
    console.log(archivo.item(0));

    const reader = new FileReader();
    reader.readAsDataURL(archivo.item(0));

    reader.onload = () => {
      console.log(reader.result);
      this.b64 = reader.result;
      this.enviar(); // --> pongalo en un boton magico
    };




  }
  enviar() {
    this.http.post('http://localhost:8080/save', {
      nombre: 'dante',
      certificado: this.b64,

    }).subscribe(data => {
      console.log(data);
    }, err => { console.error(err); });
  }


  mirarIMG() {
    this.http.get('http://localhost:8080/getCertificado').subscribe((data: any) => {
      this.imagenLoca = data.certificado;
    }, err => {
      console.log(err);
    });
  }

}
