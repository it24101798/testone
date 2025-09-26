package com.example.registerapp.repository;

import com.example.registerapp.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
    // Custom queries can be added here if necessary
}
