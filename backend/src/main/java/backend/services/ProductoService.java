package backend.services;

import backend.dtos.ProductoRequest;
import backend.dtos.ProductoResponse;
import java.util.List;

public interface ProductoService {
    
    ProductoResponse guardar(ProductoRequest request);
    List<ProductoResponse> findAll();
    ProductoResponse findById(Long id);
    ProductoResponse update(Long id, ProductoRequest request);
    void delete(Long id);

}