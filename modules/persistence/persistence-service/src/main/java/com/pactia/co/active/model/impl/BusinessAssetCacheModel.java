/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.pactia.co.active.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.pactia.co.active.model.BusinessAsset;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing BusinessAsset in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class BusinessAssetCacheModel
	implements CacheModel<BusinessAsset>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof BusinessAssetCacheModel)) {
			return false;
		}

		BusinessAssetCacheModel businessAssetCacheModel =
			(BusinessAssetCacheModel)obj;

		if (businessAssetId == businessAssetCacheModel.businessAssetId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, businessAssetId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(39);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", businessAssetId=");
		sb.append(businessAssetId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", assetCode=");
		sb.append(assetCode);
		sb.append(", assetName=");
		sb.append(assetName);
		sb.append(", assetAddress=");
		sb.append(assetAddress);
		sb.append(", squareMeterValue=");
		sb.append(squareMeterValue);
		sb.append(", internalCode=");
		sb.append(internalCode);
		sb.append(", markerMap=");
		sb.append(markerMap);
		sb.append(", description=");
		sb.append(description);
		sb.append(", logo=");
		sb.append(logo);
		sb.append(", latitude=");
		sb.append(latitude);
		sb.append(", longitude=");
		sb.append(longitude);
		sb.append(", cityId=");
		sb.append(cityId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public BusinessAsset toEntityModel() {
		BusinessAssetImpl businessAssetImpl = new BusinessAssetImpl();

		if (uuid == null) {
			businessAssetImpl.setUuid("");
		}
		else {
			businessAssetImpl.setUuid(uuid);
		}

		businessAssetImpl.setBusinessAssetId(businessAssetId);
		businessAssetImpl.setGroupId(groupId);
		businessAssetImpl.setCompanyId(companyId);
		businessAssetImpl.setUserId(userId);

		if (userName == null) {
			businessAssetImpl.setUserName("");
		}
		else {
			businessAssetImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			businessAssetImpl.setCreateDate(null);
		}
		else {
			businessAssetImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			businessAssetImpl.setModifiedDate(null);
		}
		else {
			businessAssetImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (assetCode == null) {
			businessAssetImpl.setAssetCode("");
		}
		else {
			businessAssetImpl.setAssetCode(assetCode);
		}

		if (assetName == null) {
			businessAssetImpl.setAssetName("");
		}
		else {
			businessAssetImpl.setAssetName(assetName);
		}

		if (assetAddress == null) {
			businessAssetImpl.setAssetAddress("");
		}
		else {
			businessAssetImpl.setAssetAddress(assetAddress);
		}

		businessAssetImpl.setSquareMeterValue(squareMeterValue);

		if (internalCode == null) {
			businessAssetImpl.setInternalCode("");
		}
		else {
			businessAssetImpl.setInternalCode(internalCode);
		}

		businessAssetImpl.setMarkerMap(markerMap);

		if (description == null) {
			businessAssetImpl.setDescription("");
		}
		else {
			businessAssetImpl.setDescription(description);
		}

		businessAssetImpl.setLogo(logo);
		businessAssetImpl.setLatitude(latitude);
		businessAssetImpl.setLongitude(longitude);

		if (cityId == null) {
			businessAssetImpl.setCityId("");
		}
		else {
			businessAssetImpl.setCityId(cityId);
		}

		businessAssetImpl.resetOriginalValues();

		return businessAssetImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		businessAssetId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		assetCode = objectInput.readUTF();
		assetName = objectInput.readUTF();
		assetAddress = objectInput.readUTF();

		squareMeterValue = objectInput.readDouble();
		internalCode = objectInput.readUTF();

		markerMap = objectInput.readLong();
		description = objectInput.readUTF();

		logo = objectInput.readLong();

		latitude = objectInput.readDouble();

		longitude = objectInput.readDouble();
		cityId = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(businessAssetId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (assetCode == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(assetCode);
		}

		if (assetName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(assetName);
		}

		if (assetAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(assetAddress);
		}

		objectOutput.writeDouble(squareMeterValue);

		if (internalCode == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(internalCode);
		}

		objectOutput.writeLong(markerMap);

		if (description == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(description);
		}

		objectOutput.writeLong(logo);

		objectOutput.writeDouble(latitude);

		objectOutput.writeDouble(longitude);

		if (cityId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(cityId);
		}
	}

	public String uuid;
	public long businessAssetId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String assetCode;
	public String assetName;
	public String assetAddress;
	public double squareMeterValue;
	public String internalCode;
	public long markerMap;
	public String description;
	public long logo;
	public double latitude;
	public double longitude;
	public String cityId;

}