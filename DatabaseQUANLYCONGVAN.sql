CREATE DATABASE QUANLYCONGVAN
USE QUANLYCONGVAN

CREATE TABLE tblPhongBan
(   
	MaPhongBan INT PRIMARY KEY IDENTITY (1,1),
    TenPhongBan NVARCHAR(50) UNIQUE
);

INSERT INTO tblPhongBan (TenPhongBan) VALUES (N'Phòng hội đồng')
UPDATE tblPhongBan SET TenPhongBan = N'Phòng hội đồnggggcdddg' WHERE TenPhongBan = '444';
DELETE tblPhongBan WHERE MaPhongBan = 1;

SELECT * FROM tblPhongBan
DROP TABLE tblPhongBan



CREATE TABLE LOAIVANBAN(
	maLoai char(10) primary key,
	loaiVanBan nvarchar(100),
	moTa text,
	daXoa bit DEFAULT 0,
);

DROP TABLE LOAIVANBAN 
insert into LOAIVANBAN(maLoai, loaiVanBan)
values
('1','Cong Van'),
('2','Van ban'),
('3','Giay phep')


CREATE TABLE VanBanNoiBo
(
    SoKyHieu VARCHAR(50) PRIMARY KEY,
    TenVanBan NVARCHAR(50),
    NgayBanHanh DATE,

    maloai CHAR(10), -- Khóa ngoại đến LOAIVANBAN
    MaBanHanh INT, -- Khóa ngoại đến tblPhongBan (Phòng ban hành)
    MaBanNhan INT, -- Khóa ngoại đến tblPhongBan (Phòng ban nhận)

    NguoiNhan NVARCHAR(50),
    NguoiKy NVARCHAR(50),
    NguoiDuyet NVARCHAR(50),
    TrichYeu NVARCHAR(200),
    NoiDung NVARCHAR(200),


    -- Ràng buộc khóa ngoại
    CONSTRAINT FK_MaLoai FOREIGN KEY (maloai) REFERENCES LOAIVANBAN(maloai),
    CONSTRAINT FK_MaPhongHanh FOREIGN KEY (MaBanHanh) REFERENCES tblPhongBan(MaPhongBan),
    CONSTRAINT FK_MaPhongNhan FOREIGN KEY (MabanNhan) REFERENCES tblPhongBan(MaPhongBan),

	-- Mã tài liệu;
	MaTL INT,
	CONSTRAINT FK_MaTaiLieu FOREIGN KEY (MaTL) REFERENCES TAILIEU(MaTL)
);
drop table VanBanNoiBo

INSERT INTO VanBanNoiBo (SoKyHieu, TenVanBan, NgayBanHanh, maloai, MaBanHanh, MaBanNhan, NguoiNhan, NguoiKy, NguoiDuyet, TrichYeu, NoiDung, MaTL)
VALUES 
(2, N'Quyết định số 2', '2024-11-20', '1', 21, 19, N'Nguyễn Văn A', N'Trần Thị B', N'Lê Văn C', N'Trích yếu văn bản số 1', N'Nội dung chi tiết của văn bản số 1', 1),
(1, N'Quyết định số 1', '2024-11-20', '1', 21, 19, N'Nguyễn Văn A', N'Trần Thị B', N'Lê Văn C', N'Trích yếu văn bản số 1', N'Nội dung chi tiết của văn bản số 1', 1);


-- Sử dụng JOIN để lấy tên phòng ban từ bảng tblPhongBan:

 SELECT 
    vb.SoKyHieu, vb.TenVanBan,vb.NgayBanHanh,l.loaivanban AS LoaiBanHanh, pbH.TenPhongBan AS PhongBanHanh, pbN.TenPhongBan AS PhongNhan, vb.NguoiNhan, vb.NguoiKy, vb.NguoiDuyet, vb.TrichYeu, vb.NoiDung
FROM VanBanNoiBo vb
JOIN LOAIVANBAN l ON vb.maloai = l.maloai
JOIN tblPhongBan pbH ON vb.MaBanHanh = pbH.MaPhongBan
JOIN tblPhongBan pbN ON vb.MaBanNhan = pbN.MaPhongBan;


SELECT 
    vb.SoKyHieu, 
    vb.TenVanBan,
    vb.NgayBanHanh,
    l.loaivanban AS LoaiBanHanh,
    pbH.TenPhongBan AS PhongBanHanh,
    pbN.TenPhongBan AS PhongNhan,
    vb.NguoiNhan, 
    vb.NguoiKy, 
    vb.NguoiDuyet, 
    vb.TrichYeu, 
    vb.NoiDung,
    --t.MaTL,
    t.TenTL,
    t.NgayTao,
    t.KichCo,
    t.Loai,
    t.DuongDan
FROM VanBanNoiBo vb
JOIN LOAIVANBAN l ON vb.maloai = l.maloai
JOIN tblPhongBan pbH ON vb.MaBanHanh = pbH.MaPhongBan
JOIN tblPhongBan pbN ON vb.MaBanNhan = pbN.MaPhongBan
JOIN TAILIEU t ON vb.MaTL = t.MaTL;





CREATE TABLE TAILIEU (
    MaTL INT PRIMARY KEY IDENTITY(1,1),           
    TenTL NVARCHAR(50),              
    NgayTao DATE,                               
    KichCo INT,                                   
    Loai NVARCHAR(50),                           
    DuongDan NVARCHAR(200)                  
);

DROP TABLE TAILIEU

INSERT INTO TAILIEU (TenTL, NgayTao, KichCo, Loai, DuongDan) VALUES ('TLieu so 12','20041212','34','png','12ssssc3.png');

SELECT * FROM TAILIEU 

