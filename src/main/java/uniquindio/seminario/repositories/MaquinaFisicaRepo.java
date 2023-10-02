package uniquindio.seminario.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uniquindio.seminario.model.MaquinaFisica;
@Repository
public interface MaquinaFisicaRepo extends JpaRepository<MaquinaFisica, Integer> {
}
