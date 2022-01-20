/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mz.co.centralserver.utilitarios;

import java.util.Date;
import mz.co.centralserver.dao.DAOGenerico;
import mz.co.centralserver.model.controleacesso.Log;
import mz.co.centralserver.model.controleacesso.Usuario;

/**
 *
 * @author HJC2K8
 */
public class LogUser {

    Data d;

    public LogUser() {
        d = new Data();
    }

    public void addLog(Usuario u, String desc) {
        d.le_hora();
        Log log = new Log();

        log.setLog_data(new Date());
        log.setLog_hora(d.getHora() + ":" + d.getMinuto() + ":" + d.getSegundo());
        log.setLog_descricao(desc);
        log.setUsuario(u);

        DAOGenerico daog = new DAOGenerico(log);
        daog.inserir_actualizar();
    }
}
