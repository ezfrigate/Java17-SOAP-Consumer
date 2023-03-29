package com.soap.service.impl;

import com.schneider.selectconfig.business.tiers.bllConf_generated.Nodes;
import com.schneider.selectconfig.business.tiers.bllConf_generated.error.Errors;
import com.schneider.selectconfig.business.tiers.ssc.*;
import com.soap.service.BLLService;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.JAXBIntrospector;
import jakarta.xml.bind.Unmarshaller;
import lombok.extern.log4j.Log4j2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.oxm.XmlMappingException;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.xml.transform.StringSource;

@Log4j2
public class BLLServiceImpl implements BLLService {

    private static final String CANNOT = "cannot";
    @Value("${bll.default.environment}")
    private String ssl_default;

    @Autowired
    private WebServiceTemplate jt1BllWebServiceTemplate;

    @Autowired
    private WebServiceTemplate jq1BllWebServiceTemplate;

    @Autowired
    private WebServiceTemplate jq2BllWebServiceTemplate;

    @Autowired
    private WebServiceTemplate jcBllWebServiceTemplate;

    @Autowired
    private WebServiceTemplate jpBllWebServiceTemplate;

    @Autowired
    private WebServiceTemplate genericBllWebServiceTemplate;

    private final ObjectFactory objectFactory = new ObjectFactory();
    private static final Logger LOG = LoggerFactory.getLogger(BLLServiceImpl.class);

    private void logError(String xmlString){
        if(xmlString!=null&&xmlString.contains(CANNOT)){
            LOG.error("Cannot create configuration");
            Errors errors = unmarshalError(xmlString);
            Errors.Error resp = errors.getError();
            LOG.error(resp.getValue());
        }
    }
    private <T> T callDUDelimService(Object requestObject) {
        return (T) JAXBIntrospector.getValue(genericBllWebServiceTemplate.marshalSendAndReceive(requestObject));
    }

    Nodes unmarshalNode(String xmlInput) {
        JAXBContext jaxbContext;
        try {
            jaxbContext = JAXBContext.newInstance(Nodes.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            return (Nodes) jaxbUnmarshaller.unmarshal(new StringSource(xmlInput));
        } catch (XmlMappingException | JAXBException e) {
            LOG.error("Exception occurred during unmarshal: " + e.getMessage(), e);
            throw new RuntimeException("Processing Error");
        }

    }

    Errors unmarshalError(String xmlInput) {
        try{
            JAXBContext jContext = JAXBContext.newInstance(Errors.class);
            Unmarshaller unmarshallerObj = jContext.createUnmarshaller();
            return (Errors) unmarshallerObj.unmarshal(new StringSource(xmlInput));
        }catch(Exception e){
            LOG.error("Exception occurred while unmarshalling", e);
            Errors.Error resp = new Errors.Error();
            resp.setId((byte) 1);
            resp.setValue(CANNOT);
            throw new RuntimeException("Error");
        }
    }
    @Override
    public Nodes createConfigFromRefForDu(CreateConfigFromRefForDu createConfigFromRefForDuRequest) {
        CreateConfigFromRefForDuResponse createConfigFromRefForDuResponse = callDUDelimService(objectFactory.createCreateConfigFromRefForDu(createConfigFromRefForDuRequest));
        String xmlString = createConfigFromRefForDuResponse.getReturn();
           logError(xmlString);
        return unmarshalNode(xmlString);
    }
    @Override
    public Nodes createConfigAndInitFromRef(CreateConfigAndInitFromRef createConfigAndInitFromRef) {
        CreateConfigFromRefForDuResponse createConfigFromRefForDuResponse = callDUDelimService(objectFactory.createCreateConfigAndInitFromRef(createConfigAndInitFromRef));
        String xmlString = createConfigFromRefForDuResponse.getReturn();
           logError(xmlString);
        return unmarshalNode(xmlString);
    }
    @Override
    public String deleteConfig(String configId) {
        DeleteConfig config = new DeleteConfig();
        config.setConfigId(configId);
        DeleteConfigResponse resp = callDUDelimService(objectFactory.createDeleteConfig(config));
        return resp.toString();
    }
    @Override
    public Nodes createConfigForKB(CreateConfigForKB createConfigForKBRequest) {
        CreateConfigForKBResponse createConfigForKBResponse = callDUDelimService(objectFactory.createCreateConfigForKB(createConfigForKBRequest));
        String xmlString = createConfigForKBResponse.getReturn();

           logError(xmlString);
        return unmarshalNode(xmlString);
    }
    @Override
    public Nodes deleteCstic(DeleteCstic deleteCsticRequest) {
        DeleteCsticResponse deleteCsticResponse = callDUDelimService(objectFactory.createDeleteCstic(deleteCsticRequest));
        String xmlString = deleteCsticResponse.getReturn();

           logError(xmlString);
        return unmarshalNode(xmlString);
    }
    @Override
    public Nodes deleteCstics(DeleteCstics deleteCsticsRequest) {
        DeleteCsticsResponse deleteCsticsResponse = callDUDelimService(objectFactory.createDeleteCstics(deleteCsticsRequest));
        String xmlString = deleteCsticsResponse.getReturn();

           logError(xmlString);
        return unmarshalNode(xmlString);
    }
    @Override
    public Nodes deleteCsticValue(DeleteCsticValue deleteCsticValueRequest) {
        DeleteCsticValueResponse deleteCsticValueResponse = callDUDelimService(objectFactory.createDeleteCsticValue(deleteCsticValueRequest));
        String xmlString = deleteCsticValueResponse.getReturn();

           logError(xmlString);
        return unmarshalNode(xmlString);
    }
    @Override
    public Nodes deletePersistedConfig(DeletePersistedConfig deletePersistedConfigRequest) {
        DeletePersistedConfigResponse deletePersistedConfigResponse = callDUDelimService(objectFactory.createDeletePersistedConfig(deletePersistedConfigRequest));
        String xmlString = deletePersistedConfigResponse.getReturn();

           logError(xmlString);
        return unmarshalNode(xmlString);
    }
    @Override
    public Nodes downloadConfig(DownloadConfig downloadConfigRequest) {
        DownloadConfigResponse downloadConfigResponse = callDUDelimService(objectFactory.createDownloadConfig(downloadConfigRequest));
        String xmlString = downloadConfigResponse.getReturn();

           logError(xmlString);
        return unmarshalNode(xmlString);
    }
    @Override
    public Nodes downloadPersistedConfig(DownloadPersistedConfig downloadPersistedConfig) {
        DownloadPersistedConfigResponse downloadPersistedConfigResponse = callDUDelimService(objectFactory.createDownloadPersistedConfig(downloadPersistedConfig));
        String xmlString = downloadPersistedConfigResponse.getReturn();

           logError(xmlString);
        return unmarshalNode(xmlString);
    }
    @Override
    public Nodes downloadPersistedConfigService(DownloadPersistedConfigService downloadPersistedConfigServiceRequest) {
        DownloadPersistedConfigServiceResponse downloadPersistedConfigServiceResponse = callDUDelimService(objectFactory.createDownloadPersistedConfigService(downloadPersistedConfigServiceRequest));
        String xmlString = downloadPersistedConfigServiceResponse.getReturn();

           logError(xmlString);
        return unmarshalNode(xmlString);
    }
    @Override
    public Nodes downloadPersistedConfigZip(DownloadPersistedConfigZip downloadPersistedConfigZipRequest) {
        DownloadPersistedConfigZipResponse downloadPersistedConfigZipResponse = callDUDelimService(objectFactory.createDownloadPersistedConfigZip(downloadPersistedConfigZipRequest));
        String xmlString = downloadPersistedConfigZipResponse.getReturn();

           logError(xmlString);
        return unmarshalNode(xmlString);
    }
    @Override
    public Nodes freezeConfig(FreezeConfig freezeConfigRequest) {
        FreezeConfigResponse freezeConfigResponse = callDUDelimService(objectFactory.createFreezeConfig(freezeConfigRequest));
        String xmlString = freezeConfigResponse.getReturn();

           logError(xmlString);
        return unmarshalNode(xmlString);
    }
    @Override
    public Nodes getConfiguration(GetConfiguration getConfigurationRequest) {
        GetConfigurationResponse getConfigurationResponse = callDUDelimService(objectFactory.createGetConfiguration(getConfigurationRequest));
        String xmlString = getConfigurationResponse.getReturn();

           logError(xmlString);
        return unmarshalNode(xmlString);
    }
    @Override
    public Nodes getDUs(GetDUs getDUsRequest) {
        GetDUsResponse getDUsResponse = callDUDelimService(objectFactory.createGetDUs(getDUsRequest));
        String xmlString = getDUsResponse.getReturn();

           logError(xmlString);
        return unmarshalNode(xmlString);
    }
    @Override
    public Nodes getFavs(GetFavs getFavsRequest) {
        GetFavsResponse getFavsResponse = callDUDelimService(objectFactory.createGetFavs(getFavsRequest));
        String xmlString = getFavsResponse.getReturn().toString();

           logError(xmlString);
        return unmarshalNode(xmlString);
    }
    @Override
    public Nodes getGUID(GetGUID getGUIDRequest) {
        GetGUIDResponse getGUIDResponse = callDUDelimService(objectFactory.createGetGUID(getGUIDRequest));
        String xmlString = getGUIDResponse.getReturn();

           logError(xmlString);
        return unmarshalNode(xmlString);
    }
    @Override
    public Nodes getHiveXml(GetHiveXml getHiveXmlRequest) {
        GetHiveXmlResponse getHiveXmlResponse = callDUDelimService(objectFactory.createGetHiveXml(getHiveXmlRequest));
        String xmlString = getHiveXmlResponse.getReturn();

           logError(xmlString);
        return unmarshalNode(xmlString);
    }
    @Override
    public Nodes getHiveZip(GetHiveZip getHiveZipRequest) {
        GetHiveZipResponse getHiveZipResponse = callDUDelimService(objectFactory.createGetHiveZip(getHiveZipRequest));
        String xmlString = getHiveZipResponse.getReturn();

           logError(xmlString);
        return unmarshalNode(xmlString);
    }

    @Override
    public Nodes getRefsByDU(GetRefsByDU getRefsByDURequest) {
        GetRefsByDUResponse getRefsByDUResponse = callDUDelimService(objectFactory.createGetRefsByDU(getRefsByDURequest));
        String xmlString = getRefsByDUResponse.getReturn();

           logError(xmlString);
        return unmarshalNode(xmlString);
    }
    @Override
    public Nodes getStatus(GetStatus getStatusRequest) {
        GetStatusResponse getStatusResponse = callDUDelimService(objectFactory.createGetStatus(getStatusRequest));
        String xmlString = getStatusResponse.getReturn();

           logError(xmlString);
        return unmarshalNode(xmlString);
    }
    @Override
    public Nodes getWSVersion(GetWSVersion getWSVersionRequest) {
        GetWSVersionResponse getWSVersionResponse = callDUDelimService(objectFactory.createGetWSVersion(getWSVersionRequest));
        String xmlString = getWSVersionResponse.getReturn();

           logError(xmlString);
        return unmarshalNode(xmlString);
    }
    @Override
    public Nodes heartbeat(Heartbeat heartbeatRequest) {
        HeartbeatResponse heartbeatResponse = callDUDelimService(objectFactory.createHeartbeat(heartbeatRequest));
        String xmlString = heartbeatResponse.getReturn();
        logError(xmlString);
        return unmarshalNode(xmlString);
    }
    @Override
    public Nodes removeFav(RemoveFav removeFavRequest) {
        RemoveFavResponse removeFavResponse = callDUDelimService(objectFactory.createRemoveFav(removeFavRequest));
        String xmlString = removeFavResponse.getReturn();
        logError(xmlString);
        return unmarshalNode(xmlString);
    }
    @Override
    public Nodes resetConfig(ResetConfig resetConfigRequest) {
        ResetConfigResponse resetConfigResponse = callDUDelimService(objectFactory.createResetConfig(resetConfigRequest));
        String xmlString = resetConfigResponse.getReturn();
        logError(xmlString);
        return unmarshalNode(xmlString);
    }
    @Override
    public Nodes saveConfig(SaveConfig saveConfigRequest) {
        SaveConfigResponse saveConfigResponse = callDUDelimService(objectFactory.createSaveConfig(saveConfigRequest));
        String xmlString = saveConfigResponse.getReturn();
        logError(xmlString);
        return unmarshalNode(xmlString);
    }
    @Override
    public Nodes setCstic(SetCstic setCsticRequest) {
        SetCsticResponse setCsticResponse = callDUDelimService(objectFactory.createSetCstic(setCsticRequest));
        String xmlString = setCsticResponse.getReturn();
        logError(xmlString);
        return unmarshalNode(xmlString);
    }
    @Override
    public Nodes setCstics(SetCstics setCsticsRequest) {
        SetCsticsResponse setCsticsResponse = callDUDelimService(objectFactory.createSetCstics(setCsticsRequest));
        String xmlString = setCsticsResponse.getReturn();
        logError(xmlString);
        return unmarshalNode(xmlString);
    }
    @Override
    public Nodes setCsticWhenPossible(SetCsticWhenPossible setCsticWhenPossible) {
        SetCsticWhenPossibleResponse setCsticWhenPossibleResponse = callDUDelimService(objectFactory.createSetCsticWhenPossible(setCsticWhenPossible));
        String xmlString = setCsticWhenPossibleResponse.getReturn();
        logError(xmlString);
        return unmarshalNode(xmlString);
    }
    @Override
    public Nodes setFav(SetFav setFavRequest) {
        SetFavResponse setFavResponse = callDUDelimService(objectFactory.createSetFav(setFavRequest));
        String xmlString = setFavResponse.getReturn();
        logError(xmlString);
        return unmarshalNode(xmlString);
    }
    @Override
    public Nodes setIedCstics(SetIedCstics setIedCsticsRequest) {
        SetIedCsticsResponse setIedCsticsResponse = callDUDelimService(objectFactory.createSetIedCstics(setIedCsticsRequest));
        String xmlString = setIedCsticsResponse.getReturn();
        logError(xmlString);
        return unmarshalNode(xmlString);
    }
    @Override
    public Nodes setLabelCstics(SetLabelCstics setLabelCsticsRequest) {
        SetLabelCsticsResponse setLabelCsticsResponse = callDUDelimService(objectFactory.createSetLabelCstics(setLabelCsticsRequest));
        String xmlString = setLabelCsticsResponse.getReturn();
        logError(xmlString);
        return unmarshalNode(xmlString);
    }
    @Override
    public Nodes updateFav(UpdateFav updateFavRequest) {
        UpdateFavResponse updateFavResponse = callDUDelimService(objectFactory.createUpdateFav(updateFavRequest));
        String xmlString = updateFavResponse.getReturn();
        logError(xmlString);
        return unmarshalNode(xmlString);
    }
    @Override
    public Nodes uploadConfig(UploadConfig uploadConfigRequest) {
        UploadConfigResponse uploadConfigResponse = callDUDelimService(objectFactory.createUploadConfig(uploadConfigRequest));
        String xmlString = uploadConfigResponse.getReturn();
        logError(xmlString);
        return unmarshalNode(xmlString);
    }
    @Override
    public Nodes uploadConfigZip(UploadConfigZip uploadConfigZipRequest) {
        UploadConfigZipResponse uploadConfigZipResponse = callDUDelimService(objectFactory.createUploadConfigZip(uploadConfigZipRequest));
        String xmlString = uploadConfigZipResponse.getReturn();
        logError(xmlString);
        return unmarshalNode(xmlString);
    }
}
