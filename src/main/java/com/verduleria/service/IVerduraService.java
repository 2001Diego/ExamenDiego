
package com.verduleria.service;

import com.verduleria.entity.Verdura;
import java.util.List;

public interface IVerduraService {
    public List<Verdura> getAllVerdura();
    public Verdura getVerduraById(long id);
    public void saveVerdura(Verdura verdura);
    public void delete(long id);
}
