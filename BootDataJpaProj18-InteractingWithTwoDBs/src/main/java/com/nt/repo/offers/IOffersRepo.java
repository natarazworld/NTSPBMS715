package com.nt.repo.offers;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.model.offers.Offers;

public interface IOffersRepo extends JpaRepository<Offers, Integer> {

}
