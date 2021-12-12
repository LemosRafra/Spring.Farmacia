package com.rafaellemos.farmacia.Repository;

import java.util.List;

import com.rafaellemos.farmacia.Model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

    public List <Categoria> findAllByCategoriaContainingIgnoreCase(String categoria);

}
