package ru.gapisovii.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("ru.gapisovii.aop")
@EnableAspectJAutoProxy
public class MyConfig2 {
}
