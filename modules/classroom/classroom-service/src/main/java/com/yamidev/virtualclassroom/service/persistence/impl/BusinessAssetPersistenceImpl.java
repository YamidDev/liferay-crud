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

package com.yamidev.virtualclassroom.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;

import com.yamidev.virtualclassroom.exception.NoSuchBusinessAssetException;
import com.yamidev.virtualclassroom.model.BusinessAsset;
import com.yamidev.virtualclassroom.model.impl.BusinessAssetImpl;
import com.yamidev.virtualclassroom.model.impl.BusinessAssetModelImpl;
import com.yamidev.virtualclassroom.service.persistence.BusinessAssetPersistence;
import com.yamidev.virtualclassroom.service.persistence.impl.constants.vcPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the Activos del negocio service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = BusinessAssetPersistence.class)
public class BusinessAssetPersistenceImpl
	extends BasePersistenceImpl<BusinessAsset>
	implements BusinessAssetPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>BusinessAssetUtil</code> to access the Activos del negocio persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		BusinessAssetImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByUuid;
	private FinderPath _finderPathWithoutPaginationFindByUuid;
	private FinderPath _finderPathCountByUuid;

	/**
	 * Returns all the Activos del negocios where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching Activos del negocios
	 */
	@Override
	public List<BusinessAsset> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<BusinessAsset> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

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
	@Override
	public List<BusinessAsset> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<BusinessAsset> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

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
	@Override
	public List<BusinessAsset> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<BusinessAsset> orderByComparator,
		boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUuid;
				finderArgs = new Object[] {uuid};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUuid;
			finderArgs = new Object[] {uuid, start, end, orderByComparator};
		}

		List<BusinessAsset> list = null;

		if (useFinderCache) {
			list = (List<BusinessAsset>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (BusinessAsset businessAsset : list) {
					if (!uuid.equals(businessAsset.getUuid())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_BUSINESSASSET_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(BusinessAssetModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				list = (List<BusinessAsset>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(finderPath, finderArgs);
				}

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first Activos del negocio in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching Activos del negocio
	 * @throws NoSuchBusinessAssetException if a matching Activos del negocio could not be found
	 */
	@Override
	public BusinessAsset findByUuid_First(
			String uuid, OrderByComparator<BusinessAsset> orderByComparator)
		throws NoSuchBusinessAssetException {

		BusinessAsset businessAsset = fetchByUuid_First(
			uuid, orderByComparator);

		if (businessAsset != null) {
			return businessAsset;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchBusinessAssetException(sb.toString());
	}

	/**
	 * Returns the first Activos del negocio in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching Activos del negocio, or <code>null</code> if a matching Activos del negocio could not be found
	 */
	@Override
	public BusinessAsset fetchByUuid_First(
		String uuid, OrderByComparator<BusinessAsset> orderByComparator) {

		List<BusinessAsset> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last Activos del negocio in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching Activos del negocio
	 * @throws NoSuchBusinessAssetException if a matching Activos del negocio could not be found
	 */
	@Override
	public BusinessAsset findByUuid_Last(
			String uuid, OrderByComparator<BusinessAsset> orderByComparator)
		throws NoSuchBusinessAssetException {

		BusinessAsset businessAsset = fetchByUuid_Last(uuid, orderByComparator);

		if (businessAsset != null) {
			return businessAsset;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchBusinessAssetException(sb.toString());
	}

	/**
	 * Returns the last Activos del negocio in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching Activos del negocio, or <code>null</code> if a matching Activos del negocio could not be found
	 */
	@Override
	public BusinessAsset fetchByUuid_Last(
		String uuid, OrderByComparator<BusinessAsset> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<BusinessAsset> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the Activos del negocios before and after the current Activos del negocio in the ordered set where uuid = &#63;.
	 *
	 * @param businessAssetId the primary key of the current Activos del negocio
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next Activos del negocio
	 * @throws NoSuchBusinessAssetException if a Activos del negocio with the primary key could not be found
	 */
	@Override
	public BusinessAsset[] findByUuid_PrevAndNext(
			long businessAssetId, String uuid,
			OrderByComparator<BusinessAsset> orderByComparator)
		throws NoSuchBusinessAssetException {

		uuid = Objects.toString(uuid, "");

		BusinessAsset businessAsset = findByPrimaryKey(businessAssetId);

		Session session = null;

		try {
			session = openSession();

			BusinessAsset[] array = new BusinessAssetImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, businessAsset, uuid, orderByComparator, true);

			array[1] = businessAsset;

			array[2] = getByUuid_PrevAndNext(
				session, businessAsset, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected BusinessAsset getByUuid_PrevAndNext(
		Session session, BusinessAsset businessAsset, String uuid,
		OrderByComparator<BusinessAsset> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_BUSINESSASSET_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			sb.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			sb.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(BusinessAssetModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindUuid) {
			queryPos.add(uuid);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						businessAsset)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<BusinessAsset> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the Activos del negocios where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (BusinessAsset businessAsset :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(businessAsset);
		}
	}

	/**
	 * Returns the number of Activos del negocios where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching Activos del negocios
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_BUSINESSASSET_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_2 =
		"businessAsset.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(businessAsset.uuid IS NULL OR businessAsset.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the Activos del negocio where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchBusinessAssetException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching Activos del negocio
	 * @throws NoSuchBusinessAssetException if a matching Activos del negocio could not be found
	 */
	@Override
	public BusinessAsset findByUUID_G(String uuid, long groupId)
		throws NoSuchBusinessAssetException {

		BusinessAsset businessAsset = fetchByUUID_G(uuid, groupId);

		if (businessAsset == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("uuid=");
			sb.append(uuid);

			sb.append(", groupId=");
			sb.append(groupId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchBusinessAssetException(sb.toString());
		}

		return businessAsset;
	}

	/**
	 * Returns the Activos del negocio where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching Activos del negocio, or <code>null</code> if a matching Activos del negocio could not be found
	 */
	@Override
	public BusinessAsset fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the Activos del negocio where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching Activos del negocio, or <code>null</code> if a matching Activos del negocio could not be found
	 */
	@Override
	public BusinessAsset fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {uuid, groupId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchByUUID_G, finderArgs, this);
		}

		if (result instanceof BusinessAsset) {
			BusinessAsset businessAsset = (BusinessAsset)result;

			if (!Objects.equals(uuid, businessAsset.getUuid()) ||
				(groupId != businessAsset.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_BUSINESSASSET_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(groupId);

				List<BusinessAsset> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					BusinessAsset businessAsset = list.get(0);

					result = businessAsset;

					cacheResult(businessAsset);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(
						_finderPathFetchByUUID_G, finderArgs);
				}

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (BusinessAsset)result;
		}
	}

	/**
	 * Removes the Activos del negocio where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the Activos del negocio that was removed
	 */
	@Override
	public BusinessAsset removeByUUID_G(String uuid, long groupId)
		throws NoSuchBusinessAssetException {

		BusinessAsset businessAsset = findByUUID_G(uuid, groupId);

		return remove(businessAsset);
	}

	/**
	 * Returns the number of Activos del negocios where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching Activos del negocios
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_BUSINESSASSET_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(groupId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_G_UUID_2 =
		"businessAsset.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(businessAsset.uuid IS NULL OR businessAsset.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"businessAsset.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the Activos del negocios where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching Activos del negocios
	 */
	@Override
	public List<BusinessAsset> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<BusinessAsset> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

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
	@Override
	public List<BusinessAsset> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<BusinessAsset> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

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
	@Override
	public List<BusinessAsset> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<BusinessAsset> orderByComparator,
		boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUuid_C;
				finderArgs = new Object[] {uuid, companyId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUuid_C;
			finderArgs = new Object[] {
				uuid, companyId, start, end, orderByComparator
			};
		}

		List<BusinessAsset> list = null;

		if (useFinderCache) {
			list = (List<BusinessAsset>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (BusinessAsset businessAsset : list) {
					if (!uuid.equals(businessAsset.getUuid()) ||
						(companyId != businessAsset.getCompanyId())) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					4 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(4);
			}

			sb.append(_SQL_SELECT_BUSINESSASSET_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(BusinessAssetModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(companyId);

				list = (List<BusinessAsset>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(finderPath, finderArgs);
				}

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first Activos del negocio in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching Activos del negocio
	 * @throws NoSuchBusinessAssetException if a matching Activos del negocio could not be found
	 */
	@Override
	public BusinessAsset findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<BusinessAsset> orderByComparator)
		throws NoSuchBusinessAssetException {

		BusinessAsset businessAsset = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (businessAsset != null) {
			return businessAsset;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchBusinessAssetException(sb.toString());
	}

	/**
	 * Returns the first Activos del negocio in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching Activos del negocio, or <code>null</code> if a matching Activos del negocio could not be found
	 */
	@Override
	public BusinessAsset fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<BusinessAsset> orderByComparator) {

		List<BusinessAsset> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last Activos del negocio in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching Activos del negocio
	 * @throws NoSuchBusinessAssetException if a matching Activos del negocio could not be found
	 */
	@Override
	public BusinessAsset findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<BusinessAsset> orderByComparator)
		throws NoSuchBusinessAssetException {

		BusinessAsset businessAsset = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (businessAsset != null) {
			return businessAsset;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchBusinessAssetException(sb.toString());
	}

	/**
	 * Returns the last Activos del negocio in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching Activos del negocio, or <code>null</code> if a matching Activos del negocio could not be found
	 */
	@Override
	public BusinessAsset fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<BusinessAsset> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<BusinessAsset> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

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
	@Override
	public BusinessAsset[] findByUuid_C_PrevAndNext(
			long businessAssetId, String uuid, long companyId,
			OrderByComparator<BusinessAsset> orderByComparator)
		throws NoSuchBusinessAssetException {

		uuid = Objects.toString(uuid, "");

		BusinessAsset businessAsset = findByPrimaryKey(businessAssetId);

		Session session = null;

		try {
			session = openSession();

			BusinessAsset[] array = new BusinessAssetImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, businessAsset, uuid, companyId, orderByComparator,
				true);

			array[1] = businessAsset;

			array[2] = getByUuid_C_PrevAndNext(
				session, businessAsset, uuid, companyId, orderByComparator,
				false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected BusinessAsset getByUuid_C_PrevAndNext(
		Session session, BusinessAsset businessAsset, String uuid,
		long companyId, OrderByComparator<BusinessAsset> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_BUSINESSASSET_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			sb.append(_FINDER_COLUMN_UUID_C_UUID_3);
		}
		else {
			bindUuid = true;

			sb.append(_FINDER_COLUMN_UUID_C_UUID_2);
		}

		sb.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(BusinessAssetModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindUuid) {
			queryPos.add(uuid);
		}

		queryPos.add(companyId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						businessAsset)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<BusinessAsset> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the Activos del negocios where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (BusinessAsset businessAsset :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(businessAsset);
		}
	}

	/**
	 * Returns the number of Activos del negocios where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching Activos del negocios
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_BUSINESSASSET_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(companyId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_C_UUID_2 =
		"businessAsset.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(businessAsset.uuid IS NULL OR businessAsset.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"businessAsset.companyId = ?";

	private FinderPath _finderPathWithPaginationFindByAll;
	private FinderPath _finderPathWithoutPaginationFindByAll;
	private FinderPath _finderPathCountByAll;

	/**
	 * Returns all the Activos del negocios where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching Activos del negocios
	 */
	@Override
	public List<BusinessAsset> findByAll(long groupId) {
		return findByAll(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<BusinessAsset> findByAll(long groupId, int start, int end) {
		return findByAll(groupId, start, end, null);
	}

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
	@Override
	public List<BusinessAsset> findByAll(
		long groupId, int start, int end,
		OrderByComparator<BusinessAsset> orderByComparator) {

		return findByAll(groupId, start, end, orderByComparator, true);
	}

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
	@Override
	public List<BusinessAsset> findByAll(
		long groupId, int start, int end,
		OrderByComparator<BusinessAsset> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByAll;
				finderArgs = new Object[] {groupId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByAll;
			finderArgs = new Object[] {groupId, start, end, orderByComparator};
		}

		List<BusinessAsset> list = null;

		if (useFinderCache) {
			list = (List<BusinessAsset>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (BusinessAsset businessAsset : list) {
					if (groupId != businessAsset.getGroupId()) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_BUSINESSASSET_WHERE);

			sb.append(_FINDER_COLUMN_ALL_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(BusinessAssetModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(groupId);

				list = (List<BusinessAsset>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(finderPath, finderArgs);
				}

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first Activos del negocio in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching Activos del negocio
	 * @throws NoSuchBusinessAssetException if a matching Activos del negocio could not be found
	 */
	@Override
	public BusinessAsset findByAll_First(
			long groupId, OrderByComparator<BusinessAsset> orderByComparator)
		throws NoSuchBusinessAssetException {

		BusinessAsset businessAsset = fetchByAll_First(
			groupId, orderByComparator);

		if (businessAsset != null) {
			return businessAsset;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("groupId=");
		sb.append(groupId);

		sb.append("}");

		throw new NoSuchBusinessAssetException(sb.toString());
	}

	/**
	 * Returns the first Activos del negocio in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching Activos del negocio, or <code>null</code> if a matching Activos del negocio could not be found
	 */
	@Override
	public BusinessAsset fetchByAll_First(
		long groupId, OrderByComparator<BusinessAsset> orderByComparator) {

		List<BusinessAsset> list = findByAll(groupId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last Activos del negocio in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching Activos del negocio
	 * @throws NoSuchBusinessAssetException if a matching Activos del negocio could not be found
	 */
	@Override
	public BusinessAsset findByAll_Last(
			long groupId, OrderByComparator<BusinessAsset> orderByComparator)
		throws NoSuchBusinessAssetException {

		BusinessAsset businessAsset = fetchByAll_Last(
			groupId, orderByComparator);

		if (businessAsset != null) {
			return businessAsset;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("groupId=");
		sb.append(groupId);

		sb.append("}");

		throw new NoSuchBusinessAssetException(sb.toString());
	}

	/**
	 * Returns the last Activos del negocio in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching Activos del negocio, or <code>null</code> if a matching Activos del negocio could not be found
	 */
	@Override
	public BusinessAsset fetchByAll_Last(
		long groupId, OrderByComparator<BusinessAsset> orderByComparator) {

		int count = countByAll(groupId);

		if (count == 0) {
			return null;
		}

		List<BusinessAsset> list = findByAll(
			groupId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the Activos del negocios before and after the current Activos del negocio in the ordered set where groupId = &#63;.
	 *
	 * @param businessAssetId the primary key of the current Activos del negocio
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next Activos del negocio
	 * @throws NoSuchBusinessAssetException if a Activos del negocio with the primary key could not be found
	 */
	@Override
	public BusinessAsset[] findByAll_PrevAndNext(
			long businessAssetId, long groupId,
			OrderByComparator<BusinessAsset> orderByComparator)
		throws NoSuchBusinessAssetException {

		BusinessAsset businessAsset = findByPrimaryKey(businessAssetId);

		Session session = null;

		try {
			session = openSession();

			BusinessAsset[] array = new BusinessAssetImpl[3];

			array[0] = getByAll_PrevAndNext(
				session, businessAsset, groupId, orderByComparator, true);

			array[1] = businessAsset;

			array[2] = getByAll_PrevAndNext(
				session, businessAsset, groupId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected BusinessAsset getByAll_PrevAndNext(
		Session session, BusinessAsset businessAsset, long groupId,
		OrderByComparator<BusinessAsset> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_BUSINESSASSET_WHERE);

		sb.append(_FINDER_COLUMN_ALL_GROUPID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(BusinessAssetModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(groupId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						businessAsset)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<BusinessAsset> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the Activos del negocios where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	@Override
	public void removeByAll(long groupId) {
		for (BusinessAsset businessAsset :
				findByAll(
					groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(businessAsset);
		}
	}

	/**
	 * Returns the number of Activos del negocios where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching Activos del negocios
	 */
	@Override
	public int countByAll(long groupId) {
		FinderPath finderPath = _finderPathCountByAll;

		Object[] finderArgs = new Object[] {groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_BUSINESSASSET_WHERE);

			sb.append(_FINDER_COLUMN_ALL_GROUPID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(groupId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_ALL_GROUPID_2 =
		"businessAsset.groupId = ?";

	private FinderPath _finderPathFetchByAssetCode;
	private FinderPath _finderPathCountByAssetCode;

	/**
	 * Returns the Activos del negocio where assetCode = &#63; or throws a <code>NoSuchBusinessAssetException</code> if it could not be found.
	 *
	 * @param assetCode the asset code
	 * @return the matching Activos del negocio
	 * @throws NoSuchBusinessAssetException if a matching Activos del negocio could not be found
	 */
	@Override
	public BusinessAsset findByAssetCode(String assetCode)
		throws NoSuchBusinessAssetException {

		BusinessAsset businessAsset = fetchByAssetCode(assetCode);

		if (businessAsset == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("assetCode=");
			sb.append(assetCode);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchBusinessAssetException(sb.toString());
		}

		return businessAsset;
	}

	/**
	 * Returns the Activos del negocio where assetCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param assetCode the asset code
	 * @return the matching Activos del negocio, or <code>null</code> if a matching Activos del negocio could not be found
	 */
	@Override
	public BusinessAsset fetchByAssetCode(String assetCode) {
		return fetchByAssetCode(assetCode, true);
	}

	/**
	 * Returns the Activos del negocio where assetCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param assetCode the asset code
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching Activos del negocio, or <code>null</code> if a matching Activos del negocio could not be found
	 */
	@Override
	public BusinessAsset fetchByAssetCode(
		String assetCode, boolean useFinderCache) {

		assetCode = Objects.toString(assetCode, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {assetCode};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchByAssetCode, finderArgs, this);
		}

		if (result instanceof BusinessAsset) {
			BusinessAsset businessAsset = (BusinessAsset)result;

			if (!Objects.equals(assetCode, businessAsset.getAssetCode())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_BUSINESSASSET_WHERE);

			boolean bindAssetCode = false;

			if (assetCode.isEmpty()) {
				sb.append(_FINDER_COLUMN_ASSETCODE_ASSETCODE_3);
			}
			else {
				bindAssetCode = true;

				sb.append(_FINDER_COLUMN_ASSETCODE_ASSETCODE_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindAssetCode) {
					queryPos.add(assetCode);
				}

				List<BusinessAsset> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByAssetCode, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {assetCode};
							}

							_log.warn(
								"BusinessAssetPersistenceImpl.fetchByAssetCode(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					BusinessAsset businessAsset = list.get(0);

					result = businessAsset;

					cacheResult(businessAsset);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(
						_finderPathFetchByAssetCode, finderArgs);
				}

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (BusinessAsset)result;
		}
	}

	/**
	 * Removes the Activos del negocio where assetCode = &#63; from the database.
	 *
	 * @param assetCode the asset code
	 * @return the Activos del negocio that was removed
	 */
	@Override
	public BusinessAsset removeByAssetCode(String assetCode)
		throws NoSuchBusinessAssetException {

		BusinessAsset businessAsset = findByAssetCode(assetCode);

		return remove(businessAsset);
	}

	/**
	 * Returns the number of Activos del negocios where assetCode = &#63;.
	 *
	 * @param assetCode the asset code
	 * @return the number of matching Activos del negocios
	 */
	@Override
	public int countByAssetCode(String assetCode) {
		assetCode = Objects.toString(assetCode, "");

		FinderPath finderPath = _finderPathCountByAssetCode;

		Object[] finderArgs = new Object[] {assetCode};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_BUSINESSASSET_WHERE);

			boolean bindAssetCode = false;

			if (assetCode.isEmpty()) {
				sb.append(_FINDER_COLUMN_ASSETCODE_ASSETCODE_3);
			}
			else {
				bindAssetCode = true;

				sb.append(_FINDER_COLUMN_ASSETCODE_ASSETCODE_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindAssetCode) {
					queryPos.add(assetCode);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_ASSETCODE_ASSETCODE_2 =
		"businessAsset.assetCode = ?";

	private static final String _FINDER_COLUMN_ASSETCODE_ASSETCODE_3 =
		"(businessAsset.assetCode IS NULL OR businessAsset.assetCode = '')";

	public BusinessAssetPersistenceImpl() {
		setModelClass(BusinessAsset.class);

		setModelImplClass(BusinessAssetImpl.class);
		setModelPKClass(long.class);

		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);
	}

	/**
	 * Caches the Activos del negocio in the entity cache if it is enabled.
	 *
	 * @param businessAsset the Activos del negocio
	 */
	@Override
	public void cacheResult(BusinessAsset businessAsset) {
		entityCache.putResult(
			entityCacheEnabled, BusinessAssetImpl.class,
			businessAsset.getPrimaryKey(), businessAsset);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {businessAsset.getUuid(), businessAsset.getGroupId()},
			businessAsset);

		finderCache.putResult(
			_finderPathFetchByAssetCode,
			new Object[] {businessAsset.getAssetCode()}, businessAsset);

		businessAsset.resetOriginalValues();
	}

	/**
	 * Caches the Activos del negocios in the entity cache if it is enabled.
	 *
	 * @param businessAssets the Activos del negocios
	 */
	@Override
	public void cacheResult(List<BusinessAsset> businessAssets) {
		for (BusinessAsset businessAsset : businessAssets) {
			if (entityCache.getResult(
					entityCacheEnabled, BusinessAssetImpl.class,
					businessAsset.getPrimaryKey()) == null) {

				cacheResult(businessAsset);
			}
			else {
				businessAsset.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all Activos del negocios.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(BusinessAssetImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the Activos del negocio.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(BusinessAsset businessAsset) {
		entityCache.removeResult(
			entityCacheEnabled, BusinessAssetImpl.class,
			businessAsset.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((BusinessAssetModelImpl)businessAsset, true);
	}

	@Override
	public void clearCache(List<BusinessAsset> businessAssets) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (BusinessAsset businessAsset : businessAssets) {
			entityCache.removeResult(
				entityCacheEnabled, BusinessAssetImpl.class,
				businessAsset.getPrimaryKey());

			clearUniqueFindersCache(
				(BusinessAssetModelImpl)businessAsset, true);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				entityCacheEnabled, BusinessAssetImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		BusinessAssetModelImpl businessAssetModelImpl) {

		Object[] args = new Object[] {
			businessAssetModelImpl.getUuid(),
			businessAssetModelImpl.getGroupId()
		};

		finderCache.putResult(
			_finderPathCountByUUID_G, args, Long.valueOf(1), false);
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, businessAssetModelImpl, false);

		args = new Object[] {businessAssetModelImpl.getAssetCode()};

		finderCache.putResult(
			_finderPathCountByAssetCode, args, Long.valueOf(1), false);
		finderCache.putResult(
			_finderPathFetchByAssetCode, args, businessAssetModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		BusinessAssetModelImpl businessAssetModelImpl, boolean clearCurrent) {

		if (clearCurrent) {
			Object[] args = new Object[] {
				businessAssetModelImpl.getUuid(),
				businessAssetModelImpl.getGroupId()
			};

			finderCache.removeResult(_finderPathCountByUUID_G, args);
			finderCache.removeResult(_finderPathFetchByUUID_G, args);
		}

		if ((businessAssetModelImpl.getColumnBitmask() &
			 _finderPathFetchByUUID_G.getColumnBitmask()) != 0) {

			Object[] args = new Object[] {
				businessAssetModelImpl.getOriginalUuid(),
				businessAssetModelImpl.getOriginalGroupId()
			};

			finderCache.removeResult(_finderPathCountByUUID_G, args);
			finderCache.removeResult(_finderPathFetchByUUID_G, args);
		}

		if (clearCurrent) {
			Object[] args = new Object[] {
				businessAssetModelImpl.getAssetCode()
			};

			finderCache.removeResult(_finderPathCountByAssetCode, args);
			finderCache.removeResult(_finderPathFetchByAssetCode, args);
		}

		if ((businessAssetModelImpl.getColumnBitmask() &
			 _finderPathFetchByAssetCode.getColumnBitmask()) != 0) {

			Object[] args = new Object[] {
				businessAssetModelImpl.getOriginalAssetCode()
			};

			finderCache.removeResult(_finderPathCountByAssetCode, args);
			finderCache.removeResult(_finderPathFetchByAssetCode, args);
		}
	}

	/**
	 * Creates a new Activos del negocio with the primary key. Does not add the Activos del negocio to the database.
	 *
	 * @param businessAssetId the primary key for the new Activos del negocio
	 * @return the new Activos del negocio
	 */
	@Override
	public BusinessAsset create(long businessAssetId) {
		BusinessAsset businessAsset = new BusinessAssetImpl();

		businessAsset.setNew(true);
		businessAsset.setPrimaryKey(businessAssetId);

		String uuid = PortalUUIDUtil.generate();

		businessAsset.setUuid(uuid);

		businessAsset.setCompanyId(CompanyThreadLocal.getCompanyId());

		return businessAsset;
	}

	/**
	 * Removes the Activos del negocio with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param businessAssetId the primary key of the Activos del negocio
	 * @return the Activos del negocio that was removed
	 * @throws NoSuchBusinessAssetException if a Activos del negocio with the primary key could not be found
	 */
	@Override
	public BusinessAsset remove(long businessAssetId)
		throws NoSuchBusinessAssetException {

		return remove((Serializable)businessAssetId);
	}

	/**
	 * Removes the Activos del negocio with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the Activos del negocio
	 * @return the Activos del negocio that was removed
	 * @throws NoSuchBusinessAssetException if a Activos del negocio with the primary key could not be found
	 */
	@Override
	public BusinessAsset remove(Serializable primaryKey)
		throws NoSuchBusinessAssetException {

		Session session = null;

		try {
			session = openSession();

			BusinessAsset businessAsset = (BusinessAsset)session.get(
				BusinessAssetImpl.class, primaryKey);

			if (businessAsset == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchBusinessAssetException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(businessAsset);
		}
		catch (NoSuchBusinessAssetException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected BusinessAsset removeImpl(BusinessAsset businessAsset) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(businessAsset)) {
				businessAsset = (BusinessAsset)session.get(
					BusinessAssetImpl.class, businessAsset.getPrimaryKeyObj());
			}

			if (businessAsset != null) {
				session.delete(businessAsset);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (businessAsset != null) {
			clearCache(businessAsset);
		}

		return businessAsset;
	}

	@Override
	public BusinessAsset updateImpl(BusinessAsset businessAsset) {
		boolean isNew = businessAsset.isNew();

		if (!(businessAsset instanceof BusinessAssetModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(businessAsset.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					businessAsset);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in businessAsset proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom BusinessAsset implementation " +
					businessAsset.getClass());
		}

		BusinessAssetModelImpl businessAssetModelImpl =
			(BusinessAssetModelImpl)businessAsset;

		if (Validator.isNull(businessAsset.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			businessAsset.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (businessAsset.getCreateDate() == null)) {
			if (serviceContext == null) {
				businessAsset.setCreateDate(now);
			}
			else {
				businessAsset.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!businessAssetModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				businessAsset.setModifiedDate(now);
			}
			else {
				businessAsset.setModifiedDate(
					serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (businessAsset.isNew()) {
				session.save(businessAsset);

				businessAsset.setNew(false);
			}
			else {
				businessAsset = (BusinessAsset)session.merge(businessAsset);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!_columnBitmaskEnabled) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else if (isNew) {
			Object[] args = new Object[] {businessAssetModelImpl.getUuid()};

			finderCache.removeResult(_finderPathCountByUuid, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByUuid, args);

			args = new Object[] {
				businessAssetModelImpl.getUuid(),
				businessAssetModelImpl.getCompanyId()
			};

			finderCache.removeResult(_finderPathCountByUuid_C, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByUuid_C, args);

			args = new Object[] {businessAssetModelImpl.getGroupId()};

			finderCache.removeResult(_finderPathCountByAll, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByAll, args);

			finderCache.removeResult(_finderPathCountAll, FINDER_ARGS_EMPTY);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindAll, FINDER_ARGS_EMPTY);
		}
		else {
			if ((businessAssetModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByUuid.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					businessAssetModelImpl.getOriginalUuid()
				};

				finderCache.removeResult(_finderPathCountByUuid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid, args);

				args = new Object[] {businessAssetModelImpl.getUuid()};

				finderCache.removeResult(_finderPathCountByUuid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid, args);
			}

			if ((businessAssetModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByUuid_C.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					businessAssetModelImpl.getOriginalUuid(),
					businessAssetModelImpl.getOriginalCompanyId()
				};

				finderCache.removeResult(_finderPathCountByUuid_C, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid_C, args);

				args = new Object[] {
					businessAssetModelImpl.getUuid(),
					businessAssetModelImpl.getCompanyId()
				};

				finderCache.removeResult(_finderPathCountByUuid_C, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid_C, args);
			}

			if ((businessAssetModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByAll.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					businessAssetModelImpl.getOriginalGroupId()
				};

				finderCache.removeResult(_finderPathCountByAll, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByAll, args);

				args = new Object[] {businessAssetModelImpl.getGroupId()};

				finderCache.removeResult(_finderPathCountByAll, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByAll, args);
			}
		}

		entityCache.putResult(
			entityCacheEnabled, BusinessAssetImpl.class,
			businessAsset.getPrimaryKey(), businessAsset, false);

		clearUniqueFindersCache(businessAssetModelImpl, false);
		cacheUniqueFindersCache(businessAssetModelImpl);

		businessAsset.resetOriginalValues();

		return businessAsset;
	}

	/**
	 * Returns the Activos del negocio with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the Activos del negocio
	 * @return the Activos del negocio
	 * @throws NoSuchBusinessAssetException if a Activos del negocio with the primary key could not be found
	 */
	@Override
	public BusinessAsset findByPrimaryKey(Serializable primaryKey)
		throws NoSuchBusinessAssetException {

		BusinessAsset businessAsset = fetchByPrimaryKey(primaryKey);

		if (businessAsset == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchBusinessAssetException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return businessAsset;
	}

	/**
	 * Returns the Activos del negocio with the primary key or throws a <code>NoSuchBusinessAssetException</code> if it could not be found.
	 *
	 * @param businessAssetId the primary key of the Activos del negocio
	 * @return the Activos del negocio
	 * @throws NoSuchBusinessAssetException if a Activos del negocio with the primary key could not be found
	 */
	@Override
	public BusinessAsset findByPrimaryKey(long businessAssetId)
		throws NoSuchBusinessAssetException {

		return findByPrimaryKey((Serializable)businessAssetId);
	}

	/**
	 * Returns the Activos del negocio with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param businessAssetId the primary key of the Activos del negocio
	 * @return the Activos del negocio, or <code>null</code> if a Activos del negocio with the primary key could not be found
	 */
	@Override
	public BusinessAsset fetchByPrimaryKey(long businessAssetId) {
		return fetchByPrimaryKey((Serializable)businessAssetId);
	}

	/**
	 * Returns all the Activos del negocios.
	 *
	 * @return the Activos del negocios
	 */
	@Override
	public List<BusinessAsset> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<BusinessAsset> findAll(int start, int end) {
		return findAll(start, end, null);
	}

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
	@Override
	public List<BusinessAsset> findAll(
		int start, int end,
		OrderByComparator<BusinessAsset> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

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
	@Override
	public List<BusinessAsset> findAll(
		int start, int end, OrderByComparator<BusinessAsset> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<BusinessAsset> list = null;

		if (useFinderCache) {
			list = (List<BusinessAsset>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_BUSINESSASSET);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_BUSINESSASSET;

				sql = sql.concat(BusinessAssetModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<BusinessAsset>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(finderPath, finderArgs);
				}

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the Activos del negocios from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (BusinessAsset businessAsset : findAll()) {
			remove(businessAsset);
		}
	}

	/**
	 * Returns the number of Activos del negocios.
	 *
	 * @return the number of Activos del negocios
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_BUSINESSASSET);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				finderCache.removeResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "businessAssetId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_BUSINESSASSET;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return BusinessAssetModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the Activos del negocio persistence.
	 */
	@Activate
	public void activate() {
		BusinessAssetModelImpl.setEntityCacheEnabled(entityCacheEnabled);
		BusinessAssetModelImpl.setFinderCacheEnabled(finderCacheEnabled);

		_finderPathWithPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, BusinessAssetImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, BusinessAssetImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll",
			new String[0]);

		_finderPathCountAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

		_finderPathWithPaginationFindByUuid = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, BusinessAssetImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByUuid = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, BusinessAssetImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] {String.class.getName()},
			BusinessAssetModelImpl.UUID_COLUMN_BITMASK);

		_finderPathCountByUuid = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] {String.class.getName()});

		_finderPathFetchByUUID_G = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, BusinessAssetImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()},
			BusinessAssetModelImpl.UUID_COLUMN_BITMASK |
			BusinessAssetModelImpl.GROUPID_COLUMN_BITMASK);

		_finderPathCountByUUID_G = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()});

		_finderPathWithPaginationFindByUuid_C = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, BusinessAssetImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByUuid_C = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, BusinessAssetImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()},
			BusinessAssetModelImpl.UUID_COLUMN_BITMASK |
			BusinessAssetModelImpl.COMPANYID_COLUMN_BITMASK);

		_finderPathCountByUuid_C = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()});

		_finderPathWithPaginationFindByAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, BusinessAssetImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByAll",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, BusinessAssetImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByAll",
			new String[] {Long.class.getName()},
			BusinessAssetModelImpl.GROUPID_COLUMN_BITMASK);

		_finderPathCountByAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByAll",
			new String[] {Long.class.getName()});

		_finderPathFetchByAssetCode = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, BusinessAssetImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByAssetCode",
			new String[] {String.class.getName()},
			BusinessAssetModelImpl.ASSETCODE_COLUMN_BITMASK);

		_finderPathCountByAssetCode = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByAssetCode",
			new String[] {String.class.getName()});
	}

	@Deactivate
	public void deactivate() {
		entityCache.removeCache(BusinessAssetImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	@Reference(
		target = vcPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
		super.setConfiguration(configuration);

		_columnBitmaskEnabled = GetterUtil.getBoolean(
			configuration.get(
				"value.object.column.bitmask.enabled.com.yamidev.virtualclassroom.model.BusinessAsset"),
			true);
	}

	@Override
	@Reference(
		target = vcPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = vcPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	private boolean _columnBitmaskEnabled;

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_BUSINESSASSET =
		"SELECT businessAsset FROM BusinessAsset businessAsset";

	private static final String _SQL_SELECT_BUSINESSASSET_WHERE =
		"SELECT businessAsset FROM BusinessAsset businessAsset WHERE ";

	private static final String _SQL_COUNT_BUSINESSASSET =
		"SELECT COUNT(businessAsset) FROM BusinessAsset businessAsset";

	private static final String _SQL_COUNT_BUSINESSASSET_WHERE =
		"SELECT COUNT(businessAsset) FROM BusinessAsset businessAsset WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "businessAsset.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No BusinessAsset exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No BusinessAsset exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		BusinessAssetPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	static {
		try {
			Class.forName(vcPersistenceConstants.class.getName());
		}
		catch (ClassNotFoundException classNotFoundException) {
			throw new ExceptionInInitializerError(classNotFoundException);
		}
	}

}