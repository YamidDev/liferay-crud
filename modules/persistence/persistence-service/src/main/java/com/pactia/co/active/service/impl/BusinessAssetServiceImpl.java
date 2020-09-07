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

package com.pactia.co.active.service.impl;

import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.service.ServiceContext;
import com.pactia.co.active.model.BusinessAsset;
import com.pactia.co.active.service.base.BusinessAssetServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

import java.util.List;
import java.util.Locale;
import java.util.Map;

/**
 * The implementation of the business asset remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.pactia.co.active.service.BusinessAssetService</code> interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BusinessAssetServiceBaseImpl
 */
@Component(
	property = {
		"json.web.service.context.name=ps",
		"json.web.service.context.path=BusinessAsset"
	},
	service = AopService.class
)
public class BusinessAssetServiceImpl extends BusinessAssetServiceBaseImpl {

	public BusinessAsset addAsset(
			long groupId,
			String assetCode,
			String cityId,
			String assetName,
			String assetAddress,
			double squareMeterValue,
			ServiceContext serviceContext,
			Map<Locale, String> description
	) throws PortalException {
		return businessAssetLocalService.addAsset(groupId, assetCode, cityId, assetName, assetAddress,
				squareMeterValue, serviceContext, description);
	}

	public BusinessAsset updateBusiness(
			long businessAssetId,
			long groupId,
			String assetCode,
			String cityId,
			String assetName,
			String assetAddress,
			double squareMeterValue,
			ServiceContext serviceContext,
			Map<Locale, String> description
	) throws PortalException{
		return businessAssetLocalService.updateBusiness(
				businessAssetId, groupId,assetCode, cityId,
				assetName, assetAddress, squareMeterValue, serviceContext, description);
	}

	public BusinessAsset fetchBusinessAsset(long businessAssetId) {
		return businessAssetLocalService.fetchBusinessAsset(businessAssetId);
	}

	public List<BusinessAsset> findAll(){
		return businessAssetLocalService.findAll();
	}
}