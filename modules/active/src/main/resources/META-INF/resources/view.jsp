<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState" %>
<%@ include file="/init.jsp" %>
<p>
    <liferay-portlet:renderURL var="editURL" windowState="<%= LiferayWindowState.MAXIMIZED.toString() %>">
        <liferay-portlet:param name="mvcRenderCommandName" value="edit-active"/>
        <liferay-portlet:param name="backURL" value="<%= currentURL %>"/>
    </liferay-portlet:renderURL>
    <aui:a href="<%= editURL %>">editar</aui:a>
</p>