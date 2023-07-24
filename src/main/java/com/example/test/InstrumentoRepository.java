package com.example.test;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource(collectionResourceRel = "instrumentos", path = "instrumentos")
public interface InstrumentoRepository extends PagingAndSortingRepository<Instrumento, Integer>,CrudRepository<Instrumento, Integer> {
    List<Instrumento> findByNombre(@Param("nombre") String nombre);
}
