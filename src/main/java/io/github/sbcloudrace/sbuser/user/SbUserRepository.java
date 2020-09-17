package io.github.sbcloudrace.sbuser.user;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "sbusers")
public interface SbUserRepository extends PagingAndSortingRepository<SbUser, Long> {

    SbUser findByEmail(@Param("email") String email);
}
