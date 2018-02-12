package com.intellingens.busbooker.bizcore.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.intellingens.busbooker.bizcore.entity.practice.BusDetailsEntity;

public interface PracticeRepository extends CrudRepository<BusDetailsEntity, UUID> {

}
