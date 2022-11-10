/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Usuario
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="Body", namespace = "http://schemas.xmlsoap.org/soap/envelope/")
public class Body {
    

   private C21ASConsSociosPorEjecResponse[] aC21ASConsSociosPorEjecResponse;
    
    @XmlElement(name = "C21ASConsSociosPorEjecResponse", namespace = "T24WebServicesImpl")
    public C21ASConsSociosPorEjecResponse[] getC21ASConsSociosPorEjecResponse() {
        return aC21ASConsSociosPorEjecResponse;
    }

    public void setC21ASConsSociosPorEjecResponse(C21ASConsSociosPorEjecResponse[] C21ASConsSociosPorEjecResponse) {
        this.aC21ASConsSociosPorEjecResponse = C21ASConsSociosPorEjecResponse;
    }

 
    
    
    
}
