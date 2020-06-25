-- --------------------------------------------------------
-- Sunucu:                       127.0.0.1
-- Sunucu sürümü:                10.4.12-MariaDB - mariadb.org binary distribution
-- Sunucu İşletim Sistemi:       Win64
-- HeidiSQL Sürüm:               10.2.0.5599
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- tablo yapısı dökülüyor odev.dosya
CREATE TABLE IF NOT EXISTS `dosya` (
  `id` int(100) unsigned NOT NULL AUTO_INCREMENT,
  `path` varchar(150) COLLATE utf8_unicode_ci NOT NULL,
  `name` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `type` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- odev.dosya: ~0 rows (yaklaşık) tablosu için veriler indiriliyor
/*!40000 ALTER TABLE `dosya` DISABLE KEYS */;
/*!40000 ALTER TABLE `dosya` ENABLE KEYS */;

-- tablo yapısı dökülüyor odev.firmalar
CREATE TABLE IF NOT EXISTS `firmalar` (
  `kullaniciAdi` varchar(50) NOT NULL,
  `sifre` bigint(20) NOT NULL DEFAULT 0,
  `sirketAdi` varchar(50) NOT NULL,
  `telNo` bigint(20) NOT NULL DEFAULT 0,
  `sektor` varchar(50) NOT NULL,
  `elemanSayisi` bigint(20) NOT NULL DEFAULT 0,
  `cinsiyet` varchar(50) NOT NULL,
  PRIMARY KEY (`kullaniciAdi`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- odev.firmalar: ~26 rows (yaklaşık) tablosu için veriler indiriliyor
/*!40000 ALTER TABLE `firmalar` DISABLE KEYS */;
INSERT INTO `firmalar` (`kullaniciAdi`, `sifre`, `sirketAdi`, `telNo`, `sektor`, `elemanSayisi`, `cinsiyet`) VALUES
	('ADKIE', 34252262, 'ERTEK', 979755, 'SAĞLIK', 9, 'BİLİNMİYOR'),
	('Admin', 1234, 'Admin', 1, 'Admin', 1, 'Admin'),
	('asdfg', 21345, 'addfa', 364, 'hizmet', 67, 'bilinmiyor'),
	('BFGMÇU', 3456744, 'WQEQWEQW', 688976543, 'SAĞLIK', 454, 'ERKEK'),
	('bvbcvb', 4234234, 'holdig', 12, 'gıda', 24, 'kadın'),
	('CVBNM', 3245, 'WERTSRE', 345678, 'TURİZM', 2, 'KADIN'),
	('CVBNMÖ', 234567, 'EFGHJKLJH', 213435657, 'SAĞLIK', 34, 'ERKEK'),
	('EQRT', 4234, 'MNBVCX', 666, 'Giyim', 33, 'kadın'),
	('fdsfs', 6312, 'neraf', 17, 'gıda', 6, 'BİLİNMİYOR'),
	('fvfqwe145y', 13423648, 'hizadada', 55, 'hizmet', 2, 'erkek'),
	('gerafag', 3243546, 'tusirwa', 58655668, 'turizm', 4, 'kadın'),
	('GıdaFirma', 1234, 'GıdaFirma', 5553332211, 'Gıda', 3, 'Erkek'),
	('GiyimFirma', 1234, 'GiyimFirma', 5553332211, 'Giyim', 3, 'Kadın'),
	('HizmetFirma', 1234, 'HizmetFirma', 5553332211, 'Hizmet', 3, 'Erkek'),
	('InsaatFirma', 1234, 'İnşaatFirma', 5553332211, 'İnşaat', 3, 'Erkek'),
	('merdak', 34324, 'merdajkk', 34, 'hizmet', 21, 'kadın'),
	('MNÖÇH', 134, 'sadfghnm', 232, 'inşaat', 6, 'ERKEK'),
	('qwerty', 34566, 'dasd', 11, 'Gıda', 50, 'erkek'),
	('SaglikFirma', 1234, 'SağlıkFirma', 5553332211, 'Sağlık', 3, 'Kadın'),
	('TurizmFirma', 1234, 'TurizmFirma', 5553332211, 'Turizm', 3, 'Erkek'),
	('WEFDGHH', 1234567, 'WQEö', 6447, 'İNŞAAT', 76, 'KADIN'),
	('WERTY', 3245, 'RWERW', 424252, 'TURİZM', 3242, 'ERKEK'),
	('wewwe', 31145, 'dükkan', 14, 'gıda', 65, 'kadın'),
	('wqer', 123456, 'dfghj', 154, 'giyim', 124, 'kadın'),
	('xzcvcbn', 2122345, 'Furkan', 10, 'giyim', 22, 'erkek'),
	('YAKODL', 434535, 'BETON', 5754, 'İNŞAAT', 57, 'ERKEK');
/*!40000 ALTER TABLE `firmalar` ENABLE KEYS */;

-- tablo yapısı dökülüyor odev.gida
CREATE TABLE IF NOT EXISTS `gida` (
  `firmaAdi` varchar(50) DEFAULT NULL,
  `firmaSektor` varchar(50) DEFAULT NULL,
  `firmaNo` bigint(20) DEFAULT NULL,
  `isciSayisi` bigint(20) DEFAULT NULL,
  `cinsiyet` varchar(50) DEFAULT NULL,
  `isciAdi` varchar(50) DEFAULT NULL,
  `isciSoyadi` varchar(50) DEFAULT NULL,
  `isciTelNo` bigint(20) DEFAULT NULL,
  `isciKullaniciAdi` varchar(50) DEFAULT NULL,
  `isciSifre` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- odev.gida: ~2 rows (yaklaşık) tablosu için veriler indiriliyor
/*!40000 ALTER TABLE `gida` DISABLE KEYS */;
INSERT INTO `gida` (`firmaAdi`, `firmaSektor`, `firmaNo`, `isciSayisi`, `cinsiyet`, `isciAdi`, `isciSoyadi`, `isciTelNo`, `isciKullaniciAdi`, `isciSifre`) VALUES
	('GıdaFirma', 'Gıda', 5553332211, 3, 'Erkek', 'g', 'd', 5443332211, 'GıdaDeneme', 123);
/*!40000 ALTER TABLE `gida` ENABLE KEYS */;

-- tablo yapısı dökülüyor odev.giyim
CREATE TABLE IF NOT EXISTS `giyim` (
  `firmaAdi` varchar(50) DEFAULT NULL,
  `firmaSektor` varchar(50) DEFAULT NULL,
  `firmaNo` bigint(20) DEFAULT NULL,
  `isciSayisi` bigint(20) DEFAULT NULL,
  `cinsiyet` varchar(50) DEFAULT NULL,
  `isciAdi` varchar(50) DEFAULT NULL,
  `isciSoyadi` varchar(50) DEFAULT NULL,
  `isciTelNo` bigint(20) DEFAULT NULL,
  `isciKullaniciAdi` varchar(50) DEFAULT NULL,
  `isciSifre` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- odev.giyim: ~0 rows (yaklaşık) tablosu için veriler indiriliyor
/*!40000 ALTER TABLE `giyim` DISABLE KEYS */;
INSERT INTO `giyim` (`firmaAdi`, `firmaSektor`, `firmaNo`, `isciSayisi`, `cinsiyet`, `isciAdi`, `isciSoyadi`, `isciTelNo`, `isciKullaniciAdi`, `isciSifre`) VALUES
	('GiyimFirma', 'Giyim', 5553332211, 3, 'Kadın', 'g', 'd', 5443332211, 'GiyimDeneme', 123);
/*!40000 ALTER TABLE `giyim` ENABLE KEYS */;

-- tablo yapısı dökülüyor odev.hizmet
CREATE TABLE IF NOT EXISTS `hizmet` (
  `firmaAdi` varchar(50) DEFAULT NULL,
  `firmaSektor` varchar(50) DEFAULT NULL,
  `firmaNo` bigint(20) DEFAULT NULL,
  `isciSayisi` bigint(20) DEFAULT NULL,
  `cinsiyet` varchar(50) DEFAULT NULL,
  `isciAdi` varchar(50) DEFAULT NULL,
  `isciSoyadi` varchar(50) DEFAULT NULL,
  `isciTelNo` bigint(20) DEFAULT NULL,
  `isciKullaniciAdi` varchar(50) DEFAULT NULL,
  `isciSifre` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- odev.hizmet: ~1 rows (yaklaşık) tablosu için veriler indiriliyor
/*!40000 ALTER TABLE `hizmet` DISABLE KEYS */;
INSERT INTO `hizmet` (`firmaAdi`, `firmaSektor`, `firmaNo`, `isciSayisi`, `cinsiyet`, `isciAdi`, `isciSoyadi`, `isciTelNo`, `isciKullaniciAdi`, `isciSifre`) VALUES
	('HizmetFirma', 'Hizmet', 5553332211, 3, 'Erkek', 'h', 'd', 5443332211, 'HizmetDeneme', 123);
/*!40000 ALTER TABLE `hizmet` ENABLE KEYS */;

-- tablo yapısı dökülüyor odev.insaat
CREATE TABLE IF NOT EXISTS `insaat` (
  `firmaAdi` varchar(50) DEFAULT NULL,
  `firmaSektor` varchar(50) DEFAULT NULL,
  `firmaNo` bigint(20) DEFAULT NULL,
  `isciSayisi` bigint(20) DEFAULT NULL,
  `cinsiyet` varchar(50) DEFAULT NULL,
  `isciAdi` varchar(50) DEFAULT NULL,
  `isciSoyadi` varchar(50) DEFAULT NULL,
  `isciTelNo` bigint(20) DEFAULT NULL,
  `isciKullaniciAdi` varchar(50) DEFAULT NULL,
  `isciSifre` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- odev.insaat: ~1 rows (yaklaşık) tablosu için veriler indiriliyor
/*!40000 ALTER TABLE `insaat` DISABLE KEYS */;
INSERT INTO `insaat` (`firmaAdi`, `firmaSektor`, `firmaNo`, `isciSayisi`, `cinsiyet`, `isciAdi`, `isciSoyadi`, `isciTelNo`, `isciKullaniciAdi`, `isciSifre`) VALUES
	('İnşaatFirma', 'İnşaat', 5553332211, 3, 'Erkek', 'i', 'd', 5443332211, 'InsaatDeneme', 123);
/*!40000 ALTER TABLE `insaat` ENABLE KEYS */;

-- tablo yapısı dökülüyor odev.isciler
CREATE TABLE IF NOT EXISTS `isciler` (
  `kullaniciAdi` varchar(50) NOT NULL,
  `sifre` bigint(20) NOT NULL DEFAULT 0,
  `ad` varchar(50) NOT NULL DEFAULT '0',
  `soyad` varchar(50) NOT NULL DEFAULT '0',
  `cinsiyet` varchar(50) NOT NULL DEFAULT '0',
  `telNo` bigint(20) NOT NULL DEFAULT 0,
  `sektor` varchar(50) NOT NULL DEFAULT '0',
  `firmaAdi` varchar(50) DEFAULT 'Firma Yok',
  `firmaNo` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`kullaniciAdi`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- odev.isciler: ~28 rows (yaklaşık) tablosu için veriler indiriliyor
/*!40000 ALTER TABLE `isciler` DISABLE KEYS */;
INSERT INTO `isciler` (`kullaniciAdi`, `sifre`, `ad`, `soyad`, `cinsiyet`, `telNo`, `sektor`, `firmaAdi`, `firmaNo`) VALUES
	('asasa', 2323232, 'ddddd', 'daaaaaa', 'kadın', 2357896310, 'Gıda', 'firma yok', 0),
	('ASD545345', 34324324, 'oeranad', 'sdasdada', 'kadın', 5445455454, 'sağlık', 'firma yok', 0),
	('AyhanKara', 123, 'Ayhan', 'Kara', 'Erkek', 5443332211, 'Gıda', 'firma yok', 0),
	('AytenKara', 123, 'Ayten', 'Kara', 'Kadın', 5443332211, 'Giyim', 'firma yok', 0),
	('ccbbcbbc13243', 534545, 'rhererw', 'WQEWR', 'kadın', 23450981234, 'Hizmet', 'firma yok', 0),
	('CenlaKara', 123, 'Necla', 'Kara', 'Kadın', 5443332211, 'Hizmet', 'firma yok', 0),
	('çöçöçöçöçö', 4534554, 'Furkan', 'safaf', 'erkek', 12, 'Turizm', 'firma yok', 0),
	('CVBCCCCCCC', 234567, 'IOUO', 'DFG', 'KADIN', 56464645645, 'GİYİM', 'firma yok', 0),
	('deneme', 232323, 'denemeee', 'de', 'erkek', 5897412352, 'Gıda', 'firma yok', 0),
	('Deneme1234', 1234, 'Deneme', 'Deneme', 'Erkek', 5386459786, 'Gıda', 'firma yok', 0),
	('etryu', 240920, 'cvbvcbc', 'dasdarfeew', 'kadın', 9876543, 'Hizmet', 'firma yok', 0),
	('FRRIORIT', 3323, 'BEMERE', 'RERERER', 'BİLİNMİYOR', 656656545656, 'inşaat', 'firma yok', 0),
	('GFHNV', 2323, 'asdaaadddadadaad', 'nfafmafmaf', 'kadın', 598765432345, 'inşaat', 'firma yok', 0),
	('GıdaDeneme', 123, 'g', 'de', 'Erkek', 5443332211, 'Gıda', 'GıdaFirma', 0),
	('GiyimDeneme', 123, 'g', 'd', 'Kadın', 5443332211, 'Giyim', 'GiyimFirma', 0),
	('HizmetDeneme', 123, 'h', 'd', 'Erkek', 5443332211, 'Hizmet', 'HizmetFirma', 0),
	('InsaatDeneme', 123, 'i', 'd', 'Erkek', 5443332211, 'İnşaat', 'İnşaatFirma', 0),
	('MecnunKara', 123, 'Mecnun', 'Kara', 'Erkek', 5443332211, 'İnşaat', 'firma yok', 0),
	('MünevverKara', 123, 'Münevver', 'Kara', 'Kadın', 5443332211, 'Sağlık', 'firma yok', 0),
	('MuratKara', 123, 'Murat', 'Kara', 'Erkek', 5443332211, 'Turizm', 'firma yok', 0),
	('ornek', 213, 'vvvvvvvvvvvv', 'sdaaaaaaaaa', 'erkek', 34234234234, 'Giyim', 'firma yok', 0),
	('SaglikDeneme', 123, 's', 'd', 'Kadın', 5443332211, 'Sağlık', 'SağlıkFirma', 0),
	('SDASDS', 634645, 'SASDDS', 'GDGDG', 'KADIN', 95998222, 'Hizmet', 'firma yok', 0),
	('TurizmDeneme', 123, 't', 'd', 'Erkek', 5443332211, 'Turizm', 'TurizmFirma', 0),
	('UVAY22442', 232442424, 'KEMLA', 'KOSTEK', 'ERKEK', 123432123, 'sağlık', 'firma yok', 0),
	('VCCV', 2242424224276, 'NAHİDE', 'DAREHAL', 'BİLİNMİYOR', 65665465, 'sağlık', 'firma yok', 0),
	('vxvxvx422', 4325, 'bozkurt', 'vbretu', 'erkek', 13, 'turizm', 'firma yok', 0),
	('xccxzcxzc', 4234324, 'işşbul', 'projeiş', 'bilinmiyor', 999999999999, 'inşaat', 'firma yok', 0);
/*!40000 ALTER TABLE `isciler` ENABLE KEYS */;

-- tablo yapısı dökülüyor odev.saglik
CREATE TABLE IF NOT EXISTS `saglik` (
  `firmaAdi` varchar(50) DEFAULT NULL,
  `firmaSektor` varchar(50) DEFAULT NULL,
  `firmaNo` bigint(20) DEFAULT NULL,
  `isciSayisi` bigint(20) DEFAULT NULL,
  `cinsiyet` varchar(50) DEFAULT NULL,
  `isciAdi` varchar(50) DEFAULT NULL,
  `isciSoyadi` varchar(50) DEFAULT NULL,
  `isciTelNo` bigint(20) DEFAULT NULL,
  `isciKullaniciAdi` varchar(50) DEFAULT NULL,
  `isciSifre` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- odev.saglik: ~0 rows (yaklaşık) tablosu için veriler indiriliyor
/*!40000 ALTER TABLE `saglik` DISABLE KEYS */;
INSERT INTO `saglik` (`firmaAdi`, `firmaSektor`, `firmaNo`, `isciSayisi`, `cinsiyet`, `isciAdi`, `isciSoyadi`, `isciTelNo`, `isciKullaniciAdi`, `isciSifre`) VALUES
	('SağlıkFirma', 'Sağlık', 5553332211, 3, 'Kadın', 's', 'd', 5443332211, 'SaglikDeneme', 123);
/*!40000 ALTER TABLE `saglik` ENABLE KEYS */;

-- tablo yapısı dökülüyor odev.turizm
CREATE TABLE IF NOT EXISTS `turizm` (
  `firmaAdi` varchar(50) DEFAULT NULL,
  `firmaSektor` varchar(50) DEFAULT NULL,
  `firmaNo` bigint(20) DEFAULT NULL,
  `isciSayisi` bigint(20) DEFAULT NULL,
  `cinsiyet` varchar(50) DEFAULT NULL,
  `isciAdi` varchar(50) DEFAULT NULL,
  `isciSoyadi` varchar(50) DEFAULT NULL,
  `isciTelNo` bigint(20) DEFAULT NULL,
  `isciKullaniciAdi` varchar(50) DEFAULT NULL,
  `isciSifre` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- odev.turizm: ~1 rows (yaklaşık) tablosu için veriler indiriliyor
/*!40000 ALTER TABLE `turizm` DISABLE KEYS */;
INSERT INTO `turizm` (`firmaAdi`, `firmaSektor`, `firmaNo`, `isciSayisi`, `cinsiyet`, `isciAdi`, `isciSoyadi`, `isciTelNo`, `isciKullaniciAdi`, `isciSifre`) VALUES
	('TurizmFirma', 'Turizm', 5553332211, 3, 'Erkek', 't', 'd', 5443332211, 'TurizmDeneme', 123);
/*!40000 ALTER TABLE `turizm` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
