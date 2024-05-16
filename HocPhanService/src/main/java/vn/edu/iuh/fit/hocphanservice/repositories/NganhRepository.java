package vn.edu.iuh.fit.hocphanservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.hocphanservice.model.Khoa;
import vn.edu.iuh.fit.hocphanservice.model.Nganh;

public interface NganhRepository extends JpaRepository<Nganh, Long> {
    boolean existsByTenNganh(String tenNganh);

    boolean existsByKhoa(Khoa khoa);
}
