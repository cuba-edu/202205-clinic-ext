-- begin CLINIC_VISIT
alter table CLINIC_VISIT add column URGENT boolean ^
update CLINIC_VISIT set URGENT = false where URGENT is null ^
alter table CLINIC_VISIT alter column URGENT set not null ^
alter table CLINIC_VISIT add column DTYPE varchar(31) ^
update CLINIC_VISIT set DTYPE = 'ext_VisitExt' where DTYPE is null ^
-- end CLINIC_VISIT
