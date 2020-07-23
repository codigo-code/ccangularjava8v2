
// Ejemplo con typeScript de una clase Persona
export class Persona {

    private nombre: string;
    private apellido: string;

    constructor(nombre: string, apellido: string) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    mostrarNombreCompleto(): void {

        console.log(this.nombre + " " + this.apellido);
    }

    getPersonaDefault(): Persona {

        return new Persona('nombre', 'apellido');
    }

    metodoSaludos(saludito: string, edad: number): string {
        return saludito + edad;
    }

}


var objPersona = new Persona('dante', 'panella');
objPersona.mostrarNombreCompleto();
objPersona.getPersonaDefault().mostrarNombreCompleto();
console.log(objPersona.metodoSaludos('pepe', 22));