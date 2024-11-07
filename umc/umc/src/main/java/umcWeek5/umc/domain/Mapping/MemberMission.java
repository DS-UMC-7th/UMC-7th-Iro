package umcWeek5.umc.domain.Mapping;

import jakarta.persistence.*;
import lombok.*;
import umcWeek5.umc.domain.Mission;
import umcWeek5.umc.domain.Member;
import umcWeek5.umc.domain.common.BaseEntity;
import umcWeek5.umc.domain.enums.MissionStatus;

@Entity //해당클래스가 JPA의 엔티티임을 명시
@Getter //getter를 만들어주는 어노테이션
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor //빌더패턴

public class MemberMission extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // 기본키

    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "VARCHAR(15) DEFAULT 'CHALLENGING'")
    private MissionStatus status; // 미션 상태

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mission_id")
    private Mission mission; // 미션 id

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member; // 유저

}
