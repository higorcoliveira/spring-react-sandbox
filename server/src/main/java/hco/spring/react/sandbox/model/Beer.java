package hco.spring.react.sandbox.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@ToString
@Getter @Setter
@NoArgsConstructor
public class Beer {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    public Beer(String name) {
        this.name = name;
    }
}
