package umcWeek5.umc.config;
import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.PersistenceContext;

@Configuration
@RequiredArgsConstructor
public class QueryDSLConfig {
    @PersistenceContext // final이 오류나서 @PersistenceContext 어노테이션으로 댜체
    private EntityManager entityManager;

    @Bean
    public JPAQueryFactory jpaQueryFactory(){
        return new JPAQueryFactory(entityManager);
    }
}