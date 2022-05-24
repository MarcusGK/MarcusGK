
public class Gestor_empleados {

    public static void main(String[] args) {
        EmpAdmvo adm =new EmpAdmvo("Marco Antonio", "Administrativo"," departamento de finanzas" ," MACMJ880326");
        adm.quincenaadm();
        EmpMecanico mcn=new EmpMecanico("Jasmin gutierrez", "Mecanico"," departamento de Mecanica" ," JSGJ880326");
        mcn.sueldoqcmcn();
        EmpVendedor vnd=new EmpVendedor("Gustavo Lopez", "Vendedor"," departamento de Ventas" ," GLJ880326");
        vnd.quincenavnd();
    }
    
}
