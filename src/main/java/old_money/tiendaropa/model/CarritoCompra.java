package old_money.tiendaropa.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "CarritoCompras")
public class CarritoCompra {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_carrito;
    @Column(nullable = false)
    private String estado;

    @OneToOne
    @JoinColumn(name = "fk_user", nullable = false)
    private Usuario user;

    public CarritoCompra(Long id_carrito, String estado, Usuario user) {
        this.id_carrito = id_carrito;
        this.estado = estado;
        this.user = user;
    }


    public CarritoCompra() {
    }

    public Long getId_carrito() {
        return id_carrito;
    }

    public void setId_carrito(Long id_carrito) {
        this.id_carrito = id_carrito;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }
}
