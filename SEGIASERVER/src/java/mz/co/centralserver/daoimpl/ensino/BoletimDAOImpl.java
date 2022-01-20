/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package mz.co.centralserver.daoimpl.ensino;

import java.util.List;
import mz.co.centralserver.dao.DAOGenerico;
import mz.co.centralserver.model.ensino.Inscricao;
import mz.co.centralserver.model.ensino.Boletim;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
public class BoletimDAOImpl {

    private DAOGenerico daog;

    public BoletimDAOImpl() {
        daog = new DAOGenerico(Boletim.class);
    }

    public Boletim getBoletim(int id) {
        return (Boletim) daog.buscarEntidadePorQuery("from Boletim where bole_id = " + id);
    }

    public List<Boletim> listaBoletins(Entidade entidade) {
        return daog.buscarPorConsulta("from Boletim order where entidade_enti_id = " + entidade.getEnti_id() + " by bole_id desc");
    }

    public List<Boletim> listaBoletinsInscricao(Entidade entidade, Inscricao inscricao) {
        return daog.buscarPorConsulta("from Boletim  where entidade_enti_id = " + entidade.getEnti_id() + " AND inscricao_insc_id = " + inscricao.getInsc_id() + " order by bole_id desc");
    }

    public void persistir_boletim(Boletim boletim) {
        daog = new DAOGenerico(boletim);
        daog.inserir_actualizar();
    }

    public void remover_boletim(Boletim boletim) {
        daog = new DAOGenerico(boletim);
        daog.excluir();
    }
}
