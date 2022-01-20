/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package mz.co.centralserver.model.educstat;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author 25884
 */
@Entity
@Table(name = "EDST_Zip")
public class EDST_Zip implements Serializable {

    @Id
    private int id;

    private String name;

    private Integer districtId;

    private Integer headQuarterSchoolId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDistrictId() {
        return districtId;
    }

    public void setDistrictId(int districtId) {
        this.districtId = districtId;
    }

    public int getHeadQuarterSchoolId() {
        return headQuarterSchoolId;
    }

    public void setHeadQuarterSchoolId(int headQuarterSchoolId) {
        this.headQuarterSchoolId = headQuarterSchoolId;
    }
    
    
}
