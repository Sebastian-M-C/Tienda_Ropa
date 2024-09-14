package old_money.tiendaropa.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "MetodoPagos")
public class MetodoPago {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_metodoPago;
    @Column(nullable = false)
    private Integer monto;
    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date fecha_pago;
    @Column(nullable = false)
    private String metodo_pago;

    public MetodoPago(Long id_metodoPago, Integer monto, Date fecha_pago, String metodo_pago) {
        this.id_metodoPago = id_metodoPago;
        this.monto = monto;
        this.fecha_pago = fecha_pago;
        this.metodo_pago = metodo_pago;
    }

    public MetodoPago() {
    }

    public Long getId_metodoPago() {
        return id_metodoPago;
    }

    public void setId_metodoPago(Long id_metodoPago) {
        this.id_metodoPago = id_metodoPago;
    }

    public Integer getMonto() {
        return monto;
    }

    public void setMonto(Integer monto) {
        this.monto = monto;
    }

    public Date getFecha_pago() {
        return fecha_pago;
    }

    public void setFecha_pago(Date fecha_pago) {
        this.fecha_pago = fecha_pago;
    }

    public String getMetodo_pago() {
        return metodo_pago;
    }

    public void setMetodo_pago(String metodo_pago) {
        this.metodo_pago = metodo_pago;
    }
}
