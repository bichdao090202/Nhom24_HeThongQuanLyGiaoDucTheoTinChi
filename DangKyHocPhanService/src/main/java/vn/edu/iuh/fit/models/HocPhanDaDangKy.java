package vn.edu.iuh.fit.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import vn.edu.iuh.fit.pks.SinhVien_HocPhanPK;

import java.time.LocalDate;

@Entity
@Table(name = "hoc_phan_da_dang_ky")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@IdClass(SinhVien_HocPhanPK.class)
public class HocPhanDaDangKy {
    @Id
    @ManyToOne
    @JoinColumn(name = "maSV")
    @JsonIgnoreProperties(value = {"email", "diaChi", "nganh"})
    private SinhVien maSV;

    @Id
    @ManyToOne
    @JoinColumn(name = "maHocPhan")
    @JsonIgnoreProperties(value = {"soTinChiLyThuyet", "soTinChiThucHanh", "hocKy", "khoa", "nganh"})
    private HocPhan maHocPhan;

    private float hocKyDangKy;
    private LocalDate ngayDangKy;
}
