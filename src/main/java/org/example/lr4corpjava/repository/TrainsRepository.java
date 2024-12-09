package org.example.lr4corpjava.repository;

import org.example.lr4corpjava.data.Trains;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainsRepository extends JpaRepository<Trains,Integer> {
}
