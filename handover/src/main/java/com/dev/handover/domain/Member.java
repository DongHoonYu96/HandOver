package com.dev.handover.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity // JPA 엔티티, 데이터베이스 테이블과 매핑됩니다.
@Getter
@Setter
public class Member {
    @Id // 기본 키 (Primary Key)
    @GeneratedValue(strategy = GenerationType.IDENTITY) // ID 자동 생성 전략
    private Long id;

    private String name;
    private String password;


}
