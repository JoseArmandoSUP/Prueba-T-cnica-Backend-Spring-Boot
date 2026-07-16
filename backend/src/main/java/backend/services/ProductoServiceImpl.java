package backend.services;

import backend.dtos.ProductoRequest;
import backend.dtos.ProductoResponse;
import backend.dtos.CategoriaResponse;
import backend.exceptions.NoEncontradoException;
import backend.exceptions.SolicitudException;
import backend.model.Categoria;
import backend.model.Producto;
import backend.repositories.CategoriaRepository;
import backend.repositories.ProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductoServiceImpl implements ProductoService {
    
    private final ProductoRepository productoRepository;
    private final CategoriaRepository categoriaRepository;
    
    public ProductoServiceImpl(ProductoRepository productoRepository, CategoriaRepository categoriaRepository) {
        this.productoRepository = productoRepository;
        this.categoriaRepository = categoriaRepository;
    }
    
    @Override
    public ProductoResponse guardar(ProductoRequest request){
        if(productoRepository.existsBySku(request.getSku())){
            throw new SolicitudException("El SKU ya se encuentra registrado")
        }
    }

}