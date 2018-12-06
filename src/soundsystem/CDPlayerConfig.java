package soundsystem;

/**
 * @ComponentScan 这个注解能够在spring中启用组件扫描
 *
 * @Configuration 这个组件
 *
 *
 * */

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class CDPlayerConfig {
}
