package umcWeek5.umc.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMember is a Querydsl query type for Member
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMember extends EntityPathBase<Member> {

    private static final long serialVersionUID = -1060473847L;

    public static final QMember member = new QMember("member1");

    public final umcWeek5.umc.domain.common.QBaseEntity _super = new umcWeek5.umc.domain.common.QBaseEntity(this);

    public final StringPath address = createString("address");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final ListPath<CustomerInquiry, QCustomerInquiry> customerInquiryList = this.<CustomerInquiry, QCustomerInquiry>createList("customerInquiryList", CustomerInquiry.class, QCustomerInquiry.class, PathInits.DIRECT2);

    public final StringPath email = createString("email");

    public final EnumPath<umcWeek5.umc.domain.enums.Gender> gender = createEnum("gender", umcWeek5.umc.domain.enums.Gender.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final DatePath<java.time.LocalDate> inactiveDate = createDate("inactiveDate", java.time.LocalDate.class);

    public final ListPath<umcWeek5.umc.domain.Mapping.MemberAgree, umcWeek5.umc.domain.Mapping.QMemberAgree> memberAgreeList = this.<umcWeek5.umc.domain.Mapping.MemberAgree, umcWeek5.umc.domain.Mapping.QMemberAgree>createList("memberAgreeList", umcWeek5.umc.domain.Mapping.MemberAgree.class, umcWeek5.umc.domain.Mapping.QMemberAgree.class, PathInits.DIRECT2);

    public final ListPath<umcWeek5.umc.domain.Mapping.MemberMission, umcWeek5.umc.domain.Mapping.QMemberMission> memberMissionList = this.<umcWeek5.umc.domain.Mapping.MemberMission, umcWeek5.umc.domain.Mapping.QMemberMission>createList("memberMissionList", umcWeek5.umc.domain.Mapping.MemberMission.class, umcWeek5.umc.domain.Mapping.QMemberMission.class, PathInits.DIRECT2);

    public final ListPath<umcWeek5.umc.domain.Mapping.MemberPreferFood, umcWeek5.umc.domain.Mapping.QMemberPreferFood> memberPreferFoodList = this.<umcWeek5.umc.domain.Mapping.MemberPreferFood, umcWeek5.umc.domain.Mapping.QMemberPreferFood>createList("memberPreferFoodList", umcWeek5.umc.domain.Mapping.MemberPreferFood.class, umcWeek5.umc.domain.Mapping.QMemberPreferFood.class, PathInits.DIRECT2);

    public final StringPath name = createString("name");

    public final NumberPath<Integer> point = createNumber("point", Integer.class);

    public final ListPath<Review, QReview> reviewList = this.<Review, QReview>createList("reviewList", Review.class, QReview.class, PathInits.DIRECT2);

    public final EnumPath<umcWeek5.umc.domain.enums.MemberStatus> status = createEnum("status", umcWeek5.umc.domain.enums.MemberStatus.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QMember(String variable) {
        super(Member.class, forVariable(variable));
    }

    public QMember(Path<? extends Member> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMember(PathMetadata metadata) {
        super(Member.class, metadata);
    }

}

