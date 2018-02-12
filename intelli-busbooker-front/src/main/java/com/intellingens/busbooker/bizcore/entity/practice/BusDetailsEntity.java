package com.intellingens.busbooker.bizcore.entity.practice;

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
public class BusDetailsEntity {

	@Id
	private UUID id;
	private UUID operatorId;
	private int semiSleeperCount;
	private int sleeperCount;
	private int seaterCount;
	private boolean isVolvo;
	private boolean isAc;
	private int totalCapacity;
	private UUID routeId;
}
