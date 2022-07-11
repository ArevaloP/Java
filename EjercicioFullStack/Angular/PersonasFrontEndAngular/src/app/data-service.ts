import {Injectable} from '@angular/core';
import {HttpClient, HttpResponse} from '@angular/common/http';
import { Persona } from './persona.model';

@Injectable()
export class DataService {

  constructor(private httpClient: HttpClient){}

  urlBase = 'http://localhost:8080/PersonasBackEndJava/webservice/personas';

  cargarPersonas(){
    return this.httpClient.get<Persona[]>(this.urlBase);
  }

  agregarPersona(persona: Persona){
    return this.httpClient.post<Persona>(this.urlBase, persona);
  }

  modificarPersona(idPersona: number, persona: Persona){
    let url: string;
    url = this.urlBase + '/' + idPersona;
    this.httpClient.put(url, persona).subscribe({
      next: (response) => console.log('Resultado de modificar Persona: '+response),
      error: (error) => console.log('Error al modificar la persona'+error),
      complete: ()=> console.log('Completado')
    });
  }

  eliminarPersona(idPersona: number){
    let url: string;
    url = this.urlBase + '/' + idPersona;
    this.httpClient.delete(url).subscribe({
      next: (resposne) => console.log('Resultado de eliminar Persona: '+resposne),
      error: (error) => console.log('Error al eliminar la persona'+error),
      complete: ()=> console.log('Completado')
    })
  }

}
