package ec.edu.uce.web.resource;

import ec.edu.uce.application.service.VehiculoService;
import ec.edu.uce.domain.model.Vehiculo;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

@Path("/vehiculo")
public class VehiculoResource {

    @Inject
    private VehiculoService vs;

    @Path("/porPlaca/{placa}")
    @GET
    public Vehiculo buscarPorPlaca(@PathParam("placa") String placa){
        
        return this.vs.buscarPorPlaca(placa);

    }

    @Path("/guardar")
    @POST
    public void guardar(Vehiculo v){

        this.vs.insertar(v);
    }



}
