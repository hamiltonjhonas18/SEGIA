/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package mz.co.centralserver.dao;

import java.util.List;

public interface InterfaceDAOGenerico<T> {

    public void excluir();

    public void excluir_associados(String sql);

    public void inserir_actualizar();

    public void refresh();

    public void remover_da_cache();

    public List<T> buscarPorConsulta(String sql);

    public List<T> buscarPorConsultaLimite(String sql, int limite);

    public List<T> buscarPorConsultaIntervalo(String sql, int primeiro, int limite);

    public List<T> buscarTodos();

    public T buscarEntidadePorQuery(String stringQuery);

    public T buscarEntidadePorId(int id);
}
