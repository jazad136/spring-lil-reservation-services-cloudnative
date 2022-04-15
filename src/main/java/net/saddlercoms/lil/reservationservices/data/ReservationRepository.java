package net.saddlercoms.lil.reservationservices.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import net.saddlercoms.lil.reservationservices.models.Reservation;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Long>{

}
