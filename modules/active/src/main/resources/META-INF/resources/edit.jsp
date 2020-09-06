<%@ include file="/init.jsp" %>
<liferay-ui:header title="active.edit" backURL="<%= backURL %>"></liferay-ui:header>
 <liferay-portlet:actionURL var="updateURL" name="<%=ConstantsCommands.UPDATE_ASSET %>">
     <liferay-portlet:param name="backURL" value="<%= currentURL %>"/>
</liferay-portlet:actionURL>
<% BusinessAsset businessAsset= (BusinessAsset) renderRequest.getAttribute("businessAsset"); %>
<aui:form action="${updateURL}">
    <aui:model-context bean="<%=businessAsset %>" model="<%=BusinessAsset.class %>"></aui:model-context>
    <aui:input name="assetId" type="hidden"></aui:input>
    <aui:input name="assetCode" label="active.code"></aui:input>
    <aui:input name="cityId" label="active.city"></aui:input>
    <aui:input name="assetName" label="active.name"></aui:input>
    <aui:input name="assetAddress" label="active.address"></aui:input>
    <aui:input name="squareMeterValue" label="active.value"></aui:input>
    <aui:input name="description"></aui:input>

    <aui:button-row>
        <aui:button type="submit" value="save"></aui:button>
        <aui:button type="cancel" value="cancel" href="<%=backURL %>"></aui:button>
    </aui:button-row>
</aui:form>