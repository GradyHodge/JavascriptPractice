package com.gwh.projects.BucketList.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gwh.projects.BucketList.Model.Task;


@Repository
public interface TaskRepo extends CrudRepository<Task, Long> {

}
