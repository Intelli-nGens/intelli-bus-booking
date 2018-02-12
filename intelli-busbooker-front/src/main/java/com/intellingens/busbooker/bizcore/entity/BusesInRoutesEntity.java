package com.intellingens.busbooker.bizcore.entity;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.intellingens.busbooker.bizcore.entity.RouteEntity.RouteEntityBuilder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


@Builder
@Data
@Entity
@AllArgsConstructor
public class BusesInRoutesEntity {
	@Id
	private UUID routeId;
	private List<UUID> busIds; 
}
