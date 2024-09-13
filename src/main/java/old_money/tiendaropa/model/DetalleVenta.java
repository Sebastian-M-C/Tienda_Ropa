package old_money.tiendaropa.model;

import jakarta.persistence.*;

@Entity
@Table(name = "DetalleVentas")
public class DetalleVenta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_detalleVenta;
    @Column(nullable = false)
    private Integer cantidad;
    @Column(nullable = false)
    private Integer precio;

    @ManyToOne
    @JoinColumn(name = "fk_notaVenta", nullable = false)
    private NotaVenta notaVenta;

    @ManyToOne
    @JoinColumn(name = "fk_producto", nullable = false)
    private Producto producto;



    public Long getId_detalleVenta() {
        return id_detalleVenta;
    }

    public void setId_detalleVenta(Long id_detalleVenta) {
        this.id_detalleVenta = id_detalleVenta;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public NotaVenta getNotaVenta() {
        return notaVenta;
    }

    public void setNotaVenta(NotaVenta notaVenta) {
        this.notaVenta = notaVenta;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}
