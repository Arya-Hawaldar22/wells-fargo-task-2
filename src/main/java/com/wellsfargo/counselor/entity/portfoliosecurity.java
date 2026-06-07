package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class portfoliosecurity {

    @Id
    @GeneratedValue()
    private long portfolioSecurityId;

    @ManyToOne
    private portfolio portfolio;

    @ManyToOne
    private security security;

    @Column(nullable = false)
    private LocalDate purchaseDate;

    @Column(nullable = false)
    private double purchasePrice;

    @Column(nullable = false)
    private double quantity;

    protected portfoliosecurity() {
    }

    public portfoliosecurity(
            portfolio portfolio,
            security security,
            LocalDate purchaseDate,
            double purchasePrice,
            double quantity) {

        this.portfolio = portfolio;
        this.security = security;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
        this.quantity = quantity;
    }

    public long getPortfolioSecurityId() {
        return portfolioSecurityId;
    }

    public portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public security getSecurity() {
        return security;
    }

    public void setSecurity(security security) {
        this.security = security;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
}