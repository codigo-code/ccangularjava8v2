"use strict";

// Ejemplo con typeScript de una clase Persona
var Persona = /** @class */ (function () {
    function Persona(nombre, apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    Persona.prototype.mostrarNombreCompleto = function () {
        console.log(this.nombre + " " + this.apellido);
    };
    Persona.prototype.getPersonaDefault = function () {
        return new Persona('nombre', 'apellido');
    };
    Persona.prototype.metodoSaludos = function (saludito, edad) {
        return saludito + edad;
    };
    return Persona;
}());

var objPersona = new Persona('dante', 'panella');
objPersona.mostrarNombreCompleto();
objPersona.getPersonaDefault().mostrarNombreCompleto();
console.log(objPersona.metodoSaludos('pepe', 22));
