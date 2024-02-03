package com.a1dnan.customerfrontthymeleafapp;

import com.a1dnan.customerfrontthymeleafapp.entities.Customer;
import com.a1dnan.customerfrontthymeleafapp.repo.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerFrontThymeleafAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerFrontThymeleafAppApplication.class, args);
    }


    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
        return args -> {
            customerRepository.save(Customer.builder().name("Adnan").email("adnan@gmail.com").build());
            customerRepository.save(Customer.builder().name("Issam").email("issam@gmail.com").build());
            customerRepository.save(Customer.builder().name("Med").email("med@gmail.com").build());
        };
    }
}
