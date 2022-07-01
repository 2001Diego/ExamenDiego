
package com.empresa.repository;

import com.empresa.entity.Concierto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ConciertoRepository extends CrudRepository<Concierto,Long>{
    
}
