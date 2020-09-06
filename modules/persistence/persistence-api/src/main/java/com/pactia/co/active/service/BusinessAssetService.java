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

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.kernel.security.access.control.AccessControlled;
import com.liferay.portal.kernel.service.BaseService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.pactia.co.active.model.BusinessAsset;
import org.osgi.annotation.versioning.ProviderType;

import java.util.List;
import java.util.Locale;
import java.util.Map;

/**
 * Provides the remote service interface for BusinessAsset. Methods of this
 * service are expected to have security checks based on the propagated JAAS
 * credentials because this service can be accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see BusinessAssetServiceUtil
 * @generated
 */
@AccessControlled
@JSONWebService
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface BusinessAssetService extends BaseService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link BusinessAssetServiceUtil} to access the business asset remote service. Add custom service methods to <code>com.pactia.co.active.service.impl.BusinessAssetServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public BusinessAsset addAsset(
			long groupId, String assetCode, String cityId, String assetName,
			String assetAddress, double squareMeterValue,
			ServiceContext serviceContext, Map<Locale, String> description)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public BusinessAsset fetchBusinessAsset(long businessAssetId);

	public List<BusinessAsset> findAll();

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public String getOSGiServiceIdentifier();

	public BusinessAsset updateBusiness(
			long businessAssetId, long groupId, String assetCode, String cityId,
			String assetName, String assetAddress, double squareMeterValue,
			ServiceContext serviceContext, Map<Locale, String> description)
		throws PortalException;

}