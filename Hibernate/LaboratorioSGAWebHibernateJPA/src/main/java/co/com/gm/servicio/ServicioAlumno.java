
package co.com.gm.servicio;

import co.com.gm.dao.AlumnoDao;
import co.com.gm.domain.Alumno;
import java.util.List;


public class ServicioAlumno {
    
    private AlumnoDao alumnoDao = new AlumnoDao();
    
    public List<Alumno> listarAlumnos(){
        return alumnoDao.listar();
    }
    
    public void guardarAlumno(Alumno alumno){
        if(alumno != null && alumno.getIdAlumno() == null){
            alumnoDao.insertar(alumno);
        }else{
            alumnoDao.actualizar(alumno);
        }
    }
    
    public void eliminarAlumno(Alumno alumno){
        alumnoDao.eliminar(alumno);
    }
    
    public Alumno encontarAlumno(Alumno alumno){
        return alumnoDao.buscarPorId(alumno);
    }
    
}
