function validarForma(forma){
    var usuario = forma.usuario;
    if(usuario.value == "" || usuario.value == "Escribir usuario"){
        alert("Debe proporcionar un nombre de usuraio.");
        usuario.focus();
        usuario.select();
        return false;
    }
    
    var password = forma.password;
    if (password.value == "" || password.value.length < 3){
        alert("Debe proporcionar un password de al menos 3 caracteres.");
        password.focus();
        password.select()
    }
    
    var tecnologias = forma.tecnologia;
    var checkBox = false;
    
    for (i=0 ; i<tecnologias.length ; i++){
        if(tecnologias[i].checked){
            checkBox = true;
        }
    }
    
    if(!checkBox){
        alert("Debe seleccionar al menos una tecnología.");
        return false;
    }
    
    var genero = forma.genero;
    var radio = false;
    
    for(i=0; i<genero.length; i++){
        if(genero[i].checked){
            radio = true;
        }
    }
    
    if(!radio){
        alert("Debe seleccionar el genero.");
        return false;
    }
    
    var ocupacion = forma.ocupacion;
    
    if(ocupacion.value == ""){
        alert("Debe seleccionar una ocupacion.");
        return false;
    }
    
    
    //A este punto el formulario es valido.
    alert("Formulario valido. Enviando datos al servidor...");
    return true;
    
    
}
