package com.homework.bootcamp.service.member;

import java.util.List;

public interface MemberService {
    Long create(Member member);
    Member retrieve(Long id);
    List<Member> retrieveAll();
    void delete(Long Id);
}
