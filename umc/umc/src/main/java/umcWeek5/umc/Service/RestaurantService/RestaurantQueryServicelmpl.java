package umcWeek5.umc.Service.RestaurantService;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import umcWeek5.umc.domain.Restaurant;
import umcWeek5.umc.repository.RestaurantRepository.RestaurantRepository;

import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class RestaurantQueryServicelmpl implements RestaurantQueryService {

    @PersistenceContext
    private RestaurantRepository restaurantRepository;

    @Override
    public Optional<Restaurant> findRestaurant(Long id){
        return restaurantRepository.findById(id);
    }

    @Override
    public List<Restaurant> findRestaurantByNameAndScore(String name, Float score){
        List<Restaurant> filteredRestaurants = restaurantRepository.dynamicQueryWithBooleanBuilder(name,score);
        filteredRestaurants.forEach(restaurant -> System.out.println("Restaurant: "+restaurant));
        return filteredRestaurants;
    }

}
