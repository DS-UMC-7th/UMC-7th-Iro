package umcWeek5.umc.repository.RestaurantRepository;

import umcWeek5.umc.domain.Restaurant;

import java.util.List;

public interface RestaurantRepositoryCustom {
    List<Restaurant> dynamicQueryWithBooleanBuilder(String name, Float score);
}
