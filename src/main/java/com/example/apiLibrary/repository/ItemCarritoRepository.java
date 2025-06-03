package com.example.apiLibrary.repository;

import com.example.apiLibrary.model.ItemCarrito;
import com.example.apiLibrary.model.Carrito;
import com.example.apiLibrary.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface ItemCarritoRepository extends JpaRepository<ItemCarrito, UUID> {
    Optional<ItemCarrito> findByCarritoAndLibro(Carrito carrito, Libro libro);
    //Potentially add methods to find by carritoId and libroId if needed directly
}
