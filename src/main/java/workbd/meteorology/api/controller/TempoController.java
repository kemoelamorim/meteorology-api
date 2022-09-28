package workbd.meteorology.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import workbd.meteorology.api.model.dto.TempoDTO;
import workbd.meteorology.api.service.TempoFacade;

@RestController
@RequestMapping(value = "/tempo")
public class TempoController {
  
  @Autowired
  private TempoFacade tempoFacade;

  @GetMapping
  @ResponseBody
  public List<TempoDTO> getAll(){
    return this.tempoFacade.getAll();
  }
}
