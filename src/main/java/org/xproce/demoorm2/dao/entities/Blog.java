package org.xproce.demoorm2.dao.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "blogs")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Blog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    private String category;

    private String content;

    @ManyToOne
    private Owner owner;
}
