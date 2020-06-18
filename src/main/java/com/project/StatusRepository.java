package com.project;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StatusRepository extends JpaRepository<Status, Integer> {

    Status getByStatusId(Integer statusId);

    List<Status> getAllByStatusIdGreaterThan(Integer kajsdlkajs);

    List<Status> getAllByStatusNameLikeAndStatusIdGreaterThanEqual(String nameLike, Integer gtr);

    @Query(
            value = "SELECT * FROM status s WHERE s.statusId = ?1",
            nativeQuery = true)
    Status findUserByStatusNative(Integer status);

    // select * from status where statusName like '%n' and statusId > 5
    // spring data jpa genereaza query-uri pe baza numelor metodelor

    List<Status> findFirstByStatusNameLikeAndStatusIdLes(String like, Integer number);



}
