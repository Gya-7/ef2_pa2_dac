package ec.edu.uce.application.service;

import ec.edu.uce.application.interceptor.Auditoria;
import ec.edu.uce.domain.model.Auditoria1;
import ec.edu.uce.infrastructure.repository.AuditoriaRepositoryImpl;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
@Transactional
public class AuditoriaService {

    @Inject
    private AuditoriaRepositoryImpl auditoriaRepositoryImpl;

    public void insertar(Auditoria1 v){
        this.auditoriaRepositoryImpl.persist(v);


    }


}
