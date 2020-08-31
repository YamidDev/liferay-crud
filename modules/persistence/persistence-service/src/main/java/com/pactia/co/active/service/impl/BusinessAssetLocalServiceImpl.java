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
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.pactia.co.active.model.BusinessAsset;
import com.pactia.co.active.service.base.BusinessAssetLocalServiceBaseImpl;
import org.osgi.service.component.annotations.Component;

import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;

@Component(
	property = "model.class.name=com.pactia.co.active.model.BusinessAsset",
	service = AopService.class
)
public class BusinessAssetLocalServiceImpl extends BusinessAssetLocalServiceBaseImpl {

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
		long businessAssetId = counterLocalService.increment(BusinessAsset.class.getName());
		BusinessAsset businessAsset = super.createBusinessAsset(businessAssetId);
		businessAsset.setGroupId(groupId);
		businessAsset.setUserId(serviceContext.getUserId());
		businessAsset.setCityId(cityId);
		businessAsset.setCreateDate(serviceContext.getCreateDate(new Date()));
		businessAsset.setAssetName(assetName);
		businessAsset.setAssetAddress(assetAddress);
		businessAsset.setSquareMeterValue(squareMeterValue);
		businessAsset.setDescriptionMap(description);
		User user  = userLocalService.getUser(serviceContext.getUserId());
		businessAsset.setAssetCode(assetCode);
		return super.addBusinessAsset(businessAsset);
	}

	public List<BusinessAsset> findAll(){
		return businessAssetPersistence.findAll();
	}
}