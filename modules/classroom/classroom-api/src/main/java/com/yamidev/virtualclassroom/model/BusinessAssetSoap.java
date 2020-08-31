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

package com.yamidev.virtualclassroom.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.yamidev.virtualclassroom.service.http.BusinessAssetServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class BusinessAssetSoap implements Serializable {

	public static BusinessAssetSoap toSoapModel(BusinessAsset model) {
		BusinessAssetSoap soapModel = new BusinessAssetSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setBusinessAssetId(model.getBusinessAssetId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setAssetCode(model.getAssetCode());
		soapModel.setAssetName(model.getAssetName());
		soapModel.setAssetAddress(model.getAssetAddress());
		soapModel.setSquareMeterValue(model.getSquareMeterValue());
		soapModel.setInternalCode(model.getInternalCode());
		soapModel.setMarkerMap(model.getMarkerMap());
		soapModel.setDescription(model.getDescription());
		soapModel.setLogo(model.getLogo());
		soapModel.setLatitude(model.getLatitude());
		soapModel.setLongitude(model.getLongitude());
		soapModel.setCityId(model.getCityId());

		return soapModel;
	}

	public static BusinessAssetSoap[] toSoapModels(BusinessAsset[] models) {
		BusinessAssetSoap[] soapModels = new BusinessAssetSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static BusinessAssetSoap[][] toSoapModels(BusinessAsset[][] models) {
		BusinessAssetSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new BusinessAssetSoap[models.length][models[0].length];
		}
		else {
			soapModels = new BusinessAssetSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static BusinessAssetSoap[] toSoapModels(List<BusinessAsset> models) {
		List<BusinessAssetSoap> soapModels = new ArrayList<BusinessAssetSoap>(
			models.size());

		for (BusinessAsset model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new BusinessAssetSoap[soapModels.size()]);
	}

	public BusinessAssetSoap() {
	}

	public long getPrimaryKey() {
		return _businessAssetId;
	}

	public void setPrimaryKey(long pk) {
		setBusinessAssetId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getBusinessAssetId() {
		return _businessAssetId;
	}

	public void setBusinessAssetId(long businessAssetId) {
		_businessAssetId = businessAssetId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getAssetCode() {
		return _assetCode;
	}

	public void setAssetCode(String assetCode) {
		_assetCode = assetCode;
	}

	public String getAssetName() {
		return _assetName;
	}

	public void setAssetName(String assetName) {
		_assetName = assetName;
	}

	public String getAssetAddress() {
		return _assetAddress;
	}

	public void setAssetAddress(String assetAddress) {
		_assetAddress = assetAddress;
	}

	public double getSquareMeterValue() {
		return _squareMeterValue;
	}

	public void setSquareMeterValue(double squareMeterValue) {
		_squareMeterValue = squareMeterValue;
	}

	public String getInternalCode() {
		return _internalCode;
	}

	public void setInternalCode(String internalCode) {
		_internalCode = internalCode;
	}

	public long getMarkerMap() {
		return _markerMap;
	}

	public void setMarkerMap(long markerMap) {
		_markerMap = markerMap;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public long getLogo() {
		return _logo;
	}

	public void setLogo(long logo) {
		_logo = logo;
	}

	public double getLatitude() {
		return _latitude;
	}

	public void setLatitude(double latitude) {
		_latitude = latitude;
	}

	public double getLongitude() {
		return _longitude;
	}

	public void setLongitude(double longitude) {
		_longitude = longitude;
	}

	public String getCityId() {
		return _cityId;
	}

	public void setCityId(String cityId) {
		_cityId = cityId;
	}

	private String _uuid;
	private long _businessAssetId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _assetCode;
	private String _assetName;
	private String _assetAddress;
	private double _squareMeterValue;
	private String _internalCode;
	private long _markerMap;
	private String _description;
	private long _logo;
	private double _latitude;
	private double _longitude;
	private String _cityId;

}