package com.youlai.laboratory.spring.beanFactoryPostProcessor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.core.Ordered;

/**
 *
 *
 * @author <a href="mailto:2256222053@qq.com">zc</a>
 * @Date 2022/3/17 0017 22:03
 */

public class D implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("D------------BeanFactoryPostProcessor---postProcessBeanFactory----9");
    }

}
