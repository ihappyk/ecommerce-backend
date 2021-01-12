package com.webtutsplus.ecommerce.model;



import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.sql.Timestamp;
import java.util.Date;


@Entity
@Table(name = "wishlist")
public class WishList {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "user_id")
    private @NotBlank Integer userId;

    @Column(name = "product_id")
    private @NotBlank Integer productId;


    @Column(name = "created_date")
    private Date createdDate;

    public WishList() {
    }


    public WishList(Integer userId, Integer productId) {
        this.userId = userId;
        this.productId=productId;
    }

    public Integer getId() {
        return id;
    }

    public Integer getProductId() {
        return productId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public Date getCreatedDate() {
        return createdDate;
    }
}
