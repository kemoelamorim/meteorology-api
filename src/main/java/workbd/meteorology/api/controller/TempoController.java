package workbd.meteorology.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class TempoController {
  
  @GetMapping
  public String tempoHoje(){
    return "{ blumenau: 21° , 26/09/2022}";
  }
}
