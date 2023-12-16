package com.dev.handover.repository;

import com.dev.handover.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
    // User 엔티티에 대한 JPA 리포지토리, 기본 CRUD 연산 제공 <엔티티이름, 기본키의 타입>
}
