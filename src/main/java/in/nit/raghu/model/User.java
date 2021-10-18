package in.nit.raghu.model;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="userstab")
public class User {
	
	 @Id
	 @Column(name="id")
	 @GeneratedValue
     private Integer uid;
	 
	 @Column(name="name")
     private String name;
	 
	 @Column(name="email")
     private String email;
	 
	 @Column(name="pwd")
     private String pwd;
	 
	 @ElementCollection
	 @CollectionTable(name="rolestab", //table name
	                  joinColumns=@JoinColumn(name="uid"))
	 @Column(name="roles") //element column
     private List<String> roles;
     
}
