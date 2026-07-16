package backend.repositories;

import backend.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository {
    boolean existsBySku(String sku);
    //boolean existsBySkuAndIdNot(String sku, Long id); para validar SKU al actualizar
}