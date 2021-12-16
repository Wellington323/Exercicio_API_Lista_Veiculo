package com.carro.apirest.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carro.apirest.Repository.VeiculoRepository;
import com.carro.apirest.models.veiculo;

@RestController 
@RequestMapping(value="/api")
public class VeiculoResource {
	
	 @Autowired
	 VeiculoRepository veiculoRepository; 
	 
	 @GetMapping("/carro")
	  public List<veiculo> listaVeiculo(){ 
		  return  veiculoRepository.findAll(); 
  }
	  //RETORNA UM PRODUTO APENAS,TEM QUE CRIAR UM COMANDO NO REPOSITORY
	  
	  @GetMapping("/carro/{id}")
	  public veiculo listaVeiculoUnico(@PathVariable(value="id") long id) { 
		  return  veiculoRepository.findById(id);  	    
	  }
          // SALVAR PRODUTO

      @PostMapping("/carro")
      public veiculo salavaVeiculo(@RequestBody veiculo veiculo){
    	  return veiculoRepository.save(veiculo); 
      } 
      
      // DELETA UM PRODUTO 
      
      @DeleteMapping("/carro")
      public void  deletaVeiculo(@RequestBody veiculo veiculo) {
        veiculoRepository.delete(veiculo);
      }    
        //ATUALIZAR UM PRODUTO
        
        @PutMapping("/carro")
         public veiculo atualizaVeiculo(@RequestBody veiculo veiculo) {
        	return veiculoRepository.save(veiculo);   
       
        
   }
}

















