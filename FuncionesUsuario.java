import Usuario.java;

class FuncionesUsuario{

    public float CalcularImpuestos(Usuario u){
        
        int edad = u.getEdad();
        float imp=0;
        
        if (edad<18){
            return imp;
        }

        else{
        else if(edad>=18 && edad<=30){
            imp = 2000;
        }

        else if(edad>30 && edad<65){
            imp = 7000;
        }

        else if(edad>65){
           imp = 2000;
        }
        
         imp = imp - ((u.getCantHijos()*100)/3);
        }

        return imp;

    }

    public float CobroSueldo(Usuario u,float sueldo){
        
        float sal = sueldo - CalcularImpuestos(u);
        u.setSaldo(sal);
    }

}