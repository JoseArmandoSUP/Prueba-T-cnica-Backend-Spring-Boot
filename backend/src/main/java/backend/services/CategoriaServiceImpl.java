package backend.services;

import backend.dtos.CategoriaRequest;
import backend.dtos.CategoriaResponse;
import backend.model.Categoria;
import backend.repositories.CategoriaRepository;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

@Service
public class CategoriaServiceImpl implements CategoriaService {
    
    private final CategoriaRepository categoriaRepository;

    public CategoriaServiceImpl(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    @Override
    public CategoriaResponse guardar(CategoriaRequest request){
        
        Categoria categoria = new Categoria(request.getNombre());
        Categoria guardado = categoriaRepository.save(categoria);

        return new CategoriaResponse(guardado.getId(), guardado.getNombre());
    }

    @Override
    public List<CategoriaResponse> findAll() {
        return CategoriaRepository.findAll().stream().map(c -> new CategoriaResponse(c.getId(), c.getNombre())).collect(Collector.toList());
    }
}