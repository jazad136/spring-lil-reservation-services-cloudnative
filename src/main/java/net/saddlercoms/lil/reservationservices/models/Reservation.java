package net.saddlercoms.lil.reservationservices.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="RESERVATION")
public class Reservation {
	/*
  RESERVATION_ID BIGINT AUTO_INCREMENT PRIMARY KEY,
  ROOM_ID BIGINT NOT NULL,
  GUEST_ID BIGINT NOT NULL,
  RES_DATE DATE
	 */
	@Id
	@Column(name="RESERVATION_ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(name="ROOM_ID")
	private long roomId;
	
	@Column(name="GUEST_ID")
	private long guestId;
	
	@Column(name="RES_DATE")
	private Date resDate;

	public long getId() { return id; }

	public void setId(long id) { this.id = id; }

	public long getRoomId() { return roomId; }

	public void setRoomId(long roomId) { this.roomId = roomId; }

	public long getGuestId() { return guestId; }

	public void setGuestId(long guestId) { this.guestId = guestId; }

	public Date getResDate() { return resDate; }

	public void setResDate(Date resDate) { this.resDate = resDate; }

	@Override
	public String toString() {
		return "Reservation [id=" + id + ", roomId=" + roomId + ", guestId=" + guestId + ", resDate=" + resDate + "]";
	}
	
}
