package com.carro.apirest.Repository;

import org.springframework.data.jpa.repository.JpaRepository; 

import com.carro.apirest.models.veiculo;

public interface VeiculoRepository  extends JpaRepository <veiculo, Long> {  
  
	
	 veiculo findById(long id);
}
