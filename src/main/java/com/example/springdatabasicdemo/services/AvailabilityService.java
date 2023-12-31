package com.example.springdatabasicdemo.services;

import com.example.springdatabasicdemo.dtos.GoodsDto;
import com.example.springdatabasicdemo.dtos.PlaceDto;
import com.example.springdatabasicdemo.dtos.AvailabilityDto;

import java.util.List;
import java.util.Optional;

public interface AvailabilityService<ID> {

    AvailabilityDto register(AvailabilityDto avalability);

    void expel(AvailabilityDto avalability);

    void expel(ID id);
    /*
    void transfer(AvailabilityDto avalability, PlaceDto place);
    */
    Optional<AvailabilityDto> findAvalability(Integer id);

    List<AvailabilityDto> getAll();

    List<AvailabilityDto> findAllbyDate(java.sql.Date currentDate);

    List<AvailabilityDto> findAvalabilitysByPlace(String place);

    List<AvailabilityDto> findAllByPlaceId(int id);

    List<GoodsDto> findGoodsByPlaceName(String placeName);
}

