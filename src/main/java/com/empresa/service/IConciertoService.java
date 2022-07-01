
package com.empresa.service;

import com.empresa.entity.Concierto;
import java.util.List;

public interface IConciertoService {
    public List<Concierto> getAllConcierto();
    public Concierto getConciertoById(long id);
    public void saveConcierto(Concierto verdura);
    public void delete(long id);
}
