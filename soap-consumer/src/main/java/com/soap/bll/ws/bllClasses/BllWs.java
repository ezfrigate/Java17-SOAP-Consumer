
package ws.bllClasses;

import java.util.List;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 4.0.0-M4
 * Generated source version: 3.0
 * 
 */
@WebService(name = "BllWs", targetNamespace = "http://schneider.com/bll/ws/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BllWs {


    /**
     * 
     * @param duId
     * @param setDefaults
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "createConfigForDu", targetNamespace = "http://schneider.com/bll/ws/", className = "ws.bllClasses.CreateConfigForDu")
    @ResponseWrapper(localName = "createConfigForDuResponse", targetNamespace = "http://schneider.com/bll/ws/", className = "ws.bllClasses.CreateConfigForDuResponse")
    public String createConfigForDu(
        @WebParam(name = "duId", targetNamespace = "")
        String duId,
        @WebParam(name = "setDefaults", targetNamespace = "")
        String setDefaults);

    /**
     * 
     * @param kbName
     * @param kbVersion
     * @param languageCode
     * @param setDefaults
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "createConfigForKB", targetNamespace = "http://schneider.com/bll/ws/", className = "ws.bllClasses.CreateConfigForKB")
    @ResponseWrapper(localName = "createConfigForKBResponse", targetNamespace = "http://schneider.com/bll/ws/", className = "ws.bllClasses.CreateConfigForKBResponse")
    public String createConfigForKB(
        @WebParam(name = "kbName", targetNamespace = "")
        String kbName,
        @WebParam(name = "kbVersion", targetNamespace = "")
        String kbVersion,
        @WebParam(name = "languageCode", targetNamespace = "")
        String languageCode,
        @WebParam(name = "setDefaults", targetNamespace = "")
        String setDefaults);

    /**
     * 
     * @param setCstics
     * @param kbName
     * @param hardset
     * @param kbVersion
     * @param languageCode
     * @param setDefaults
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "createConfigFromRef", targetNamespace = "http://schneider.com/bll/ws/", className = "ws.bllClasses.CreateConfigFromRef")
    @ResponseWrapper(localName = "createConfigFromRefResponse", targetNamespace = "http://schneider.com/bll/ws/", className = "ws.bllClasses.CreateConfigFromRefResponse")
    public String createConfigFromRef(
        @WebParam(name = "kbName", targetNamespace = "")
        String kbName,
        @WebParam(name = "kbVersion", targetNamespace = "")
        String kbVersion,
        @WebParam(name = "languageCode", targetNamespace = "")
        String languageCode,
        @WebParam(name = "setCstics", targetNamespace = "")
        List<SetCsticDef> setCstics,
        @WebParam(name = "hardset", targetNamespace = "")
        String hardset,
        @WebParam(name = "setDefaults", targetNamespace = "")
        String setDefaults);

    /**
     * 
     * @param setCstics
     * @param duId
     * @param hardset
     * @param setDefaults
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "createConfigFromRefForDu", targetNamespace = "http://schneider.com/bll/ws/", className = "ws.bllClasses.CreateConfigFromRefForDu")
    @ResponseWrapper(localName = "createConfigFromRefForDuResponse", targetNamespace = "http://schneider.com/bll/ws/", className = "ws.bllClasses.CreateConfigFromRefForDuResponse")
    public String createConfigFromRefForDu(
        @WebParam(name = "duId", targetNamespace = "")
        String duId,
        @WebParam(name = "setCstics", targetNamespace = "")
        List<SetCsticDef> setCstics,
        @WebParam(name = "hardset", targetNamespace = "")
        String hardset,
        @WebParam(name = "setDefaults", targetNamespace = "")
        String setDefaults);

    /**
     * 
     * @param configId
     */
    @WebMethod
    @RequestWrapper(localName = "deleteConfig", targetNamespace = "http://schneider.com/bll/ws/", className = "ws.bllClasses.DeleteConfig")
    @ResponseWrapper(localName = "deleteConfigResponse", targetNamespace = "http://schneider.com/bll/ws/", className = "ws.bllClasses.DeleteConfigResponse")
    public void deleteConfig(
        @WebParam(name = "configId", targetNamespace = "")
        String configId);

    /**
     * 
     * @param csticId
     * @param bompath
     * @param configId
     * @param autoUnsetUserHiddenCstics
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteCstic", targetNamespace = "http://schneider.com/bll/ws/", className = "ws.bllClasses.DeleteCstic")
    @ResponseWrapper(localName = "deleteCsticResponse", targetNamespace = "http://schneider.com/bll/ws/", className = "ws.bllClasses.DeleteCsticResponse")
    public String deleteCstic(
        @WebParam(name = "configId", targetNamespace = "")
        String configId,
        @WebParam(name = "bompath", targetNamespace = "")
        String bompath,
        @WebParam(name = "csticId", targetNamespace = "")
        String csticId,
        @WebParam(name = "autoUnsetUserHiddenCstics", targetNamespace = "")
        String autoUnsetUserHiddenCstics);

    /**
     * 
     * @param setCstics
     * @param configId
     * @param autoUnsetUserHiddenCstics
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteCstics", targetNamespace = "http://schneider.com/bll/ws/", className = "ws.bllClasses.DeleteCstics")
    @ResponseWrapper(localName = "deleteCsticsResponse", targetNamespace = "http://schneider.com/bll/ws/", className = "ws.bllClasses.DeleteCsticsResponse")
    public String deleteCstics(
        @WebParam(name = "configId", targetNamespace = "")
        String configId,
        @WebParam(name = "setCstics", targetNamespace = "")
        List<SetCsticDef> setCstics,
        @WebParam(name = "autoUnsetUserHiddenCstics", targetNamespace = "")
        String autoUnsetUserHiddenCstics);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getWSVersion", targetNamespace = "http://schneider.com/bll/ws/", className = "ws.bllClasses.GetWSVersion")
    @ResponseWrapper(localName = "getWSVersionResponse", targetNamespace = "http://schneider.com/bll/ws/", className = "ws.bllClasses.GetWSVersionResponse")
    public String getWSVersion();

    /**
     * 
     * @param configId
     * @param lang
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getConfiguration", targetNamespace = "http://schneider.com/bll/ws/", className = "ws.bllClasses.GetConfiguration")
    @ResponseWrapper(localName = "getConfigurationResponse", targetNamespace = "http://schneider.com/bll/ws/", className = "ws.bllClasses.GetConfigurationResponse")
    public String getConfiguration(
        @WebParam(name = "configId", targetNamespace = "")
        String configId,
        @WebParam(name = "lang", targetNamespace = "")
        String lang);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getDUs", targetNamespace = "http://schneider.com/bll/ws/", className = "ws.bllClasses.GetDUs")
    @ResponseWrapper(localName = "getDUsResponse", targetNamespace = "http://schneider.com/bll/ws/", className = "ws.bllClasses.GetDUsResponse")
    public String getDUs();

    /**
     * 
     * @param country
     * @param duStatus
     * @param duBuild
     * @param projectCode
     * @param duVersion
     * @param stdVersion
     * @param scope
     * @param language
     * @param duCode
     * @param aliasCode
     * @param kbCode
     * @param projectVersion
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getGUID", targetNamespace = "http://schneider.com/bll/ws/", className = "ws.bllClasses.GetGUID")
    @ResponseWrapper(localName = "getGUIDResponse", targetNamespace = "http://schneider.com/bll/ws/", className = "ws.bllClasses.GetGUIDResponse")
    public String getGUID(
        @WebParam(name = "du_code", targetNamespace = "")
        String duCode,
        @WebParam(name = "kb_code", targetNamespace = "")
        String kbCode,
        @WebParam(name = "scope", targetNamespace = "")
        String scope,
        @WebParam(name = "language", targetNamespace = "")
        String language,
        @WebParam(name = "alias_code", targetNamespace = "")
        String aliasCode,
        @WebParam(name = "project_code", targetNamespace = "")
        String projectCode,
        @WebParam(name = "du_status", targetNamespace = "")
        String duStatus,
        @WebParam(name = "du_build", targetNamespace = "")
        String duBuild,
        @WebParam(name = "du_version", targetNamespace = "")
        String duVersion,
        @WebParam(name = "std_version", targetNamespace = "")
        String stdVersion,
        @WebParam(name = "project_version", targetNamespace = "")
        String projectVersion,
        @WebParam(name = "country", targetNamespace = "")
        String country);

    /**
     * 
     * @param configId
     * @param type
     * @param setDefaults
     * @param headerReplacement
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getHiveXml", targetNamespace = "http://schneider.com/bll/ws/", className = "ws.bllClasses.GetHiveXml")
    @ResponseWrapper(localName = "getHiveXmlResponse", targetNamespace = "http://schneider.com/bll/ws/", className = "ws.bllClasses.GetHiveXmlResponse")
    public String getHiveXml(
        @WebParam(name = "configId", targetNamespace = "")
        String configId,
        @WebParam(name = "type", targetNamespace = "")
        String type,
        @WebParam(name = "headerReplacement", targetNamespace = "")
        String headerReplacement,
        @WebParam(name = "setDefaults", targetNamespace = "")
        String setDefaults);

    /**
     * 
     * @param configId
     * @param type
     * @param setDefaults
     * @param headerReplacement
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getHiveZip", targetNamespace = "http://schneider.com/bll/ws/", className = "ws.bllClasses.GetHiveZip")
    @ResponseWrapper(localName = "getHiveZipResponse", targetNamespace = "http://schneider.com/bll/ws/", className = "ws.bllClasses.GetHiveZipResponse")
    public String getHiveZip(
        @WebParam(name = "configId", targetNamespace = "")
        String configId,
        @WebParam(name = "type", targetNamespace = "")
        String type,
        @WebParam(name = "headerReplacement", targetNamespace = "")
        String headerReplacement,
        @WebParam(name = "setDefaults", targetNamespace = "")
        String setDefaults);

    /**
     * 
     * @param guid
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getRefsByDU", targetNamespace = "http://schneider.com/bll/ws/", className = "ws.bllClasses.GetRefsByDU")
    @ResponseWrapper(localName = "getRefsByDUResponse", targetNamespace = "http://schneider.com/bll/ws/", className = "ws.bllClasses.GetRefsByDUResponse")
    public String getRefsByDU(
        @WebParam(name = "guid", targetNamespace = "")
        String guid);

    /**
     * 
     * @param configId
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "resetConfig", targetNamespace = "http://schneider.com/bll/ws/", className = "ws.bllClasses.ResetConfig")
    @ResponseWrapper(localName = "resetConfigResponse", targetNamespace = "http://schneider.com/bll/ws/", className = "ws.bllClasses.ResetConfigResponse")
    public String resetConfig(
        @WebParam(name = "configId", targetNamespace = "")
        String configId);

    /**
     * 
     * @param valueId
     * @param csticId
     * @param bompath
     * @param configId
     * @param autoUnsetUserHiddenCstics
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "setCstic", targetNamespace = "http://schneider.com/bll/ws/", className = "ws.bllClasses.SetCstic")
    @ResponseWrapper(localName = "setCsticResponse", targetNamespace = "http://schneider.com/bll/ws/", className = "ws.bllClasses.SetCsticResponse")
    public String setCstic(
        @WebParam(name = "configId", targetNamespace = "")
        String configId,
        @WebParam(name = "bompath", targetNamespace = "")
        String bompath,
        @WebParam(name = "csticId", targetNamespace = "")
        String csticId,
        @WebParam(name = "valueId", targetNamespace = "")
        String valueId,
        @WebParam(name = "autoUnsetUserHiddenCstics", targetNamespace = "")
        String autoUnsetUserHiddenCstics);

    /**
     * 
     * @param valueId
     * @param csticId
     * @param bompath
     * @param configId
     * @param autoUnsetUserHiddenCstics
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteCsticValue", targetNamespace = "http://schneider.com/bll/ws/", className = "ws.bllClasses.DeleteCsticValue")
    @ResponseWrapper(localName = "deleteCsticValueResponse", targetNamespace = "http://schneider.com/bll/ws/", className = "ws.bllClasses.DeleteCsticValueResponse")
    public String deleteCsticValue(
        @WebParam(name = "configId", targetNamespace = "")
        String configId,
        @WebParam(name = "bompath", targetNamespace = "")
        String bompath,
        @WebParam(name = "csticId", targetNamespace = "")
        String csticId,
        @WebParam(name = "valueId", targetNamespace = "")
        String valueId,
        @WebParam(name = "autoUnsetUserHiddenCstics", targetNamespace = "")
        String autoUnsetUserHiddenCstics);

    /**
     * 
     * @param setCstics
     * @param configId
     * @param autoUnsetUserHiddenCstics
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "setCstics", targetNamespace = "http://schneider.com/bll/ws/", className = "ws.bllClasses.SetCstics")
    @ResponseWrapper(localName = "setCsticsResponse", targetNamespace = "http://schneider.com/bll/ws/", className = "ws.bllClasses.SetCsticsResponse")
    public String setCstics(
        @WebParam(name = "configId", targetNamespace = "")
        String configId,
        @WebParam(name = "setCstics", targetNamespace = "")
        List<SetCsticDef> setCstics,
        @WebParam(name = "autoUnsetUserHiddenCstics", targetNamespace = "")
        String autoUnsetUserHiddenCstics);

    /**
     * 
     * @param setCstics
     * @param configId
     * @param autoUnsetUserHiddenCstics
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "setCsticWhenPossible", targetNamespace = "http://schneider.com/bll/ws/", className = "ws.bllClasses.SetCsticWhenPossible")
    @ResponseWrapper(localName = "setCsticWhenPossibleResponse", targetNamespace = "http://schneider.com/bll/ws/", className = "ws.bllClasses.SetCsticWhenPossibleResponse")
    public String setCsticWhenPossible(
        @WebParam(name = "configId", targetNamespace = "")
        String configId,
        @WebParam(name = "setCstics", targetNamespace = "")
        List<SetCsticDef> setCstics,
        @WebParam(name = "autoUnsetUserHiddenCstics", targetNamespace = "")
        String autoUnsetUserHiddenCstics);

    /**
     * 
     * @param setCstics
     * @param configId
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "setLabelCstics", targetNamespace = "http://schneider.com/bll/ws/", className = "ws.bllClasses.SetLabelCstics")
    @ResponseWrapper(localName = "setLabelCsticsResponse", targetNamespace = "http://schneider.com/bll/ws/", className = "ws.bllClasses.SetLabelCsticsResponse")
    public String setLabelCstics(
        @WebParam(name = "configId", targetNamespace = "")
        String configId,
        @WebParam(name = "setCstics", targetNamespace = "")
        List<SetCsticDef> setCstics);

    /**
     * 
     * @param persistedConfigId
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getStatus", targetNamespace = "http://schneider.com/bll/ws/", className = "ws.bllClasses.GetStatus")
    @ResponseWrapper(localName = "getStatusResponse", targetNamespace = "http://schneider.com/bll/ws/", className = "ws.bllClasses.GetStatusResponse")
    public String getStatus(
        @WebParam(name = "persistedConfigId", targetNamespace = "")
        String persistedConfigId);

    /**
     * 
     * @param persistedConfigId
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "downloadPersistedConfig", targetNamespace = "http://schneider.com/bll/ws/", className = "ws.bllClasses.DownloadPersistedConfig")
    @ResponseWrapper(localName = "downloadPersistedConfigResponse", targetNamespace = "http://schneider.com/bll/ws/", className = "ws.bllClasses.DownloadPersistedConfigResponse")
    public String downloadPersistedConfig(
        @WebParam(name = "persistedConfigId", targetNamespace = "")
        String persistedConfigId);

    /**
     * 
     * @param persistedConfigId
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "downloadPersistedConfigZip", targetNamespace = "http://schneider.com/bll/ws/", className = "ws.bllClasses.DownloadPersistedConfigZip")
    @ResponseWrapper(localName = "downloadPersistedConfigZipResponse", targetNamespace = "http://schneider.com/bll/ws/", className = "ws.bllClasses.DownloadPersistedConfigZipResponse")
    public String downloadPersistedConfigZip(
        @WebParam(name = "persistedConfigId", targetNamespace = "")
        String persistedConfigId);

    /**
     * 
     * @param persistedConfigId
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "freezeConfig", targetNamespace = "http://schneider.com/bll/ws/", className = "ws.bllClasses.FreezeConfig")
    @ResponseWrapper(localName = "freezeConfigResponse", targetNamespace = "http://schneider.com/bll/ws/", className = "ws.bllClasses.FreezeConfigResponse")
    public String freezeConfig(
        @WebParam(name = "persistedConfigId", targetNamespace = "")
        String persistedConfigId);

    /**
     * 
     * @param persistedConfigId
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "downloadPersistedConfigService", targetNamespace = "http://schneider.com/bll/ws/", className = "ws.bllClasses.DownloadPersistedConfigService")
    @ResponseWrapper(localName = "downloadPersistedConfigServiceResponse", targetNamespace = "http://schneider.com/bll/ws/", className = "ws.bllClasses.DownloadPersistedConfigServiceResponse")
    public String downloadPersistedConfigService(
        @WebParam(name = "persistedConfigId", targetNamespace = "")
        String persistedConfigId);

    /**
     * 
     * @param configId
     * @param persistedConfigId
     * @param type
     * @param userId
     * @param setDefaults
     * @param headerReplacement
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "saveConfig", targetNamespace = "http://schneider.com/bll/ws/", className = "ws.bllClasses.SaveConfig")
    @ResponseWrapper(localName = "saveConfigResponse", targetNamespace = "http://schneider.com/bll/ws/", className = "ws.bllClasses.SaveConfigResponse")
    public String saveConfig(
        @WebParam(name = "configId", targetNamespace = "")
        String configId,
        @WebParam(name = "userId", targetNamespace = "")
        String userId,
        @WebParam(name = "persistedConfigId", targetNamespace = "")
        String persistedConfigId,
        @WebParam(name = "type", targetNamespace = "")
        String type,
        @WebParam(name = "headerReplacement", targetNamespace = "")
        String headerReplacement,
        @WebParam(name = "setDefaults", targetNamespace = "")
        String setDefaults);

    /**
     * 
     * @param configId
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "downloadConfig", targetNamespace = "http://schneider.com/bll/ws/", className = "ws.bllClasses.DownloadConfig")
    @ResponseWrapper(localName = "downloadConfigResponse", targetNamespace = "http://schneider.com/bll/ws/", className = "ws.bllClasses.DownloadConfigResponse")
    public String downloadConfig(
        @WebParam(name = "configId", targetNamespace = "")
        String configId);

    /**
     * 
     * @param hiveXml
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "uploadConfig", targetNamespace = "http://schneider.com/bll/ws/", className = "ws.bllClasses.UploadConfig")
    @ResponseWrapper(localName = "uploadConfigResponse", targetNamespace = "http://schneider.com/bll/ws/", className = "ws.bllClasses.UploadConfigResponse")
    public String uploadConfig(
        @WebParam(name = "hiveXml", targetNamespace = "")
        String hiveXml);

    /**
     * 
     * @param zipStrEncoded
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "uploadConfigZip", targetNamespace = "http://schneider.com/bll/ws/", className = "ws.bllClasses.UploadConfigZip")
    @ResponseWrapper(localName = "uploadConfigZipResponse", targetNamespace = "http://schneider.com/bll/ws/", className = "ws.bllClasses.UploadConfigZipResponse")
    public String uploadConfigZip(
        @WebParam(name = "zipStrEncoded", targetNamespace = "")
        String zipStrEncoded);

    /**
     * 
     * @param persistedConfigId
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPersistedConfig", targetNamespace = "http://schneider.com/bll/ws/", className = "ws.bllClasses.GetPersistedConfig")
    @ResponseWrapper(localName = "getPersistedConfigResponse", targetNamespace = "http://schneider.com/bll/ws/", className = "ws.bllClasses.GetPersistedConfigResponse")
    public String getPersistedConfig(
        @WebParam(name = "persistedConfigId", targetNamespace = "")
        String persistedConfigId);

    /**
     * 
     * @param configId
     * @param name
     * @param comment
     * @param userId
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "setFav", targetNamespace = "http://schneider.com/bll/ws/", className = "ws.bllClasses.SetFav")
    @ResponseWrapper(localName = "setFavResponse", targetNamespace = "http://schneider.com/bll/ws/", className = "ws.bllClasses.SetFavResponse")
    public String setFav(
        @WebParam(name = "userId", targetNamespace = "")
        String userId,
        @WebParam(name = "configId", targetNamespace = "")
        String configId,
        @WebParam(name = "name", targetNamespace = "")
        String name,
        @WebParam(name = "comment", targetNamespace = "")
        String comment);

    /**
     * 
     * @param productId
     * @param userId
     * @return
     *     returns java.util.List<ws.bllClasses.GetFavsDef>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getFavs", targetNamespace = "http://schneider.com/bll/ws/", className = "ws.bllClasses.GetFavs")
    @ResponseWrapper(localName = "getFavsResponse", targetNamespace = "http://schneider.com/bll/ws/", className = "ws.bllClasses.GetFavsResponse")
    public List<GetFavsDef> getFavs(
        @WebParam(name = "userId", targetNamespace = "")
        String userId,
        @WebParam(name = "productId", targetNamespace = "")
        String productId);

    /**
     * 
     * @param persistedConfigId
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deletePersistedConfig", targetNamespace = "http://schneider.com/bll/ws/", className = "ws.bllClasses.DeletePersistedConfig")
    @ResponseWrapper(localName = "deletePersistedConfigResponse", targetNamespace = "http://schneider.com/bll/ws/", className = "ws.bllClasses.DeletePersistedConfigResponse")
    public String deletePersistedConfig(
        @WebParam(name = "persistedConfigId", targetNamespace = "")
        String persistedConfigId);

    /**
     * 
     * @param persistedConfigId
     * @param userId
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "removeFav", targetNamespace = "http://schneider.com/bll/ws/", className = "ws.bllClasses.RemoveFav")
    @ResponseWrapper(localName = "removeFavResponse", targetNamespace = "http://schneider.com/bll/ws/", className = "ws.bllClasses.RemoveFavResponse")
    public String removeFav(
        @WebParam(name = "userId", targetNamespace = "")
        String userId,
        @WebParam(name = "persistedConfigId", targetNamespace = "")
        String persistedConfigId);

    /**
     * 
     * @param configId
     * @param name
     * @param comment
     * @param persistedConfigId
     * @param userId
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateFav", targetNamespace = "http://schneider.com/bll/ws/", className = "ws.bllClasses.UpdateFav")
    @ResponseWrapper(localName = "updateFavResponse", targetNamespace = "http://schneider.com/bll/ws/", className = "ws.bllClasses.UpdateFavResponse")
    public String updateFav(
        @WebParam(name = "userId", targetNamespace = "")
        String userId,
        @WebParam(name = "persistedConfigId", targetNamespace = "")
        String persistedConfigId,
        @WebParam(name = "name", targetNamespace = "")
        String name,
        @WebParam(name = "comment", targetNamespace = "")
        String comment,
        @WebParam(name = "configId", targetNamespace = "")
        String configId);

    /**
     * 
     * @param setCstics
     * @param duId
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "createConfigAndInitFromRef", targetNamespace = "http://schneider.com/bll/ws/", className = "ws.bllClasses.CreateConfigAndInitFromRef")
    @ResponseWrapper(localName = "createConfigAndInitFromRefResponse", targetNamespace = "http://schneider.com/bll/ws/", className = "ws.bllClasses.CreateConfigAndInitFromRefResponse")
    public String createConfigAndInitFromRef(
        @WebParam(name = "duId", targetNamespace = "")
        String duId,
        @WebParam(name = "setCstics", targetNamespace = "")
        List<SetCsticDef> setCstics);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "heartbeat", targetNamespace = "http://schneider.com/bll/ws/", className = "ws.bllClasses.Heartbeat")
    @ResponseWrapper(localName = "heartbeatResponse", targetNamespace = "http://schneider.com/bll/ws/", className = "ws.bllClasses.HeartbeatResponse")
    public String heartbeat();

    /**
     * 
     * @param setCstics
     * @param configId
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "setIedCstics", targetNamespace = "http://schneider.com/bll/ws/", className = "ws.bllClasses.SetIedCstics")
    @ResponseWrapper(localName = "setIedCsticsResponse", targetNamespace = "http://schneider.com/bll/ws/", className = "ws.bllClasses.SetIedCsticsResponse")
    public String setIedCstics(
        @WebParam(name = "configId", targetNamespace = "")
        String configId,
        @WebParam(name = "setCstics", targetNamespace = "")
        List<SetCsticDef> setCstics);

}
