class Usuario{

    private String nombre;
    private String cedula;
    private String contraseña;
    private int edad;
    private int cantidadHijos;
    private int saldo = 0;

    public Usuario(){

    }

    public void setNombre(String nom){
        this.nombre = nom;
    }

    public String getNombre(){
        return this.nombre;
    }
   
    
    public void setCedula(String ced){
        this.cedula = ced;
    }

    public String getCedula(){
        return this.cedula;
    }
   
   
    public void setContraseña(String contr){
        this.contraseña = contr;
    }

    public String getContraseña(){
        return this.contraseña;
    }


    public void setEdad(int ed){
        this.edad = ed;
    }

    public int getEdad(){
        return this.edad;
    }
   
    public void setCantidadHijos(int cant){
        this.cantidadHijos = cant;
    }

    public int getCantHijos(){
        return this.cantidadHijos;
    }
    
    
    public void setSaldo(int sal){
        this.saldo = sal;
    }

    public int getSaldo(){
        return this.saldo;
    }


    public boolean equals(Object obj){
        Usuario u = (Persona) obj;
        if (this.getCedula() == u.getCedula){
            return true;
        }

        else{
            return false;
        }
    }


}