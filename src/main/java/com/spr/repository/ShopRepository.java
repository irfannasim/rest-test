package com.spr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spr.model.Shop;

/***
 * @author irfan
 */
public interface ShopRepository extends JpaRepository<Shop, Integer> {

}
