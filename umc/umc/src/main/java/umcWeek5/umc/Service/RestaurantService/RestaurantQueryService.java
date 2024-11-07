package umcWeek5.umc.Service.RestaurantService;

import umcWeek5.umc.domain.Restaurant;

import java.util.List;
import java.util.Optional;

public interface RestaurantQueryService {
    Optional<Restaurant> findRestaurant(Long id);
    List<Restaurant> findRestaurantByNameAndScore(String name, Float score);
}
