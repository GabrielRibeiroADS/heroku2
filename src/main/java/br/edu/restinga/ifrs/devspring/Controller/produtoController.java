package br.edu.restinga.ifrs.devspring.Controller;

import br.edu.restinga.ifrs.devspring.Services.ProdutoService;
import br.edu.restinga.ifrs.devspring.modelo.Entidade.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class produtoController {

    @Autowired
    ProdutoService produtoService;

    @PostMapping(path="/criarProduto")
    public Produto criarProduto(@RequestBody Produto produto){
        return produtoService.criarProduto(produto);
    }

    @GetMapping(path = "/listarProduto")
    public Iterable<Produto> listarProdutos(){
        return produtoService.listarProdutos();
    }

    @GetMapping(path = "/recuperaProduto/{id}")
    public Optional<Produto> recuperarProduto(@PathVariable int id){
        return produtoService.recuperarProduto(id);
    }

    @PutMapping(path = "/atualizarProduto/{id}")
    public Produto atualizarProduto(@PathVariable("id") int id, @RequestBody Produto produto){
        return produtoService.atualizarProduto(produto,id);
    }

    @DeleteMapping(path = "/deletarProduto/{id}")
    public void deletarProduto(@PathVariable("id") int id){
        produtoService.deletarProduto(id);
    }




}
