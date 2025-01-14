package com.hei.app;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Rue {
    private String nom;
    private Lieu lieu1;
    private Lieu lieu2;
    
    public Rue(Lieu lieu1, Lieu lieu2) {
        this.lieu1 = lieu1;
        this.lieu2 = lieu2;
    }
}
