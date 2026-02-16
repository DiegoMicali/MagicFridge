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

    private String name;

    @Enumerated(EnumType.STRING)
    private Category category;

    private int amout;

    private LocalDate validity;

    public enum Category {
        MEATS, DAIRY, VEGETABLES, FRUITS, LIQUIDS, BEVERAGES
    }
}
