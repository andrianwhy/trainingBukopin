--create database
Create Database bukopin

--create table
create table Pegawai(
	id_Pegawai integer primary key,
	umur integer,
	nama_pegawai text
)

create table absen(
	id_absen integer primary key,
	tgl_absen date,
	jam_masuk TIMESTAMP,
	jam_pulang TIMESTAMP	
)

create table film(
	kd_film text primary key,
	nm_film text,
	genre text,
	artis text,
	produser text,
	pendapatan int,
	nominasi int
)

--insert data
insert into Pegawai(id_pegawai,umur,nama_pegawai)
VALUES(1,25,'Tomas')

insert into Pegawai(id_pegawai,umur,nama_pegawai)
VALUES(2,22,'Willy')

insert into pegawai(id_pegawai)
values(3)

update pegawai set umur = 24, nama_pegawai =  'Rambo_d' where id_pegawai = 3

SELECT * from Pegawai

INSERT INTO public.film VALUES ('F001', 'IRON MAN', 'G001', 'A001', 'PD01', 2000000000, 3);
INSERT INTO public.film VALUES ('F002', 'IRON MAN 2', 'G001', 'A001', 'PD01', 1800000000, 2);
INSERT INTO public.film VALUES ('F003', 'IRON MAN 3', 'G001', 'A001', 'PD01', 1200000000, 0);
INSERT INTO public.film VALUES ('F004', 'AVENGER:CIVIL WAR', 'G001', 'A001', 'PD01', 2000000000, 1);
INSERT INTO public.film VALUES ('F005', 'SPIDERMAN HOMCOMING', 'G001', 'A001', 'PD01', 1300000000, 0);
INSERT INTO public.film VALUES ('F006', 'THE RAID', 'G001', 'A004', 'PD03', 800000000, 5);
INSERT INTO public.film VALUES ('F007', 'FAST & FURIOUS', 'G001', 'A004', 'PD05', 830000000, 2);
INSERT INTO public.film VALUES ('F008', 'HABIBI DAN AINUN', 'G004', 'A005', 'PD03', 670000000, 4);
INSERT INTO public.film VALUES ('F009', 'POLICE STORY', 'G001', 'A003', 'PD02', 700000000, 3);
INSERT INTO public.film VALUES ('F010', 'POLICE STORY 2', 'G001', 'A003', 'PD02', 710000000, 1);
INSERT INTO public.film VALUES ('F011', 'POLICE STORY 3', 'G001', 'A003', 'PD02', 615000000, 0);
INSERT INTO public.film VALUES ('F012', 'RUSH HOUR', 'G003', 'A003', 'PD05', 695000000, 2);
INSERT INTO public.film VALUES ('F013', 'KUNGFU PANDA', 'G003', 'A003', 'PD05', 923000000, 5);

Select * from film

select 1000+100

select * from pegawai

--agregate
select avg(umur) from pegawai
select floor(avg(umur)) from pegawai
select round(avg(umur)) from pegawai

select sum(umur) from pegawai
select max(umur) from pegawai


--latihan
select * from film

select nm_film, nominasi from film  order by nominasi desc
select nm_film, pendapatan from film order by pendapatan asc
select nm_film, nominasi from film where nominasi = 0

select nm_film, nominasi from film where nominasi = (select max(nominasi) from film) 
select nm_film, pendapatan from film where pendapatan = (select min(pendapatan) from film)
select nm_film, pendapatan from film where pendapatan = (select max(pendapatan) from film)

select nm_film from film where nm_film like 'P%'
select nm_film from film where nm_film like '%H'
select nm_film from film where nm_film like '%O%' and pendapatan = (select min(f.pendapatan) from film f)
select nm_film from film where nm_film like '%O%' and pendapatan = (select max(f.pendapatan) from film f)
