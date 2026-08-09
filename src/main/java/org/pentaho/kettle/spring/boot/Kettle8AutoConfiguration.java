package org.pentaho.kettle.spring.boot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(prefix = Kettle8Properties.PREFIX, value = "enabled", havingValue = "true")
@EnableConfigurationProperties({ Kettle8Properties.class })
/**\n * Auto-configuration for Kettle8AutoConfiguration.\n *\n * @author [@Loong Wan](https://github.com/loong10k)\n * @since 1.0.0\n */
public class Kettle8AutoConfiguration {

}
