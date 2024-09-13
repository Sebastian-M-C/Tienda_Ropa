package old_money.tiendaropa.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "NotaVentas")
public class NotaVenta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_notaventa;
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column(nullable = false)
    private Integer Total;

    @ManyToOne
    @JoinColumn(name = "fk_user", nullable = false)
    private Usuario user;

    @ManyToOne
    @JoinColumn(name = "fk_metodoPago", nullable = false)
    private MetodoPago metodoPago;

    public NotaVenta(Long id_notaventa, Date fecha, Integer total, Usuario user, MetodoPago metodoPago) {
        this.id_notaventa = id_notaventa;
        this.fecha = fecha;
        Total = total;
        this.user = user;
        this.metodoPago = metodoPago;
    }

    public NotaVenta() {
    }

    public Long getId_notaventa() {
        return id_notaventa;
    }

    public void setId_notaventa(Long id_notaventa) {
        this.id_notaventa = id_notaventa;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getTotal() {
        return Total;
    }

    public void setTotal(Integer total) {
        Total = total;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public MetodoPago getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }
}