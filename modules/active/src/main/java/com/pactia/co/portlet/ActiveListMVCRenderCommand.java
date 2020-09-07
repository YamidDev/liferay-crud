package com.pactia.co.portlet;


import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.pactia.co.active.model.BusinessAsset;
import com.pactia.co.active.service.BusinessAssetService;
import com.pactia.co.constants.ActivePortletKeys;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import java.util.List;

@Component(
        immediate = true,
        property = {

                "javax.portlet.name=" + ActivePortletKeys.ACTIVE,
                "mvc.command.name=/"
        },
        service = MVCRenderCommand.class
)
public class ActiveListMVCRenderCommand implements MVCRenderCommand{

    @Override
    public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
        List<BusinessAsset> businessAsset = _BusinessAssetService.findAll();
        renderRequest.setAttribute("businessAsset", businessAsset);
        return null;
    }
    private static final Log _log= LogFactoryUtil.getLog(ActiveListMVCRenderCommand.class);

    @Reference
    private BusinessAssetService _BusinessAssetService;
}
