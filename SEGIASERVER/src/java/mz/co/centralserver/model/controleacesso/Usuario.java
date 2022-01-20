package mz.co.centralserver.model.controleacesso;

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
import mz.co.centralserver.model.ensino.Escola;
import mz.co.centralserver.model.gestao.Entidade;
import mz.co.centralserver.model.gestao.Pessoa;

@Entity
@Table(name = "Usuario")
public class Usuario implements Serializable {

    @Id
    @GeneratedValue
    private int usua_id;

    private String usua_usuario;

    private String usua_senha;

    private String usua_estado;

    private String usua_codigoRegistro;

    private String usua_online;

    private String usua_device;

    private String usua_statusicon;

    private String usua_status;

    private String usua_fotoperfil;

    private String usua_ultimasPasswords;

    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date usua_dataValidade;

    private String usua_perguntaSeguranca;

    private String usua_respostaSeguranca;

    private Integer usua_tentativasLogin;

    private boolean usua_presenca;

    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date usu_dataUltimaVisita;

    @ManyToOne
    private Entidade entidade;

    @ManyToOne
    private Pessoa pessoapess;

    @ManyToOne
    private TipoUsuario tipoUsuariotipu;

    @ManyToOne
    private Escola escola;

    private String usua_distrito;

    private String usua_provincia;

    
    private boolean encrypted;

    public boolean isEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }

    public void setUsua_id(int value) {
        this.usua_id = value;
    }

    public int getUsua_id() {
        return usua_id;
    }

    public void setUsua_usuario(String value) {
        this.usua_usuario = value;
    }

    public String getUsua_usuario() {
        return usua_usuario;
    }

    public void setUsua_senha(String value) {
        this.usua_senha = value;
    }

    public String getUsua_senha() {
        return usua_senha;
    }

    public void setUsua_estado(String value) {
        this.usua_estado = value;
    }

    public String getUsua_estado() {
        return usua_estado;
    }

    public void setUsua_codigoRegistro(String value) {
        this.usua_codigoRegistro = value;
    }

    public String getUsua_codigoRegistro() {
        return usua_codigoRegistro;
    }

    public void setUsua_dataValidade(java.util.Date value) {
        this.usua_dataValidade = value;
    }

    public java.util.Date getUsua_dataValidade() {
        return usua_dataValidade;
    }

    public void setUsua_perguntaSeguranca(String value) {
        this.usua_perguntaSeguranca = value;
    }

    public String getUsua_perguntaSeguranca() {
        return usua_perguntaSeguranca;
    }

    public void setUsua_respostaSeguranca(String value) {
        this.usua_respostaSeguranca = value;
    }

    public String getUsua_respostaSeguranca() {
        return usua_respostaSeguranca;
    }

    public void setUsua_tentativasLogin(int value) {
        setUsua_tentativasLogin(new Integer(value));
    }

    public void setUsua_tentativasLogin(Integer value) {
        this.usua_tentativasLogin = value;
    }

    public Integer getUsua_tentativasLogin() {
        return usua_tentativasLogin;
    }

    public void setUsua_presenca(boolean value) {
        this.usua_presenca = value;
    }

    public boolean getUsua_presenca() {
        return usua_presenca;
    }

    public void setUsu_dataUltimaVisita(java.util.Date value) {
        this.usu_dataUltimaVisita = value;
    }

    public java.util.Date getUsu_dataUltimaVisita() {
        return usu_dataUltimaVisita;
    }

    public void setPessoapess(Pessoa value) {
        this.pessoapess = value;
    }

    public Pessoa getPessoapess() {
        return pessoapess;
    }

    public void setTipoUsuariotipu(TipoUsuario value) {
        this.tipoUsuariotipu = value;
    }

    public TipoUsuario getTipoUsuariotipu() {
        return tipoUsuariotipu;
    }

    @Override
    public String toString() {
        return toString(false);
    }

    public String toString(boolean idOnly) {
        if (idOnly) {
            return String.valueOf(getUsua_id());
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Usuario[ ");
            sb.append("Usua_id=").append(getUsua_id()).append(" ");
            sb.append("Usua_usuario=").append(getUsua_usuario()).append(" ");
            sb.append("Usua_senha=").append(getUsua_senha()).append(" ");
            sb.append("Usua_estado=").append(getUsua_estado()).append(" ");
            sb.append("Usua_codigoRegistro=").append(getUsua_codigoRegistro()).append(" ");
            sb.append("Usua_dataValidade=").append(getUsua_dataValidade()).append(" ");
            sb.append("Usua_perguntaSeguranca=").append(getUsua_perguntaSeguranca()).append(" ");
            sb.append("Usua_respostaSeguranca=").append(getUsua_respostaSeguranca()).append(" ");
            sb.append("Usua_tentativasLogin=").append(getUsua_tentativasLogin()).append(" ");
            sb.append("Usua_presenca=").append(getUsua_presenca()).append(" ");
            sb.append("Usu_dataUltimaVisita=").append(getUsu_dataUltimaVisita()).append(" ");
            if (getPessoapess() != null) {
                sb.append("Pessoapess.Persist_ID=").append(getPessoapess().toString(true)).append(" ");
            } else {
                sb.append("Pessoapess=null ");
            }
            if (getTipoUsuariotipu() != null) {
                sb.append("TipoUsuariotipu.Persist_ID=").append(getTipoUsuariotipu().toString(true)).append(" ");
            } else {
                sb.append("TipoUsuariotipu=null ");
            }
            sb.append("]");
            return sb.toString();
        }
    }

    public String getUsua_online() {
        return usua_online;
    }

    public void setUsua_online(String usua_online) {
        this.usua_online = usua_online;
    }

    public String getUsua_device() {
        return usua_device;
    }

    public void setUsua_device(String usua_device) {
        this.usua_device = usua_device;
    }

    public String getUsua_statusicon() {
        return usua_statusicon;
    }

    public void setUsua_statusicon(String usua_statusicon) {
        this.usua_statusicon = usua_statusicon;
    }

    public String getUsua_status() {
        return usua_status;
    }

    public void setUsua_status(String usua_status) {
        this.usua_status = usua_status;
    }


    public Entidade getEntidade() {
        return entidade;
    }

    public void setEntidade(Entidade entidade) {
        this.entidade = entidade;
    }

    public String getUsua_fotoperfil() {
        return usua_fotoperfil;
    }

    public void setUsua_fotoperfil(String usua_fotoperfil) {
        this.usua_fotoperfil = usua_fotoperfil;
    }

    public String getUsua_ultimasPasswords() {
        return usua_ultimasPasswords;
    }

    public void setUsua_ultimasPasswords(String usua_ultimasPasswords) {
        this.usua_ultimasPasswords = usua_ultimasPasswords;
    }

    public Escola getEscola() {
        return escola;
    }

    public void setEscola(Escola escola) {
        this.escola = escola;
    }

    public String getUsua_distrito() {
        return usua_distrito;
    }

    public void setUsua_distrito(String usua_distrito) {
        this.usua_distrito = usua_distrito;
    }

    public String getUsua_provincia() {
        return usua_provincia;
    }

    public void setUsua_provincia(String usua_provincia) {
        this.usua_provincia = usua_provincia;
    }

}
