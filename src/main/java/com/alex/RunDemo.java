package com.alex;

import com.alex.config.JPAConfig;
import com.alex.entities.Account;
import com.alex.repositories.AccountRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.math.BigDecimal;

public class RunDemo {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(
                        JPAConfig.class, JPAConfig.class);
//        System.out.println(context.getBeanDefinitionCount());
//        for (String name : context.getBeanDefinitionNames()) {
//            System.out.println(name);
//        }
        AccountRepository repository=context.getBean(AccountRepository.class);

        Account ac =new Account();
        ac.setBalance(BigDecimal.valueOf(130));
        repository.save(ac);
       // List<Account> accounts = repository.findAll();
        //System.out.println(accounts);
    }
}
