/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shop.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 *
 * @author Lulu
 */
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private String name;

    @Column
    private String mobileNumber;

    @Column
    private String address;

    @Column
    private float totalPurchase;

    @Column
    private float totalPaid;

    @Column
    private float totalOutstanding;

    @OneToMany(mappedBy = "customerId")
    private List<Salse> salses;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getTotalPurchase() {
        return totalPurchase;
    }

    public void setTotalPurchase(float totalPurchase) {
        this.totalPurchase = totalPurchase;
    }

    public float getTotalPaid() {
        return totalPaid;
    }

    public void setTotalPaid(float totalPaid) {
        this.totalPaid = totalPaid;
    }

    public float getTotalOutstanding() {
        return totalOutstanding;
    }

    public void setTotalOutstanding(float totalOutstanding) {
        this.totalOutstanding = totalOutstanding;
    }

    public List<Salse> getSalses() {
        return salses;
    }

    public void setSalses(List<Salse> salses) {
        this.salses = salses;
    }

}
