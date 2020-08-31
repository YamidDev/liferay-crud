create table ps_business_asset (
	uuid_ VARCHAR(75) null,
	businessAssetId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	assetCode VARCHAR(75) null,
	assetName VARCHAR(75) null,
	assetAddress VARCHAR(75) null,
	squareMeterValue DOUBLE,
	internalCode VARCHAR(75) null,
	markerMap LONG,
	description STRING null,
	logo LONG,
	latitude DOUBLE,
	longitude DOUBLE,
	cityId VARCHAR(75) null
);

create table vc_Course (
	courseId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name STRING null,
	description VARCHAR(75) null
);

create table vc_CourseSession (
	courseSessionId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	title VARCHAR(75) null,
	description VARCHAR(75) null,
	dueDate DATE null,
	courseId LONG
);