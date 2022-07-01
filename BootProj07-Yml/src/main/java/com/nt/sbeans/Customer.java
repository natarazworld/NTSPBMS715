//Customer.java
package com.nt.sbeans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("cust")
@ConfigurationProperties(prefix="cust.info")
@Data
public class Customer {
	private Integer custNo;
	private  String custName;
	private  String custAddrs;
	private  Double  billAmt;

}
