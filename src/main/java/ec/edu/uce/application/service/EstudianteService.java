package ec.edu.uce.application.service;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import ec.edu.uce.infrastructure.repository.EstudianteRepositoryImpl;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
@Transactional
public class EstudianteService {

    @Inject
    private EstudianteRepositoryImpl eRepoImpl;

    public  void guardarReactiva (String url) throws IOException {

        Path paths = Paths.get(url);

        List<String> lineas = Files.readAllLines(paths, StandardCharsets.UTF_8);

        String cedula = lineas.get(1);
        String nombre = lineas.get(2);
        String apellido = lineas.get(3);
        String genero = lineas.get(4);
        

        /* 
        CompletableFuture<Void> cp =  CompletableFuture.runAsync(() ->
        ));

        lineas.parallelStream().forEach( -> {

            String cedula = lin.indexOf(1);

            this.eRepoImpl.persist(lin);


        });
        */

    }


    
}
