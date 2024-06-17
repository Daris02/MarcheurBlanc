package com.hei.app;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Set;

@Data
@AllArgsConstructor
public class Carte {
    private Set<Rue> rues;
}
