/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shop.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Lulu
 */
@Entity
public class Purchase {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private String billNo;

    @ManyToOne
    @JoinColumn(name = "distributer_id")
    private Distributer distributerId;

    @Column
    private float price;

    @Column
    private Date purchaseeDate;

    @OneToMany(mappedBy = "purchaseId")
    private List<PurchaseDetails> purchaseDetails;

    public List<PurchaseDetails> getPurchaseDetails() {
        return purchaseDetails;
    }

    public void setPurchaseDetails(List<PurchaseDetails> purchaseDetails) {
        this.purchaseDetails = purchaseDetails;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    public Distributer getDistributerId() {
        return distributerId;
    }

    public void setDistributerId(Distributer distributerId) {
        this.distributerId = distributerId;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Date getPurchaseeDate() {
        return purchaseeDate;
    }

    public void setPurchaseeDate(Date purchaseeDate) {
        this.purchaseeDate = purchaseeDate;
    }

}
