package book.tuto.service;

import org.springframework.stereotype.Service;

import book.tuto.dto.requestDto.CityRequestDto;
import book.tuto.model.City;

import java.util.List;

@Service
public interface CityService {
    public City addCity(CityRequestDto cityRequestDto);
    public List<City> getCities();
    public City getCity(Long cityId);
    public City deleteCity(Long cityId);
    public City editCity(Long cityId, CityRequestDto cityRequestDto);
}
