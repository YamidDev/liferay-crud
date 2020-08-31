create index IX_C7E4379A on ps_business_asset (assetCode[$COLUMN_LENGTH:75$]);
create index IX_D1D5E217 on ps_business_asset (groupId);
create index IX_5399DF27 on ps_business_asset (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_788E0369 on ps_business_asset (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_6DF7A777 on vc_Course (groupId);
create index IX_6DBD37D on vc_Course (userId, groupId);

create index IX_74EB8E99 on vc_CourseSession (courseId);