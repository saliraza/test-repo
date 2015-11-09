package com.jxb;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Company {

  @XmlElement String orgName;

  public String getOrgName() {
    return orgName;
  }

  public void setOrgName(String name) {
    this.orgName = name;
  }

}
