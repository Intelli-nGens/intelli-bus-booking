package com.intellingens.busbooker.bizcore.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.intellingens.busbooker.bizcore.entity.BusDetailsEntity;

public interface BusDetailsRepository extends CrudRepository<BusDetailsEntity, UUID> {

}
