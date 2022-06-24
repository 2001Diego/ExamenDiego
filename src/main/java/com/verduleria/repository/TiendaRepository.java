
package com.verduleria.repository;

import com.verduleria.entity.Tienda;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TiendaRepository extends CrudRepository<Tienda,Long>{
    
}
