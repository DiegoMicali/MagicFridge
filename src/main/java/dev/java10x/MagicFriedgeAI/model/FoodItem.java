package dev.java10x.MagicFriedgeAI.model;

import dev.java10x.MagicFriedgeAI.enums.Category;
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

    private Category category;

    private int amout;

    private LocalDate validity;

}
