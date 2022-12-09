package com.bookstore.store.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "usuario")
public class User implements Serializable {
    private static final long serialVersionUID = -70987494770293557L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;    
 
    @Column(name = "nome_usuario", nullable = false)
    private String username;
 
    @Column(name = "email", nullable = false)
    private String email;   

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_pessoa", referencedColumnName = "id")
    private Person person;

    @Column(name = "data_criacao", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;
    
    @Column(name = "data_atualizacao")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateDate;

    public User() {

    }

    public User(Long id, String username, String email, Person person, Date creationDate, Date updateDate) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.person = person;
        this.creationDate = creationDate;
        this.updateDate = updateDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((username == null) ? 0 : username.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        User other = (User) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (username == null) {
            if (other.username != null)
                return false;
        } else if (!username.equals(other.username))
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", username=" + username + ", email=" + email + ", person=" + person
                + ", creationDate=" + creationDate + ", updateDate=" + updateDate + "]";
    }

}
