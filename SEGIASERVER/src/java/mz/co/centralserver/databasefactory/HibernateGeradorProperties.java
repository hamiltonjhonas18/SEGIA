/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mz.co.centralserver.databasefactory;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author HJC
 */
public class HibernateGeradorProperties {

    public void _gerarFicheiroProperties(String driverClass, String url, String username, String password, String dialect) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("src/hibernate.properties"));

            bw.write("hibernate.connection.driver.class = " + driverClass);
            bw.newLine();
            bw.write("hibernate.connection.url = " + url);
            bw.newLine();
            bw.write("hibernate.connection.username = " + username);
            bw.newLine();
            bw.write("hibernate.connection.password = " + password);
            bw.newLine();
            bw.write("hibernate.dialect = " + dialect);
            bw.newLine();
            bw.write("hibernate.hibernate.cache.NoCacheProvider = true");
            bw.newLine();
            bw.write("hibernate.format_sql = true");
            bw.newLine();
            bw.write("hibernate.show_sql = true");
            bw.newLine();

            bw.close();

        } catch (IOException ex) {

        }

    }
}
