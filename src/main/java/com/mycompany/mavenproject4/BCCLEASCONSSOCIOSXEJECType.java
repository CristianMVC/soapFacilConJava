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
@XmlRootElement(name="BCCLEASCONSSOCIOSXEJECType")
class BCCLEASCONSSOCIOSXEJECType {
    
    
    
    private gBCCLEASCONSSOCIOSXEJECDetailType aagBCCLEASCONSSOCIOSXEJECDetailType;
    
    @XmlElement(name = "gBCCLEASCONSSOCIOSXEJECDetailType")
    public gBCCLEASCONSSOCIOSXEJECDetailType getgBCCLEASCONSSOCIOSXEJECDetailType() {
        return aagBCCLEASCONSSOCIOSXEJECDetailType;
    }

    public void setgBCCLEASCONSSOCIOSXEJECDetailType(gBCCLEASCONSSOCIOSXEJECDetailType gBCCLEASCONSSOCIOSXEJECDetailType) {
        this.aagBCCLEASCONSSOCIOSXEJECDetailType = gBCCLEASCONSSOCIOSXEJECDetailType;
    }
    
    
    
}
