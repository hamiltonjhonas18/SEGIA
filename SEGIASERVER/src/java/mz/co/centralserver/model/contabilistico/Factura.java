package mz.co.centralserver.model.contabilistico;

/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 *
 * This is an automatic generated file. It will be regenerated every time you
 * generate persistence class.
 *
 * Modifying its content may cause the program not work, or your work may lost.
 */
/**
 * Licensee: License Type: Evaluation
 */
import java.io.Serializable;
import javax.persistence.*;
import mz.co.centralserver.model.controleacesso.Usuario;
import mz.co.centralserver.model.gestao.Entidade;
import mz.co.centralserver.model.vendas.Caixa;
import mz.co.centralserver.model.vendas.Venda;

@Entity
@Table(name = "Factura")
public class Factura implements Serializable {

    @Id
    @GeneratedValue
    private int fact_id;

    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date fact_data;

    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date fact_dataPagamento;

    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date fact_dataLimite;

    private double fact_valortotal;
    
    private double fact_valorTotalMedio;

    private double fact_valoriva;

    private double fact_desconto;

    private boolean fact_iva;
    
    private boolean fact_reciboProcessado;
    
    private double fact_ValorTrocos;

    private long fact_numerolancamento;
    @Lob
    private String fact_observacoes;
    private String fact_categorizacao;
    private double fact_valorRecibo;
    private double fact_valorPago;
    private double fact_valorMulta;
    private double fact_valorProcessado;
    private double fact_valorIncidencia;
    private double fact_cambio;
    private int fact_pedidoCliente;
    private int fact_prestacoes;
    private int fact_prestacoesPagas;
    private long fact_numerocartao;
    private boolean fact_emitida;
    private boolean fact_emitidoRecibo;
    private boolean fact_lancada;
    private String fact_item;
    private String fact_status;
    private String fact_origem;
    private String fact_tipo;
    private String fact_documentoPagamento;
    private String fact_nrDocumentoPagamento;
    private String fact_referencia;
    private String fact_referenciaRecibo;
    private String fact_bancoPagamento;
    private double fact_descontoFinaceiro;
    private String fact_documentoReferencia;
    private String fact_requisicao;
    
    
    private String fact_condicaoPagamento;
    
    @Lob
    private String fact_motivoIsencao;


    @ManyToOne
    private ContaGeral conta;

    @ManyToOne
    private Documento documento;

    @ManyToOne
    private Moeda moeda;

    @ManyToOne
    private Usuario usuario;

    @ManyToOne
    private Pagamento pagamento;
    
    @ManyToOne
    private Venda venda;
    
    
    @ManyToOne
    private Entidade Entidade;
    
    @ManyToOne
    private Caixa caixa; 
    
    
    private boolean encrypted;

    public boolean isEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }

    public Entidade getEntidade() {
        return Entidade;
    }

    public void setEntidade(Entidade Entidade) {
        this.Entidade = Entidade;
    }

    public int getFact_id() {
        return fact_id;
    }

    public void setFact_id(int fact_id) {
        this.fact_id = fact_id;
    }

    public java.util.Date getFact_data() {
        return fact_data;
    }

    public void setFact_data(java.util.Date fact_data) {
        this.fact_data = fact_data;
    }

    public double getFact_valortotal() {
        return fact_valortotal;
    }

    public void setFact_valortotal(double fact_valortotal) {
        this.fact_valortotal = fact_valortotal;
    }

    public double getFact_valoriva() {
        return fact_valoriva;
    }

    public void setFact_valoriva(double fact_valoriva) {
        this.fact_valoriva = fact_valoriva;
    }

    public double getFact_desconto() {
        return fact_desconto;
    }

    public void setFact_desconto(double fact_desconto) {
        this.fact_desconto = fact_desconto;
    }

    public boolean isFact_iva() {
        return fact_iva;
    }

    public void setFact_iva(boolean fact_iva) {
        this.fact_iva = fact_iva;
    }

    public long getFact_numerolancamento() {
        return fact_numerolancamento;
    }

    public void setFact_numerolancamento(long fact_numerolancamento) {
        this.fact_numerolancamento = fact_numerolancamento;
    }

    public String getFact_observacoes() {
        return fact_observacoes;
    }

    public void setFact_observacoes(String fact_observacoes) {
        this.fact_observacoes = fact_observacoes;
    }

    public String getFact_categorizacao() {
        return fact_categorizacao;
    }

    public void setFact_categorizacao(String fact_categorizacao) {
        this.fact_categorizacao = fact_categorizacao;
    }

    public double getFact_valorRecibo() {
        return fact_valorRecibo;
    }

    public void setFact_valorRecibo(double fact_valorRecibo) {
        this.fact_valorRecibo = fact_valorRecibo;
    }

    public double getFact_valorPago() {
        return fact_valorPago;
    }

    public void setFact_valorPago(double fact_valorPago) {
        this.fact_valorPago = fact_valorPago;
    }

    public double getFact_cambio() {
        return fact_cambio;
    }

    public void setFact_cambio(double fact_cambio) {
        this.fact_cambio = fact_cambio;
    }

    public int getFact_pedidoCliente() {
        return fact_pedidoCliente;
    }

    public void setFact_pedidoCliente(int fact_pedidoCliente) {
        this.fact_pedidoCliente = fact_pedidoCliente;
    }

    public int getFact_prestacoes() {
        return fact_prestacoes;
    }

    public void setFact_prestacoes(int fact_prestacoes) {
        this.fact_prestacoes = fact_prestacoes;
    }

    public int getFact_prestacoesPagas() {
        return fact_prestacoesPagas;
    }

    public void setFact_prestacoesPagas(int fact_prestacoesPagas) {
        this.fact_prestacoesPagas = fact_prestacoesPagas;
    }

    public long getFact_numerocartao() {
        return fact_numerocartao;
    }

    public void setFact_numerocartao(long fact_numerocartao) {
        this.fact_numerocartao = fact_numerocartao;
    }

    public boolean isFact_emitida() {
        return fact_emitida;
    }

    public void setFact_emitida(boolean fact_emitida) {
        this.fact_emitida = fact_emitida;
    }

    public String getFact_item() {
        return fact_item;
    }

    public void setFact_item(String fact_item) {
        this.fact_item = fact_item;
    }

    public ContaGeral getConta() {
        return conta;
    }

    public void setConta(ContaGeral conta) {
        this.conta = conta;
    }

    public Documento getDocumento() {
        return documento;
    }

    public void setDocumento(Documento documento) {
        this.documento = documento;
    }

    public Moeda getMoeda() {
        return moeda;
    }

    public void setMoeda(Moeda moeda) {
        this.moeda = moeda;
    }


    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }


    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }


    public String getFact_status() {
        return fact_status;
    }

    public void setFact_status(String fact_status) {
        this.fact_status = fact_status;
    }

    public java.util.Date getFact_dataPagamento() {
        return fact_dataPagamento;
    }

    public void setFact_dataPagamento(java.util.Date fact_dataPagamento) {
        this.fact_dataPagamento = fact_dataPagamento;
    }

    public String getFact_origem() {
        return fact_origem;
    }

    public void setFact_origem(String fact_origem) {
        this.fact_origem = fact_origem;
    }

    public java.util.Date getFact_dataLimite() {
        return fact_dataLimite;
    }

    public void setFact_dataLimite(java.util.Date fact_dataLimite) {
        this.fact_dataLimite = fact_dataLimite;
    }


    public boolean isFact_reciboProcessado() {
        return fact_reciboProcessado;
    }

    public void setFact_reciboProcessado(boolean fact_reciboProcessado) {
        this.fact_reciboProcessado = fact_reciboProcessado;
    }

    public double getFact_valorMulta() {
        return fact_valorMulta;
    }

    public void setFact_valorMulta(double fact_valorMulta) {
        this.fact_valorMulta = fact_valorMulta;
    }

    public double getFact_valorProcessado() {
        return fact_valorProcessado;
    }

    public void setFact_valorProcessado(double fact_valorProcessado) {
        this.fact_valorProcessado = fact_valorProcessado;
    }

    public String getFact_tipo() {
        return fact_tipo;
    }

    public void setFact_tipo(String fact_tipo) {
        this.fact_tipo = fact_tipo;
    }

    public String getFact_documentoPagamento() {
        return fact_documentoPagamento;
    }

    public void setFact_documentoPagamento(String fact_documentoPagamento) {
        this.fact_documentoPagamento = fact_documentoPagamento;
    }

    public String getFact_nrDocumentoPagamento() {
        return fact_nrDocumentoPagamento;
    }

    public void setFact_nrDocumentoPagamento(String fact_nrDocumentoPagamento) {
        this.fact_nrDocumentoPagamento = fact_nrDocumentoPagamento;
    }

    public String getFact_referencia() {
        return fact_referencia;
    }

    public void setFact_referencia(String fact_referencia) {
        this.fact_referencia = fact_referencia;
    }

    public String getFact_referenciaRecibo() {
        return fact_referenciaRecibo;
    }

    public void setFact_referenciaRecibo(String fact_referenciaRecibo) {
        this.fact_referenciaRecibo = fact_referenciaRecibo;
    }

    public String getFact_bancoPagamento() {
        return fact_bancoPagamento;
    }

    public void setFact_bancoPagamento(String fact_bancoPagamento) {
        this.fact_bancoPagamento = fact_bancoPagamento;
    }

    public boolean isFact_emitidoRecibo() {
        return fact_emitidoRecibo;
    }

    public void setFact_emitidoRecibo(boolean fact_emitidoRecibo) {
        this.fact_emitidoRecibo = fact_emitidoRecibo;
    }

    public String getFact_condicaoPagamento() {
        return fact_condicaoPagamento;
    }

    public void setFact_condicaoPagamento(String fact_condicaoPagamento) {
        this.fact_condicaoPagamento = fact_condicaoPagamento;
    }

    public String getFact_motivoIsencao() {
        return fact_motivoIsencao;
    }

    public void setFact_motivoIsencao(String fact_motivoIsencao) {
        this.fact_motivoIsencao = fact_motivoIsencao;
    }

    public double getFact_descontoFinaceiro() {
        return fact_descontoFinaceiro;
    }

    public void setFact_descontoFinaceiro(double fact_descontoFinaceiro) {
        this.fact_descontoFinaceiro = fact_descontoFinaceiro;
    }

    public String getFact_documentoReferencia() {
        return fact_documentoReferencia;
    }

    public void setFact_documentoReferencia(String fact_documentoReferencia) {
        this.fact_documentoReferencia = fact_documentoReferencia;
    }

    public double getFact_valorIncidencia() {
        return fact_valorIncidencia;
    }

    public void setFact_valorIncidencia(double fact_valorIncidencia) {
        this.fact_valorIncidencia = fact_valorIncidencia;
    }

    public String getFact_requisicao() {
        return fact_requisicao;
    }

    public void setFact_requisicao(String fact_requisicao) {
        this.fact_requisicao = fact_requisicao;
    }

    public boolean isFact_lancada() {
        return fact_lancada;
    }

    public void setFact_lancada(boolean fact_lancada) {
        this.fact_lancada = fact_lancada;
    }

    public double getFact_valorTotalMedio() {
        return fact_valorTotalMedio;
    }

    public void setFact_valorTotalMedio(double fact_valorTotalMedio) {
        this.fact_valorTotalMedio = fact_valorTotalMedio;
    }

    public Caixa getCaixa() {
        return caixa;
    }

    public void setCaixa(Caixa caixa) {
        this.caixa = caixa;
    }

    public double getFact_ValorTrocos() {
        return fact_ValorTrocos;
    }

    public void setFact_ValorTrocos(double fact_ValorTrocos) {
        this.fact_ValorTrocos = fact_ValorTrocos;
    }

    
}
