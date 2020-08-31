package com.pactia.co.portlet;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.LocalizationUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.pactia.co.active.service.BusinessAssetService;
import com.pactia.co.constants.ActivePortletKeys;
import com.pactia.co.constants.ConstantsCommands;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import java.util.Locale;
import java.util.Map;

@Component(
        immediate = true,
        property = {

                "javax.portlet.name=" + ActivePortletKeys.ACTIVE,
                "mvc.command.name="+ ConstantsCommands.UPDATE_ASSET
        },
        service = MVCActionCommand.class
)
public class ActiveUpdateMVCActionCommand implements MVCActionCommand {

    @Override
    public boolean processAction(ActionRequest actionRequest, ActionResponse actionResponse) throws PortletException {

        try {
            String assetCode = ParamUtil.getString(actionRequest, "assetCode");
            String cityId = ParamUtil.getString(actionRequest, "cityId");
            String assetName = ParamUtil.getString(actionRequest, "assetName");
            ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
            long groupId= themeDisplay.getSiteGroupId();
            ServiceContext serviceContext = ServiceContextFactory.getInstance(actionRequest);
            String assetAddress = ParamUtil.getString(actionRequest, "assetAddress");
            double squareMeterValue = ParamUtil.getDouble(actionRequest, "squareMeterValue");
            Map<Locale, String> descripcion = LocalizationUtil.getLocalizationMap(actionRequest, "description");
            _BusinessAssetService.addAsset(
                    groupId, assetCode, cityId,
                    assetName, assetAddress, squareMeterValue,serviceContext,descripcion);
            return true;
        } catch (Exception e){
            _log.error(e.getMessage());
        }
        return false;
    }

    private static final Log _log= LogFactoryUtil.getLog(ActiveUpdateMVCActionCommand.class);

    @Reference
    private BusinessAssetService _BusinessAssetService;
}
