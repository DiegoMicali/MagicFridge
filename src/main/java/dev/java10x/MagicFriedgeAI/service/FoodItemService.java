package dev.java10x.MagicFriedgeAI.service;
import dev.java10x.MagicFriedgeAI.model.FoodItem;
import dev.java10x.MagicFriedgeAI.repository.FoodItemRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@NoArgsConstructor
@AllArgsConstructor
@Data
public class FoodItemService {

    private FoodItemRepository repository;


    // List all foods
    public List<FoodItem> listAll() {
        return repository.findAll();
    }

    // Search for Id
    public Optional<FoodItem> serchById(Long id) {
        return repository.findById(id);
    }

    // Save new food
    public FoodItem save(FoodItem foodItem) {
        return repository.save(foodItem);
    }

    // Update Food
    public FoodItem update(FoodItem foodItem) {
        return repository.save(foodItem);
    }

    // Delete food
    public void delete(Long id) {
        repository.deleteById(id);
    }

}
