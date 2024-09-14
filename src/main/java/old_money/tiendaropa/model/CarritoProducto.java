package old_money.tiendaropa.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "CarritoProductos")
public class CarritoProducto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_carritoProducto;

    @Column(nullable = false)
    private Integer cantidad;
    @Column(nullable = false)
    private Integer precio_unitario;

    @Lob
    @Column(nullable = false)
    private byte[] imagen;

    @ManyToOne
    @JoinColumn(name = "fk_carritoCompra", nullable = false)
    private CarritoCompra carritoCompra;

    @ManyToOne
    @JoinColumn(name = "fk_producto", nullable = false)
    private Producto producto;

    public CarritoProducto(Long id_carritoProducto, Integer cantidad, Integer precio_unitario, byte[] imagen, CarritoCompra carritoCompra, Producto producto) {
        this.id_carritoProducto = id_carritoProducto;
        this.cantidad = cantidad;
        this.precio_unitario = precio_unitario;
        this.imagen = imagen;
        this.carritoCompra = carritoCompra;
        this.producto = producto;
    }

    public CarritoProducto() {
    }

    public Long getId_carritoProducto() {
        return id_carritoProducto;
    }

    public void setId_carritoProducto(Long id_carritoProducto) {
        this.id_carritoProducto = id_carritoProducto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(Integer precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    public CarritoCompra getCarritoCompra() {
        return carritoCompra;
    }

    public void setCarritoCompra(CarritoCompra carritoCompra) {
        this.carritoCompra = carritoCompra;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}
