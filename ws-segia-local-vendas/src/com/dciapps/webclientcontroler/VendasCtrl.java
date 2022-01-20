/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package com.dciapps.webclientcontroler;

import com.dciapps.webclient.Caixa;
import com.dciapps.webclient.CategoriaProduto;
import com.dciapps.webclient.Cliente;
import com.dciapps.webclient.CondicaoPagamento;
import com.dciapps.webclient.ContaCorrente;
import com.dciapps.webclient.Fecho;
import com.dciapps.webclient.Fluxo;
import com.dciapps.webclient.Fornecedor;
import com.dciapps.webclient.GuiaRemessa;
import com.dciapps.webclient.Isencao;
import com.dciapps.webclient.ItemPedido;
import com.dciapps.webclient.MeioPagamento;
import com.dciapps.webclient.Produto;
import com.dciapps.webclient.ProdutoVendido;
import com.dciapps.webclient.Referencia;
import com.dciapps.webclient.RegistoFecho;
import com.dciapps.webclient.Venda;

/**
 *
 * @author HJC2K8
 */
public class VendasCtrl {

    public VendasCtrl() {
    }

    public CategoriaProduto buscaCategoriaProdutoDescricao(com.dciapps.webclient.Entidade entidade, java.lang.String descricao) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.buscaCategoriaProdutoDescricao(entidade, descricao);
    }

    public CategoriaProduto buscaCategoriaProdutoId(int id) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.buscaCategoriaProdutoId(id);
    }

    public Fornecedor buscaFornecedorDescricao(com.dciapps.webclient.Entidade entidade, java.lang.String descricao) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.buscaFornecedorDescricao(entidade, descricao);
    }

    public Fornecedor buscaFornecedorId(int id) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.buscaFornecedorId(id);
    }

    public ItemPedido buscaItemPedidoId(int id) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.buscaItemPedidoId(id);
    }

    public Produto buscaProdutoDescricao(com.dciapps.webclient.Entidade entidade, java.lang.String descricao) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.buscaProdutoDescricao(entidade, descricao);
    }

    public Produto buscaProdutoId(int id) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.buscaProdutoId(id);
    }

    public ProdutoVendido buscaProdutoVendidoId(int id) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.buscaProdutoVendidoId(id);
    }

    public Venda buscaVendaId(int id) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.buscaVendaId(id);
    }

    public Venda buscaVendaReferencia(com.dciapps.webclient.Entidade entidade, java.lang.String descricao) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.buscaVendaReferencia(entidade, descricao);
    }

    public Cliente buscarClienteId(int id) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.buscarClienteId(id);
    }

    public Cliente buscarClientePessoaId(int id) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.buscarClientePessoaId(id);
    }

    public java.util.List<com.dciapps.webclient.CategoriaProduto> listaCategoriaProdutos(com.dciapps.webclient.Entidade entidade) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.listaCategoriaProdutos(entidade);
    }

    public java.util.List<com.dciapps.webclient.Cliente> listaClientes(java.lang.String funcao) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.listaClientes(funcao);
    }

    public java.util.List<com.dciapps.webclient.Fornecedor> listaFornecedores(com.dciapps.webclient.Entidade entidade) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.listaFornecedores(entidade);
    }

    public java.util.List<com.dciapps.webclient.ItemPedido> listaItensPedidosFactura(long id) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.listaItensPedidosFactura(id);
    }

    public java.util.List<com.dciapps.webclient.ProdutoVendido> listaProdutoVendidoFactura(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Factura factura) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.listaProdutoVendidoFactura(entidade, factura);
    }

    public java.util.List<com.dciapps.webclient.ProdutoVendido> listaProdutoVendidoFacturaProduto(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Factura factura, com.dciapps.webclient.Produto produto) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.listaProdutoVendidoFacturaProduto(entidade, factura, produto);
    }

    public java.util.List<com.dciapps.webclient.ProdutoVendido> listaProdutoVendidoPeriodo(com.dciapps.webclient.Entidade entidade, java.lang.String p1, java.lang.String p2) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.listaProdutoVendidoPeriodo(entidade, p1, p2);
    }

    public java.util.List<com.dciapps.webclient.ProdutoVendido> listaProdutoVendidoProduto(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Produto produto) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.listaProdutoVendidoProduto(entidade, produto);
    }

    public java.util.List<com.dciapps.webclient.Produto> listaProdutos(com.dciapps.webclient.Entidade entidade) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.listaProdutos(entidade);
    }

    public java.util.List<com.dciapps.webclient.ProdutoVendido> listaProdutosVendidos(com.dciapps.webclient.Entidade entidade) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.listaProdutosVendidos(entidade);
    }

    public java.util.List<com.dciapps.webclient.Venda> listaVendas(com.dciapps.webclient.Entidade entidade) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.listaVendas(entidade);
    }

    public java.util.List<com.dciapps.webclient.Venda> listaVendasCliente(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Cliente cliente) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.listaVendasCliente(entidade, cliente);
    }

    public java.util.List<com.dciapps.webclient.Venda> listaVendasEstado(com.dciapps.webclient.Entidade entidade, java.lang.String estado) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.listaVendasEstado(entidade, estado);
    }

    public void persistirCategoriaProduto(com.dciapps.webclient.CategoriaProduto categoriaProduto) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        port.persistirCategoriaProduto(categoriaProduto);
    }

    public void persistirCliente(com.dciapps.webclient.Cliente cliente) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        port.persistirCliente(cliente);
    }

    public void persistirFornecedor(com.dciapps.webclient.Fornecedor fornecedor) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        port.persistirFornecedor(fornecedor);
    }

    public void persistirItemPedido(com.dciapps.webclient.ItemPedido itemPedido) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        port.persistirItemPedido(itemPedido);
    }

    public void persistirProduto(com.dciapps.webclient.Produto produto) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        port.persistirProduto(produto);
    }

    public void persistirProdutoVendido(com.dciapps.webclient.ProdutoVendido produtoVendido) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        port.persistirProdutoVendido(produtoVendido);
    }

    public void persistirVenda(com.dciapps.webclient.Venda venda) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        port.persistirVenda(venda);
    }

    public void removerCategoriaProduto(com.dciapps.webclient.CategoriaProduto categoriaProduto) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        port.removerCategoriaProduto(categoriaProduto);
    }

    public void removerFornecedor(com.dciapps.webclient.Fornecedor fornecedor) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        port.removerFornecedor(fornecedor);
    }

    public void removerProduto(com.dciapps.webclient.Produto produto) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        port.removerProduto(produto);
    }

    public void removerProdutoVendido(com.dciapps.webclient.ProdutoVendido produtoVendido) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        port.removerProdutoVendido(produtoVendido);
    }

    public void removerVenda(com.dciapps.webclient.Venda venda) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        port.removerVenda(venda);
    }

    public java.util.List<com.dciapps.webclient.Cliente> listaClientesLimite(java.lang.String funcao, int limite) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.listaClientesLimite(funcao, limite);
    }

    public java.util.List<com.dciapps.webclient.Produto> listaProdutosLimite(com.dciapps.webclient.Entidade entidade, int limite) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.listaProdutosLimite(entidade, limite);
    }

    public java.util.List<com.dciapps.webclient.Produto> listaProdutosFornecedor(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Fornecedor fornecedor) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.listaProdutosFornecedor(entidade, fornecedor);
    }

    public Fluxo buscaFluxoId(int id) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.buscaFluxoId(id);
    }

    public java.util.List<com.dciapps.webclient.Fluxo> listaFluxoPeriodo(com.dciapps.webclient.Entidade entidade, java.lang.String p1, java.lang.String p2) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.listaFluxoPeriodo(entidade, p1, p2);
    }

    public java.util.List<com.dciapps.webclient.Fluxo> listaFluxoProduto(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Produto produto) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.listaFluxoProduto(entidade, produto);
    }

    public java.util.List<com.dciapps.webclient.Fluxo> listaFluxoUsuario(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Usuario usuario) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.listaFluxoUsuario(entidade, usuario);
    }

    public java.util.List<com.dciapps.webclient.Fluxo> listaFluxoUsuarioProduto(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Usuario usuario, com.dciapps.webclient.Produto produto) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.listaFluxoUsuarioProduto(entidade, usuario, produto);
    }

    public java.util.List<com.dciapps.webclient.Fluxo> listaFluxos(com.dciapps.webclient.Entidade entidade) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.listaFluxos(entidade);
    }

    public void persistirFluxo(com.dciapps.webclient.Fluxo fluxo) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        port.persistirFluxo(fluxo);
    }

    public void removerFluxo(com.dciapps.webclient.Fluxo fluxo) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        port.removerFluxo(fluxo);
    }

    public java.util.List<com.dciapps.webclient.ItemPedido> listaItensPedidos(com.dciapps.webclient.Entidade entidade) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.listaItensPedidos(entidade);
    }

    public java.util.List<com.dciapps.webclient.ItemPedido> listaItensPedidosPeriodo(com.dciapps.webclient.Entidade entidade, java.lang.String p1, java.lang.String p2) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.listaItensPedidosPeriodo(entidade, p1, p2);
    }

    public java.util.List<com.dciapps.webclient.Produto> listaProdutosCategoriaProduto(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.CategoriaProduto categoriaProduto) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.listaProdutosCategoriaProduto(entidade, categoriaProduto);
    }


    public java.util.List<com.dciapps.webclient.Fluxo> listaFluxoData(com.dciapps.webclient.Entidade entidade, java.lang.String data) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.listaFluxoData(entidade, data);
    }

    public GuiaRemessa buscaGuiaRemessaId(int id) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.buscaGuiaRemessaId(id);
    }

    public java.util.List<com.dciapps.webclient.ItemPedido> listaItensPedidosGuiaRemessa(java.lang.String id) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.listaItensPedidosGuiaRemessa(id);
    }

    public java.util.List<com.dciapps.webclient.GuiaRemessa> listaGuiasRemessa(com.dciapps.webclient.Entidade entidade) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.listaGuiasRemessa(entidade);
    }

    public java.util.List<com.dciapps.webclient.GuiaRemessa> listaGuiasRemessaData(com.dciapps.webclient.Entidade entidade, java.lang.String data) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.listaGuiasRemessaData(entidade, data);
    }

    public java.util.List<com.dciapps.webclient.GuiaRemessa> listaGuiasRemessaFactura(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Factura factura) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.listaGuiasRemessaFactura(entidade, factura);
    }

    public java.util.List<com.dciapps.webclient.GuiaRemessa> listaGuiasRemessaPeriodo(com.dciapps.webclient.Entidade entidade, java.lang.String p1, java.lang.String p2) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.listaGuiasRemessaPeriodo(entidade, p1, p2);
    }

    public void persistirGuiaRemessa(com.dciapps.webclient.GuiaRemessa guiaRemessa) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        port.persistirGuiaRemessa(guiaRemessa);
    }

    public void removerGuiaRemessa(com.dciapps.webclient.GuiaRemessa guiaRemessa) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        port.removerGuiaRemessa(guiaRemessa);
    }

    public java.util.List<com.dciapps.webclient.Produto> listaProdutosIntervalo(com.dciapps.webclient.Entidade entidade, int primeiro, int limite) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.listaProdutosIntervalo(entidade, primeiro, limite);
    }

    public Produto buscaProdutoReferencia(com.dciapps.webclient.Entidade entidade, java.lang.String segmento) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.buscaProdutoReferencia(entidade, segmento);
    }

    public Isencao buscaIsencaoCodigo(java.lang.String codigo) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.buscaIsencaoCodigo(codigo);
    }

    public Isencao buscaIsencaoDescricao(java.lang.String descricao) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.buscaIsencaoDescricao(descricao);
    }

    public Isencao buscaIsencaoEntidadeCodigo(com.dciapps.webclient.Entidade entidade, java.lang.String codigo) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.buscaIsencaoEntidadeCodigo(entidade, codigo);
    }

    public Isencao buscaIsencaoEntidadeDescricao(com.dciapps.webclient.Entidade entidade, java.lang.String descricao) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.buscaIsencaoEntidadeDescricao(entidade, descricao);
    }

    public Isencao buscaIsencaoId(int id) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.buscaIsencaoId(id);
    }

    public java.util.List<com.dciapps.webclient.Isencao> listaIsencoes(com.dciapps.webclient.Entidade entidade) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.listaIsencoes(entidade);
    }

    public java.util.List<com.dciapps.webclient.Isencao> listaTodasIsencoes() {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.listaTodasIsencoes();
    }

    public void persistirIsencao(com.dciapps.webclient.Isencao isencao) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        port.persistirIsencao(isencao);
    }

    public void removerIsencao(com.dciapps.webclient.Isencao isencao) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        port.removerIsencao(isencao);
    }

    public CondicaoPagamento buscaCondicaoPagamentoDescricao(com.dciapps.webclient.Entidade entidade, java.lang.String descricao) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.buscaCondicaoPagamentoDescricao(entidade, descricao);
    }

    public CondicaoPagamento buscaCondicaoPagamentoId(int id) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.buscaCondicaoPagamentoId(id);
    }

    public java.util.List<com.dciapps.webclient.CondicaoPagamento> listaCondicoesPagamento(com.dciapps.webclient.Entidade entidade) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.listaCondicoesPagamento(entidade);
    }

    public void persistirCondicaoPagamento(com.dciapps.webclient.CondicaoPagamento condicaoPagamento) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        port.persistirCondicaoPagamento(condicaoPagamento);
    }

    public void removerCondicaoPagamento(com.dciapps.webclient.CondicaoPagamento condicaoPagamento) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        port.removerCondicaoPagamento(condicaoPagamento);
    }

    public java.util.List<com.dciapps.webclient.Venda> listaVendasData(com.dciapps.webclient.Entidade entidade, java.lang.String data) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.listaVendasData(entidade, data);
    }

    public java.util.List<com.dciapps.webclient.Venda> listaVendasPeriodo(com.dciapps.webclient.Entidade entidade, java.lang.String p1, java.lang.String p2) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.listaVendasPeriodo(entidade, p1, p2);
    }

    public java.util.List<com.dciapps.webclient.ItemPedido> listaItensPedidosData(com.dciapps.webclient.Entidade entidade, java.lang.String data) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.listaItensPedidosData(entidade, data);
    }

    public void removerItemPedido(com.dciapps.webclient.ItemPedido itemPedido) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        port.removerItemPedido(itemPedido);
    }

    public GuiaRemessa buscaGuiaRemessaReferencia(com.dciapps.webclient.Entidade entidade, java.lang.String descricao) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.buscaGuiaRemessaReferencia(entidade, descricao);
    }

    public ContaCorrente buscaContaCorrenteId(int id) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.buscaContaCorrenteId(id);
    }

    public java.util.List<com.dciapps.webclient.ContaCorrente> listaContasCorrentes(com.dciapps.webclient.Entidade entidade) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.listaContasCorrentes(entidade);
    }

    public java.util.List<com.dciapps.webclient.ContaCorrente> listaContasCorrentesCliente(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Cliente cliente) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.listaContasCorrentesCliente(entidade, cliente);
    }

    public java.util.List<com.dciapps.webclient.ContaCorrente> listaContasCorrentesData(com.dciapps.webclient.Entidade entidade, java.lang.String data) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.listaContasCorrentesData(entidade, data);
    }

    public java.util.List<com.dciapps.webclient.ContaCorrente> listaContasCorrentesPeriodo(com.dciapps.webclient.Entidade entidade, java.lang.String p1, java.lang.String p2) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.listaContasCorrentesPeriodo(entidade, p1, p2);
    }

    public java.util.List<com.dciapps.webclient.ContaCorrente> listaContasCorrentesUsuario(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Usuario usuario) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.listaContasCorrentesUsuario(entidade, usuario);
    }

    public void persistirContaCorrente(com.dciapps.webclient.ContaCorrente contaCorrente) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        port.persistirContaCorrente(contaCorrente);
    }

    public void removerContaCorrente(com.dciapps.webclient.ContaCorrente contaCorrente) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        port.removerContaCorrente(contaCorrente);
    }

    public java.util.List<com.dciapps.webclient.Produto> listaProdutosEmAlerta(com.dciapps.webclient.Entidade entidade) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.listaProdutosEmAlerta(entidade);
    }

    public java.util.List<com.dciapps.webclient.Produto> listaProdutosSemStock(com.dciapps.webclient.Entidade entidade) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.listaProdutosSemStock(entidade);
    }

    public java.util.List<com.dciapps.webclient.Produto> listaProdutosSemStockIntervalo(com.dciapps.webclient.Entidade entidade, int primeiro, int limite) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.listaProdutosSemStockIntervalo(entidade, primeiro, limite);
    }

    public java.util.List<com.dciapps.webclient.Produto> listaProdutosEmAlertaIntervalo(com.dciapps.webclient.Entidade entidade, int primeiro, int limite) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.listaProdutosEmAlertaIntervalo(entidade, primeiro, limite);
    }

    public void removerCliente(com.dciapps.webclient.Cliente cliente) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        port.removerCliente(cliente);
    }

    public Produto buscaProdutoCodigoBarras(com.dciapps.webclient.Entidade entidade, java.lang.String codigoBarras) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.buscaProdutoCodigoBarras(entidade, codigoBarras);
    }

    public Fecho buscaFechoId(int id) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.buscaFechoId(id);
    }

    public Fecho buscaFechoData(com.dciapps.webclient.Entidade entidade, java.lang.String data) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.buscaFechoData(entidade, data);
    }

    public RegistoFecho buscaRegistoFechoId(int id) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.buscaRegistoFechoId(id);
    }

    public java.util.List<com.dciapps.webclient.Fecho> listaFechos(com.dciapps.webclient.Entidade entidade) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.listaFechos(entidade);
    }

    public java.util.List<com.dciapps.webclient.Fecho> listaFechosData(com.dciapps.webclient.Entidade entidade, java.lang.String data) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.listaFechosData(entidade, data);
    }

    public java.util.List<com.dciapps.webclient.Fecho> listaFechosPeriodo(com.dciapps.webclient.Entidade entidade, java.lang.String p1, java.lang.String p2) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.listaFechosPeriodo(entidade, p1, p2);
    }

    public java.util.List<com.dciapps.webclient.Fecho> listaFechosUsuario(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Usuario usuario) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.listaFechosUsuario(entidade, usuario);
    }

    public java.util.List<com.dciapps.webclient.RegistoFecho> listaRegistosFechos(com.dciapps.webclient.Entidade entidade) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.listaRegistosFechos(entidade);
    }

    public java.util.List<com.dciapps.webclient.RegistoFecho> listaRegistosFechosData(com.dciapps.webclient.Entidade entidade, java.lang.String data) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.listaRegistosFechosData(entidade, data);
    }

    public java.util.List<com.dciapps.webclient.RegistoFecho> listaRegistosFechosFecho(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Fecho fecho) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.listaRegistosFechosFecho(entidade, fecho);
    }

    public java.util.List<com.dciapps.webclient.RegistoFecho> listaRegistosFechosPeriodo(com.dciapps.webclient.Entidade entidade, java.lang.String p1, java.lang.String p2) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.listaRegistosFechosPeriodo(entidade, p1, p2);
    }

    public java.util.List<com.dciapps.webclient.RegistoFecho> listaRegistosFechosProduto(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Produto produto) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.listaRegistosFechosProduto(entidade, produto);
    }

    public void persistirFecho(com.dciapps.webclient.Fecho fecho) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        port.persistirFecho(fecho);
    }

    public void persistirRegistoFecho(com.dciapps.webclient.RegistoFecho registoFecho) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        port.persistirRegistoFecho(registoFecho);
    }

    public void removerFecho(com.dciapps.webclient.Fecho fecho) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        port.removerFecho(fecho);
    }

    public void removerRegistoFecho(com.dciapps.webclient.RegistoFecho registoFecho) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        port.removerRegistoFecho(registoFecho);
    }

    public Caixa buscaCaixaDescricao(com.dciapps.webclient.Entidade entidade, java.lang.String descricao) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.buscaCaixaDescricao(entidade, descricao);
    }

    public Caixa buscaCaixaId(int id) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.buscaCaixaId(id);
    }

    public java.util.List<com.dciapps.webclient.Caixa> listaCaixas(com.dciapps.webclient.Entidade entidade) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.listaCaixas(entidade);
    }

    public java.util.List<com.dciapps.webclient.Caixa> listaCaixasDepartamento(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Departamento departamento) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.listaCaixasDepartamento(entidade, departamento);
    }

    public java.util.List<com.dciapps.webclient.Caixa> listaCaixasUsuario(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Usuario usuario) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.listaCaixasUsuario(entidade, usuario);
    }

    public void persistirCaixa(com.dciapps.webclient.Caixa caixa) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        port.persistirCaixa(caixa);
    }

    public void removerCaixa(com.dciapps.webclient.Caixa caixa) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        port.removerCaixa(caixa);
    }

    public java.util.List<com.dciapps.webclient.GuiaRemessa> listaGuiasRemessaTipo(com.dciapps.webclient.Entidade entidade, java.lang.String descricao) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.listaGuiasRemessaTipo(entidade, descricao);
    }

    public java.util.List<com.dciapps.webclient.Produto> listaProdutosEmStock(com.dciapps.webclient.Entidade entidade) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.listaProdutosEmStock(entidade);
    }

    public java.util.List<com.dciapps.webclient.Produto> listaProdutosEmStockIntervalo(com.dciapps.webclient.Entidade entidade, int primeiro, int limite) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.listaProdutosEmStockIntervalo(entidade, primeiro, limite);
    }

    public java.util.List<com.dciapps.webclient.Produto> listaProdutosExpirados(com.dciapps.webclient.Entidade entidade, java.lang.String data) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.listaProdutosExpirados(entidade, data);
    }

    public java.util.List<com.dciapps.webclient.Produto> listaProdutosPorExpirar(com.dciapps.webclient.Entidade entidade) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.listaProdutosPorExpirar(entidade);
    }

    public java.util.List<com.dciapps.webclient.Cliente> listaClientesCategoria(com.dciapps.webclient.Entidade entidade, java.lang.String categoria) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.listaClientesCategoria(entidade, categoria);
    }

    public Referencia buscaReferencia(java.lang.String codEscola, java.lang.String ano) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.buscaReferencia(codEscola, ano);
    }

    public java.util.List<com.dciapps.webclient.Referencia> listaReferencias(java.lang.String codEscola) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.listaReferencias(codEscola);
    }

    public void persistirReferencia(com.dciapps.webclient.Referencia referencia) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        port.persistirReferencia(referencia);
    }

    public void removerReferencia(com.dciapps.webclient.Referencia referencia) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        port.removerReferencia(referencia);
    }

    public MeioPagamento buscaMeioPagamentoDescricao(com.dciapps.webclient.Entidade entidade, java.lang.String descricao) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.buscaMeioPagamentoDescricao(entidade, descricao);
    }

    public MeioPagamento buscaMeioPagamentoId(int id) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.buscaMeioPagamentoId(id);
    }

    public java.util.List<com.dciapps.webclient.MeioPagamento> listaMeiosPagamento(com.dciapps.webclient.Entidade entidade) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.listaMeiosPagamento(entidade);
    }

    public void persistirMeioPagamento(com.dciapps.webclient.MeioPagamento meioPagamento) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        port.persistirMeioPagamento(meioPagamento);
    }

    public void removerMeioPagamento(com.dciapps.webclient.MeioPagamento meioPagamento) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        port.removerMeioPagamento(meioPagamento);
    }

    public java.util.List<com.dciapps.webclient.Fluxo> listaFluxoTurmaData(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Turma turma, java.lang.String data) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.listaFluxoTurmaData(entidade, turma, data);
    }

    public java.util.List<com.dciapps.webclient.Fluxo> listaFluxoTurmaPeriodo(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Turma turma, java.lang.String p1, java.lang.String p2) {
        com.dciapps.webclient.VendasWSrv_Service service = new com.dciapps.webclient.VendasWSrv_Service();
        com.dciapps.webclient.VendasWSrv port = service.getVendasWSrvPort();
        return port.listaFluxoTurmaPeriodo(entidade, turma, p1, p2);
    }

}
