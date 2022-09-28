package workbd.meteorology.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

import workbd.meteorology.api.model.Tempo;
import workbd.meteorology.api.model.dto.TempoDTO;
import workbd.meteorology.api.repository.TempoRepository;

@Service
public class TempoFacade {
  
  private final TempoRepository repository;

  public TempoFacade(TempoRepository repository){
    this.repository = repository;
  }

  public List<TempoDTO> getAll(){
    return this.repository
      .findAll()
      .stream()
      .map(this::converter)
      .collect(Collectors.toList());
  }

  public TempoDTO converter(Tempo tempo){
    TempoDTO result = new TempoDTO();
    result.setId(tempo.getId());
    result.setDescricao(tempo.getDescricao());
    return result;
  }

}
