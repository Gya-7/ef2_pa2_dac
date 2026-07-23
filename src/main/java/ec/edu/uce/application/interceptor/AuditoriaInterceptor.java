package ec.edu.uce.application.interceptor;

import java.util.Arrays;

import ec.edu.uce.application.service.AuditoriaService;
import ec.edu.uce.domain.model.Auditoria1;
import jakarta.inject.Inject;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@Interceptor
@Auditoria
public class AuditoriaInterceptor {

    @Inject
    AuditoriaService auditoriaService;

    @AroundInvoke
    public Object auditar(InvocationContext context) throws Exception{

        Auditoria1 a = new Auditoria1();

        /* 
        int contadorin = 0;
        int contadorac = 0;
        int contadorbu = 0;
        int contadorac = 0;
        */

        String nombreMetodo = context.getMethod().getName();

        Object [] argumentos = context.getParameters();
        String atexto = Arrays.toString(argumentos);

        if(nombreMetodo == "insertar"){

            int contador = 0;

            a.setInsert(++contador);

        }if (nombreMetodo == "actualizar"){

            int contador = 0;
            a.setUpdate(++contador);
        } if(nombreMetodo == "buscarPorPlaca"){
            int contador = 0;

            a.setSelect(++contador);
        }if (nombreMetodo == "borrar"){

            int contador = 0;
            a.setDelete(++ contador);

        } else {
            System.out.println("Error");
        }

        Object resultado = context.proceed();

        this.auditoriaService.insertar(a);
        

        return resultado;

    }


}
