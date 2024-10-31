package umcWeek5.umc.domain;
import com.fasterxml.jackson.annotation.JsonTypeId;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import umcWeek5.umc.domain.Mapping.MemberAgree;
import umcWeek5.umc.domain.Mapping.MemberMission;
import umcWeek5.umc.domain.Mapping.MemberPreferFood;
import umcWeek5.umc.domain.base.BaseEntity;
import umcWeek5.umc.domain.enums.Gender;
import umcWeek5.umc.domain.enums.MemberStatus;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Entity //해당클래스가 JPA의 엔티티임을 명시
@Getter //getter를 만들어주는 어노테이션
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor //빌더패턴

public class Member extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; // Memeber 기본키

    @Column(nullable = false, length = 20)
    private String name; // 이름

    @Column(nullable = false, length = 150)
    private String address; // 주소

    private LocalDate inactiveDate; // 비활성화일수

    @Column(nullable = false, length = 50)
    private String email; // 이메일

    private Integer point; // 소유 포인트

    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "VARCHAR(15)")
    private Gender gender; // 성별
    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "VARCHAR(15) DEFAULT 'ACTIVE'")
    private MemberStatus status; //상태

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    private List<MemberAgree> memberAgreeList = new ArrayList<>(); // MemberAgree 양방향 연관관계 매핑

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    private List<MemberPreferFood> memberPreferFoodList = new ArrayList<>(); // MemberPreferFood 양방향 연관관계 매핑

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    private List<MemberMission> memberMissionList = new ArrayList<>(); // MemberMission 양방향 연관관계 매핑

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    private List<Review> reviewList = new ArrayList<>(); // Review 양방향 연관관계 매핑

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    private List<CustomerInquiry> customerInquiryList = new ArrayList<>(); // CustomerInquiry 양방향 연관관계 매핑

}
