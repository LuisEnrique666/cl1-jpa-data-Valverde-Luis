package pe.edu.i202225585.cl1_jpa_data_Valverde_Luis.repository;

import org.springframework.data.repository.CrudRepository;
import pe.edu.i202225585.cl1_jpa_data_Valverde_Luis.entity.Country;

public interface CountryRepository  extends CrudRepository<Country, String> {
}
