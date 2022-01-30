package br.edu.restinga.ifrs.devspring.Services;


import br.edu.restinga.ifrs.devspring.modelo.Entidade.Produto;
import br.edu.restinga.ifrs.devspring.produtoRepository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository produtoRepository;


    public Produto criarProduto(Produto produto){
        return produtoRepository.save(produto);
    }

    public Iterable<Produto> listarProdutos(){
        Iterable<Produto> produtos = produtoRepository.findAll();
        return produtos;
    }

    public Optional<Produto> recuperarProduto(int id){
        Optional<Produto> produtoRecuperado = produtoRepository.findById(id);
        return produtoRecuperado;
    }

    public Produto atualizarProduto(Produto produto, int id){
        produto.setId(id);
        return produtoRepository.save(produto);
    }

    public void deletarProduto(int id){
        Optional<Produto> produto = produtoRepository.findById(id);
        produtoRepository.deleteById(id);
    }


}
