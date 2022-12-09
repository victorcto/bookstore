package com.bookstore.store.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "avaliacao")
public class Review implements Serializable {
    private static final long serialVersionUID = 5391435310989594110L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;    
 
    @Column(name = "nome_usuario", nullable = false)
    private String username;
 
    @Column(name = "email", nullable = false)
    private String email;    
 
    @Column(name = "comentario", nullable = false, length = 1000)
    private String comment;
 
    @Column(name = "avaliacao", nullable = true)
    private int rating;
 
    @ManyToOne
    @JoinColumn(name = "id_produto", nullable = false)
    private Product product;
 
    @Column(name = "data_criacao", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;

    @Column(name = "data_atualizacao")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateDate;

    public Review() {
        
    }

    public Review(Long id, String username, String email, String comment, int rating, Product product,
            Date creationDate, Date updateDate) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.comment = comment;
        this.rating = rating;
        this.product = product;
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

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
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
        Review other = (Review) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Review [id=" + id + ", username=" + username + ", email=" + email + ", comment=" + comment + ", rating="
                + rating + ", product=" + product + ", creationDate=" + creationDate + ", updateDate=" + updateDate
                + "]";
    }

}
