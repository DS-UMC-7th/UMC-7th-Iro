package umcWeek5.umc.domain.Mapping;

import jakarta.persistence.*;
import lombok.*;
import umcWeek5.umc.domain.FoodCategory;
import umcWeek5.umc.domain.Member;
import umcWeek5.umc.domain.common.BaseEntity;

@Entity //해당클래스가 JPA의 엔티티임을 명시
@Getter //getter를 만들어주는 어노테이션
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor //빌더패턴

public class MemberPreferFood extends BaseEntity  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // 기본키

    @ManyToOne(fetch = FetchType.LAZY) //지연로딩 설정
    @JoinColumn(name = "member_id")
    private Member member; // 유저

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "food_id")
    private FoodCategory foodCategory; // 종류

}
