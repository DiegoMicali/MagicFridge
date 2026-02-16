package dev.java10x.MagicFriedgeAI.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Entity
@Table(name = "food_item")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class FoodItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Enumerated(EnumType.STRING)
    private Categoria categoria;
    private int quantidade;

    private LocalDate validade;

    public enum Categoria {
        CARNES, LATICINIOS, VEGETAIS, FRUTAS, LIQUIDOS, BEBIDAS
    }
}
