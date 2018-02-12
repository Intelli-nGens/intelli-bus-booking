package com.intellingens.busbooker.bizcore.entity;

import java.util.List;
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
public class OperatorsEntity {
	@Id
	private UUID operatorId;
	private String operatorName;
	private Map<String,String> branchAddress;
	private List<UUID> busIds;
	private List<String> phoneNumbers;
	private String mail;
	private boolean isPickupVanAvailable;
	
}
