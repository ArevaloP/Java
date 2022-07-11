import { Injectable } from "@angular/core";
import { DataService } from "./data-service";
import {Persona} from './persona.model';

@Injectable()
export class PersonaService {

  personas: Persona[] = [];

  constructor(private dataService: DataService){}

  //Se usa para mdificar el valor del arreglo devido a la llamada asincrona
  setPersonas(personas: Persona[]){
    this.personas = personas;
  }

  obtenerPersonas(){
    return this.dataService.cargarPersonas();
  }

  agregarPersona(persona: Persona){
    console.log('Persona a agregar: ' + persona.nombre);
    this.dataService.agregarPersona(persona).subscribe(
      (persona: Persona)=>{
        console.log('Persona agregada recientemente: ' + persona.idPersona);
        this.personas.push(persona);
      }
    );
  }

  encontrarPersona(id: number){
    const persona: Persona = this.personas.find( persona => persona.idPersona == id )!;
    console.log('Persona encontrada: ' + persona.idPersona + ' ' + persona.nombre);
    return persona;
  }

  modificarPersona(id: number, persona: Persona){
    console.log('Persona a modificar: ' + persona.idPersona);
    const personaModificadaLocal = this.personas.find(persona => persona.idPersona == id)!;
    personaModificadaLocal.idPersona = persona.idPersona;
    personaModificadaLocal.nombre = persona.nombre;
    this.dataService.modificarPersona(id, persona);
  }

  eliminarPersona(id: number){
    console.log('Eliminar persona con id: ' + id);
    const index = this.personas.findIndex(persona => persona.idPersona == id);
    this.personas.splice(index,1);
    this.dataService.eliminarPersona(id);
  }

}
