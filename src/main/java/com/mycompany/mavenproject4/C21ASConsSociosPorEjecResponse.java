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
@XmlRootElement(name="C21ASConsSociosPorEjecResponse")
public class C21ASConsSociosPorEjecResponse {
  
@XmlElement   
 private Status[] aStatus;  

@XmlElement 
 private BCCLEASCONSSOCIOSXEJECType[] aBCCLEASCONSSOCIOSXEJECType;


     @XmlElement(name = "Status")
    public Status[] getStatus() {
        return aStatus;
    }

    public void setStatus(Status[] status) {
        this.aStatus = status;
    }

     @XmlElement(name = "BCCLEASCONSSOCIOSXEJECType")
    public BCCLEASCONSSOCIOSXEJECType[] getBCCLEASCONSSOCIOSXEJECType() {
        return aBCCLEASCONSSOCIOSXEJECType;
    }

    public void setBCCLEASCONSSOCIOSXEJECType(BCCLEASCONSSOCIOSXEJECType[] BCCLEASCONSSOCIOSXEJECType) {
        this.aBCCLEASCONSSOCIOSXEJECType = BCCLEASCONSSOCIOSXEJECType;
    }

 

  


    
    
    
}
