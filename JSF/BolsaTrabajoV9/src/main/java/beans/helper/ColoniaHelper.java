package beans.helper;

import beans.model.Colonia;
import java.util.*;
import javax.enterprise.context.RequestScoped;
import javax.faces.model.SelectItem;
import javax.inject.Named;


@Named
@RequestScoped
public class ColoniaHelper {
    
    public List<Colonia> getColonias(){
        List<Colonia> colonias = new ArrayList<>();
        
        int coloniaId = 1;
        
        colonias.add(new Colonia(coloniaId++, "Napoles", 3810));
        colonias.add(new Colonia(coloniaId++, "Polanco", 11530));
        colonias.add(new Colonia(coloniaId++, "Valle Centro", 3100));
        
        return colonias;
    }
    
    public int getColoniaIdPorNombre(String nombreColonia){
        int coloniaId = 0;
        List<Colonia> colonias = this.getColonias();
        
        for(Colonia colonia: colonias){
            if(colonia.getNombre().equals(nombreColonia.trim())){
                coloniaId = colonia.getColoniaId();
                break;
            }
        }
        return coloniaId;
    }
    
    public int getColoniaIdPorCodigoPostal(int codigoPostal){
        int coloniaId = 0;
        List<Colonia> colonias = this.getColonias();
        
        for(Colonia colonia: colonias){
            if(colonia.getCodigoPostal() == codigoPostal){
                coloniaId = colonia.getColoniaId();
                break;
            }
        }
        return coloniaId;
    }
    
    public List<SelectItem> getSelectItems(){
        List<SelectItem> selectItems = new ArrayList<>();
        
        List<Colonia> colonias = this.getColonias();
        
        for(Colonia colonia: colonias){
            SelectItem selectItem= new SelectItem(colonia.getColoniaId(), colonia.getNombre());
            selectItems.add(selectItem);
        }
        return selectItems;
    }
    
}
