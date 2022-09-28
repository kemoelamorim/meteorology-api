package workbd.meteorology.api.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import workbd.meteorology.api.model.Tempo;

@Repository
public interface TempoRepository extends JpaRepository<Tempo, Long>{
  
}
