package ec.edu.uce.infrastructure.repository;

import ec.edu.uce.domain.model.Auditoria1;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

@ApplicationScoped
@Transactional
public class AuditoriaRepositoryImpl implements PanacheRepositoryBase<Auditoria1, Integer>{

}
