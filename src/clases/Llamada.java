/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.time.LocalDateTime;

/**
 *
 * @author acastro
 */
public class Llamada {
    private Contacto contacto;
    private LocalDateTime inicio;
    private LocalDateTime fin;
    private long duracion;

    public Contacto getContacto() {
        return contacto;
    }

    public LocalDateTime getInicio() {
        return inicio;
    }

    public LocalDateTime getFin() {
        return fin;
    }

    public long getDuracion() {
        return duracion;
    }

    public void setContacto(Contacto contacto) {
        this.contacto = contacto;
    }

    public void setInicio(LocalDateTime inicio) {
        this.inicio = inicio;
    }

    public void setFin(LocalDateTime fin) {
        this.fin = fin;
    }

    public void setDuracion(long duracion) {
        this.duracion = duracion;
    }

    public Llamada() {
    }

    public Llamada(Contacto contacto, LocalDateTime inicio, LocalDateTime fin, long duracion) {
        this.contacto = contacto;
        this.inicio = inicio;
        this.fin = fin;
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Llamada{" + "contacto=" + contacto + ", inicio=" + inicio + ", fin=" + fin + ", duracion=" + duracion + '}';
    }
    
    
    
}
