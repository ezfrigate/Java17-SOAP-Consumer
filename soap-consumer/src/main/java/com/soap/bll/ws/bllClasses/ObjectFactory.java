
package ws.bllClasses;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws.bllClasses package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CreateConfigAndInitFromRef_QNAME = new QName("http://schneider.com/bll/ws/", "createConfigAndInitFromRef");
    private final static QName _CreateConfigAndInitFromRefResponse_QNAME = new QName("http://schneider.com/bll/ws/", "createConfigAndInitFromRefResponse");
    private final static QName _CreateConfigForDu_QNAME = new QName("http://schneider.com/bll/ws/", "createConfigForDu");
    private final static QName _CreateConfigForDuResponse_QNAME = new QName("http://schneider.com/bll/ws/", "createConfigForDuResponse");
    private final static QName _CreateConfigForKB_QNAME = new QName("http://schneider.com/bll/ws/", "createConfigForKB");
    private final static QName _CreateConfigForKBResponse_QNAME = new QName("http://schneider.com/bll/ws/", "createConfigForKBResponse");
    private final static QName _CreateConfigFromRef_QNAME = new QName("http://schneider.com/bll/ws/", "createConfigFromRef");
    private final static QName _CreateConfigFromRefForDu_QNAME = new QName("http://schneider.com/bll/ws/", "createConfigFromRefForDu");
    private final static QName _CreateConfigFromRefForDuResponse_QNAME = new QName("http://schneider.com/bll/ws/", "createConfigFromRefForDuResponse");
    private final static QName _CreateConfigFromRefResponse_QNAME = new QName("http://schneider.com/bll/ws/", "createConfigFromRefResponse");
    private final static QName _DeleteConfig_QNAME = new QName("http://schneider.com/bll/ws/", "deleteConfig");
    private final static QName _DeleteConfigResponse_QNAME = new QName("http://schneider.com/bll/ws/", "deleteConfigResponse");
    private final static QName _DeleteCstic_QNAME = new QName("http://schneider.com/bll/ws/", "deleteCstic");
    private final static QName _DeleteCsticResponse_QNAME = new QName("http://schneider.com/bll/ws/", "deleteCsticResponse");
    private final static QName _DeleteCsticValue_QNAME = new QName("http://schneider.com/bll/ws/", "deleteCsticValue");
    private final static QName _DeleteCsticValueResponse_QNAME = new QName("http://schneider.com/bll/ws/", "deleteCsticValueResponse");
    private final static QName _DeleteCstics_QNAME = new QName("http://schneider.com/bll/ws/", "deleteCstics");
    private final static QName _DeleteCsticsResponse_QNAME = new QName("http://schneider.com/bll/ws/", "deleteCsticsResponse");
    private final static QName _DeletePersistedConfig_QNAME = new QName("http://schneider.com/bll/ws/", "deletePersistedConfig");
    private final static QName _DeletePersistedConfigResponse_QNAME = new QName("http://schneider.com/bll/ws/", "deletePersistedConfigResponse");
    private final static QName _DownloadConfig_QNAME = new QName("http://schneider.com/bll/ws/", "downloadConfig");
    private final static QName _DownloadConfigResponse_QNAME = new QName("http://schneider.com/bll/ws/", "downloadConfigResponse");
    private final static QName _DownloadPersistedConfig_QNAME = new QName("http://schneider.com/bll/ws/", "downloadPersistedConfig");
    private final static QName _DownloadPersistedConfigResponse_QNAME = new QName("http://schneider.com/bll/ws/", "downloadPersistedConfigResponse");
    private final static QName _DownloadPersistedConfigService_QNAME = new QName("http://schneider.com/bll/ws/", "downloadPersistedConfigService");
    private final static QName _DownloadPersistedConfigServiceResponse_QNAME = new QName("http://schneider.com/bll/ws/", "downloadPersistedConfigServiceResponse");
    private final static QName _DownloadPersistedConfigZip_QNAME = new QName("http://schneider.com/bll/ws/", "downloadPersistedConfigZip");
    private final static QName _DownloadPersistedConfigZipResponse_QNAME = new QName("http://schneider.com/bll/ws/", "downloadPersistedConfigZipResponse");
    private final static QName _FreezeConfig_QNAME = new QName("http://schneider.com/bll/ws/", "freezeConfig");
    private final static QName _FreezeConfigResponse_QNAME = new QName("http://schneider.com/bll/ws/", "freezeConfigResponse");
    private final static QName _GetConfiguration_QNAME = new QName("http://schneider.com/bll/ws/", "getConfiguration");
    private final static QName _GetConfigurationResponse_QNAME = new QName("http://schneider.com/bll/ws/", "getConfigurationResponse");
    private final static QName _GetDUs_QNAME = new QName("http://schneider.com/bll/ws/", "getDUs");
    private final static QName _GetDUsResponse_QNAME = new QName("http://schneider.com/bll/ws/", "getDUsResponse");
    private final static QName _GetFavs_QNAME = new QName("http://schneider.com/bll/ws/", "getFavs");
    private final static QName _GetFavsResponse_QNAME = new QName("http://schneider.com/bll/ws/", "getFavsResponse");
    private final static QName _GetGUID_QNAME = new QName("http://schneider.com/bll/ws/", "getGUID");
    private final static QName _GetGUIDResponse_QNAME = new QName("http://schneider.com/bll/ws/", "getGUIDResponse");
    private final static QName _GetHiveXml_QNAME = new QName("http://schneider.com/bll/ws/", "getHiveXml");
    private final static QName _GetHiveXmlResponse_QNAME = new QName("http://schneider.com/bll/ws/", "getHiveXmlResponse");
    private final static QName _GetHiveZip_QNAME = new QName("http://schneider.com/bll/ws/", "getHiveZip");
    private final static QName _GetHiveZipResponse_QNAME = new QName("http://schneider.com/bll/ws/", "getHiveZipResponse");
    private final static QName _GetPersistedConfig_QNAME = new QName("http://schneider.com/bll/ws/", "getPersistedConfig");
    private final static QName _GetPersistedConfigResponse_QNAME = new QName("http://schneider.com/bll/ws/", "getPersistedConfigResponse");
    private final static QName _GetRefsByDU_QNAME = new QName("http://schneider.com/bll/ws/", "getRefsByDU");
    private final static QName _GetRefsByDUResponse_QNAME = new QName("http://schneider.com/bll/ws/", "getRefsByDUResponse");
    private final static QName _GetStatus_QNAME = new QName("http://schneider.com/bll/ws/", "getStatus");
    private final static QName _GetStatusResponse_QNAME = new QName("http://schneider.com/bll/ws/", "getStatusResponse");
    private final static QName _GetWSVersion_QNAME = new QName("http://schneider.com/bll/ws/", "getWSVersion");
    private final static QName _GetWSVersionResponse_QNAME = new QName("http://schneider.com/bll/ws/", "getWSVersionResponse");
    private final static QName _Heartbeat_QNAME = new QName("http://schneider.com/bll/ws/", "heartbeat");
    private final static QName _HeartbeatResponse_QNAME = new QName("http://schneider.com/bll/ws/", "heartbeatResponse");
    private final static QName _RemoveFav_QNAME = new QName("http://schneider.com/bll/ws/", "removeFav");
    private final static QName _RemoveFavResponse_QNAME = new QName("http://schneider.com/bll/ws/", "removeFavResponse");
    private final static QName _ResetConfig_QNAME = new QName("http://schneider.com/bll/ws/", "resetConfig");
    private final static QName _ResetConfigResponse_QNAME = new QName("http://schneider.com/bll/ws/", "resetConfigResponse");
    private final static QName _SaveConfig_QNAME = new QName("http://schneider.com/bll/ws/", "saveConfig");
    private final static QName _SaveConfigResponse_QNAME = new QName("http://schneider.com/bll/ws/", "saveConfigResponse");
    private final static QName _SetCstic_QNAME = new QName("http://schneider.com/bll/ws/", "setCstic");
    private final static QName _SetCsticResponse_QNAME = new QName("http://schneider.com/bll/ws/", "setCsticResponse");
    private final static QName _SetCsticWhenPossible_QNAME = new QName("http://schneider.com/bll/ws/", "setCsticWhenPossible");
    private final static QName _SetCsticWhenPossibleResponse_QNAME = new QName("http://schneider.com/bll/ws/", "setCsticWhenPossibleResponse");
    private final static QName _SetCstics_QNAME = new QName("http://schneider.com/bll/ws/", "setCstics");
    private final static QName _SetCsticsResponse_QNAME = new QName("http://schneider.com/bll/ws/", "setCsticsResponse");
    private final static QName _SetFav_QNAME = new QName("http://schneider.com/bll/ws/", "setFav");
    private final static QName _SetFavResponse_QNAME = new QName("http://schneider.com/bll/ws/", "setFavResponse");
    private final static QName _SetIedCstics_QNAME = new QName("http://schneider.com/bll/ws/", "setIedCstics");
    private final static QName _SetIedCsticsResponse_QNAME = new QName("http://schneider.com/bll/ws/", "setIedCsticsResponse");
    private final static QName _SetLabelCstics_QNAME = new QName("http://schneider.com/bll/ws/", "setLabelCstics");
    private final static QName _SetLabelCsticsResponse_QNAME = new QName("http://schneider.com/bll/ws/", "setLabelCsticsResponse");
    private final static QName _UpdateFav_QNAME = new QName("http://schneider.com/bll/ws/", "updateFav");
    private final static QName _UpdateFavResponse_QNAME = new QName("http://schneider.com/bll/ws/", "updateFavResponse");
    private final static QName _UploadConfig_QNAME = new QName("http://schneider.com/bll/ws/", "uploadConfig");
    private final static QName _UploadConfigResponse_QNAME = new QName("http://schneider.com/bll/ws/", "uploadConfigResponse");
    private final static QName _UploadConfigZip_QNAME = new QName("http://schneider.com/bll/ws/", "uploadConfigZip");
    private final static QName _UploadConfigZipResponse_QNAME = new QName("http://schneider.com/bll/ws/", "uploadConfigZipResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws.bllClasses
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateConfigAndInitFromRef }
     * 
     */
    public CreateConfigAndInitFromRef createCreateConfigAndInitFromRef() {
        return new CreateConfigAndInitFromRef();
    }

    /**
     * Create an instance of {@link CreateConfigAndInitFromRefResponse }
     * 
     */
    public CreateConfigAndInitFromRefResponse createCreateConfigAndInitFromRefResponse() {
        return new CreateConfigAndInitFromRefResponse();
    }

    /**
     * Create an instance of {@link CreateConfigForDu }
     * 
     */
    public CreateConfigForDu createCreateConfigForDu() {
        return new CreateConfigForDu();
    }

    /**
     * Create an instance of {@link CreateConfigForDuResponse }
     * 
     */
    public CreateConfigForDuResponse createCreateConfigForDuResponse() {
        return new CreateConfigForDuResponse();
    }

    /**
     * Create an instance of {@link CreateConfigForKB }
     * 
     */
    public CreateConfigForKB createCreateConfigForKB() {
        return new CreateConfigForKB();
    }

    /**
     * Create an instance of {@link CreateConfigForKBResponse }
     * 
     */
    public CreateConfigForKBResponse createCreateConfigForKBResponse() {
        return new CreateConfigForKBResponse();
    }

    /**
     * Create an instance of {@link CreateConfigFromRef }
     * 
     */
    public CreateConfigFromRef createCreateConfigFromRef() {
        return new CreateConfigFromRef();
    }

    /**
     * Create an instance of {@link CreateConfigFromRefForDu }
     * 
     */
    public CreateConfigFromRefForDu createCreateConfigFromRefForDu() {
        return new CreateConfigFromRefForDu();
    }

    /**
     * Create an instance of {@link CreateConfigFromRefForDuResponse }
     * 
     */
    public CreateConfigFromRefForDuResponse createCreateConfigFromRefForDuResponse() {
        return new CreateConfigFromRefForDuResponse();
    }

    /**
     * Create an instance of {@link CreateConfigFromRefResponse }
     * 
     */
    public CreateConfigFromRefResponse createCreateConfigFromRefResponse() {
        return new CreateConfigFromRefResponse();
    }

    /**
     * Create an instance of {@link DeleteConfig }
     * 
     */
    public DeleteConfig createDeleteConfig() {
        return new DeleteConfig();
    }

    /**
     * Create an instance of {@link DeleteConfigResponse }
     * 
     */
    public DeleteConfigResponse createDeleteConfigResponse() {
        return new DeleteConfigResponse();
    }

    /**
     * Create an instance of {@link DeleteCstic }
     * 
     */
    public DeleteCstic createDeleteCstic() {
        return new DeleteCstic();
    }

    /**
     * Create an instance of {@link DeleteCsticResponse }
     * 
     */
    public DeleteCsticResponse createDeleteCsticResponse() {
        return new DeleteCsticResponse();
    }

    /**
     * Create an instance of {@link DeleteCsticValue }
     * 
     */
    public DeleteCsticValue createDeleteCsticValue() {
        return new DeleteCsticValue();
    }

    /**
     * Create an instance of {@link DeleteCsticValueResponse }
     * 
     */
    public DeleteCsticValueResponse createDeleteCsticValueResponse() {
        return new DeleteCsticValueResponse();
    }

    /**
     * Create an instance of {@link DeleteCstics }
     * 
     */
    public DeleteCstics createDeleteCstics() {
        return new DeleteCstics();
    }

    /**
     * Create an instance of {@link DeleteCsticsResponse }
     * 
     */
    public DeleteCsticsResponse createDeleteCsticsResponse() {
        return new DeleteCsticsResponse();
    }

    /**
     * Create an instance of {@link DeletePersistedConfig }
     * 
     */
    public DeletePersistedConfig createDeletePersistedConfig() {
        return new DeletePersistedConfig();
    }

    /**
     * Create an instance of {@link DeletePersistedConfigResponse }
     * 
     */
    public DeletePersistedConfigResponse createDeletePersistedConfigResponse() {
        return new DeletePersistedConfigResponse();
    }

    /**
     * Create an instance of {@link DownloadConfig }
     * 
     */
    public DownloadConfig createDownloadConfig() {
        return new DownloadConfig();
    }

    /**
     * Create an instance of {@link DownloadConfigResponse }
     * 
     */
    public DownloadConfigResponse createDownloadConfigResponse() {
        return new DownloadConfigResponse();
    }

    /**
     * Create an instance of {@link DownloadPersistedConfig }
     * 
     */
    public DownloadPersistedConfig createDownloadPersistedConfig() {
        return new DownloadPersistedConfig();
    }

    /**
     * Create an instance of {@link DownloadPersistedConfigResponse }
     * 
     */
    public DownloadPersistedConfigResponse createDownloadPersistedConfigResponse() {
        return new DownloadPersistedConfigResponse();
    }

    /**
     * Create an instance of {@link DownloadPersistedConfigService }
     * 
     */
    public DownloadPersistedConfigService createDownloadPersistedConfigService() {
        return new DownloadPersistedConfigService();
    }

    /**
     * Create an instance of {@link DownloadPersistedConfigServiceResponse }
     * 
     */
    public DownloadPersistedConfigServiceResponse createDownloadPersistedConfigServiceResponse() {
        return new DownloadPersistedConfigServiceResponse();
    }

    /**
     * Create an instance of {@link DownloadPersistedConfigZip }
     * 
     */
    public DownloadPersistedConfigZip createDownloadPersistedConfigZip() {
        return new DownloadPersistedConfigZip();
    }

    /**
     * Create an instance of {@link DownloadPersistedConfigZipResponse }
     * 
     */
    public DownloadPersistedConfigZipResponse createDownloadPersistedConfigZipResponse() {
        return new DownloadPersistedConfigZipResponse();
    }

    /**
     * Create an instance of {@link FreezeConfig }
     * 
     */
    public FreezeConfig createFreezeConfig() {
        return new FreezeConfig();
    }

    /**
     * Create an instance of {@link FreezeConfigResponse }
     * 
     */
    public FreezeConfigResponse createFreezeConfigResponse() {
        return new FreezeConfigResponse();
    }

    /**
     * Create an instance of {@link GetConfiguration }
     * 
     */
    public GetConfiguration createGetConfiguration() {
        return new GetConfiguration();
    }

    /**
     * Create an instance of {@link GetConfigurationResponse }
     * 
     */
    public GetConfigurationResponse createGetConfigurationResponse() {
        return new GetConfigurationResponse();
    }

    /**
     * Create an instance of {@link GetDUs }
     * 
     */
    public GetDUs createGetDUs() {
        return new GetDUs();
    }

    /**
     * Create an instance of {@link GetDUsResponse }
     * 
     */
    public GetDUsResponse createGetDUsResponse() {
        return new GetDUsResponse();
    }

    /**
     * Create an instance of {@link GetFavs }
     * 
     */
    public GetFavs createGetFavs() {
        return new GetFavs();
    }

    /**
     * Create an instance of {@link GetFavsResponse }
     * 
     */
    public GetFavsResponse createGetFavsResponse() {
        return new GetFavsResponse();
    }

    /**
     * Create an instance of {@link GetGUID }
     * 
     */
    public GetGUID createGetGUID() {
        return new GetGUID();
    }

    /**
     * Create an instance of {@link GetGUIDResponse }
     * 
     */
    public GetGUIDResponse createGetGUIDResponse() {
        return new GetGUIDResponse();
    }

    /**
     * Create an instance of {@link GetHiveXml }
     * 
     */
    public GetHiveXml createGetHiveXml() {
        return new GetHiveXml();
    }

    /**
     * Create an instance of {@link GetHiveXmlResponse }
     * 
     */
    public GetHiveXmlResponse createGetHiveXmlResponse() {
        return new GetHiveXmlResponse();
    }

    /**
     * Create an instance of {@link GetHiveZip }
     * 
     */
    public GetHiveZip createGetHiveZip() {
        return new GetHiveZip();
    }

    /**
     * Create an instance of {@link GetHiveZipResponse }
     * 
     */
    public GetHiveZipResponse createGetHiveZipResponse() {
        return new GetHiveZipResponse();
    }

    /**
     * Create an instance of {@link GetPersistedConfig }
     * 
     */
    public GetPersistedConfig createGetPersistedConfig() {
        return new GetPersistedConfig();
    }

    /**
     * Create an instance of {@link GetPersistedConfigResponse }
     * 
     */
    public GetPersistedConfigResponse createGetPersistedConfigResponse() {
        return new GetPersistedConfigResponse();
    }

    /**
     * Create an instance of {@link GetRefsByDU }
     * 
     */
    public GetRefsByDU createGetRefsByDU() {
        return new GetRefsByDU();
    }

    /**
     * Create an instance of {@link GetRefsByDUResponse }
     * 
     */
    public GetRefsByDUResponse createGetRefsByDUResponse() {
        return new GetRefsByDUResponse();
    }

    /**
     * Create an instance of {@link GetStatus }
     * 
     */
    public GetStatus createGetStatus() {
        return new GetStatus();
    }

    /**
     * Create an instance of {@link GetStatusResponse }
     * 
     */
    public GetStatusResponse createGetStatusResponse() {
        return new GetStatusResponse();
    }

    /**
     * Create an instance of {@link GetWSVersion }
     * 
     */
    public GetWSVersion createGetWSVersion() {
        return new GetWSVersion();
    }

    /**
     * Create an instance of {@link GetWSVersionResponse }
     * 
     */
    public GetWSVersionResponse createGetWSVersionResponse() {
        return new GetWSVersionResponse();
    }

    /**
     * Create an instance of {@link Heartbeat }
     * 
     */
    public Heartbeat createHeartbeat() {
        return new Heartbeat();
    }

    /**
     * Create an instance of {@link HeartbeatResponse }
     * 
     */
    public HeartbeatResponse createHeartbeatResponse() {
        return new HeartbeatResponse();
    }

    /**
     * Create an instance of {@link RemoveFav }
     * 
     */
    public RemoveFav createRemoveFav() {
        return new RemoveFav();
    }

    /**
     * Create an instance of {@link RemoveFavResponse }
     * 
     */
    public RemoveFavResponse createRemoveFavResponse() {
        return new RemoveFavResponse();
    }

    /**
     * Create an instance of {@link ResetConfig }
     * 
     */
    public ResetConfig createResetConfig() {
        return new ResetConfig();
    }

    /**
     * Create an instance of {@link ResetConfigResponse }
     * 
     */
    public ResetConfigResponse createResetConfigResponse() {
        return new ResetConfigResponse();
    }

    /**
     * Create an instance of {@link SaveConfig }
     * 
     */
    public SaveConfig createSaveConfig() {
        return new SaveConfig();
    }

    /**
     * Create an instance of {@link SaveConfigResponse }
     * 
     */
    public SaveConfigResponse createSaveConfigResponse() {
        return new SaveConfigResponse();
    }

    /**
     * Create an instance of {@link SetCstic }
     * 
     */
    public SetCstic createSetCstic() {
        return new SetCstic();
    }

    /**
     * Create an instance of {@link SetCsticResponse }
     * 
     */
    public SetCsticResponse createSetCsticResponse() {
        return new SetCsticResponse();
    }

    /**
     * Create an instance of {@link SetCsticWhenPossible }
     * 
     */
    public SetCsticWhenPossible createSetCsticWhenPossible() {
        return new SetCsticWhenPossible();
    }

    /**
     * Create an instance of {@link SetCsticWhenPossibleResponse }
     * 
     */
    public SetCsticWhenPossibleResponse createSetCsticWhenPossibleResponse() {
        return new SetCsticWhenPossibleResponse();
    }

    /**
     * Create an instance of {@link SetCstics }
     * 
     */
    public SetCstics createSetCstics() {
        return new SetCstics();
    }

    /**
     * Create an instance of {@link SetCsticsResponse }
     * 
     */
    public SetCsticsResponse createSetCsticsResponse() {
        return new SetCsticsResponse();
    }

    /**
     * Create an instance of {@link SetFav }
     * 
     */
    public SetFav createSetFav() {
        return new SetFav();
    }

    /**
     * Create an instance of {@link SetFavResponse }
     * 
     */
    public SetFavResponse createSetFavResponse() {
        return new SetFavResponse();
    }

    /**
     * Create an instance of {@link SetIedCstics }
     * 
     */
    public SetIedCstics createSetIedCstics() {
        return new SetIedCstics();
    }

    /**
     * Create an instance of {@link SetIedCsticsResponse }
     * 
     */
    public SetIedCsticsResponse createSetIedCsticsResponse() {
        return new SetIedCsticsResponse();
    }

    /**
     * Create an instance of {@link SetLabelCstics }
     * 
     */
    public SetLabelCstics createSetLabelCstics() {
        return new SetLabelCstics();
    }

    /**
     * Create an instance of {@link SetLabelCsticsResponse }
     * 
     */
    public SetLabelCsticsResponse createSetLabelCsticsResponse() {
        return new SetLabelCsticsResponse();
    }

    /**
     * Create an instance of {@link UpdateFav }
     * 
     */
    public UpdateFav createUpdateFav() {
        return new UpdateFav();
    }

    /**
     * Create an instance of {@link UpdateFavResponse }
     * 
     */
    public UpdateFavResponse createUpdateFavResponse() {
        return new UpdateFavResponse();
    }

    /**
     * Create an instance of {@link UploadConfig }
     * 
     */
    public UploadConfig createUploadConfig() {
        return new UploadConfig();
    }

    /**
     * Create an instance of {@link UploadConfigResponse }
     * 
     */
    public UploadConfigResponse createUploadConfigResponse() {
        return new UploadConfigResponse();
    }

    /**
     * Create an instance of {@link UploadConfigZip }
     * 
     */
    public UploadConfigZip createUploadConfigZip() {
        return new UploadConfigZip();
    }

    /**
     * Create an instance of {@link UploadConfigZipResponse }
     * 
     */
    public UploadConfigZipResponse createUploadConfigZipResponse() {
        return new UploadConfigZipResponse();
    }

    /**
     * Create an instance of {@link SetCsticDef }
     * 
     */
    public SetCsticDef createSetCsticDef() {
        return new SetCsticDef();
    }

    /**
     * Create an instance of {@link GetFavsDef }
     * 
     */
    public GetFavsDef createGetFavsDef() {
        return new GetFavsDef();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateConfigAndInitFromRef }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateConfigAndInitFromRef }{@code >}
     */
    @XmlElementDecl(namespace = "http://schneider.com/bll/ws/", name = "createConfigAndInitFromRef")
    public JAXBElement<CreateConfigAndInitFromRef> createCreateConfigAndInitFromRef(CreateConfigAndInitFromRef value) {
        return new JAXBElement<CreateConfigAndInitFromRef>(_CreateConfigAndInitFromRef_QNAME, CreateConfigAndInitFromRef.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateConfigAndInitFromRefResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateConfigAndInitFromRefResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schneider.com/bll/ws/", name = "createConfigAndInitFromRefResponse")
    public JAXBElement<CreateConfigAndInitFromRefResponse> createCreateConfigAndInitFromRefResponse(CreateConfigAndInitFromRefResponse value) {
        return new JAXBElement<CreateConfigAndInitFromRefResponse>(_CreateConfigAndInitFromRefResponse_QNAME, CreateConfigAndInitFromRefResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateConfigForDu }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateConfigForDu }{@code >}
     */
    @XmlElementDecl(namespace = "http://schneider.com/bll/ws/", name = "createConfigForDu")
    public JAXBElement<CreateConfigForDu> createCreateConfigForDu(CreateConfigForDu value) {
        return new JAXBElement<CreateConfigForDu>(_CreateConfigForDu_QNAME, CreateConfigForDu.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateConfigForDuResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateConfigForDuResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schneider.com/bll/ws/", name = "createConfigForDuResponse")
    public JAXBElement<CreateConfigForDuResponse> createCreateConfigForDuResponse(CreateConfigForDuResponse value) {
        return new JAXBElement<CreateConfigForDuResponse>(_CreateConfigForDuResponse_QNAME, CreateConfigForDuResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateConfigForKB }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateConfigForKB }{@code >}
     */
    @XmlElementDecl(namespace = "http://schneider.com/bll/ws/", name = "createConfigForKB")
    public JAXBElement<CreateConfigForKB> createCreateConfigForKB(CreateConfigForKB value) {
        return new JAXBElement<CreateConfigForKB>(_CreateConfigForKB_QNAME, CreateConfigForKB.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateConfigForKBResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateConfigForKBResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schneider.com/bll/ws/", name = "createConfigForKBResponse")
    public JAXBElement<CreateConfigForKBResponse> createCreateConfigForKBResponse(CreateConfigForKBResponse value) {
        return new JAXBElement<CreateConfigForKBResponse>(_CreateConfigForKBResponse_QNAME, CreateConfigForKBResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateConfigFromRef }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateConfigFromRef }{@code >}
     */
    @XmlElementDecl(namespace = "http://schneider.com/bll/ws/", name = "createConfigFromRef")
    public JAXBElement<CreateConfigFromRef> createCreateConfigFromRef(CreateConfigFromRef value) {
        return new JAXBElement<CreateConfigFromRef>(_CreateConfigFromRef_QNAME, CreateConfigFromRef.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateConfigFromRefForDu }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateConfigFromRefForDu }{@code >}
     */
    @XmlElementDecl(namespace = "http://schneider.com/bll/ws/", name = "createConfigFromRefForDu")
    public JAXBElement<CreateConfigFromRefForDu> createCreateConfigFromRefForDu(CreateConfigFromRefForDu value) {
        return new JAXBElement<CreateConfigFromRefForDu>(_CreateConfigFromRefForDu_QNAME, CreateConfigFromRefForDu.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateConfigFromRefForDuResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateConfigFromRefForDuResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schneider.com/bll/ws/", name = "createConfigFromRefForDuResponse")
    public JAXBElement<CreateConfigFromRefForDuResponse> createCreateConfigFromRefForDuResponse(CreateConfigFromRefForDuResponse value) {
        return new JAXBElement<CreateConfigFromRefForDuResponse>(_CreateConfigFromRefForDuResponse_QNAME, CreateConfigFromRefForDuResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateConfigFromRefResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateConfigFromRefResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schneider.com/bll/ws/", name = "createConfigFromRefResponse")
    public JAXBElement<CreateConfigFromRefResponse> createCreateConfigFromRefResponse(CreateConfigFromRefResponse value) {
        return new JAXBElement<CreateConfigFromRefResponse>(_CreateConfigFromRefResponse_QNAME, CreateConfigFromRefResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteConfig }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteConfig }{@code >}
     */
    @XmlElementDecl(namespace = "http://schneider.com/bll/ws/", name = "deleteConfig")
    public JAXBElement<DeleteConfig> createDeleteConfig(DeleteConfig value) {
        return new JAXBElement<DeleteConfig>(_DeleteConfig_QNAME, DeleteConfig.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteConfigResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteConfigResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schneider.com/bll/ws/", name = "deleteConfigResponse")
    public JAXBElement<DeleteConfigResponse> createDeleteConfigResponse(DeleteConfigResponse value) {
        return new JAXBElement<DeleteConfigResponse>(_DeleteConfigResponse_QNAME, DeleteConfigResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCstic }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteCstic }{@code >}
     */
    @XmlElementDecl(namespace = "http://schneider.com/bll/ws/", name = "deleteCstic")
    public JAXBElement<DeleteCstic> createDeleteCstic(DeleteCstic value) {
        return new JAXBElement<DeleteCstic>(_DeleteCstic_QNAME, DeleteCstic.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCsticResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteCsticResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schneider.com/bll/ws/", name = "deleteCsticResponse")
    public JAXBElement<DeleteCsticResponse> createDeleteCsticResponse(DeleteCsticResponse value) {
        return new JAXBElement<DeleteCsticResponse>(_DeleteCsticResponse_QNAME, DeleteCsticResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCsticValue }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteCsticValue }{@code >}
     */
    @XmlElementDecl(namespace = "http://schneider.com/bll/ws/", name = "deleteCsticValue")
    public JAXBElement<DeleteCsticValue> createDeleteCsticValue(DeleteCsticValue value) {
        return new JAXBElement<DeleteCsticValue>(_DeleteCsticValue_QNAME, DeleteCsticValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCsticValueResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteCsticValueResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schneider.com/bll/ws/", name = "deleteCsticValueResponse")
    public JAXBElement<DeleteCsticValueResponse> createDeleteCsticValueResponse(DeleteCsticValueResponse value) {
        return new JAXBElement<DeleteCsticValueResponse>(_DeleteCsticValueResponse_QNAME, DeleteCsticValueResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCstics }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteCstics }{@code >}
     */
    @XmlElementDecl(namespace = "http://schneider.com/bll/ws/", name = "deleteCstics")
    public JAXBElement<DeleteCstics> createDeleteCstics(DeleteCstics value) {
        return new JAXBElement<DeleteCstics>(_DeleteCstics_QNAME, DeleteCstics.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCsticsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteCsticsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schneider.com/bll/ws/", name = "deleteCsticsResponse")
    public JAXBElement<DeleteCsticsResponse> createDeleteCsticsResponse(DeleteCsticsResponse value) {
        return new JAXBElement<DeleteCsticsResponse>(_DeleteCsticsResponse_QNAME, DeleteCsticsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePersistedConfig }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeletePersistedConfig }{@code >}
     */
    @XmlElementDecl(namespace = "http://schneider.com/bll/ws/", name = "deletePersistedConfig")
    public JAXBElement<DeletePersistedConfig> createDeletePersistedConfig(DeletePersistedConfig value) {
        return new JAXBElement<DeletePersistedConfig>(_DeletePersistedConfig_QNAME, DeletePersistedConfig.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePersistedConfigResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeletePersistedConfigResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schneider.com/bll/ws/", name = "deletePersistedConfigResponse")
    public JAXBElement<DeletePersistedConfigResponse> createDeletePersistedConfigResponse(DeletePersistedConfigResponse value) {
        return new JAXBElement<DeletePersistedConfigResponse>(_DeletePersistedConfigResponse_QNAME, DeletePersistedConfigResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadConfig }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DownloadConfig }{@code >}
     */
    @XmlElementDecl(namespace = "http://schneider.com/bll/ws/", name = "downloadConfig")
    public JAXBElement<DownloadConfig> createDownloadConfig(DownloadConfig value) {
        return new JAXBElement<DownloadConfig>(_DownloadConfig_QNAME, DownloadConfig.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadConfigResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DownloadConfigResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schneider.com/bll/ws/", name = "downloadConfigResponse")
    public JAXBElement<DownloadConfigResponse> createDownloadConfigResponse(DownloadConfigResponse value) {
        return new JAXBElement<DownloadConfigResponse>(_DownloadConfigResponse_QNAME, DownloadConfigResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadPersistedConfig }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DownloadPersistedConfig }{@code >}
     */
    @XmlElementDecl(namespace = "http://schneider.com/bll/ws/", name = "downloadPersistedConfig")
    public JAXBElement<DownloadPersistedConfig> createDownloadPersistedConfig(DownloadPersistedConfig value) {
        return new JAXBElement<DownloadPersistedConfig>(_DownloadPersistedConfig_QNAME, DownloadPersistedConfig.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadPersistedConfigResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DownloadPersistedConfigResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schneider.com/bll/ws/", name = "downloadPersistedConfigResponse")
    public JAXBElement<DownloadPersistedConfigResponse> createDownloadPersistedConfigResponse(DownloadPersistedConfigResponse value) {
        return new JAXBElement<DownloadPersistedConfigResponse>(_DownloadPersistedConfigResponse_QNAME, DownloadPersistedConfigResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadPersistedConfigService }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DownloadPersistedConfigService }{@code >}
     */
    @XmlElementDecl(namespace = "http://schneider.com/bll/ws/", name = "downloadPersistedConfigService")
    public JAXBElement<DownloadPersistedConfigService> createDownloadPersistedConfigService(DownloadPersistedConfigService value) {
        return new JAXBElement<DownloadPersistedConfigService>(_DownloadPersistedConfigService_QNAME, DownloadPersistedConfigService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadPersistedConfigServiceResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DownloadPersistedConfigServiceResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schneider.com/bll/ws/", name = "downloadPersistedConfigServiceResponse")
    public JAXBElement<DownloadPersistedConfigServiceResponse> createDownloadPersistedConfigServiceResponse(DownloadPersistedConfigServiceResponse value) {
        return new JAXBElement<DownloadPersistedConfigServiceResponse>(_DownloadPersistedConfigServiceResponse_QNAME, DownloadPersistedConfigServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadPersistedConfigZip }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DownloadPersistedConfigZip }{@code >}
     */
    @XmlElementDecl(namespace = "http://schneider.com/bll/ws/", name = "downloadPersistedConfigZip")
    public JAXBElement<DownloadPersistedConfigZip> createDownloadPersistedConfigZip(DownloadPersistedConfigZip value) {
        return new JAXBElement<DownloadPersistedConfigZip>(_DownloadPersistedConfigZip_QNAME, DownloadPersistedConfigZip.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadPersistedConfigZipResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DownloadPersistedConfigZipResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schneider.com/bll/ws/", name = "downloadPersistedConfigZipResponse")
    public JAXBElement<DownloadPersistedConfigZipResponse> createDownloadPersistedConfigZipResponse(DownloadPersistedConfigZipResponse value) {
        return new JAXBElement<DownloadPersistedConfigZipResponse>(_DownloadPersistedConfigZipResponse_QNAME, DownloadPersistedConfigZipResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FreezeConfig }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FreezeConfig }{@code >}
     */
    @XmlElementDecl(namespace = "http://schneider.com/bll/ws/", name = "freezeConfig")
    public JAXBElement<FreezeConfig> createFreezeConfig(FreezeConfig value) {
        return new JAXBElement<FreezeConfig>(_FreezeConfig_QNAME, FreezeConfig.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FreezeConfigResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FreezeConfigResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schneider.com/bll/ws/", name = "freezeConfigResponse")
    public JAXBElement<FreezeConfigResponse> createFreezeConfigResponse(FreezeConfigResponse value) {
        return new JAXBElement<FreezeConfigResponse>(_FreezeConfigResponse_QNAME, FreezeConfigResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConfiguration }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetConfiguration }{@code >}
     */
    @XmlElementDecl(namespace = "http://schneider.com/bll/ws/", name = "getConfiguration")
    public JAXBElement<GetConfiguration> createGetConfiguration(GetConfiguration value) {
        return new JAXBElement<GetConfiguration>(_GetConfiguration_QNAME, GetConfiguration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConfigurationResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetConfigurationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schneider.com/bll/ws/", name = "getConfigurationResponse")
    public JAXBElement<GetConfigurationResponse> createGetConfigurationResponse(GetConfigurationResponse value) {
        return new JAXBElement<GetConfigurationResponse>(_GetConfigurationResponse_QNAME, GetConfigurationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDUs }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDUs }{@code >}
     */
    @XmlElementDecl(namespace = "http://schneider.com/bll/ws/", name = "getDUs")
    public JAXBElement<GetDUs> createGetDUs(GetDUs value) {
        return new JAXBElement<GetDUs>(_GetDUs_QNAME, GetDUs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDUsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDUsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schneider.com/bll/ws/", name = "getDUsResponse")
    public JAXBElement<GetDUsResponse> createGetDUsResponse(GetDUsResponse value) {
        return new JAXBElement<GetDUsResponse>(_GetDUsResponse_QNAME, GetDUsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFavs }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetFavs }{@code >}
     */
    @XmlElementDecl(namespace = "http://schneider.com/bll/ws/", name = "getFavs")
    public JAXBElement<GetFavs> createGetFavs(GetFavs value) {
        return new JAXBElement<GetFavs>(_GetFavs_QNAME, GetFavs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFavsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetFavsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schneider.com/bll/ws/", name = "getFavsResponse")
    public JAXBElement<GetFavsResponse> createGetFavsResponse(GetFavsResponse value) {
        return new JAXBElement<GetFavsResponse>(_GetFavsResponse_QNAME, GetFavsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGUID }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetGUID }{@code >}
     */
    @XmlElementDecl(namespace = "http://schneider.com/bll/ws/", name = "getGUID")
    public JAXBElement<GetGUID> createGetGUID(GetGUID value) {
        return new JAXBElement<GetGUID>(_GetGUID_QNAME, GetGUID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGUIDResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetGUIDResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schneider.com/bll/ws/", name = "getGUIDResponse")
    public JAXBElement<GetGUIDResponse> createGetGUIDResponse(GetGUIDResponse value) {
        return new JAXBElement<GetGUIDResponse>(_GetGUIDResponse_QNAME, GetGUIDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHiveXml }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetHiveXml }{@code >}
     */
    @XmlElementDecl(namespace = "http://schneider.com/bll/ws/", name = "getHiveXml")
    public JAXBElement<GetHiveXml> createGetHiveXml(GetHiveXml value) {
        return new JAXBElement<GetHiveXml>(_GetHiveXml_QNAME, GetHiveXml.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHiveXmlResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetHiveXmlResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schneider.com/bll/ws/", name = "getHiveXmlResponse")
    public JAXBElement<GetHiveXmlResponse> createGetHiveXmlResponse(GetHiveXmlResponse value) {
        return new JAXBElement<GetHiveXmlResponse>(_GetHiveXmlResponse_QNAME, GetHiveXmlResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHiveZip }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetHiveZip }{@code >}
     */
    @XmlElementDecl(namespace = "http://schneider.com/bll/ws/", name = "getHiveZip")
    public JAXBElement<GetHiveZip> createGetHiveZip(GetHiveZip value) {
        return new JAXBElement<GetHiveZip>(_GetHiveZip_QNAME, GetHiveZip.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHiveZipResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetHiveZipResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schneider.com/bll/ws/", name = "getHiveZipResponse")
    public JAXBElement<GetHiveZipResponse> createGetHiveZipResponse(GetHiveZipResponse value) {
        return new JAXBElement<GetHiveZipResponse>(_GetHiveZipResponse_QNAME, GetHiveZipResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersistedConfig }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPersistedConfig }{@code >}
     */
    @XmlElementDecl(namespace = "http://schneider.com/bll/ws/", name = "getPersistedConfig")
    public JAXBElement<GetPersistedConfig> createGetPersistedConfig(GetPersistedConfig value) {
        return new JAXBElement<GetPersistedConfig>(_GetPersistedConfig_QNAME, GetPersistedConfig.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersistedConfigResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPersistedConfigResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schneider.com/bll/ws/", name = "getPersistedConfigResponse")
    public JAXBElement<GetPersistedConfigResponse> createGetPersistedConfigResponse(GetPersistedConfigResponse value) {
        return new JAXBElement<GetPersistedConfigResponse>(_GetPersistedConfigResponse_QNAME, GetPersistedConfigResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRefsByDU }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetRefsByDU }{@code >}
     */
    @XmlElementDecl(namespace = "http://schneider.com/bll/ws/", name = "getRefsByDU")
    public JAXBElement<GetRefsByDU> createGetRefsByDU(GetRefsByDU value) {
        return new JAXBElement<GetRefsByDU>(_GetRefsByDU_QNAME, GetRefsByDU.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRefsByDUResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetRefsByDUResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schneider.com/bll/ws/", name = "getRefsByDUResponse")
    public JAXBElement<GetRefsByDUResponse> createGetRefsByDUResponse(GetRefsByDUResponse value) {
        return new JAXBElement<GetRefsByDUResponse>(_GetRefsByDUResponse_QNAME, GetRefsByDUResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStatus }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetStatus }{@code >}
     */
    @XmlElementDecl(namespace = "http://schneider.com/bll/ws/", name = "getStatus")
    public JAXBElement<GetStatus> createGetStatus(GetStatus value) {
        return new JAXBElement<GetStatus>(_GetStatus_QNAME, GetStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStatusResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetStatusResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schneider.com/bll/ws/", name = "getStatusResponse")
    public JAXBElement<GetStatusResponse> createGetStatusResponse(GetStatusResponse value) {
        return new JAXBElement<GetStatusResponse>(_GetStatusResponse_QNAME, GetStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWSVersion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetWSVersion }{@code >}
     */
    @XmlElementDecl(namespace = "http://schneider.com/bll/ws/", name = "getWSVersion")
    public JAXBElement<GetWSVersion> createGetWSVersion(GetWSVersion value) {
        return new JAXBElement<GetWSVersion>(_GetWSVersion_QNAME, GetWSVersion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWSVersionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetWSVersionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schneider.com/bll/ws/", name = "getWSVersionResponse")
    public JAXBElement<GetWSVersionResponse> createGetWSVersionResponse(GetWSVersionResponse value) {
        return new JAXBElement<GetWSVersionResponse>(_GetWSVersionResponse_QNAME, GetWSVersionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Heartbeat }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Heartbeat }{@code >}
     */
    @XmlElementDecl(namespace = "http://schneider.com/bll/ws/", name = "heartbeat")
    public JAXBElement<Heartbeat> createHeartbeat(Heartbeat value) {
        return new JAXBElement<Heartbeat>(_Heartbeat_QNAME, Heartbeat.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HeartbeatResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HeartbeatResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schneider.com/bll/ws/", name = "heartbeatResponse")
    public JAXBElement<HeartbeatResponse> createHeartbeatResponse(HeartbeatResponse value) {
        return new JAXBElement<HeartbeatResponse>(_HeartbeatResponse_QNAME, HeartbeatResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveFav }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveFav }{@code >}
     */
    @XmlElementDecl(namespace = "http://schneider.com/bll/ws/", name = "removeFav")
    public JAXBElement<RemoveFav> createRemoveFav(RemoveFav value) {
        return new JAXBElement<RemoveFav>(_RemoveFav_QNAME, RemoveFav.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveFavResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveFavResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schneider.com/bll/ws/", name = "removeFavResponse")
    public JAXBElement<RemoveFavResponse> createRemoveFavResponse(RemoveFavResponse value) {
        return new JAXBElement<RemoveFavResponse>(_RemoveFavResponse_QNAME, RemoveFavResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResetConfig }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResetConfig }{@code >}
     */
    @XmlElementDecl(namespace = "http://schneider.com/bll/ws/", name = "resetConfig")
    public JAXBElement<ResetConfig> createResetConfig(ResetConfig value) {
        return new JAXBElement<ResetConfig>(_ResetConfig_QNAME, ResetConfig.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResetConfigResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResetConfigResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schneider.com/bll/ws/", name = "resetConfigResponse")
    public JAXBElement<ResetConfigResponse> createResetConfigResponse(ResetConfigResponse value) {
        return new JAXBElement<ResetConfigResponse>(_ResetConfigResponse_QNAME, ResetConfigResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveConfig }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SaveConfig }{@code >}
     */
    @XmlElementDecl(namespace = "http://schneider.com/bll/ws/", name = "saveConfig")
    public JAXBElement<SaveConfig> createSaveConfig(SaveConfig value) {
        return new JAXBElement<SaveConfig>(_SaveConfig_QNAME, SaveConfig.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveConfigResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SaveConfigResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schneider.com/bll/ws/", name = "saveConfigResponse")
    public JAXBElement<SaveConfigResponse> createSaveConfigResponse(SaveConfigResponse value) {
        return new JAXBElement<SaveConfigResponse>(_SaveConfigResponse_QNAME, SaveConfigResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetCstic }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetCstic }{@code >}
     */
    @XmlElementDecl(namespace = "http://schneider.com/bll/ws/", name = "setCstic")
    public JAXBElement<SetCstic> createSetCstic(SetCstic value) {
        return new JAXBElement<SetCstic>(_SetCstic_QNAME, SetCstic.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetCsticResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetCsticResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schneider.com/bll/ws/", name = "setCsticResponse")
    public JAXBElement<SetCsticResponse> createSetCsticResponse(SetCsticResponse value) {
        return new JAXBElement<SetCsticResponse>(_SetCsticResponse_QNAME, SetCsticResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetCsticWhenPossible }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetCsticWhenPossible }{@code >}
     */
    @XmlElementDecl(namespace = "http://schneider.com/bll/ws/", name = "setCsticWhenPossible")
    public JAXBElement<SetCsticWhenPossible> createSetCsticWhenPossible(SetCsticWhenPossible value) {
        return new JAXBElement<SetCsticWhenPossible>(_SetCsticWhenPossible_QNAME, SetCsticWhenPossible.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetCsticWhenPossibleResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetCsticWhenPossibleResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schneider.com/bll/ws/", name = "setCsticWhenPossibleResponse")
    public JAXBElement<SetCsticWhenPossibleResponse> createSetCsticWhenPossibleResponse(SetCsticWhenPossibleResponse value) {
        return new JAXBElement<SetCsticWhenPossibleResponse>(_SetCsticWhenPossibleResponse_QNAME, SetCsticWhenPossibleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetCstics }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetCstics }{@code >}
     */
    @XmlElementDecl(namespace = "http://schneider.com/bll/ws/", name = "setCstics")
    public JAXBElement<SetCstics> createSetCstics(SetCstics value) {
        return new JAXBElement<SetCstics>(_SetCstics_QNAME, SetCstics.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetCsticsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetCsticsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schneider.com/bll/ws/", name = "setCsticsResponse")
    public JAXBElement<SetCsticsResponse> createSetCsticsResponse(SetCsticsResponse value) {
        return new JAXBElement<SetCsticsResponse>(_SetCsticsResponse_QNAME, SetCsticsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetFav }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetFav }{@code >}
     */
    @XmlElementDecl(namespace = "http://schneider.com/bll/ws/", name = "setFav")
    public JAXBElement<SetFav> createSetFav(SetFav value) {
        return new JAXBElement<SetFav>(_SetFav_QNAME, SetFav.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetFavResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetFavResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schneider.com/bll/ws/", name = "setFavResponse")
    public JAXBElement<SetFavResponse> createSetFavResponse(SetFavResponse value) {
        return new JAXBElement<SetFavResponse>(_SetFavResponse_QNAME, SetFavResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetIedCstics }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetIedCstics }{@code >}
     */
    @XmlElementDecl(namespace = "http://schneider.com/bll/ws/", name = "setIedCstics")
    public JAXBElement<SetIedCstics> createSetIedCstics(SetIedCstics value) {
        return new JAXBElement<SetIedCstics>(_SetIedCstics_QNAME, SetIedCstics.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetIedCsticsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetIedCsticsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schneider.com/bll/ws/", name = "setIedCsticsResponse")
    public JAXBElement<SetIedCsticsResponse> createSetIedCsticsResponse(SetIedCsticsResponse value) {
        return new JAXBElement<SetIedCsticsResponse>(_SetIedCsticsResponse_QNAME, SetIedCsticsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetLabelCstics }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetLabelCstics }{@code >}
     */
    @XmlElementDecl(namespace = "http://schneider.com/bll/ws/", name = "setLabelCstics")
    public JAXBElement<SetLabelCstics> createSetLabelCstics(SetLabelCstics value) {
        return new JAXBElement<SetLabelCstics>(_SetLabelCstics_QNAME, SetLabelCstics.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetLabelCsticsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetLabelCsticsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schneider.com/bll/ws/", name = "setLabelCsticsResponse")
    public JAXBElement<SetLabelCsticsResponse> createSetLabelCsticsResponse(SetLabelCsticsResponse value) {
        return new JAXBElement<SetLabelCsticsResponse>(_SetLabelCsticsResponse_QNAME, SetLabelCsticsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateFav }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateFav }{@code >}
     */
    @XmlElementDecl(namespace = "http://schneider.com/bll/ws/", name = "updateFav")
    public JAXBElement<UpdateFav> createUpdateFav(UpdateFav value) {
        return new JAXBElement<UpdateFav>(_UpdateFav_QNAME, UpdateFav.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateFavResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateFavResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schneider.com/bll/ws/", name = "updateFavResponse")
    public JAXBElement<UpdateFavResponse> createUpdateFavResponse(UpdateFavResponse value) {
        return new JAXBElement<UpdateFavResponse>(_UpdateFavResponse_QNAME, UpdateFavResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadConfig }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UploadConfig }{@code >}
     */
    @XmlElementDecl(namespace = "http://schneider.com/bll/ws/", name = "uploadConfig")
    public JAXBElement<UploadConfig> createUploadConfig(UploadConfig value) {
        return new JAXBElement<UploadConfig>(_UploadConfig_QNAME, UploadConfig.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadConfigResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UploadConfigResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schneider.com/bll/ws/", name = "uploadConfigResponse")
    public JAXBElement<UploadConfigResponse> createUploadConfigResponse(UploadConfigResponse value) {
        return new JAXBElement<UploadConfigResponse>(_UploadConfigResponse_QNAME, UploadConfigResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadConfigZip }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UploadConfigZip }{@code >}
     */
    @XmlElementDecl(namespace = "http://schneider.com/bll/ws/", name = "uploadConfigZip")
    public JAXBElement<UploadConfigZip> createUploadConfigZip(UploadConfigZip value) {
        return new JAXBElement<UploadConfigZip>(_UploadConfigZip_QNAME, UploadConfigZip.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadConfigZipResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UploadConfigZipResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schneider.com/bll/ws/", name = "uploadConfigZipResponse")
    public JAXBElement<UploadConfigZipResponse> createUploadConfigZipResponse(UploadConfigZipResponse value) {
        return new JAXBElement<UploadConfigZipResponse>(_UploadConfigZipResponse_QNAME, UploadConfigZipResponse.class, null, value);
    }

}
