package org.pentaho.kettle.spring.boot;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author <a href="https://github.com/loong10k">Loong Wan</a>
 * @since 1.0.0
 */
@ConfigurationProperties(Kettle8Properties.PREFIX)
public class Kettle8Properties {

	public static final String PREFIX = "datax.kettle";

	/** 是否启用 **/
	protected Boolean enabled = false;

}
