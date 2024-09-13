package old_money.tiendaropa.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Categorias")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_categoria;
    @Column(nullable = false)
    private String tipo_categoria;



}
