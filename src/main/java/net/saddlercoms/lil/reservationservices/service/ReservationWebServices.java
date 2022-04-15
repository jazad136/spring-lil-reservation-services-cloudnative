package net.saddlercoms.lil.reservationservices.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.saddlercoms.lil.reservationservices.data.ReservationRepository;
import net.saddlercoms.lil.reservationservices.models.Reservation;

@RestController
@RequestMapping("/reservations")
public class ReservationWebServices {
	private final ReservationRepository repository;
	
	public ReservationWebServices(ReservationRepository repository) { this.repository = repository; } 
	
	@GetMapping 
	public Iterable<Reservation> getAllReservations() { return this.repository.findAll(); } 
	
	@GetMapping("/{id}")
	public Reservation getReservation(@PathVariable("id") long id) { return this.repository.findById(id).get();  }
}
