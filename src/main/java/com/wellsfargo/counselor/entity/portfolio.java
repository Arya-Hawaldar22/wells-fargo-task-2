package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @OneToOne
    private client client;

    protected portfolio() {
    }

    public portfolio(client client) {
        this.client = client;
    }

    public long getPortfolioId() {
        return portfolioId;
    }

    public client getClient() {
        return client;
    }

    public void setClient(client client) {
        this.client = client;
    }
}