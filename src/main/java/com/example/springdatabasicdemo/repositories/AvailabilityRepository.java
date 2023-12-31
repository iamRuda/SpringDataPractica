package com.example.springdatabasicdemo.repositories;

import com.example.springdatabasicdemo.models.Availability;
import com.example.springdatabasicdemo.models.Goods;
import com.example.springdatabasicdemo.models.Place;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AvailabilityRepository extends JpaRepository<Availability, Integer> {
    List<Availability> findAllByPlaceId(int id);

    List<Availability> findAllByPlaceName(String placeName);

    List<Availability> findByDateDeliveryGreaterThan(java.sql.Date date);

    @Query("select d.goods from Availability d where d.place.name = :placeName")
    List<Goods> findGoodsByPlaceName(@Param("placeName") String placeName);
}

