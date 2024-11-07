package umcWeek5.umc.repository.RestaurantRepository;

import com.querydsl.core.BooleanBuilder;
import com.querydsl.jpa.impl.JPAQueryFactory;
import umcWeek5.umc.domain.QRestaurant;
import umcWeek5.umc.domain.Restaurant;

import javax.persistence.PersistenceContext;
import java.util.List;

public class RestaurantRepositorylmpl implements RestaurantRepositoryCustom{

    @PersistenceContext // 대체
    private JPAQueryFactory jpaQueryFactory;
    private final QRestaurant restaurant = QRestaurant.restaurant;

    @Override
    public List<Restaurant> dynamicQueryWithBooleanBuilder(String name, Float score) {
        BooleanBuilder predicate = new BooleanBuilder(); //BooleanBuilder

        if (name != null) {
            predicate.and(restaurant.name.eq(name));
        } //조건 동적으로 추가

        if (score != null) {
            predicate.and(restaurant.score.goe(4.0f));
        } //조건 동적으로 추가

        return jpaQueryFactory
                .selectFrom(restaurant)
                .where(predicate)
                .fetch();
    }
}
