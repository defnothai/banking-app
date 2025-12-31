package com.haidev.account.entity;


import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Setter
@Getter
@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
@MappedSuperclass
/*
    annotation này nói với jpa rằng:
    đây không phải là entity
    không tạo bảng riêng cho class này
    nhưng các class kế thừa từ nó sẽ có các cột tương ứng
 */
public class BaseEntity {
    @Column(updatable = false)   // không cho update
    LocalDateTime createdAt;
    @Column(updatable = false)
    String createdBy;
    @Column(insertable = false)   // lúc insert vào thì không cần giá trị
    LocalDateTime updatedAt;
    @Column(insertable = false)
    String updatedBy;
}
