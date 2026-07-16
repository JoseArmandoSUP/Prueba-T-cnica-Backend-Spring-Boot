package backend.dtos;

import jakarta.validation.constraints.NotBlank;

public class CategoriaRequest {
    @NotBlank(message = "El nombre de la categoria es obligatoria")
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}