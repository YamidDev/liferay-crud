package com.pactia.co.portlet;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.pactia.co.active.model.BusinessAsset;
import com.pactia.co.active.service.BusinessAssetService;
import com.pactia.co.constants.ActivePortletKeys;
import com.pactia.co.constants.ConstantsCommands;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

@Component(
        immediate = true,
        property = {

                "javax.portlet.name=" + ActivePortletKeys.ACTIVE,
                "mvc.command.name=" + ConstantsCommands.NEW_ASSET,
                "mvc.command.name=" + ConstantsCommands.EDIT_ASSET,
        },
        service = MVCRenderCommand.class
)
public class ActiveEditMVCRenderCommand implements MVCRenderCommand{

    @Override
    public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
        long businessAssetId = ParamUtil.getLong(renderRequest, "assetId");
        _log.debug("id de edit "+ businessAssetId);
        if(businessAssetId>0){
            BusinessAsset businessAsset = _BusinessAssetService.fetchBusinessAsset(businessAssetId);
            renderRequest.setAttribute("businessAsset", businessAsset);
        }
        return "/edit.jsp";
    }

    private static final Log _log= LogFactoryUtil.getLog(ActiveEditMVCRenderCommand.class);

    @Reference
    private BusinessAssetService _BusinessAssetService;
}
