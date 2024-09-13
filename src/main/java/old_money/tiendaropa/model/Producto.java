package old_money.tiendaropa.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Productos")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_producto;
    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)
    private Integer precio;
    @Column(nullable = false)
    private String color;
    @Column(nullable = false)
    private String tallas;
    @Column(nullable = false)
    private Integer stock;

    @ManyToOne
    @JoinColumn(name = "fk_categoria")
    private Categoria categoria;


}
