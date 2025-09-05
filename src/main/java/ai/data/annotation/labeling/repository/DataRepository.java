package ai.data.annotation.labeling.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ai.data.annotation.labeling.model.DataItem;

public interface DataRepository extends JpaRepository<DataItem, Long> {
}