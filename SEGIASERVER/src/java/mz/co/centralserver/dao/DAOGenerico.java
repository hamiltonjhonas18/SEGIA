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
import mz.co.centralserver.hibernate.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class DAOGenerico<T> implements InterfaceDAOGenerico {

    private Session sessao;
    private Transaction transacao;
    private final T objecto;
    private Class<T> classe;

    public DAOGenerico(T objecto) {
        sessao = HibernateUtil.getSession();
        transacao = null;
        this.objecto = objecto;
    }

    @Override
    public void excluir() {
        try {
            sessao = getSession();
            transacao = sessao.beginTransaction();
            sessao.delete(objecto);
            transacao.commit();
            sessao.close();

        } catch (HibernateException erro) {

            System.out.println("Erro na remocao do objecto " + erro);

            transacao.rollback();
        }
    }

    @Override
    public void inserir_actualizar() {
        try {
            sessao = getSession();
            transacao = sessao.beginTransaction();
            sessao.merge(objecto);
            transacao.commit();
            sessao.close();

        } catch (HibernateException erro) {

            System.out.println("Erro na actualizacao do objecto " + erro);

            transacao.rollback();
        }
    }

    @Override
    public List<T> buscarPorConsulta(String sql) {
        sessao = getSession();
        List<T> lst = sessao.createQuery(sql).list();
        sessao.close();

        return lst;
    }

    @Override
    public List<T> buscarPorConsultaLimite(String sql, int limite) {
        sessao = getSession();
        List<T> lst = sessao.createQuery(sql).setMaxResults(limite).list();
        sessao.close();

        return lst;
    }

    @Override
    public List<T> buscarPorConsultaIntervalo(String sql, int primeiro, int limite) {
        sessao = getSession();
        Query q = sessao.createQuery(sql);
        q.setFirstResult(primeiro);
        q.setMaxResults(1000);

        List<T> lst = q.list();

        sessao.close();

        return lst;
    }

    @Override
    public List<T> buscarTodos() {

        sessao = getSession();
        List<T> lst = sessao.createCriteria(classe).list();
        sessao.close();

        return lst;
    }

    @Override
    public T buscarEntidadePorQuery(String stringQuery) {

        sessao = getSession();
        Query query = sessao.createQuery(stringQuery);
        T entity = (T) query.uniqueResult();
        sessao.close();

        return entity;
    }

    @Override
    public T buscarEntidadePorId(int id) {

        sessao = getSession();
        T entity = (T) sessao.load(classe, id);
        sessao.close();

        return entity;
    }

    public Session getSession() {
        if (sessao == null || !sessao.isOpen()) {
            sessao = HibernateUtil.getSession();
        } else {
            sessao.close();
            sessao = HibernateUtil.getSession();
        }

        return sessao;
    }

    @Override
    public void excluir_associados(String sql) {
        Query q = sessao.createQuery(sql);
        q.executeUpdate();
    }

    @Override
    public void refresh() {
        sessao.refresh(objecto);
    }

    @Override
    public void remover_da_cache() {
        sessao.evict(objecto);
    }

}
