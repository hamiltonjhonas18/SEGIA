package mz.co.centralserver.model.gestao;

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

@Entity

@Table(name = "Pessoa")
public class Pessoa implements Serializable {

    @Id
    @GeneratedValue
    private int pess_id;

    private String pess_nome;

    private String pess_apelido;

    private String pess_generoActividae;

    private String pess_actividade;

    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date pess_dataNascimento;

    private String pess_documento;

    private String pess_sexo;

    private String pess_estadoCivil;

    private Float pess_altura;

    private String pess_raca;

    private String pess_sinais;

    private String pess_pais;

    private String pess_bairro;

    private String pess_rua;

    private String pess_numeroCasa;

    private String pess_lingua;
    
    private String pess_responsavel;

    private String pess_nomePai;

    private String pess_contactoPai;

    private String pess_profissaoPai;

    private String pess_trabalhoPai;

    private String pess_nomeMae;

    private String pess_contactoMae;

    private String pess_profissaoMae;

    private String pess_trabalhoMae;

    private String pess_hobbie;

    private String pess_generoMusica;

    private String pess_generoFilme;

    private String pess_generoCultura;

    private String pess_generoAlimentacao;

    private String pess_generoEntretenimento;

    private String pess_generoBebida;

    private String pess_relegiao;

    private String pess_contacto;
    
    private String pess_email;

    private String pess_vicios;
    
    private String pess_educacao;
    
    private String pess_sobre;
    
    private String pess_skills;
    
    private String pess_origemRegisto;
    
    private String pess_bi;
    
    private String pess_dataEmissaoBi;
    
    private String pess_dataValidadeBi;

    private String pess_nuit;
    
    private String pess_provincia;
    
    private String pess_distrito;
    
    private String pess_cidade;
    
    private String pess_cPostal;
    
    private String pess_localTrabalho;
    
    private String pess_sector;
    
    private String pess_grauParentesco;
    
    
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date pess_dataCadastro;

    private String pess_foto;

    private String pess_tipo;

    @ManyToOne
    private Nacionalidade nacionalidadenaci;
   
    @ManyToOne
    private Entidade entidade;
    
    private boolean encrypted;

    public boolean isEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }

    public void setPess_id(int value) {
        this.pess_id = value;
    }

    public int getPess_id() {
        return pess_id;
    }

    public int getORMID() {
        return getPess_id();
    }

    public void setPess_nome(String value) {
        this.pess_nome = value;
    }

    public String getPess_nome() {
        return pess_nome;
    }

    public void setPess_apelido(String value) {
        this.pess_apelido = value;
    }

    public String getPess_apelido() {
        return pess_apelido;
    }

    public void setPess_generoActividae(String value) {
        this.pess_generoActividae = value;
    }

    public String getPess_generoActividae() {
        return pess_generoActividae;
    }

    public void setPess_actividade(String value) {
        this.pess_actividade = value;
    }

    public String getPess_actividade() {
        return pess_actividade;
    }

    public void setPess_dataNascimento(java.util.Date value) {
        this.pess_dataNascimento = value;
    }

    public java.util.Date getPess_dataNascimento() {
        return pess_dataNascimento;
    }

    public void setPess_sexo(String value) {
        this.pess_sexo = value;
    }

    public String getPess_sexo() {
        return pess_sexo;
    }

    public void setPess_estadoCivil(String value) {
        this.pess_estadoCivil = value;
    }

    public String getPess_estadoCivil() {
        return pess_estadoCivil;
    }

    public void setPess_altura(float value) {
        setPess_altura(new Float(value));
    }

    public void setPess_altura(Float value) {
        this.pess_altura = value;
    }

    public Float getPess_altura() {
        return pess_altura;
    }

    public void setPess_raca(String value) {
        this.pess_raca = value;
    }

    public String getPess_raca() {
        return pess_raca;
    }

    public void setPess_sinais(String value) {
        this.pess_sinais = value;
    }

    public String getPess_sinais() {
        return pess_sinais;
    }

    public void setPess_pais(String value) {
        this.pess_pais = value;
    }

    public String getPess_pais() {
        return pess_pais;
    }

    public void setPess_bairro(String value) {
        this.pess_bairro = value;
    }

    public String getPess_bairro() {
        return pess_bairro;
    }

    public void setPess_rua(String value) {
        this.pess_rua = value;
    }

    public String getPess_rua() {
        return pess_rua;
    }

    public void setPess_numeroCasa(String value) {
        this.pess_numeroCasa = value;
    }

    public String getPess_numeroCasa() {
        return pess_numeroCasa;
    }

    public void setPess_lingua(String value) {
        this.pess_lingua = value;
    }

    public String getPess_lingua() {
        return pess_lingua;
    }

    public void setPess_nomePai(String value) {
        this.pess_nomePai = value;
    }

    public String getPess_nomePai() {
        return pess_nomePai;
    }

    public void setPess_nomeMae(String value) {
        this.pess_nomeMae = value;
    }

    public String getPess_nomeMae() {
        return pess_nomeMae;
    }

    public void setPess_hobbie(String value) {
        this.pess_hobbie = value;
    }

    public String getPess_hobbie() {
        return pess_hobbie;
    }

    public void setPess_generoMusica(String value) {
        this.pess_generoMusica = value;
    }

    public String getPess_generoMusica() {
        return pess_generoMusica;
    }

    public void setPess_generoFilme(String value) {
        this.pess_generoFilme = value;
    }

    public String getPess_generoFilme() {
        return pess_generoFilme;
    }

    public void setPess_generoCultura(String value) {
        this.pess_generoCultura = value;
    }

    public String getPess_generoCultura() {
        return pess_generoCultura;
    }

    public void setPess_generoAlimentacao(String value) {
        this.pess_generoAlimentacao = value;
    }

    public String getPess_generoAlimentacao() {
        return pess_generoAlimentacao;
    }

    public void setPess_generoBebida(String value) {
        this.pess_generoBebida = value;
    }

    public String getPess_generoBebida() {
        return pess_generoBebida;
    }

    public void setPess_relegiao(String value) {
        this.pess_relegiao = value;
    }

    public String getPess_relegiao() {
        return pess_relegiao;
    }

    public void setPess_contacto(String value) {
        this.pess_contacto = value;
    }

    public String getPess_contacto() {
        return pess_contacto;
    }

    public void setPess_vicios(String value) {
        this.pess_vicios = value;
    }

    public String getPess_vicios() {
        return pess_vicios;
    }

    public void setPess_dataCadastro(java.util.Date value) {
        this.pess_dataCadastro = value;
    }

    public java.util.Date getPess_dataCadastro() {
        return pess_dataCadastro;
    }

    public void setPess_foto(String value) {
        this.pess_foto = value;
    }

    public String getPess_foto() {
        return pess_foto;
    }

    public void setPess_tipo(String value) {
        this.pess_tipo = value;
    }

    public String getPess_tipo() {
        return pess_tipo;
    }

    public void setPess_generoEntretenimento(String value) {
        this.pess_generoEntretenimento = value;
    }

    public String getPess_generoEntretenimento() {
        return pess_generoEntretenimento;
    }

    public void setNacionalidadenaci(Nacionalidade value) {
        this.nacionalidadenaci = value;
    }

    public Nacionalidade getNacionalidadenaci() {
        return nacionalidadenaci;
    }

    @Override
    public String toString() {
        return toString(false);
    }

    public String toString(boolean idOnly) {
        if (idOnly) {
            return String.valueOf(getPess_id());
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Pessoa[ ");
            sb.append("Pess_id=").append(getPess_id()).append(" ");
            sb.append("Pess_nome=").append(getPess_nome()).append(" ");
            sb.append("Pess_apelido=").append(getPess_apelido()).append(" ");
            sb.append("Pess_generoActividae=").append(getPess_generoActividae()).append(" ");
            sb.append("Pess_actividade=").append(getPess_actividade()).append(" ");
            sb.append("Pess_dataNascimento=").append(getPess_dataNascimento()).append(" ");
            sb.append("Pess_sexo=").append(getPess_sexo()).append(" ");
            sb.append("Pess_estadoCivil=").append(getPess_estadoCivil()).append(" ");
            sb.append("Pess_altura=").append(getPess_altura()).append(" ");
            sb.append("Pess_raca=").append(getPess_raca()).append(" ");
            sb.append("Pess_sinais=").append(getPess_sinais()).append(" ");
            sb.append("Pess_pais=").append(getPess_pais()).append(" ");
            sb.append("Pess_bairro=").append(getPess_bairro()).append(" ");
            sb.append("Pess_rua=").append(getPess_rua()).append(" ");
            sb.append("Pess_numeroCasa=").append(getPess_numeroCasa()).append(" ");
            sb.append("Pess_lingua=").append(getPess_lingua()).append(" ");
            sb.append("Pess_nomePai=").append(getPess_nomePai()).append(" ");
            sb.append("Pess_nomeMae=").append(getPess_nomeMae()).append(" ");
            sb.append("Pess_hobbie=").append(getPess_hobbie()).append(" ");
            sb.append("Pess_generoMusica=").append(getPess_generoMusica()).append(" ");
            sb.append("Pess_generoFilme=").append(getPess_generoFilme()).append(" ");
            sb.append("Pess_generoCultura=").append(getPess_generoCultura()).append(" ");
            sb.append("Pess_generoAlimentacao=").append(getPess_generoAlimentacao()).append(" ");
            sb.append("Pess_generoEntretenimento=").append(getPess_generoEntretenimento()).append(" ");
            sb.append("Pess_generoBebida=").append(getPess_generoBebida()).append(" ");
            sb.append("Pess_relegiao=").append(getPess_relegiao()).append(" ");
            sb.append("Pess_contacto=").append(getPess_contacto()).append(" ");
            sb.append("Pess_vicios=").append(getPess_vicios()).append(" ");
            sb.append("Pess_dataCadastro=").append(getPess_dataCadastro()).append(" ");
            sb.append("Pess_foto=").append(getPess_foto()).append(" ");
            sb.append("Pess_tipo=").append(getPess_tipo()).append(" ");
            if (getNacionalidadenaci() != null) {
                sb.append("Nacionalidadenaci.Persist_ID=").append(getNacionalidadenaci().toString(true)).append(" ");
            }
            sb.append("]");
            return sb.toString();
        }
    }

    public String getPess_email() {
        return pess_email;
    }

    public void setPess_email(String pess_email) {
        this.pess_email = pess_email;
    }

    public String getPess_educacao() {
        return pess_educacao;
    }

    public void setPess_educacao(String pess_educacao) {
        this.pess_educacao = pess_educacao;
    }

    public String getPess_sobre() {
        return pess_sobre;
    }

    public void setPess_sobre(String pess_sobre) {
        this.pess_sobre = pess_sobre;
    }

    public String getPess_skills() {
        return pess_skills;
    }

    public void setPess_skills(String pess_skills) {
        this.pess_skills = pess_skills;
    }

    public String getPess_origemRegisto() {
        return pess_origemRegisto;
    }

    public void setPess_origemRegisto(String pess_origemRegisto) {
        this.pess_origemRegisto = pess_origemRegisto;
    }

    public Entidade getEntidade() {
        return entidade;
    }

    public void setEntidade(Entidade entidade) {
        this.entidade = entidade;
    }

    public String getPess_bi() {
        return pess_bi;
    }

    public void setPess_bi(String pess_bi) {
        this.pess_bi = pess_bi;
    }

    public String getPess_dataEmissaoBi() {
        return pess_dataEmissaoBi;
    }

    public void setPess_dataEmissaoBi(String pess_dataEmissaoBi) {
        this.pess_dataEmissaoBi = pess_dataEmissaoBi;
    }

    public String getPess_dataValidadeBi() {
        return pess_dataValidadeBi;
    }

    public void setPess_dataValidadeBi(String pess_dataValidadeBi) {
        this.pess_dataValidadeBi = pess_dataValidadeBi;
    }

    public String getPess_nuit() {
        return pess_nuit;
    }

    public void setPess_nuit(String pess_nuit) {
        this.pess_nuit = pess_nuit;
    }

    public String getPess_provincia() {
        return pess_provincia;
    }

    public void setPess_provincia(String pess_provincia) {
        this.pess_provincia = pess_provincia;
    }

    public String getPess_cidade() {
        return pess_cidade;
    }

    public void setPess_cidade(String pess_cidade) {
        this.pess_cidade = pess_cidade;
    }

    public String getPess_cPostal() {
        return pess_cPostal;
    }

    public void setPess_cPostal(String pess_cPostal) {
        this.pess_cPostal = pess_cPostal;
    }

    public String getPess_localTrabalho() {
        return pess_localTrabalho;
    }

    public void setPess_localTrabalho(String pess_localTrabalho) {
        this.pess_localTrabalho = pess_localTrabalho;
    }

    public String getPess_sector() {
        return pess_sector;
    }

    public void setPess_sector(String pess_sector) {
        this.pess_sector = pess_sector;
    }

    public String getPess_grauParentesco() {
        return pess_grauParentesco;
    }

    public void setPess_grauParentesco(String pess_grauParentesco) {
        this.pess_grauParentesco = pess_grauParentesco;
    }

    public String getPess_documento() {
        return pess_documento;
    }

    public void setPess_documento(String pess_documento) {
        this.pess_documento = pess_documento;
    }

    public String getPess_distrito() {
        return pess_distrito;
    }

    public void setPess_distrito(String pess_distrito) {
        this.pess_distrito = pess_distrito;
    }

    public String getPess_responsavel() {
        return pess_responsavel;
    }

    public void setPess_responsavel(String pess_responsavel) {
        this.pess_responsavel = pess_responsavel;
    }

    public String getPess_contactoPai() {
        return pess_contactoPai;
    }

    public void setPess_contactoPai(String pess_contactoPai) {
        this.pess_contactoPai = pess_contactoPai;
    }

    public String getPess_profissaoPai() {
        return pess_profissaoPai;
    }

    public void setPess_profissaoPai(String pess_profissaoPai) {
        this.pess_profissaoPai = pess_profissaoPai;
    }

    public String getPess_trabalhoPai() {
        return pess_trabalhoPai;
    }

    public void setPess_trabalhoPai(String pess_trabalhoPai) {
        this.pess_trabalhoPai = pess_trabalhoPai;
    }

    public String getPess_contactoMae() {
        return pess_contactoMae;
    }

    public void setPess_contactoMae(String pess_contactoMae) {
        this.pess_contactoMae = pess_contactoMae;
    }

    public String getPess_profissaoMae() {
        return pess_profissaoMae;
    }

    public void setPess_profissaoMae(String pess_profissaoMae) {
        this.pess_profissaoMae = pess_profissaoMae;
    }

    public String getPess_trabalhoMae() {
        return pess_trabalhoMae;
    }

    public void setPess_trabalhoMae(String pess_trabalhoMae) {
        this.pess_trabalhoMae = pess_trabalhoMae;
    }

}
