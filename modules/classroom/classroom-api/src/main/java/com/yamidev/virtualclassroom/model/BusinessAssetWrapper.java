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

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link BusinessAsset}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BusinessAsset
 * @generated
 */
public class BusinessAssetWrapper
	extends BaseModelWrapper<BusinessAsset>
	implements BusinessAsset, ModelWrapper<BusinessAsset> {

	public BusinessAssetWrapper(BusinessAsset businessAsset) {
		super(businessAsset);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("businessAssetId", getBusinessAssetId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("assetCode", getAssetCode());
		attributes.put("assetName", getAssetName());
		attributes.put("assetAddress", getAssetAddress());
		attributes.put("squareMeterValue", getSquareMeterValue());
		attributes.put("internalCode", getInternalCode());
		attributes.put("markerMap", getMarkerMap());
		attributes.put("description", getDescription());
		attributes.put("logo", getLogo());
		attributes.put("latitude", getLatitude());
		attributes.put("longitude", getLongitude());
		attributes.put("cityId", getCityId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long businessAssetId = (Long)attributes.get("businessAssetId");

		if (businessAssetId != null) {
			setBusinessAssetId(businessAssetId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String assetCode = (String)attributes.get("assetCode");

		if (assetCode != null) {
			setAssetCode(assetCode);
		}

		String assetName = (String)attributes.get("assetName");

		if (assetName != null) {
			setAssetName(assetName);
		}

		String assetAddress = (String)attributes.get("assetAddress");

		if (assetAddress != null) {
			setAssetAddress(assetAddress);
		}

		Double squareMeterValue = (Double)attributes.get("squareMeterValue");

		if (squareMeterValue != null) {
			setSquareMeterValue(squareMeterValue);
		}

		String internalCode = (String)attributes.get("internalCode");

		if (internalCode != null) {
			setInternalCode(internalCode);
		}

		Long markerMap = (Long)attributes.get("markerMap");

		if (markerMap != null) {
			setMarkerMap(markerMap);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Long logo = (Long)attributes.get("logo");

		if (logo != null) {
			setLogo(logo);
		}

		Double latitude = (Double)attributes.get("latitude");

		if (latitude != null) {
			setLatitude(latitude);
		}

		Double longitude = (Double)attributes.get("longitude");

		if (longitude != null) {
			setLongitude(longitude);
		}

		String cityId = (String)attributes.get("cityId");

		if (cityId != null) {
			setCityId(cityId);
		}
	}

	/**
	 * Returns the asset address of this Activos del negocio.
	 *
	 * @return the asset address of this Activos del negocio
	 */
	@Override
	public String getAssetAddress() {
		return model.getAssetAddress();
	}

	/**
	 * Returns the asset code of this Activos del negocio.
	 *
	 * @return the asset code of this Activos del negocio
	 */
	@Override
	public String getAssetCode() {
		return model.getAssetCode();
	}

	/**
	 * Returns the asset name of this Activos del negocio.
	 *
	 * @return the asset name of this Activos del negocio
	 */
	@Override
	public String getAssetName() {
		return model.getAssetName();
	}

	@Override
	public String[] getAvailableLanguageIds() {
		return model.getAvailableLanguageIds();
	}

	/**
	 * Returns the business asset ID of this Activos del negocio.
	 *
	 * @return the business asset ID of this Activos del negocio
	 */
	@Override
	public long getBusinessAssetId() {
		return model.getBusinessAssetId();
	}

	/**
	 * Returns the city ID of this Activos del negocio.
	 *
	 * @return the city ID of this Activos del negocio
	 */
	@Override
	public String getCityId() {
		return model.getCityId();
	}

	/**
	 * Returns the company ID of this Activos del negocio.
	 *
	 * @return the company ID of this Activos del negocio
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this Activos del negocio.
	 *
	 * @return the create date of this Activos del negocio
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	@Override
	public String getDefaultLanguageId() {
		return model.getDefaultLanguageId();
	}

	/**
	 * Returns the description of this Activos del negocio.
	 *
	 * @return the description of this Activos del negocio
	 */
	@Override
	public String getDescription() {
		return model.getDescription();
	}

	/**
	 * Returns the localized description of this Activos del negocio in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param locale the locale of the language
	 * @return the localized description of this Activos del negocio
	 */
	@Override
	public String getDescription(java.util.Locale locale) {
		return model.getDescription(locale);
	}

	/**
	 * Returns the localized description of this Activos del negocio in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param locale the local of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized description of this Activos del negocio. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	 */
	@Override
	public String getDescription(java.util.Locale locale, boolean useDefault) {
		return model.getDescription(locale, useDefault);
	}

	/**
	 * Returns the localized description of this Activos del negocio in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @return the localized description of this Activos del negocio
	 */
	@Override
	public String getDescription(String languageId) {
		return model.getDescription(languageId);
	}

	/**
	 * Returns the localized description of this Activos del negocio in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized description of this Activos del negocio
	 */
	@Override
	public String getDescription(String languageId, boolean useDefault) {
		return model.getDescription(languageId, useDefault);
	}

	@Override
	public String getDescriptionCurrentLanguageId() {
		return model.getDescriptionCurrentLanguageId();
	}

	@Override
	public String getDescriptionCurrentValue() {
		return model.getDescriptionCurrentValue();
	}

	/**
	 * Returns a map of the locales and localized descriptions of this Activos del negocio.
	 *
	 * @return the locales and localized descriptions of this Activos del negocio
	 */
	@Override
	public Map<java.util.Locale, String> getDescriptionMap() {
		return model.getDescriptionMap();
	}

	/**
	 * Returns the group ID of this Activos del negocio.
	 *
	 * @return the group ID of this Activos del negocio
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the internal code of this Activos del negocio.
	 *
	 * @return the internal code of this Activos del negocio
	 */
	@Override
	public String getInternalCode() {
		return model.getInternalCode();
	}

	/**
	 * Returns the latitude of this Activos del negocio.
	 *
	 * @return the latitude of this Activos del negocio
	 */
	@Override
	public double getLatitude() {
		return model.getLatitude();
	}

	/**
	 * Returns the logo of this Activos del negocio.
	 *
	 * @return the logo of this Activos del negocio
	 */
	@Override
	public long getLogo() {
		return model.getLogo();
	}

	/**
	 * Returns the longitude of this Activos del negocio.
	 *
	 * @return the longitude of this Activos del negocio
	 */
	@Override
	public double getLongitude() {
		return model.getLongitude();
	}

	/**
	 * Returns the marker map of this Activos del negocio.
	 *
	 * @return the marker map of this Activos del negocio
	 */
	@Override
	public long getMarkerMap() {
		return model.getMarkerMap();
	}

	/**
	 * Returns the modified date of this Activos del negocio.
	 *
	 * @return the modified date of this Activos del negocio
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this Activos del negocio.
	 *
	 * @return the primary key of this Activos del negocio
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the square meter value of this Activos del negocio.
	 *
	 * @return the square meter value of this Activos del negocio
	 */
	@Override
	public double getSquareMeterValue() {
		return model.getSquareMeterValue();
	}

	/**
	 * Returns the user ID of this Activos del negocio.
	 *
	 * @return the user ID of this Activos del negocio
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this Activos del negocio.
	 *
	 * @return the user name of this Activos del negocio
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this Activos del negocio.
	 *
	 * @return the user uuid of this Activos del negocio
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this Activos del negocio.
	 *
	 * @return the uuid of this Activos del negocio
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	@Override
	public void prepareLocalizedFieldsForImport()
		throws com.liferay.portal.kernel.exception.LocaleException {

		model.prepareLocalizedFieldsForImport();
	}

	@Override
	public void prepareLocalizedFieldsForImport(
			java.util.Locale defaultImportLocale)
		throws com.liferay.portal.kernel.exception.LocaleException {

		model.prepareLocalizedFieldsForImport(defaultImportLocale);
	}

	/**
	 * Sets the asset address of this Activos del negocio.
	 *
	 * @param assetAddress the asset address of this Activos del negocio
	 */
	@Override
	public void setAssetAddress(String assetAddress) {
		model.setAssetAddress(assetAddress);
	}

	/**
	 * Sets the asset code of this Activos del negocio.
	 *
	 * @param assetCode the asset code of this Activos del negocio
	 */
	@Override
	public void setAssetCode(String assetCode) {
		model.setAssetCode(assetCode);
	}

	/**
	 * Sets the asset name of this Activos del negocio.
	 *
	 * @param assetName the asset name of this Activos del negocio
	 */
	@Override
	public void setAssetName(String assetName) {
		model.setAssetName(assetName);
	}

	/**
	 * Sets the business asset ID of this Activos del negocio.
	 *
	 * @param businessAssetId the business asset ID of this Activos del negocio
	 */
	@Override
	public void setBusinessAssetId(long businessAssetId) {
		model.setBusinessAssetId(businessAssetId);
	}

	/**
	 * Sets the city ID of this Activos del negocio.
	 *
	 * @param cityId the city ID of this Activos del negocio
	 */
	@Override
	public void setCityId(String cityId) {
		model.setCityId(cityId);
	}

	/**
	 * Sets the company ID of this Activos del negocio.
	 *
	 * @param companyId the company ID of this Activos del negocio
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this Activos del negocio.
	 *
	 * @param createDate the create date of this Activos del negocio
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the description of this Activos del negocio.
	 *
	 * @param description the description of this Activos del negocio
	 */
	@Override
	public void setDescription(String description) {
		model.setDescription(description);
	}

	/**
	 * Sets the localized description of this Activos del negocio in the language.
	 *
	 * @param description the localized description of this Activos del negocio
	 * @param locale the locale of the language
	 */
	@Override
	public void setDescription(String description, java.util.Locale locale) {
		model.setDescription(description, locale);
	}

	/**
	 * Sets the localized description of this Activos del negocio in the language, and sets the default locale.
	 *
	 * @param description the localized description of this Activos del negocio
	 * @param locale the locale of the language
	 * @param defaultLocale the default locale
	 */
	@Override
	public void setDescription(
		String description, java.util.Locale locale,
		java.util.Locale defaultLocale) {

		model.setDescription(description, locale, defaultLocale);
	}

	@Override
	public void setDescriptionCurrentLanguageId(String languageId) {
		model.setDescriptionCurrentLanguageId(languageId);
	}

	/**
	 * Sets the localized descriptions of this Activos del negocio from the map of locales and localized descriptions.
	 *
	 * @param descriptionMap the locales and localized descriptions of this Activos del negocio
	 */
	@Override
	public void setDescriptionMap(
		Map<java.util.Locale, String> descriptionMap) {

		model.setDescriptionMap(descriptionMap);
	}

	/**
	 * Sets the localized descriptions of this Activos del negocio from the map of locales and localized descriptions, and sets the default locale.
	 *
	 * @param descriptionMap the locales and localized descriptions of this Activos del negocio
	 * @param defaultLocale the default locale
	 */
	@Override
	public void setDescriptionMap(
		Map<java.util.Locale, String> descriptionMap,
		java.util.Locale defaultLocale) {

		model.setDescriptionMap(descriptionMap, defaultLocale);
	}

	/**
	 * Sets the group ID of this Activos del negocio.
	 *
	 * @param groupId the group ID of this Activos del negocio
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the internal code of this Activos del negocio.
	 *
	 * @param internalCode the internal code of this Activos del negocio
	 */
	@Override
	public void setInternalCode(String internalCode) {
		model.setInternalCode(internalCode);
	}

	/**
	 * Sets the latitude of this Activos del negocio.
	 *
	 * @param latitude the latitude of this Activos del negocio
	 */
	@Override
	public void setLatitude(double latitude) {
		model.setLatitude(latitude);
	}

	/**
	 * Sets the logo of this Activos del negocio.
	 *
	 * @param logo the logo of this Activos del negocio
	 */
	@Override
	public void setLogo(long logo) {
		model.setLogo(logo);
	}

	/**
	 * Sets the longitude of this Activos del negocio.
	 *
	 * @param longitude the longitude of this Activos del negocio
	 */
	@Override
	public void setLongitude(double longitude) {
		model.setLongitude(longitude);
	}

	/**
	 * Sets the marker map of this Activos del negocio.
	 *
	 * @param markerMap the marker map of this Activos del negocio
	 */
	@Override
	public void setMarkerMap(long markerMap) {
		model.setMarkerMap(markerMap);
	}

	/**
	 * Sets the modified date of this Activos del negocio.
	 *
	 * @param modifiedDate the modified date of this Activos del negocio
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this Activos del negocio.
	 *
	 * @param primaryKey the primary key of this Activos del negocio
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the square meter value of this Activos del negocio.
	 *
	 * @param squareMeterValue the square meter value of this Activos del negocio
	 */
	@Override
	public void setSquareMeterValue(double squareMeterValue) {
		model.setSquareMeterValue(squareMeterValue);
	}

	/**
	 * Sets the user ID of this Activos del negocio.
	 *
	 * @param userId the user ID of this Activos del negocio
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this Activos del negocio.
	 *
	 * @param userName the user name of this Activos del negocio
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this Activos del negocio.
	 *
	 * @param userUuid the user uuid of this Activos del negocio
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this Activos del negocio.
	 *
	 * @param uuid the uuid of this Activos del negocio
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected BusinessAssetWrapper wrap(BusinessAsset businessAsset) {
		return new BusinessAssetWrapper(businessAsset);
	}

}