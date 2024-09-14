package old_money.tiendaropa.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Categorias")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_categoria;
    @Column(nullable = false)
    private String tipo_categoria;

    public Categoria(Long id_categoria, String tipo_categoria) {
        this.id_categoria = id_categoria;
        this.tipo_categoria = tipo_categoria;
    }

    public Categoria() {

    }

    public Long getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(Long id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getTipo_categoria() {
        return tipo_categoria;
    }

    public void setTipo_categoria(String tipo_categoria) {
        this.tipo_categoria = tipo_categoria;
    }
}
