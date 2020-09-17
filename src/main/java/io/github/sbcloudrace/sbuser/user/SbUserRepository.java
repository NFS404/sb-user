package io.github.sbcloudrace.sbuser.user;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

public interface SbUserRepository extends PagingAndSortingRepository<SbUser, Long> {

    SbUser findByEmail(@Param("email") String email);
}
