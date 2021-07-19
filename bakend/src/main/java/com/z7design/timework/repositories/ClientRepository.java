package com.z7design.timework.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.z7design.timework.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}


