package org.xproce.demoorm2.dao.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "owners")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String email;

    @OneToMany(mappedBy = "owner")
    private Collection<Blog> blogs ;
}
