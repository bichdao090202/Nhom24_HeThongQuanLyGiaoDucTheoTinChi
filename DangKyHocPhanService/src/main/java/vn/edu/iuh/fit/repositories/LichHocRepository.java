package vn.edu.iuh.fit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.edu.iuh.fit.models.LichHoc;

@Repository
public interface LichHocRepository extends JpaRepository<LichHoc, Long> {
}