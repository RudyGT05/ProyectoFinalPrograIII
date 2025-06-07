package umg.edu.gt.model;

import jakarta.persistence.*;

@Entity
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String pasajero;
    private String destino;
    private int prioridad;

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getPasajero() { return pasajero; }
    public void setPasajero(String pasajero) { this.pasajero = pasajero; }

    public String getDestino() { return destino; }
    public void setDestino(String destino) { this.destino = destino; }

    public int getPrioridad() { return prioridad; }
    public void setPrioridad(int prioridad) { this.prioridad = prioridad; }
}

