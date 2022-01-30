package br.edu.restinga.ifrs.devspring.produtoRepository;

import br.edu.restinga.ifrs.devspring.modelo.Entidade.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {
}
