package com.example.apiLibrary.repository;

import com.example.apiLibrary.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor; // For filtering
import org.springframework.stereotype.Repository;
import java.util.UUID;
import java.util.Optional;

@Repository
public interface LibroRepository extends JpaRepository<Libro, UUID>, JpaSpecificationExecutor<Libro> {
    Optional<Libro> findByIsbn(String isbn); // For checking unique ISBN
}
