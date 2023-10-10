package enrico.santarelli.springsocialapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Entity
public class Account {
    
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private Long id;

    @NotNull(message = "Invalid name")
    @Column(unique=true, nullable=false)
    private String name;

    @NotNull(message = "Invalid email")
    @Column(unique = true, nullable = false)
    @Email(message = "Invalid email")
    private String email;

    @NotNull(message = "Invalid password")
    @Column(nullable = false)
    private String password;
   

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
