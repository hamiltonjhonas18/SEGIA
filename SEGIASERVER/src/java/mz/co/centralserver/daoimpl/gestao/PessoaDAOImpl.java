/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package mz.co.centralserver.daoimpl.gestao;

import java.util.List;
import mz.co.centralserver.dao.DAOGenerico;
import mz.co.centralserver.model.gestao.Entidade;
import mz.co.centralserver.model.gestao.Nacionalidade;
import mz.co.centralserver.model.gestao.Pessoa;

/**
 *
 * @author HJC2K8
 */
public class PessoaDAOImpl {

    private DAOGenerico daog;

    public PessoaDAOImpl() {
        daog = new DAOGenerico(Pessoa.class);
    }

    public Pessoa getPessoa(int id) {
        return (Pessoa) daog.buscarEntidadePorQuery("from Pessoa where pess_id = " + id);
    }

    public Pessoa getPessoa(Entidade entidade, String nome) {
        return (Pessoa) daog.buscarEntidadePorQuery("from Pessoa where pess_nome LIKE '" + nome + "' AND entidade_enti_id = " + entidade.getEnti_id());
    }

    public Pessoa getPessoaEmail(Entidade entidade, String email) {
        return (Pessoa) daog.buscarEntidadePorQuery("from Pessoa where pess_email LIKE '" + email + "' AND entidade_enti_id = " + entidade.getEnti_id());
    }

    public Pessoa getPessoaBI(Entidade entidade, String bi) {
        return (Pessoa) daog.buscarEntidadePorQuery("from Pessoa where pess_bi LIKE '" + bi + "' AND entidade_enti_id = " + entidade.getEnti_id());
    }

    public Pessoa getPessoaNuit(Entidade entidade, String nuit) {
        return (Pessoa) daog.buscarEntidadePorQuery("from Pessoa where pess_nuit LIKE '" + nuit + "' AND entidade_enti_id = " + entidade.getEnti_id());
    }

    public Pessoa getPessoa(Entidade entidade, String nome, String apelido) {
        return (Pessoa) daog.buscarEntidadePorQuery("from Pessoa where pess_nome LIKE '" + nome + "' AND pess_apelido LIKE '" + apelido + "' AND entidade_enti_id = " + entidade.getEnti_id());
    }

    public List<Pessoa> listaPessoas() {
        return daog.buscarPorConsulta("from Pessoa order by pess_nome asc");

    }

    public List<Pessoa> listaPessoas(Entidade entidade) {
        return daog.buscarPorConsulta("from Pessoa Where entidade_enti_id = " + entidade.getEnti_id() + " order by pess_nome asc");

    }

    public List<Pessoa> listaPessoasNacionalidade(Entidade entidade, Nacionalidade nacionalidade) {
        return daog.buscarPorConsulta("from Pessoa Where entidade_enti_id = " + entidade.getEnti_id() + " AND nacionalidade_naci_id = " + nacionalidade.getNaci_id() + " order by pess_nome asc");

    }

    public List<Pessoa> listaPessoasTipo(Entidade entidade, String tipo) {
        return daog.buscarPorConsulta("from Pessoa where pess_tipo LIKE '" + tipo + "' AND entidade_enti_id = " + entidade.getEnti_id() + " order by pess_nome asc");
    }

    public List<Pessoa> listaPessoasBairro(Entidade entidade, String bairro) {
        return daog.buscarPorConsulta("from Pessoa where pess_bairro LIKE '" + bairro + "' AND entidade_enti_id = " + entidade.getEnti_id() + " order by pess_nome asc");
    }

    public void persistir_pessoa(Pessoa pessoa) {
        daog = new DAOGenerico(pessoa);
        daog.inserir_actualizar();
    }

    public void remover_pessoa(Pessoa pessoa) {
        daog = new DAOGenerico(pessoa);
        daog.excluir();
    }
}
