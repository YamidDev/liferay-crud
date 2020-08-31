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

package com.yamidev.virtualclassroom.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.yamidev.virtualclassroom.exception.NoSuchBusinessAssetException;
import com.yamidev.virtualclassroom.model.BusinessAsset;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the Activos del negocio service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BusinessAssetUtil
 * @generated
 */
@ProviderType
public interface BusinessAssetPersistence
	extends BasePersistence<BusinessAsset> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link BusinessAssetUtil} to access the Activos del negocio persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the Activos del negocios where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching Activos del negocios
	 */
	public java.util.List<BusinessAsset> findByUuid(String uuid);

	/**
	 * Returns a range of all the Activos del negocios where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BusinessAssetModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of Activos del negocios
	 * @param end the upper bound of the range of Activos del negocios (not inclusive)
	 * @return the range of matching Activos del negocios
	 */
	public java.util.List<BusinessAsset> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the Activos del negocios where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BusinessAssetModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of Activos del negocios
	 * @param end the upper bound of the range of Activos del negocios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching Activos del negocios
	 */
	public java.util.List<BusinessAsset> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BusinessAsset>
			orderByComparator);

	/**
	 * Returns an ordered range of all the Activos del negocios where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BusinessAssetModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of Activos del negocios
	 * @param end the upper bound of the range of Activos del negocios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching Activos del negocios
	 */
	public java.util.List<BusinessAsset> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BusinessAsset>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first Activos del negocio in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching Activos del negocio
	 * @throws NoSuchBusinessAssetException if a matching Activos del negocio could not be found
	 */
	public BusinessAsset findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<BusinessAsset>
				orderByComparator)
		throws NoSuchBusinessAssetException;

	/**
	 * Returns the first Activos del negocio in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching Activos del negocio, or <code>null</code> if a matching Activos del negocio could not be found
	 */
	public BusinessAsset fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<BusinessAsset>
			orderByComparator);

	/**
	 * Returns the last Activos del negocio in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching Activos del negocio
	 * @throws NoSuchBusinessAssetException if a matching Activos del negocio could not be found
	 */
	public BusinessAsset findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<BusinessAsset>
				orderByComparator)
		throws NoSuchBusinessAssetException;

	/**
	 * Returns the last Activos del negocio in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching Activos del negocio, or <code>null</code> if a matching Activos del negocio could not be found
	 */
	public BusinessAsset fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<BusinessAsset>
			orderByComparator);

	/**
	 * Returns the Activos del negocios before and after the current Activos del negocio in the ordered set where uuid = &#63;.
	 *
	 * @param businessAssetId the primary key of the current Activos del negocio
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next Activos del negocio
	 * @throws NoSuchBusinessAssetException if a Activos del negocio with the primary key could not be found
	 */
	public BusinessAsset[] findByUuid_PrevAndNext(
			long businessAssetId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<BusinessAsset>
				orderByComparator)
		throws NoSuchBusinessAssetException;

	/**
	 * Removes all the Activos del negocios where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of Activos del negocios where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching Activos del negocios
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the Activos del negocio where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchBusinessAssetException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching Activos del negocio
	 * @throws NoSuchBusinessAssetException if a matching Activos del negocio could not be found
	 */
	public BusinessAsset findByUUID_G(String uuid, long groupId)
		throws NoSuchBusinessAssetException;

	/**
	 * Returns the Activos del negocio where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching Activos del negocio, or <code>null</code> if a matching Activos del negocio could not be found
	 */
	public BusinessAsset fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the Activos del negocio where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching Activos del negocio, or <code>null</code> if a matching Activos del negocio could not be found
	 */
	public BusinessAsset fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the Activos del negocio where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the Activos del negocio that was removed
	 */
	public BusinessAsset removeByUUID_G(String uuid, long groupId)
		throws NoSuchBusinessAssetException;

	/**
	 * Returns the number of Activos del negocios where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching Activos del negocios
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the Activos del negocios where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching Activos del negocios
	 */
	public java.util.List<BusinessAsset> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the Activos del negocios where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BusinessAssetModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of Activos del negocios
	 * @param end the upper bound of the range of Activos del negocios (not inclusive)
	 * @return the range of matching Activos del negocios
	 */
	public java.util.List<BusinessAsset> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the Activos del negocios where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BusinessAssetModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of Activos del negocios
	 * @param end the upper bound of the range of Activos del negocios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching Activos del negocios
	 */
	public java.util.List<BusinessAsset> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BusinessAsset>
			orderByComparator);

	/**
	 * Returns an ordered range of all the Activos del negocios where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BusinessAssetModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of Activos del negocios
	 * @param end the upper bound of the range of Activos del negocios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching Activos del negocios
	 */
	public java.util.List<BusinessAsset> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BusinessAsset>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first Activos del negocio in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching Activos del negocio
	 * @throws NoSuchBusinessAssetException if a matching Activos del negocio could not be found
	 */
	public BusinessAsset findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<BusinessAsset>
				orderByComparator)
		throws NoSuchBusinessAssetException;

	/**
	 * Returns the first Activos del negocio in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching Activos del negocio, or <code>null</code> if a matching Activos del negocio could not be found
	 */
	public BusinessAsset fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<BusinessAsset>
			orderByComparator);

	/**
	 * Returns the last Activos del negocio in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching Activos del negocio
	 * @throws NoSuchBusinessAssetException if a matching Activos del negocio could not be found
	 */
	public BusinessAsset findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<BusinessAsset>
				orderByComparator)
		throws NoSuchBusinessAssetException;

	/**
	 * Returns the last Activos del negocio in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching Activos del negocio, or <code>null</code> if a matching Activos del negocio could not be found
	 */
	public BusinessAsset fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<BusinessAsset>
			orderByComparator);

	/**
	 * Returns the Activos del negocios before and after the current Activos del negocio in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param businessAssetId the primary key of the current Activos del negocio
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next Activos del negocio
	 * @throws NoSuchBusinessAssetException if a Activos del negocio with the primary key could not be found
	 */
	public BusinessAsset[] findByUuid_C_PrevAndNext(
			long businessAssetId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<BusinessAsset>
				orderByComparator)
		throws NoSuchBusinessAssetException;

	/**
	 * Removes all the Activos del negocios where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of Activos del negocios where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching Activos del negocios
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the Activos del negocios where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching Activos del negocios
	 */
	public java.util.List<BusinessAsset> findByAll(long groupId);

	/**
	 * Returns a range of all the Activos del negocios where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BusinessAssetModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of Activos del negocios
	 * @param end the upper bound of the range of Activos del negocios (not inclusive)
	 * @return the range of matching Activos del negocios
	 */
	public java.util.List<BusinessAsset> findByAll(
		long groupId, int start, int end);

	/**
	 * Returns an ordered range of all the Activos del negocios where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BusinessAssetModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of Activos del negocios
	 * @param end the upper bound of the range of Activos del negocios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching Activos del negocios
	 */
	public java.util.List<BusinessAsset> findByAll(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BusinessAsset>
			orderByComparator);

	/**
	 * Returns an ordered range of all the Activos del negocios where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BusinessAssetModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of Activos del negocios
	 * @param end the upper bound of the range of Activos del negocios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching Activos del negocios
	 */
	public java.util.List<BusinessAsset> findByAll(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BusinessAsset>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first Activos del negocio in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching Activos del negocio
	 * @throws NoSuchBusinessAssetException if a matching Activos del negocio could not be found
	 */
	public BusinessAsset findByAll_First(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<BusinessAsset>
				orderByComparator)
		throws NoSuchBusinessAssetException;

	/**
	 * Returns the first Activos del negocio in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching Activos del negocio, or <code>null</code> if a matching Activos del negocio could not be found
	 */
	public BusinessAsset fetchByAll_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<BusinessAsset>
			orderByComparator);

	/**
	 * Returns the last Activos del negocio in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching Activos del negocio
	 * @throws NoSuchBusinessAssetException if a matching Activos del negocio could not be found
	 */
	public BusinessAsset findByAll_Last(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<BusinessAsset>
				orderByComparator)
		throws NoSuchBusinessAssetException;

	/**
	 * Returns the last Activos del negocio in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching Activos del negocio, or <code>null</code> if a matching Activos del negocio could not be found
	 */
	public BusinessAsset fetchByAll_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<BusinessAsset>
			orderByComparator);

	/**
	 * Returns the Activos del negocios before and after the current Activos del negocio in the ordered set where groupId = &#63;.
	 *
	 * @param businessAssetId the primary key of the current Activos del negocio
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next Activos del negocio
	 * @throws NoSuchBusinessAssetException if a Activos del negocio with the primary key could not be found
	 */
	public BusinessAsset[] findByAll_PrevAndNext(
			long businessAssetId, long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<BusinessAsset>
				orderByComparator)
		throws NoSuchBusinessAssetException;

	/**
	 * Removes all the Activos del negocios where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public void removeByAll(long groupId);

	/**
	 * Returns the number of Activos del negocios where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching Activos del negocios
	 */
	public int countByAll(long groupId);

	/**
	 * Returns the Activos del negocio where assetCode = &#63; or throws a <code>NoSuchBusinessAssetException</code> if it could not be found.
	 *
	 * @param assetCode the asset code
	 * @return the matching Activos del negocio
	 * @throws NoSuchBusinessAssetException if a matching Activos del negocio could not be found
	 */
	public BusinessAsset findByAssetCode(String assetCode)
		throws NoSuchBusinessAssetException;

	/**
	 * Returns the Activos del negocio where assetCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param assetCode the asset code
	 * @return the matching Activos del negocio, or <code>null</code> if a matching Activos del negocio could not be found
	 */
	public BusinessAsset fetchByAssetCode(String assetCode);

	/**
	 * Returns the Activos del negocio where assetCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param assetCode the asset code
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching Activos del negocio, or <code>null</code> if a matching Activos del negocio could not be found
	 */
	public BusinessAsset fetchByAssetCode(
		String assetCode, boolean useFinderCache);

	/**
	 * Removes the Activos del negocio where assetCode = &#63; from the database.
	 *
	 * @param assetCode the asset code
	 * @return the Activos del negocio that was removed
	 */
	public BusinessAsset removeByAssetCode(String assetCode)
		throws NoSuchBusinessAssetException;

	/**
	 * Returns the number of Activos del negocios where assetCode = &#63;.
	 *
	 * @param assetCode the asset code
	 * @return the number of matching Activos del negocios
	 */
	public int countByAssetCode(String assetCode);

	/**
	 * Caches the Activos del negocio in the entity cache if it is enabled.
	 *
	 * @param businessAsset the Activos del negocio
	 */
	public void cacheResult(BusinessAsset businessAsset);

	/**
	 * Caches the Activos del negocios in the entity cache if it is enabled.
	 *
	 * @param businessAssets the Activos del negocios
	 */
	public void cacheResult(java.util.List<BusinessAsset> businessAssets);

	/**
	 * Creates a new Activos del negocio with the primary key. Does not add the Activos del negocio to the database.
	 *
	 * @param businessAssetId the primary key for the new Activos del negocio
	 * @return the new Activos del negocio
	 */
	public BusinessAsset create(long businessAssetId);

	/**
	 * Removes the Activos del negocio with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param businessAssetId the primary key of the Activos del negocio
	 * @return the Activos del negocio that was removed
	 * @throws NoSuchBusinessAssetException if a Activos del negocio with the primary key could not be found
	 */
	public BusinessAsset remove(long businessAssetId)
		throws NoSuchBusinessAssetException;

	public BusinessAsset updateImpl(BusinessAsset businessAsset);

	/**
	 * Returns the Activos del negocio with the primary key or throws a <code>NoSuchBusinessAssetException</code> if it could not be found.
	 *
	 * @param businessAssetId the primary key of the Activos del negocio
	 * @return the Activos del negocio
	 * @throws NoSuchBusinessAssetException if a Activos del negocio with the primary key could not be found
	 */
	public BusinessAsset findByPrimaryKey(long businessAssetId)
		throws NoSuchBusinessAssetException;

	/**
	 * Returns the Activos del negocio with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param businessAssetId the primary key of the Activos del negocio
	 * @return the Activos del negocio, or <code>null</code> if a Activos del negocio with the primary key could not be found
	 */
	public BusinessAsset fetchByPrimaryKey(long businessAssetId);

	/**
	 * Returns all the Activos del negocios.
	 *
	 * @return the Activos del negocios
	 */
	public java.util.List<BusinessAsset> findAll();

	/**
	 * Returns a range of all the Activos del negocios.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BusinessAssetModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of Activos del negocios
	 * @param end the upper bound of the range of Activos del negocios (not inclusive)
	 * @return the range of Activos del negocios
	 */
	public java.util.List<BusinessAsset> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the Activos del negocios.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BusinessAssetModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of Activos del negocios
	 * @param end the upper bound of the range of Activos del negocios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of Activos del negocios
	 */
	public java.util.List<BusinessAsset> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BusinessAsset>
			orderByComparator);

	/**
	 * Returns an ordered range of all the Activos del negocios.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BusinessAssetModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of Activos del negocios
	 * @param end the upper bound of the range of Activos del negocios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of Activos del negocios
	 */
	public java.util.List<BusinessAsset> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BusinessAsset>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the Activos del negocios from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of Activos del negocios.
	 *
	 * @return the number of Activos del negocios
	 */
	public int countAll();

}