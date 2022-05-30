package Assignment.Department.Entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class DepEntity {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    Long id;

    String name;

    String address;

    String faculty;
}
