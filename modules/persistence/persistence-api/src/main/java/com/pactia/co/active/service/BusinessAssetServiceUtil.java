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

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the remote service utility for BusinessAsset. This utility wraps
 * <code>com.pactia.co.active.service.impl.BusinessAssetServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see BusinessAssetService
 * @generated
 */
public class BusinessAssetServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.pactia.co.active.service.impl.BusinessAssetServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.pactia.co.active.model.BusinessAsset addAsset(
			long groupId, String assetCode, String cityId, String assetName,
			String assetAddress, double squareMeterValue,
			com.liferay.portal.kernel.service.ServiceContext serviceContext,
			java.util.Map<java.util.Locale, String> description)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().addAsset(
			groupId, assetCode, cityId, assetName, assetAddress,
			squareMeterValue, serviceContext, description);
	}

	public static java.util.List<com.pactia.co.active.model.BusinessAsset>
		findAll() {

		return getService().findAll();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static BusinessAssetService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<BusinessAssetService, BusinessAssetService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(BusinessAssetService.class);

		ServiceTracker<BusinessAssetService, BusinessAssetService>
			serviceTracker =
				new ServiceTracker<BusinessAssetService, BusinessAssetService>(
					bundle.getBundleContext(), BusinessAssetService.class,
					null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}