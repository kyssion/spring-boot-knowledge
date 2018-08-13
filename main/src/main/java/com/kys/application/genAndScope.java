package com.kys.application;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.context.annotation.ScopeMetadata;
import org.springframework.context.annotation.ScopeMetadataResolver;

public class genAndScope implements BeanNameGenerator, ScopeMetadataResolver {

    @Override
    public String generateBeanName(BeanDefinition beanDefinition, BeanDefinitionRegistry beanDefinitionRegistry) {
        return null;
    }

    @Override
    public ScopeMetadata resolveScopeMetadata(BeanDefinition definition) {
        return null;
    }
}
