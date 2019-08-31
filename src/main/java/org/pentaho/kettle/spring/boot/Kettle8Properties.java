package org.pentaho.kettle.spring.boot;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 */
@ConfigurationProperties(Kettle8Properties.PREFIX)
public class Kettle8Properties {

	public static final String PREFIX = "datax.kettle";

	/** 是否启用 **/
	protected Boolean enabled = false;

}
