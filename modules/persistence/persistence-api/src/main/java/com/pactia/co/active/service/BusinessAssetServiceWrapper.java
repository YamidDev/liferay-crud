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

package com.pactia.co.active.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link BusinessAssetService}.
 *
 * @author Brian Wing Shun Chan
 * @see BusinessAssetService
 * @generated
 */
public class BusinessAssetServiceWrapper
	implements BusinessAssetService, ServiceWrapper<BusinessAssetService> {

	public BusinessAssetServiceWrapper(
		BusinessAssetService businessAssetService) {

		_businessAssetService = businessAssetService;
	}

	@Override
	public com.pactia.co.active.model.BusinessAsset addAsset(
			long groupId, String assetCode, String cityId, String assetName,
			String assetAddress, double squareMeterValue,
			com.liferay.portal.kernel.service.ServiceContext serviceContext,
			java.util.Map<java.util.Locale, String> description)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _businessAssetService.addAsset(
			groupId, assetCode, cityId, assetName, assetAddress,
			squareMeterValue, serviceContext, description);
	}

	@Override
	public com.pactia.co.active.model.BusinessAsset fetchBusinessAsset(
		long businessAssetId) {

		return _businessAssetService.fetchBusinessAsset(businessAssetId);
	}

	@Override
	public java.util.List<com.pactia.co.active.model.BusinessAsset> findAll() {
		return _businessAssetService.findAll();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _businessAssetService.getOSGiServiceIdentifier();
	}

	@Override
	public com.pactia.co.active.model.BusinessAsset updateBusiness(
			long businessAssetId, long groupId, String assetCode, String cityId,
			String assetName, String assetAddress, double squareMeterValue,
			com.liferay.portal.kernel.service.ServiceContext serviceContext,
			java.util.Map<java.util.Locale, String> description)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _businessAssetService.updateBusiness(
			businessAssetId, groupId, assetCode, cityId, assetName,
			assetAddress, squareMeterValue, serviceContext, description);
	}

	@Override
	public BusinessAssetService getWrappedService() {
		return _businessAssetService;
	}

	@Override
	public void setWrappedService(BusinessAssetService businessAssetService) {
		_businessAssetService = businessAssetService;
	}

	private BusinessAssetService _businessAssetService;

}