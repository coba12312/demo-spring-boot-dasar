package com.rapidtech.demospringbootrifai.config;

import com.rapidtech.demospringbootrifai.model.Foo;
import com.rapidtech.demospringbootrifai.model.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


class BeanConfigurationTest {

    @Test
    void beanTest() {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);

        Foo foo1 = context.getBean(Foo.class);
        Foo foo2 = context.getBean(Foo.class);
        Foo foo3 = context.getBean(Foo.class);

        Assertions.assertSame(foo1,foo2);
        Assertions.assertSame(foo2,foo3);

        Product product1 = context.getBean(Product.class);
        Product product2 = context.getBean(Product.class);

        Assertions.assertSame(product2,product1);
    }
}
