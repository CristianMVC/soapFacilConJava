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
@XmlRootElement(name="mBCCLEASCONSSOCIOSXEJECDetailType")
class mBCCLEASCONSSOCIOSXEJECDetailType {
  
  
     private String amessages;
    
   
    private String acodigoCrecer;
    
@XmlElement(name = "messages")
    public String getMessages() {
        return amessages;
    }

    public void setMessages(String messages) {
        this.amessages = messages;
    }

    @XmlElement(name = "codigoCrecer")
    public String getCodigoCrecer() {
        return acodigoCrecer;
    }

    public void setCodigoCrecer(String codigoCrecer) {
        this.acodigoCrecer = codigoCrecer;
    }
    
    
    
    
    
    
    
    
    
    
}
