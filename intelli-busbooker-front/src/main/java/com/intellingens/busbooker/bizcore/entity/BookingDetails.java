package com.intellingens.busbooker.bizcore.entity;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.intellingens.busbooker.bizcore.enums.BookingStatus;
import com.intellingens.busbooker.bizcore.enums.SeatType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@Entity
@AllArgsConstructor
public class BookingDetails {

	@Id
	private String userId;
	@Id
	private String bookingTransactionId;
	private String displayName;
	private String passengerNumber;
	private UUID busId;
	private String boardingPoint;
	private String dropingPoint;
	private String startTime;
	private UUID routeId;
	private BookingStatus bookingStatus;
	private int amount;
	private SeatType seatType;
	private int seatNumber;


}
