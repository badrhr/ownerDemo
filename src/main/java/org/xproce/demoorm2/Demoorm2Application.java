package org.xproce.demoorm2;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.xproce.demoorm2.dao.entities.Blog;
import org.xproce.demoorm2.dao.entities.Owner;
import org.xproce.demoorm2.dao.repositories.BlogRepository;
import org.xproce.demoorm2.dao.repositories.OwnerRepository;
import org.xproce.demoorm2.service.OwnerManager;

import java.util.ArrayList;
import java.util.List;


@SpringBootApplication
public class Demoorm2Application {

    public static void main(String[] args) {
        SpringApplication.run(Demoorm2Application.class, args);
    }


    @Bean
    public CommandLineRunner start(OwnerManager ownerManager) {
        return args -> {

            Owner owner = new Owner();
            owner.setName("x");
            owner.setEmail("x@gmail.com");

            Owner owner1 = new Owner();
            owner1.setName("y");
            owner1.setEmail("y@gmail.com");
            ownerManager.addWoner(owner1);
            ownerManager.addWoner(owner);




            System.out.println(ownerManager.getAllOwners());
             /*Blog blog = new Blog();
           blog.setCategory("Computer science");
            blog.setTitle("Jee");
            blog.setContent(" **** ");
            blog.setOwner(owner);*/

        };
    }

}
