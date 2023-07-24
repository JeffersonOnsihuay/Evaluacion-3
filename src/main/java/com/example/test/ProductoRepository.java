package com.example.test;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource(collectionResourceRel = "producto", path = "producto")
public interface ProductoRepository extends PagingAndSortingRepository<Producto, Integer>,CrudRepository<Producto, Integer> {
    List<Producto> findByNombre(@Param("nombre") String nombre);

}
