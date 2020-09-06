<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState" %>
<%@ include file="/init.jsp" %>

<% List<BusinessAsset> actives = (List<BusinessAsset>)renderRequest.getAttribute("businessAsset");  %>

<p>
    <liferay-portlet:renderURL var="newURL" windowState="<%= LiferayWindowState.MAXIMIZED.toString() %>">
        <liferay-portlet:param name="mvcRenderCommandName" value="<%= ConstantsCommands.NEW_ASSET %>"/>
        <liferay-portlet:param name="backURL" value="<%= currentURL %>"/>
    </liferay-portlet:renderURL>
    <!--<aui:button value="new" href="${ newURL }"></aui:button>-->
     <table class="table table-responsive table-hover">
    	 	<thead>
    	 		<tr>
    	 			<th scope="col">Codigo Activo</th>
    	 			<th scope="col">Nombre</th>
    	 			<th scope="col">Direccion</th>
    	 			<th scope="col">Ciudad</th>
    	 			<th scope="col">Vlr Mt2</th>
    	 			<th scope="col">Descripcion</th>
    	 			<th scope="col">Acciones</th>
    	 		</tr>
    	 	</thead>
    	 	<tbody>
                <%for(BusinessAsset businessAsset:actives){ %>
                    <tr>
                        <td><%= businessAsset.getAssetCode() %> </td>
                        <td><%= businessAsset.getAssetName() %></td>
                        <td><%= businessAsset.getAssetAddress() %></td>
                        <td><%= businessAsset.getCityId() %></td>
                        <td><%= businessAsset.getSquareMeterValue() %></td>
                        <td><%= businessAsset.getDescription() %></td>
                        <td>
                            <liferay-portlet:renderURL var="editURL">
                                <liferay-portlet:param name="mvcRenderCommandName" value="<%=ConstantsCommands.EDIT_ASSET %>"/>
                                <liferay-portlet:param name="backURL" value="<%= currentURL %>"/>
                                <liferay-portlet:param name="assetId" value="<%= String.valueOf(businessAsset.getBusinessAssetId()) %>"/>
                            </liferay-portlet:renderURL>

                            <liferay-ui:icon-menu>
                                <liferay-ui:icon url="${editURL }"  message="edit" >

                                </liferay-ui:icon>
                            </liferay-ui:icon-menu>
                        </td>
                    </tr>

                <%} %>
    	 	</tbody>
    	 </table>
</p>