package com.example.apiLibrary.repository;

import com.example.apiLibrary.model.Venta;
import com.example.apiLibrary.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.UUID;

@Repository
public interface VentaRepository extends JpaRepository<Venta, UUID>, JpaSpecificationExecutor<Venta> {
    List<Venta> findByUsuarioOrderByFechaVentaDesc(Usuario usuario);
    // JpaSpecificationExecutor will be used for admin filtering and statistics
}
