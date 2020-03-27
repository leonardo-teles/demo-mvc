package com.mballem.curso.boot.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.mballem.curso.boot.domain.Cargo;
import com.mballem.curso.boot.util.PaginacaoUtil;

@Repository
public class CargoDaoImpl extends AbstractDao<Cargo, Long> implements CargoDao {

	public PaginacaoUtil<Cargo> buscaPaginada(int pagina) {
		
		int tamanho = 2;
		int inicio = (pagina -1) * tamanho; //0*5=0 1*5=5 2*5=10
		
		List<Cargo> cargos = getEntityManager()
				.createQuery("select c from Cargo c order by c.nome asc", Cargo.class)
				.setFirstResult(inicio)
				.setMaxResults(tamanho)
				.getResultList();
		
		return new PaginacaoUtil<>(tamanho, pagina, totalDePaginas, cargos);
	}
}
