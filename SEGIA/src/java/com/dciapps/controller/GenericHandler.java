/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package com.dciapps.controller;

import com.dciapps.webclient.Usuario;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author HJC2K8
 */
public class GenericHandler {

    HttpServletRequest request;
    HttpServletResponse response;
    private String userlogado;

    public GenericHandler(HttpServletRequest request, HttpServletResponse response) {
        this.request = request;
        this.response = response;
        userlogado = "Nenhum usuário logado";
    }

    public Usuario loggedUser() {

        Usuario usuario = (Usuario) request.getSession().getAttribute("usuario");

        if (usuario == null) {
            // response.sendRedirect("error-404");

        } else if (usuario.getUsuaOnline().equals("Offline")) {
            try {

                response.sendRedirect("startup");

            } catch (IOException ex) {
            }
        } else {
            userlogado = usuario.getPessoapess().getPessNome() + " " + usuario.getPessoapess().getPessApelido();
        }
        return usuario;
    }

    public String getUserlogado() {
        return userlogado;
    }

}
