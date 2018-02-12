package com.intellingens.busbooker.bizcore.entity;

import java.util.Map;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@Entity
@AllArgsConstructor
public class RouteEntity {
	
	@Id
	private UUID routeId;
	private String departurePoint;
	private String arrivalPoint;
	private Map<String,String> pathList;
	private int totalDistance;
	private Map<String,String> boardingPoints;
	private Map<String,String> droppingPoints;

}
