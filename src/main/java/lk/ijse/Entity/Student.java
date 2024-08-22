package lk.ijse.Entity;


import jakarta.persistence.*;
import lk.ijse.embeded.StudentName;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "student")
public class Student {

//ID Attribute
@Id
@Column(name = "id")
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
@Column(name = "address" , nullable = false)
private String address;

//composite attribute
private StudentName name;



}
