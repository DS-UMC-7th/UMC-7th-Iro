package umcWeek5.umc.domain.base;

import org.springframework.cglib.core.Local;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

public abstract class BaseEntity {

    @CreatedDate
    private LocalDateTime createdAt; // 생성시일

    @LastModifiedDate
    private LocalDateTime updatedAt; // 갱신시일

}
