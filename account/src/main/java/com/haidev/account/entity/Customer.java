package com.haidev.account.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EntityListeners(AuditingEntityListener.class)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    Long id;

    @Column(name = "name")
    String name;

    @Column(name = "email")
    String email;

    @Column(name = "phone_number")
    String phoneNumber;

    // ===== Audit fields =====

    @CreatedDate
    @Column(name = "created_at", updatable = false)
    LocalDateTime createdAt;

    @CreatedBy
    @Column(name = "created_by", updatable = false)
    String createdBy;

    @LastModifiedDate
    @Column(name = "updated_at")
    LocalDateTime updatedAt;

    @LastModifiedBy
    @Column(name = "updated_by")
    String updatedBy;
}
