-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th5 08, 2024 lúc 07:59 AM
-- Phiên bản máy phục vụ: 10.4.32-MariaDB
-- Phiên bản PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `btl_java`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `dangnhap`
--

CREATE TABLE `dangnhap` (
  `id` int(11) NOT NULL,
  `hoten` varchar(255) NOT NULL,
  `taikhoan` varchar(250) NOT NULL,
  `matkhau` varchar(250) NOT NULL,
  `email` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `dangnhap`
--

INSERT INTO `dangnhap` (`id`, `hoten`, `taikhoan`, `matkhau`, `email`) VALUES
(1, 'Nguyễn Thành Hưng', 'admin', '123456', 'hung@gmail.com'),
(2, 'Trịnh Quốc Dũng', 'dung', '123456', 'dung@gmail.com');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `hopdong`
--

CREATE TABLE `hopdong` (
  `Masinhvien` varchar(100) NOT NULL,
  `Hoten` varchar(255) NOT NULL,
  `Lop` varchar(100) NOT NULL,
  `Phong` varchar(50) NOT NULL,
  `Ngayvao` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `hopdong`
--

INSERT INTO `hopdong` (`Masinhvien`, `Hoten`, `Lop`, `Phong`, `Ngayvao`) VALUES
('72DCHT20024', 'Nguyễn Thành Hưng', 'HT21', 'PA02', '2024-01-01'),
('72DCHT20025', 'Trịnh Quốc Dũng', 'TT21', 'PA01', '2024-02-01'),
('72DCHT20026', 'Nguyễn Phú Xuân Thao', 'TT22', 'PB01', '2023-01-02'),
('72DCHT20027', 'Cao Tuấn Anh', 'TT21', 'PB02', '2023-01-02'),
('72DCHT20028', 'Lê Đức Long', 'HT22', 'PC01', '2023-02-02'),
('72DCHT20029', 'Phùng Tiến Đạt', 'MT22', 'PC02', '2024-05-09');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `phong`
--

CREATE TABLE `phong` (
  `Maphong` varchar(50) NOT NULL,
  `Tenphong` varchar(100) NOT NULL,
  `Daynha` varchar(50) NOT NULL,
  `Tinhtrang` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `phong`
--

INSERT INTO `phong` (`Maphong`, `Tenphong`, `Daynha`, `Tinhtrang`) VALUES
('MP1', 'PA02', 'A02', 'Đẹp'),
('MP2', 'PA01', 'A01', 'Sạch sẽ'),
('MP3', 'PB01', 'B01', 'Hơi bẩn'),
('MP4', 'PB02', 'B02', 'An ninh tốt'),
('MP5', 'PC01', 'C01', 'Sạch'),
('MP6', 'PC02', 'C02', 'Đẹp');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `sinhvien`
--

CREATE TABLE `sinhvien` (
  `Masinhvien` varchar(100) NOT NULL,
  `Hoten` varchar(255) NOT NULL,
  `Khoa` varchar(100) NOT NULL,
  `Lop` varchar(50) NOT NULL,
  `Gioitinh` varchar(50) NOT NULL,
  `CCCD` varchar(100) NOT NULL,
  `Sodienthoai` varchar(100) NOT NULL,
  `Diachi` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `sinhvien`
--

INSERT INTO `sinhvien` (`Masinhvien`, `Hoten`, `Khoa`, `Lop`, `Gioitinh`, `CCCD`, `Sodienthoai`, `Diachi`) VALUES
('72DCHT20024', 'Nguyễn Thành Hưng', 'Hệ thống thông tin', 'HT21', 'Nam', '0981094890354', '0284782543', 'Thanh Hóa'),
('72DCHT20025', 'Trịnh Quốc Dũng', 'Công nghệ thông tin', 'TT21', 'Nam', '0924578425222', '028578245', 'Nam Định'),
('72DCHT20026', 'Nguyễn Phú Xuân Thao', 'Công nghệ thông tin', 'TT22', 'Nam', '0289478465436', '089267245', 'Hà Nam'),
('72DCHT20027', 'Cao Tuấn Anh', 'Công nghệ thông tin', 'TT21', 'Nam', '09247257828945', '024782785', 'Hà Nội'),
('72DCHT20028', 'Lê Đức Long', 'Hệ thống thông tin', 'HT22', 'Nam', '092472578289', '0247827852', 'Hà Nội'),
('72DCHT20029', 'Phùng Tiến Đạt', 'Mạng máy tính', 'MT22', 'Nữ ', '0137849825213', '094189444', 'Hà Nội');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `thanhtoan`
--

CREATE TABLE `thanhtoan` (
  `Masinhvien` varchar(100) NOT NULL,
  `Phong` varchar(100) NOT NULL,
  `Tongtien` varchar(100) NOT NULL,
  `Thanhtoan` varchar(100) NOT NULL,
  `Ngaytao` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `thanhtoan`
--

INSERT INTO `thanhtoan` (`Masinhvien`, `Phong`, `Tongtien`, `Thanhtoan`, `Ngaytao`) VALUES
('72DCHT20024', 'PA02', '1120000', 'Đã thanh toán', '2024-04-06'),
('72dcht20025', 'PA01', '2000000', 'Chưa thanh toán', '2024-04-06');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `dangnhap`
--
ALTER TABLE `dangnhap`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `dangnhap`
--
ALTER TABLE `dangnhap`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
