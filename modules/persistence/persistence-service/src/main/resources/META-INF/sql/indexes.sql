create index IX_BD60F8B3 on ps_BusinessAsset (assetCode[$COLUMN_LENGTH:75$]);
create index IX_C5921570 on ps_BusinessAsset (groupId);
create index IX_7E493876 on ps_BusinessAsset (userId, groupId);
create index IX_626F5FEE on ps_BusinessAsset (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_128B09F0 on ps_BusinessAsset (uuid_[$COLUMN_LENGTH:75$], groupId);