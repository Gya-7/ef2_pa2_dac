package ec.edu.uce.application.service;

import ec.edu.uce.application.interceptor.Auditoria;
import ec.edu.uce.domain.model.Vehiculo;
import ec.edu.uce.infrastructure.repository.VehiculoRepositoryImpl;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
@Transactional
public class VehiculoService {

    @Inject
    private VehiculoRepositoryImpl vehiculoRepositoryImpl;

    @Auditoria
    public void insertar(Vehiculo v){
        this.vehiculoRepositoryImpl.persist(v);

    }

    @Auditoria
    public void actualizar(Vehiculo v){

        Vehiculo nuevo = this.buscarPorPlaca(v.getPlaca());

        nuevo.setModelo(v.getModelo());

    }

    @Auditoria
    public Vehiculo buscarPorPlaca(String placa){

        return this.vehiculoRepositoryImpl.buscarPorPlaca(placa);
    }

    @Auditoria
    public void borrar(Integer id){

        this.vehiculoRepositoryImpl.deleteById(id);
    }

}
