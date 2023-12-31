package dev.njeu.service;

import dev.njeu.entities.Recipe;
import dev.njeu.entities.User;
import dev.njeu.repositories.RecipeRepository;
import dev.njeu.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RecipeService2 {

    private final RecipeRepository recipeRepository;
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public RecipeService2(RecipeRepository recipeRepository, UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.recipeRepository = recipeRepository;
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public Optional<Recipe> findById(long id) {
        return recipeRepository.findById(id);
    }

    public long add(Recipe recipe, UserDetails user) {
        recipe.setEmail(user.getUsername());
        return recipeRepository.save(recipe).getId();
    }

    public ResponseEntity<Void> deleteById(long id, UserDetails user) {
        var recipe = findById(id);
        if (recipe.isPresent()) {
            if (recipe.get().getEmail().equals(user.getUsername())) {
                recipeRepository.deleteById(id);
                return ResponseEntity.noContent().build();
            }
            return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
        }
        return ResponseEntity.notFound().build();
    }

    public ResponseEntity<List<Recipe>> getRecipesByName(String name) {
        return ResponseEntity.ok(recipeRepository.findByNameIgnoreCaseContainsOrderByDateDesc(name));
    }

    public ResponseEntity<List<Recipe>> getRecipesByCategory(String category) {
        return ResponseEntity.ok(recipeRepository.findByCategoryIgnoreCaseOrderByDateDesc(category));
    }

    public ResponseEntity<Void> updateById(long id, Recipe recipe, UserDetails user) {
        var recipeToUpdate = findById(id);

        if (recipeToUpdate.isPresent()) {
            Recipe oldRecipe = recipeToUpdate.get();
            if (oldRecipe.getEmail().equals(user.getUsername())) {
                oldRecipe.copyOf(recipe);
                recipeRepository.save(oldRecipe);
                return ResponseEntity.noContent().build();
            }
            return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
        }

        return ResponseEntity.notFound().build();
    }

    public boolean registerUser(User user) {
        if (!userRepository.existsByEmail(user.getEmail())) {
            user.setPassword(passwordEncoder.encode(user.getPassword()));
            userRepository.save(user);
            return true;
        }
        return false;
    }
}
