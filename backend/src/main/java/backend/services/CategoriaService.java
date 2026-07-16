package backend.services;

import backend.dtos.CategoriaRequest;
import backend.dtos.CategoriaResponse;
import java.util.List;

public interface CategoriaService {
    CategoriaResponse guardar(CategoriaRequest request);
    List<CategoriaResponse> findAll();
}
