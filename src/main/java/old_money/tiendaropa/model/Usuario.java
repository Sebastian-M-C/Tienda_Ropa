package old_money.tiendaropa.model;

import jakarta.persistence.*;

@Entity
@Table(
        name = "Usuarios",
        uniqueConstraints = @UniqueConstraint(name = "email", columnNames = "correo_user")
)
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_user;
    @Column(nullable = false)
    private String nombre_user;

    @Column(nullable = false)
    private String correo_user;

    @Column(nullable = false)
    private Integer contra_user;

    @OneToOne
    @JoinColumn(name = "fk_rol", nullable = false)
    private Rol rol;


    public Usuario(Long id_user, String nombre_user, String correo_user, Integer contra_user, Rol rol) {
        this.id_user = id_user;
        this.nombre_user = nombre_user;
        this.correo_user = correo_user;
        this.contra_user = contra_user;
        this.rol = rol;
    }

    public Usuario() {
    }

    public Long getId_user() {
        return id_user;
    }

    public void setId_user(Long id_user) {
        this.id_user = id_user;
    }

    public String getNombre_user() {
        return nombre_user;
    }

    public void setNombre_user(String nombre_user) {
        this.nombre_user = nombre_user;
    }

    public String getCorreo_user() {
        return correo_user;
    }

    public void setCorreo_user(String correo_user) {
        this.correo_user = correo_user;
    }

    public Integer getContra_user() {
        return contra_user;
    }

    public void setContra_user(Integer contra_user) {
        this.contra_user = contra_user;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
}
