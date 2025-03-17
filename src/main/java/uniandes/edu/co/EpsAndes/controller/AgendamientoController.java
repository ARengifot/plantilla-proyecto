package uniandes.edu.co.EpsAndes.controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/agendamiento")
public class AgendamientoController {

    // Endpoint para consultar la disponibilidad de un servicio en las próximas 4 semanas
    @GetMapping("/disponibilidad/{codigoServicio}")
    public List<AppointmentSlot> getDisponibilidad(@PathVariable String codigoServicio) {
        // Ejemplo: creamos un slot por semana a las 10:00 AM
        List<AppointmentSlot> slots = new ArrayList<>();
        LocalDate today = LocalDate.now();
        for (int i = 0; i < 4; i++) {
            AppointmentSlot slot = new AppointmentSlot();
            slot.setCodigoServicio(codigoServicio);
            slot.setFecha(today.plusWeeks(i));
            slot.setHora(LocalTime.of(10, 0));
            // Se asignan IPS y médico de ejemplo; en producción estos datos vendrían de la lógica de negocio
            slot.setIpsNit("9012345678");
            slot.setMedicoNumeroDocumento("34567890");
            slots.add(slot);
        }
        return slots;
    }

    // Endpoint para agendar un servicio utilizando una orden emitida
    @PostMapping
    public AppointmentConfirmation agendarServicio(@RequestBody AgendamientoRequest request) {
        // En una implementación real se validaría la existencia de la orden, disponibilidad y se actualizaría la BD.
        AppointmentConfirmation confirmation = new AppointmentConfirmation();
        confirmation.setOrdenId(request.getOrdenId());
        confirmation.setFecha(request.getFecha());
        confirmation.setHora(request.getHora());
        confirmation.setMensaje("Servicio agendado exitosamente");
        return confirmation;
    }

    // DTOs para simular la información de agenda y confirmación

    public static class AppointmentSlot {
        private String codigoServicio;
        private LocalDate fecha;
        private LocalTime hora;
        private String ipsNit;
        private String medicoNumeroDocumento;
        // Getters y Setters
        public String getCodigoServicio() { return codigoServicio; }
        public void setCodigoServicio(String codigoServicio) { this.codigoServicio = codigoServicio; }
        public LocalDate getFecha() { return fecha; }
        public void setFecha(LocalDate fecha) { this.fecha = fecha; }
        public LocalTime getHora() { return hora; }
        public void setHora(LocalTime hora) { this.hora = hora; }
        public String getIpsNit() { return ipsNit; }
        public void setIpsNit(String ipsNit) { this.ipsNit = ipsNit; }
        public String getMedicoNumeroDocumento() { return medicoNumeroDocumento; }
        public void setMedicoNumeroDocumento(String medicoNumeroDocumento) { this.medicoNumeroDocumento = medicoNumeroDocumento; }
    }

    public static class AgendamientoRequest {
        private String ordenId;
        private LocalDate fecha;
        private LocalTime hora;
        // Getters y Setters
        public String getOrdenId() { return ordenId; }
        public void setOrdenId(String ordenId) { this.ordenId = ordenId; }
        public LocalDate getFecha() { return fecha; }
        public void setFecha(LocalDate fecha) { this.fecha = fecha; }
        public LocalTime getHora() { return hora; }
        public void setHora(LocalTime hora) { this.hora = hora; }
    }

    public static class AppointmentConfirmation {
        private String ordenId;
        private LocalDate fecha;
        private LocalTime hora;
        private String mensaje;
        // Getters y Setters
        public String getOrdenId() { return ordenId; }
        public void setOrdenId(String ordenId) { this.ordenId = ordenId; }
        public LocalDate getFecha() { return fecha; }
        public void setFecha(LocalDate fecha) { this.fecha = fecha; }
        public LocalTime getHora() { return hora; }
        public void setHora(LocalTime hora) { this.hora = hora; }
        public String getMensaje() { return mensaje; }
        public void setMensaje(String mensaje) { this.mensaje = mensaje; }
    }
}
