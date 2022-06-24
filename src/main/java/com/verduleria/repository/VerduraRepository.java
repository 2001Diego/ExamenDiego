
package com.verduleria.repository;

import com.verduleria.entity.Verdura;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VerduraRepository extends CrudRepository<Verdura,Long>{
    
}
