/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package mz.co.centralserver.webservice;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import mz.co.centralserver.daoimpl.vendas.CaixaDAOImpl;
import mz.co.centralserver.daoimpl.vendas.CategoriaProdutoDAOImpl;
import mz.co.centralserver.daoimpl.vendas.ClienteDAOImpl;
import mz.co.centralserver.daoimpl.vendas.CondicaoPagamentoDAOImpl;
import mz.co.centralserver.daoimpl.vendas.ContaCorrenteDAOImpl;
import mz.co.centralserver.daoimpl.vendas.FechoDAOImpl;
import mz.co.centralserver.daoimpl.vendas.FluxoDAOImpl;
import mz.co.centralserver.daoimpl.vendas.FornecedorDAOImpl;
import mz.co.centralserver.daoimpl.vendas.GuiaRemessaDAOImpl;
import mz.co.centralserver.daoimpl.vendas.IsencaoDAOImpl;
import mz.co.centralserver.daoimpl.vendas.ItemPedidoDAOImpl;
import mz.co.centralserver.daoimpl.vendas.MeioPagamentoDAOImpl;
import mz.co.centralserver.daoimpl.vendas.ProdutoDAOImpl;
import mz.co.centralserver.daoimpl.vendas.ProdutoVendidoDAOImpl;
import mz.co.centralserver.daoimpl.vendas.ReferenciaDAOImpl;
import mz.co.centralserver.daoimpl.vendas.RegistoFechoDAOImpl;
import mz.co.centralserver.daoimpl.vendas.VendaDAOImpl;
import mz.co.centralserver.model.vendas.Fluxo;
import mz.co.centralserver.model.vendas.Fornecedor;
import mz.co.centralserver.model.vendas.CategoriaProduto;
import mz.co.centralserver.model.gestao.Entidade;
import mz.co.centralserver.model.vendas.Cliente;
import mz.co.centralserver.model.contabilistico.Factura;
import mz.co.centralserver.model.controleacesso.Usuario;
import mz.co.centralserver.model.ensino.Turma;
import mz.co.centralserver.model.recursoshumanos.Departamento;
import mz.co.centralserver.model.vendas.Caixa;
import mz.co.centralserver.model.vendas.CondicaoPagamento;
import mz.co.centralserver.model.vendas.ContaCorrente;
import mz.co.centralserver.model.vendas.Fecho;
import mz.co.centralserver.model.vendas.GuiaRemessa;
import mz.co.centralserver.model.vendas.Isencao;
import mz.co.centralserver.model.vendas.ItemPedido;
import mz.co.centralserver.model.vendas.MeioPagamento;
import mz.co.centralserver.model.vendas.Produto;
import mz.co.centralserver.model.vendas.ProdutoVendido;
import mz.co.centralserver.model.vendas.Referencia;
import mz.co.centralserver.model.vendas.RegistoFecho;
import mz.co.centralserver.model.vendas.Venda;

/**
 *
 * @author HJC2K8
 */
@WebService(serviceName = "VendasWSrv")
public class VendasWSrv {

    //=========================  CATEGORIA PRODUTO ==========================
    CategoriaProdutoDAOImpl categoriaProdutoDAOImpl = new CategoriaProdutoDAOImpl();

    @WebMethod(operationName = "buscaCategoriaProdutoId")
    public CategoriaProduto buscaCategoriaProdutoId(@WebParam(name = "id") int id) {
        return categoriaProdutoDAOImpl.getCategoriaProduto(id);
    }

    @WebMethod(operationName = "buscaCategoriaProdutoDescricao")
    public CategoriaProduto buscaCategoriaProdutoDescricao(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "descricao") String descricao) {
        return categoriaProdutoDAOImpl.getCategoriaProduto(entidade, descricao);
    }

    @WebMethod(operationName = "listaCategoriaProdutos")
    public List<CategoriaProduto> listaCategoriaProdutos(@WebParam(name = "entidade") Entidade entidade) {
        return categoriaProdutoDAOImpl.listaCategoriaProdutos(entidade);
    }

    @WebMethod(operationName = "persistir_categoriaProduto")
    public void persistir_categoriaProduto(@WebParam(name = "categoriaProduto") CategoriaProduto categoriaProduto) {
        categoriaProdutoDAOImpl.persistir_categoriaProduto(categoriaProduto);
    }

    @WebMethod(operationName = "remover_categoriaProduto")
    public void remover_categoriaProduto(@WebParam(name = "categoriaProduto") CategoriaProduto categoriaProduto) {
        categoriaProdutoDAOImpl.remover_categoriaProduto(categoriaProduto);
    }

    /*
     ************************** END CATEGORIA PRODUTO ***********************
     **/
 /*=================== CLIENTE ========================*/
    ClienteDAOImpl clienteDAOImpl = new ClienteDAOImpl();

    @WebMethod(operationName = "persistir_cliente")
    public void persistir_cliente(@WebParam(name = "cliente") Cliente cliente) {
        clienteDAOImpl.persistir_cliente(cliente);
    }

    @WebMethod(operationName = "remover_cliente")
    public void remover_cliente(@WebParam(name = "cliente") Cliente cliente) {
        clienteDAOImpl.remover_cliente(cliente);
    }

    @WebMethod(operationName = "buscarClienteId")
    public Cliente buscarClienteId(@WebParam(name = "id") int id) {
        return clienteDAOImpl.getCliente(id);
    }

    @WebMethod(operationName = "buscarClientePessoaId")
    public Cliente buscarClientePessoaId(@WebParam(name = "id") int id) {
        return clienteDAOImpl.getClientePessoa(id);
    }

    @WebMethod(operationName = "listaClientes")
    public List<Cliente> listaClientes(@WebParam(name = "funcao") String funcao) {
        return clienteDAOImpl.listaClientes(funcao);
    }

    @WebMethod(operationName = "listaClientesCategoria")
    public List<Cliente> listaClientesCategoria(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "categoria") String categoria) {
        return clienteDAOImpl.listaClientesCategoria(entidade, categoria);
    }

    @WebMethod(operationName = "listaClientesLimite")
    public List<Cliente> listaClientesLimite(@WebParam(name = "funcao") String funcao, @WebParam(name = "limite") int limite) {
        return clienteDAOImpl.listaClientesLimite(funcao, limite);
    }

    /**
     * ******************** END CLIENTE *********************
     */
    //=========================  PRODUTO ==========================
    ProdutoDAOImpl produtoDAOImpl = new ProdutoDAOImpl();

    @WebMethod(operationName = "buscaProdutoId")
    public Produto buscaProdutoId(@WebParam(name = "id") int id) {
        return produtoDAOImpl.getProduto(id);
    }

    @WebMethod(operationName = "buscaProdutoDescricao")
    public Produto buscaProdutoDescricao(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "descricao") String descricao) {
        return produtoDAOImpl.getProduto(entidade, descricao);
    }

    @WebMethod(operationName = "buscaProdutoCodigoBarras")
    public Produto buscaProdutoCodigoBarras(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "codigo_barras") String codigo_barras) {
        return produtoDAOImpl.getProdutoCodigoBarras(entidade, codigo_barras);
    }

    @WebMethod(operationName = "buscaProdutoReferencia")
    public Produto buscaProdutoReferencia(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "referencia") String referencia) {
        return produtoDAOImpl.getProdutoReferencia(entidade, referencia);
    }

    @WebMethod(operationName = "listaProdutos")
    public List<Produto> listaProdutos(@WebParam(name = "entidade") Entidade entidade) {
        return produtoDAOImpl.listaProdutos(entidade);
    }

    @WebMethod(operationName = "listaProdutosPorExpirar")
    public List<Produto> listaProdutosPorExpirar(@WebParam(name = "entidade") Entidade entidade) {
        return produtoDAOImpl.listaProdutosPorExpirar(entidade);
    }

    @WebMethod(operationName = "listaProdutosExpirados")
    public List<Produto> listaProdutosExpirados(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "data") String data) {
        return produtoDAOImpl.listaProdutosExpirados(entidade, data);
    }

    @WebMethod(operationName = "listaProdutosSemStock")
    public List<Produto> listaProdutosSemStock(@WebParam(name = "entidade") Entidade entidade) {
        return produtoDAOImpl.listaProdutosSemStock(entidade);
    }

    @WebMethod(operationName = "listaProdutosEmAlerta")
    public List<Produto> listaProdutosEmAlerta(@WebParam(name = "entidade") Entidade entidade) {
        return produtoDAOImpl.listaProdutosEmAlerta(entidade);
    }

    @WebMethod(operationName = "listaProdutosLimite")
    public List<Produto> listaProdutosLimite(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "limite") int limite) {
        return produtoDAOImpl.listaProdutosLimite(entidade, limite);
    }

    @WebMethod(operationName = "listaProdutosIntervalo")
    public List<Produto> listaProdutosIntervalo(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "primeiro") int primeiro, @WebParam(name = "limite") int limite) {
        return produtoDAOImpl.listaProdutosIntervalo(entidade, primeiro, limite);
    }

    @WebMethod(operationName = "listaProdutosSemStockIntervalo")
    public List<Produto> listaProdutosSemStockIntervalo(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "primeiro") int primeiro, @WebParam(name = "limite") int limite) {
        return produtoDAOImpl.listaProdutosSemStockIntervalo(entidade, primeiro, limite);
    }

    @WebMethod(operationName = "listaProdutosEmAlertaIntervalo")
    public List<Produto> listaProdutosEmAlertaIntervalo(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "primeiro") int primeiro, @WebParam(name = "limite") int limite) {
        return produtoDAOImpl.listaProdutosEmAlertaIntervalo(entidade, primeiro, limite);
    }

    @WebMethod(operationName = "listaProdutosFornecedor")
    public List<Produto> listaProdutosFornecedor(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "fornecedor") Fornecedor fornecedor) {
        return produtoDAOImpl.listaProdutosFornecedor(entidade, fornecedor);
    }

    @WebMethod(operationName = "listaProdutosEmStock")
    public List<Produto> listaProdutosEmStock(@WebParam(name = "entidade") Entidade entidade) {
        return produtoDAOImpl.listaProdutosEmStock(entidade);
    }

    @WebMethod(operationName = "listaProdutosEmStockIntervalo")
    public List<Produto> listaProdutosEmStockIntervalo(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "primeiro") int primeiro, @WebParam(name = "limite") int limite) {
        return produtoDAOImpl.listaProdutosEmStockIntervalo(entidade, primeiro, limite);
    }

    @WebMethod(operationName = "listaProdutosCategoriaProduto")
    public List<Produto> listaProdutosCategoriaProduto(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "categoriaProduto") CategoriaProduto categoriaProduto) {
        return produtoDAOImpl.listaProdutosCategoriaProduto(entidade, categoriaProduto);
    }

    @WebMethod(operationName = "persistir_produto")
    public void persistir_produto(@WebParam(name = "produto") Produto produto) {
        produtoDAOImpl.persistir_produto(produto);
    }

    @WebMethod(operationName = "remover_produto")
    public void remover_produto(@WebParam(name = "produto") Produto produto) {
        produtoDAOImpl.remover_produto(produto);
    }

    /*
     ************************** END PRODUTO ***********************
     **/
    //=========================  FORNECEDOR ==========================
    FornecedorDAOImpl fornecedorDAOImpl = new FornecedorDAOImpl();

    @WebMethod(operationName = "buscaFornecedorId")
    public Fornecedor buscaFornecedorId(@WebParam(name = "id") int id) {
        return fornecedorDAOImpl.getFornecedor(id);
    }

    @WebMethod(operationName = "buscaFornecedorDescricao")
    public Fornecedor buscaFornecedorDescricao(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "descricao") String descricao) {
        return fornecedorDAOImpl.getFornecedor(entidade, descricao);
    }

    @WebMethod(operationName = "listaFornecedores")
    public List<Fornecedor> listaFornecedores(@WebParam(name = "entidade") Entidade entidade) {
        return fornecedorDAOImpl.listaFornecedores(entidade);
    }

    @WebMethod(operationName = "persistir_fornecedor")
    public void persistir_fornecedor(@WebParam(name = "fornecedor") Fornecedor fornecedor) {
        fornecedorDAOImpl.persistir_fornecedor(fornecedor);
    }

    @WebMethod(operationName = "remover_fornecedor")
    public void remover_fornecedor(@WebParam(name = "fornecedor") Fornecedor fornecedor) {
        fornecedorDAOImpl.remover_fornecedor(fornecedor);
    }

    /*
     ************************** END FORNECEDOR ***********************
     **/
    //========================== PRODUTO VENDIDO ======================
    ProdutoVendidoDAOImpl produtoVendidoDAOImpl = new ProdutoVendidoDAOImpl();

    @WebMethod(operationName = "buscaProdutoVendidoId")
    public ProdutoVendido buscaProdutoVendidoId(@WebParam(name = "id") int id) {
        return produtoVendidoDAOImpl.getProdutoVendido(id);
    }

    @WebMethod(operationName = "listaProdutosVendidos")
    public List<ProdutoVendido> listaProdutosVendidos(@WebParam(name = "entidade") Entidade entidade) {
        return produtoVendidoDAOImpl.listaProdutosVendidos(entidade);
    }

    @WebMethod(operationName = "listaProdutoVendidoFactura")
    public List<ProdutoVendido> listaProdutoVendidoFactura(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "factura") Factura factura) {
        return produtoVendidoDAOImpl.listaProdutoVendidoFactura(entidade, factura);
    }

    @WebMethod(operationName = "listaProdutoVendidoProduto")
    public List<ProdutoVendido> listaProdutoVendidoProduto(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "produto") Produto produto) {
        return produtoVendidoDAOImpl.listaProdutoVendidoProduto(entidade, produto);
    }

    @WebMethod(operationName = "listaProdutoVendidoFacturaProduto")
    public List<ProdutoVendido> listaProdutoVendidoFacturaProduto(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "factura") Factura factura, @WebParam(name = "produto") Produto produto) {
        return produtoVendidoDAOImpl.listaProdutoVendidoFacturaProduto(entidade, produto, factura);
    }

    @WebMethod(operationName = "listaProdutoVendidoPeriodo")
    public List<ProdutoVendido> listaProdutoVendidoPeriodo(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "p1") String p1, @WebParam(name = "p2") String p2) {
        return produtoVendidoDAOImpl.listaProdutoVendidoPeriodo(entidade, p1, p2);
    }

    @WebMethod(operationName = "persistir_produtoVendido")
    public void persistir_produtoVendido(@WebParam(name = "produtoVendido") ProdutoVendido produtoVendido) {
        produtoVendidoDAOImpl.persistir_produtoVendido(produtoVendido);
    }

    @WebMethod(operationName = "remover_produtoVendido")
    public void remover_produtoVendido(@WebParam(name = "produtoVendido") ProdutoVendido produtoVendido) {
        produtoVendidoDAOImpl.remover_produtoVendido(produtoVendido);
    }


    /*
     ************************** END PRODUTO VENDIDO ***********************
     **/
    //=========================  VENDA ==========================
    VendaDAOImpl vendaDAOImpl = new VendaDAOImpl();

    @WebMethod(operationName = "buscaVendaId")
    public Venda buscaVendaId(@WebParam(name = "id") int id) {
        return vendaDAOImpl.getVenda(id);
    }

    @WebMethod(operationName = "buscaVendaReferencia")
    public Venda buscaVendaReferencia(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "descricao") String descricao) {
        return vendaDAOImpl.getVenda(entidade, descricao);
    }

    @WebMethod(operationName = "listaVendas")
    public List<Venda> listaVendas(@WebParam(name = "entidade") Entidade entidade) {
        return vendaDAOImpl.listaVendas(entidade);
    }

    @WebMethod(operationName = "listaVendasEstado")
    public List<Venda> listaVendasEstado(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "estado") String estado) {
        return vendaDAOImpl.listaVendasEstado(entidade, estado);
    }

    @WebMethod(operationName = "listaVendasCliente")
    public List<Venda> listaVendasCliente(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "cliente") Cliente cliente) {
        return vendaDAOImpl.listaVendasCliente(entidade, cliente);
    }

    @WebMethod(operationName = "listaVendasPeriodo")
    public List<Venda> listaVendasPeriodo(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "p1") String p1, @WebParam(name = "p2") String p2) {
        return vendaDAOImpl.listaVendasPeriodo(entidade, p1, p2);
    }

    @WebMethod(operationName = "listaVendasData")
    public List<Venda> listaVendasData(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "data") String data) {
        return vendaDAOImpl.listaVendasData(entidade, data);
    }

    @WebMethod(operationName = "persistir_venda")
    public void persistir_venda(@WebParam(name = "venda") Venda venda) {
        vendaDAOImpl.persistir_venda(venda);
    }

    @WebMethod(operationName = "remover_venda")
    public void remover_venda(@WebParam(name = "venda") Venda venda) {
        vendaDAOImpl.remover_venda(venda);
    }

    /*
     ************************** END VENDA ***********************
     **/
    //=========================  ITEM PEDIDO ==========================
    ItemPedidoDAOImpl itemPedidoDAOImpl = new ItemPedidoDAOImpl();

    @WebMethod(operationName = "buscaItemPedidoId")
    public ItemPedido buscaItemPedidoId(@WebParam(name = "id") int id) {
        return itemPedidoDAOImpl.getItemPedido(id);
    }

    @WebMethod(operationName = "listaItensPedidos")
    public List<ItemPedido> listaItensPedidos(@WebParam(name = "entidade") Entidade entidade) {
        return itemPedidoDAOImpl.listaItensPedidos(entidade);
    }

    @WebMethod(operationName = "listaItensPedidosFactura")
    public List<ItemPedido> listaItensPedidosFactura(@WebParam(name = "id") long id) {
        return itemPedidoDAOImpl.listaItensPedidosFactura(id);
    }

    @WebMethod(operationName = "listaItensPedidosGuiaRemessa")
    public List<ItemPedido> listaItensPedidosGuiaRemessa(@WebParam(name = "id") String id) {
        return itemPedidoDAOImpl.listaItensPedidosGuiaRemessa(id);
    }

    @WebMethod(operationName = "listaItensPedidosPeriodo")
    public List<ItemPedido> listaItensPedidosPeriodo(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "p1") String p1, @WebParam(name = "p2") String p2) {
        return itemPedidoDAOImpl.listaItensPedidosPeriodo(entidade, p1, p2);
    }

    @WebMethod(operationName = "listaItensPedidosData")
    public List<ItemPedido> listaItensPedidosData(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "data") String data) {
        return itemPedidoDAOImpl.listaItensPedidosData(entidade, data);
    }

    @WebMethod(operationName = "persistir_itemPedido")
    public void persistir_itemPedido(@WebParam(name = "itemPedido") ItemPedido itemPedido) {
        itemPedidoDAOImpl.persistir_itemPedido(itemPedido);
    }

    @WebMethod(operationName = "remover_itemPedido")
    public void remover_itemPedido(@WebParam(name = "itemPedido") ItemPedido itemPedido) {
        itemPedidoDAOImpl.remover_itemPedido(itemPedido);
    }

    /*
     ************************** END ITEM PEDIDO ***********************
     **/
    //========================== FLUXO ======================
    FluxoDAOImpl fluxoDAOImpl = new FluxoDAOImpl();

    @WebMethod(operationName = "buscaFluxoId")
    public Fluxo buscaFluxoId(@WebParam(name = "id") int id) {
        return fluxoDAOImpl.getFluxo(id);
    }

    @WebMethod(operationName = "listaFluxos")
    public List<Fluxo> listaFluxos(@WebParam(name = "entidade") Entidade entidade) {
        return fluxoDAOImpl.listaFluxos(entidade);
    }

    @WebMethod(operationName = "listaFluxoUsuario")
    public List<Fluxo> listaFluxoUsuario(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "usuario") Usuario usuario) {
        return fluxoDAOImpl.listaFluxoUsuario(entidade, usuario);
    }

    @WebMethod(operationName = "listaFluxoProduto")
    public List<Fluxo> listaFluxoProduto(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "produto") Produto produto) {
        return fluxoDAOImpl.listaFluxoProduto(entidade, produto);
    }

    @WebMethod(operationName = "listaFluxoUsuarioProduto")
    public List<Fluxo> listaFluxoUsuarioProduto(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "usuario") Usuario usuario, @WebParam(name = "produto") Produto produto) {
        return fluxoDAOImpl.listaFluxoUsuarioProduto(entidade, produto, usuario);
    }

    @WebMethod(operationName = "listaFluxoPeriodo")
    public List<Fluxo> listaFluxoPeriodo(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "p1") String p1, @WebParam(name = "p2") String p2) {
        return fluxoDAOImpl.listaFluxoPeriodo(entidade, p1, p2);
    }

    @WebMethod(operationName = "listaFluxoData")
    public List<Fluxo> listaFluxoData(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "data") String data) {
        return fluxoDAOImpl.listaFluxoData(entidade, data);
    }

    @WebMethod(operationName = "listaFluxoTurmaPeriodo")
    public List<Fluxo> listaFluxoTurmaPeriodo(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "turma") Turma turma, @WebParam(name = "p1") String p1, @WebParam(name = "p2") String p2) {
        return fluxoDAOImpl.listaFluxoTurmaPeriodo(entidade, turma, p1, p2);
    }

    @WebMethod(operationName = "listaFluxoTurmaData")
    public List<Fluxo> listaFluxoTurmaData(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "turma") Turma turma, @WebParam(name = "data") String data) {
        return fluxoDAOImpl.listaFluxoTurmaData(entidade, turma, data);
    }


    @WebMethod(operationName = "persistir_fluxo")
    public void persistir_fluxo(@WebParam(name = "fluxo") Fluxo fluxo) {
        fluxoDAOImpl.persistir_fluxo(fluxo);
    }

    @WebMethod(operationName = "remover_fluxo")
    public void remover_fluxo(@WebParam(name = "fluxo") Fluxo fluxo) {
        fluxoDAOImpl.remover_fluxo(fluxo);
    }


    /*
     ************************** END FLUXO ***********************
     */
    //=========================  GUIAS REMESSA ==========================
    GuiaRemessaDAOImpl guiaRemessaDAOImpl = new GuiaRemessaDAOImpl();

    @WebMethod(operationName = "buscaGuiaRemessaId")
    public GuiaRemessa buscaGuiaRemessaId(@WebParam(name = "id") int id) {
        return guiaRemessaDAOImpl.getGuiaRemessa(id);
    }

    @WebMethod(operationName = "buscaGuiaRemessaReferencia")
    public GuiaRemessa buscaGuiaRemessaReferencia(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "descricao") String descricao) {
        return guiaRemessaDAOImpl.getGuiaRemessa(entidade, descricao);
    }

    @WebMethod(operationName = "listaGuiasRemessa")
    public List<GuiaRemessa> listaGuiasRemessa(@WebParam(name = "entidade") Entidade entidade) {
        return guiaRemessaDAOImpl.listaGuiasRemessa(entidade);
    }

    @WebMethod(operationName = "listaGuiasRemessaTipo")
    public List<GuiaRemessa> listaGuiasRemessaTipo(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "descricao") String descricao) {
        return guiaRemessaDAOImpl.listaGuiasRemessaTipo(entidade, descricao);
    }

    @WebMethod(operationName = "listaGuiasRemessaFactura")
    public List<GuiaRemessa> listaGuiasRemessaFactura(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "factura") Factura factura) {
        return guiaRemessaDAOImpl.listaGuiasRemessaFactura(entidade, factura);
    }

    @WebMethod(operationName = "listaGuiasRemessaCliente")
    public List<GuiaRemessa> listaGuiasRemessaCliente(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "cliente") Cliente cliente) {
        return guiaRemessaDAOImpl.listaGuiasRemessaCliente(entidade, cliente);
    }

    @WebMethod(operationName = "listaGuiasRemessaPeriodo")
    public List<GuiaRemessa> listaGuiasRemessaPeriodo(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "p1") String p1, @WebParam(name = "p2") String p2) {
        return guiaRemessaDAOImpl.listaGuiasRemessaPeriodo(entidade, p1, p2);
    }

    @WebMethod(operationName = "listaGuiasRemessaData")
    public List<GuiaRemessa> listaGuiasRemessaData(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "data") String data) {
        return guiaRemessaDAOImpl.listaGuiasRemessaData(entidade, data);
    }

    @WebMethod(operationName = "persistir_guiaRemessa")
    public void persistir_guiaRemessa(@WebParam(name = "guiaRemessa") GuiaRemessa guiaRemessa) {
        guiaRemessaDAOImpl.persistir_guiaRemessa(guiaRemessa);
    }

    @WebMethod(operationName = "remover_guiaRemessa")
    public void remover_guiaRemessa(@WebParam(name = "guiaRemessa") GuiaRemessa guiaRemessa) {
        guiaRemessaDAOImpl.remover_guiaRemessa(guiaRemessa);
    }

    /*
     ************************** END GUIAS REMESSA ***********************
     **/
    //=========================  ISENCAO ==========================
    IsencaoDAOImpl isencaoDAOImpl = new IsencaoDAOImpl();

    @WebMethod(operationName = "buscaIsencaoId")
    public Isencao buscaIsencaoId(@WebParam(name = "id") int id) {
        return isencaoDAOImpl.getIsencao(id);
    }

    @WebMethod(operationName = "buscaIsencaoEntidadeDescricao")
    public Isencao buscaIsencaoEntidadeDescricao(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "descricao") String descricao) {
        return isencaoDAOImpl.getIsencao(entidade, descricao);
    }

    @WebMethod(operationName = "buscaIsencaoDescricao")
    public Isencao buscaIsencaoDescricao(@WebParam(name = "descricao") String descricao) {
        return isencaoDAOImpl.getIsencao(descricao);
    }

    @WebMethod(operationName = "buscaIsencaoEntidadeCodigo")
    public Isencao buscaIsencaoEntidadeCodigo(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "codigo") String codigo) {
        return isencaoDAOImpl.getIsencaoCodigo(entidade, codigo);
    }

    @WebMethod(operationName = "buscaIsencaoCodigo")
    public Isencao buscaIsencaoCodigo(@WebParam(name = "codigo") String codigo) {
        return isencaoDAOImpl.getIsencaoCodigo(codigo);
    }

    @WebMethod(operationName = "listaIsencoes")
    public List<Isencao> listaIsencoes(@WebParam(name = "entidade") Entidade entidade) {
        return isencaoDAOImpl.listaIsencoes(entidade);
    }

    @WebMethod(operationName = "listaTodasIsencoes")
    public List<Isencao> listaTodasIsencoes() {
        return isencaoDAOImpl.listaIsencoes();
    }

    @WebMethod(operationName = "persistir_isencao")
    public void persistir_isencao(@WebParam(name = "isencao") Isencao isencao) {
        isencaoDAOImpl.persistir_isencao(isencao);
    }

    @WebMethod(operationName = "remover_isencao")
    public void remover_isencao(@WebParam(name = "isencao") Isencao isencao) {
        isencaoDAOImpl.remover_isencao(isencao);
    }

    /*
     ************************** END ISENCAO ***********************
     **/
    //=========================  CONDICOES DE PAGAMENTO ==========================
    CondicaoPagamentoDAOImpl condicaoPagamentoDAOImpl = new CondicaoPagamentoDAOImpl();

    @WebMethod(operationName = "buscaCondicaoPagamentoId")
    public CondicaoPagamento buscaCondicaoPagamentoId(@WebParam(name = "id") int id) {
        return condicaoPagamentoDAOImpl.getCondicaoPagamento(id);
    }

    @WebMethod(operationName = "buscaCondicaoPagamentoDescricao")
    public CondicaoPagamento buscaCondicaoPagamentoDescricao(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "descricao") String descricao) {
        return condicaoPagamentoDAOImpl.getCondicaoPagamento(entidade, descricao);
    }

    @WebMethod(operationName = "listaCondicoesPagamento")
    public List<CondicaoPagamento> listaCondicoesPagamento(@WebParam(name = "entidade") Entidade entidade) {
        return condicaoPagamentoDAOImpl.listaCondicoesPagamento(entidade);
    }

    @WebMethod(operationName = "persistir_condicaoPagamento")
    public void persistir_condicaoPagamento(@WebParam(name = "condicaoPagamento") CondicaoPagamento condicaoPagamento) {
        condicaoPagamentoDAOImpl.persistir_condicaoPagamento(condicaoPagamento);
    }

    @WebMethod(operationName = "remover_condicaoPagamento")
    public void remover_condicaoPagamento(@WebParam(name = "condicaoPagamento") CondicaoPagamento condicaoPagamento) {
        condicaoPagamentoDAOImpl.remover_condicaoPagamento(condicaoPagamento);
    }

    /*
     ************************** END CONDICOES DE PAGAMENTO ***********************
     **/
    //========================== CONTA CORRENTE ======================
    ContaCorrenteDAOImpl contaCorrenteDAOImpl = new ContaCorrenteDAOImpl();

    @WebMethod(operationName = "buscaContaCorrenteId")
    public ContaCorrente buscaContaCorrenteId(@WebParam(name = "id") int id) {
        return contaCorrenteDAOImpl.getContaCorrente(id);
    }

    @WebMethod(operationName = "listaContasCorrentes")
    public List<ContaCorrente> listaContasCorrentess(@WebParam(name = "entidade") Entidade entidade) {
        return contaCorrenteDAOImpl.listaContasCorrentes(entidade);
    }

    @WebMethod(operationName = "listaContasCorrentesUsuario")
    public List<ContaCorrente> listaContasCorrentesUsuario(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "usuario") Usuario usuario) {
        return contaCorrenteDAOImpl.listaContasCorrentesUsuario(entidade, usuario);
    }

    @WebMethod(operationName = "listaContasCorrentesCliente")
    public List<ContaCorrente> listaContasCorrentesCliente(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "cliente") Cliente cliente) {
        return contaCorrenteDAOImpl.listaContasCorrentesCliente(entidade, cliente);
    }

    @WebMethod(operationName = "listaContasCorrentesPeriodo")
    public List<ContaCorrente> listaContasCorrentesPeriodo(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "p1") String p1, @WebParam(name = "p2") String p2) {
        return contaCorrenteDAOImpl.listaContasCorrentesPeriodo(entidade, p1, p2);
    }

    @WebMethod(operationName = "listaContasCorrentesData")
    public List<ContaCorrente> listaContasCorrentesData(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "data") String data) {
        return contaCorrenteDAOImpl.listaContasCorrentesData(entidade, data);
    }

    @WebMethod(operationName = "persistir_contaCorrente")
    public void persistir_contaCorrente(@WebParam(name = "contaCorrente") ContaCorrente contaCorrente) {
        contaCorrenteDAOImpl.persistir_contaCorrente(contaCorrente);
    }

    @WebMethod(operationName = "remover_contaCorrente")
    public void remover_contaCorrente(@WebParam(name = "contaCorrente") ContaCorrente contaCorrente) {
        contaCorrenteDAOImpl.remover_contaCorrente(contaCorrente);
    }


    /*
     ************************** END CONTA CORRENTE ***********************
     */
    //========================== FECHO ======================
    FechoDAOImpl fechoDAOImpl = new FechoDAOImpl();

    @WebMethod(operationName = "buscaFechoId")
    public Fecho buscaFechoId(@WebParam(name = "id") int id) {
        return fechoDAOImpl.getFecho(id);
    }

    @WebMethod(operationName = "buscaFechoData")
    public Fecho buscaFechoData(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "data") String data) {
        return fechoDAOImpl.getFechoData(entidade, data);
    }

    @WebMethod(operationName = "listaFechos")
    public List<Fecho> listaFechos(@WebParam(name = "entidade") Entidade entidade) {
        return fechoDAOImpl.listaFechos(entidade);
    }

    @WebMethod(operationName = "listaFechosUsuario")
    public List<Fecho> listaFechosUsuario(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "usuario") Usuario usuario) {
        return fechoDAOImpl.listaFechosUsuario(entidade, usuario);
    }

    @WebMethod(operationName = "listaFechosPeriodo")
    public List<Fecho> listaFechosPeriodo(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "p1") String p1, @WebParam(name = "p2") String p2) {
        return fechoDAOImpl.listaFechosPeriodo(entidade, p1, p2);
    }

    @WebMethod(operationName = "listaFechosData")
    public List<Fecho> listaFechosData(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "data") String data) {
        return fechoDAOImpl.listaFechosData(entidade, data);
    }

    @WebMethod(operationName = "persistir_fecho")
    public void persistir_fecho(@WebParam(name = "fecho") Fecho fecho) {
        fechoDAOImpl.persistir_fecho(fecho);
    }

    @WebMethod(operationName = "remover_fecho")
    public void remover_fecho(@WebParam(name = "fecho") Fecho fecho) {
        fechoDAOImpl.remover_fecho(fecho);
    }


    /*
     ************************** END FECHO ***********************
     */
    //========================== REGISTO FECHO ======================
    RegistoFechoDAOImpl registoFechoDAOImpl = new RegistoFechoDAOImpl();

    @WebMethod(operationName = "buscaRegistoFechoId")
    public RegistoFecho buscaRegistoFechoId(@WebParam(name = "id") int id) {
        return registoFechoDAOImpl.getRegistoFecho(id);
    }

    @WebMethod(operationName = "listaRegistosFechos")
    public List<RegistoFecho> listaRegistosFechos(@WebParam(name = "entidade") Entidade entidade) {
        return registoFechoDAOImpl.listaRegistosFechos(entidade);
    }

    @WebMethod(operationName = "listaRegistosFechosProduto")
    public List<RegistoFecho> listaRegistosFechosProduto(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "produto") Produto produto) {
        return registoFechoDAOImpl.listaRegistosFechosProduto(entidade, produto);
    }

    @WebMethod(operationName = "listaRegistosFechosFecho")
    public List<RegistoFecho> listaRegistosFechosFecho(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "fecho") Fecho fecho) {
        return registoFechoDAOImpl.listaRegistosFechosFecho(entidade, fecho);
    }

    @WebMethod(operationName = "listaRegistosFechosPeriodo")
    public List<RegistoFecho> listaRegistosFechosPeriodo(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "p1") String p1, @WebParam(name = "p2") String p2) {
        return registoFechoDAOImpl.listaRegistosFechosPeriodo(entidade, p1, p2);
    }

    @WebMethod(operationName = "listaRegistosFechosData")
    public List<RegistoFecho> listaRegistosFechosData(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "data") String data) {
        return registoFechoDAOImpl.listaRegistosFechosData(entidade, data);
    }

    @WebMethod(operationName = "persistir_registoFecho")
    public void persistir_registoFecho(@WebParam(name = "registoFecho") RegistoFecho registoFecho) {
        registoFechoDAOImpl.persistir_registoFecho(registoFecho);
    }

    @WebMethod(operationName = "remover_registoFecho")
    public void remover_registoFecho(@WebParam(name = "registoFecho") RegistoFecho registoFecho) {
        registoFechoDAOImpl.remover_registoFecho(registoFecho);
    }


    /*
     ************************** END REGISTO FECHO ***********************
     */
    //=========================  CAIXA ==========================
    CaixaDAOImpl caixaDAOImpl = new CaixaDAOImpl();

    @WebMethod(operationName = "buscaCaixaId")
    public Caixa buscaCaixaId(@WebParam(name = "id") int id) {
        return caixaDAOImpl.getCaixa(id);
    }

    @WebMethod(operationName = "buscaCaixaDescricao")
    public Caixa buscaCaixaDescricao(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "descricao") String descricao) {
        return caixaDAOImpl.getCaixa(entidade, descricao);
    }

    @WebMethod(operationName = "listaCaixas")
    public List<Caixa> listaCaixas(@WebParam(name = "entidade") Entidade entidade) {
        return caixaDAOImpl.listaCaixas(entidade);
    }

    @WebMethod(operationName = "listaCaixasUsuario")
    public List<Caixa> listaCaixasUsuario(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "usuario") Usuario usuario) {
        return caixaDAOImpl.listaCaixasUsuario(entidade, usuario);
    }

    @WebMethod(operationName = "listaCaixasDepartamento")
    public List<Caixa> listaCaixasDepartamento(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "departamento") Departamento departamento) {
        return caixaDAOImpl.listaCaixasDepartamento(entidade, departamento);
    }

    @WebMethod(operationName = "persistir_caixa")
    public void persistir_caixa(@WebParam(name = "caixa") Caixa caixa) {
        caixaDAOImpl.persistir_caixa(caixa);
    }

    @WebMethod(operationName = "remover_caixa")
    public void remover_caixa(@WebParam(name = "caixa") Caixa caixa) {
        caixaDAOImpl.remover_caixa(caixa);
    }

    /*
     ************************** END CAIXA ***********************
     **/
    //=========================  REFERENCIA ==========================
    ReferenciaDAOImpl referenciaDAOImpl = new ReferenciaDAOImpl();

    @WebMethod(operationName = "buscaReferencia")
    public Referencia buscaReferencia(@WebParam(name = "codEscola") String codEscola, @WebParam(name = "ano") String ano) {
        return referenciaDAOImpl.getReferencia(codEscola, ano);
    }

    @WebMethod(operationName = "listaReferencias")
    public List<Referencia> listaReferencias(@WebParam(name = "codEscola") String codEscola) {
        return referenciaDAOImpl.listaReferencias(codEscola);
    }

    @WebMethod(operationName = "persistir_referencia")
    public void persistir_referencia(@WebParam(name = "referencia") Referencia referencia) {
        referenciaDAOImpl.persistir_referencia(referencia);
    }

    @WebMethod(operationName = "remover_referencia")
    public void remover_referencia(@WebParam(name = "referencia") Referencia referencia) {
        referenciaDAOImpl.remover_referencia(referencia);
    }

    /*
     ************************** END REFERENCIA ***********************
     **/
    //=========================  MEIO PAGAMENTO ==========================
    MeioPagamentoDAOImpl meioPagamentoDAOImpl = new MeioPagamentoDAOImpl();

    @WebMethod(operationName = "buscaMeioPagamentoId")
    public MeioPagamento buscaMeioPagamentoId(@WebParam(name = "id") int id) {
        return meioPagamentoDAOImpl.getMeioPagamento(id);
    }

    @WebMethod(operationName = "buscaMeioPagamentoDescricao")
    public MeioPagamento buscaMeioPagamentoDescricao(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "descricao") String descricao) {
        return meioPagamentoDAOImpl.getMeioPagamento(entidade, descricao);
    }

    @WebMethod(operationName = "listaMeiosPagamento")
    public List<MeioPagamento> listaMeiosPagamento(@WebParam(name = "entidade") Entidade entidade) {
        return meioPagamentoDAOImpl.listaMeiosPagamento(entidade);
    }

    @WebMethod(operationName = "persistir_meioPagamento")
    public void persistir_meioPagamento(@WebParam(name = "meioPagamento") MeioPagamento meioPagamento) {
        meioPagamentoDAOImpl.persistir_meioPagamento(meioPagamento);
    }

    @WebMethod(operationName = "remover_meioPagamento")
    public void remover_meioPagamento(@WebParam(name = "meioPagamento") MeioPagamento meioPagamento) {
        meioPagamentoDAOImpl.remover_meioPagamento(meioPagamento);
    }

    /*
     ************************** END MEIO PAGAMENTO ***********************
     **/
}
