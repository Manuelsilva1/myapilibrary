package com.example.apiLibrary.repository;

import com.example.apiLibrary.model.Editorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface EditorialRepository extends JpaRepository<Editorial, UUID> {
}
