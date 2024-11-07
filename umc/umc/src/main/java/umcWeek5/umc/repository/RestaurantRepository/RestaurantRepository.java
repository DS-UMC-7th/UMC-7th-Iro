package umcWeek5.umc.repository.RestaurantRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import umcWeek5.umc.domain.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long>, RestaurantRepositoryCustom{
}
