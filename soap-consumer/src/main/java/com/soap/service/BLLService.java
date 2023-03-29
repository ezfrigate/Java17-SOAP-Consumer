package com.soap.service;

import com.schneider.selectconfig.business.tiers.bllConf_generated.Nodes;
import com.schneider.selectconfig.business.tiers.ssc.*;

public interface BLLService {

    Nodes createConfigFromRefForDu(CreateConfigFromRefForDu createConfigFromRefForDuRequest);

    Nodes createConfigAndInitFromRef(CreateConfigAndInitFromRef createConfigAndInitFromRef);

    String deleteConfig(String configId);

    Nodes createConfigForKB(CreateConfigForKB createConfigForKBRequest);

    Nodes deleteCstic(DeleteCstic deleteCsticRequest);

    Nodes deleteCstics(DeleteCstics deleteCsticsRequest);

    Nodes deleteCsticValue(DeleteCsticValue deleteCsticValueRequest);

    Nodes deletePersistedConfig(DeletePersistedConfig deletePersistedConfigRequest);

    Nodes downloadConfig(DownloadConfig downloadConfigRequest);

    Nodes downloadPersistedConfig(DownloadPersistedConfig downloadPersistedConfig);

    Nodes downloadPersistedConfigService(DownloadPersistedConfigService downloadPersistedConfigServiceRequest);

    Nodes downloadPersistedConfigZip(DownloadPersistedConfigZip downloadPersistedConfigZipRequest);

    Nodes freezeConfig(FreezeConfig freezeConfigRequest);

    Nodes getConfiguration(GetConfiguration getConfigurationRequest);

    Nodes getDUs(GetDUs getDUsRequest);

    Nodes getFavs(GetFavs getFavsRequest);

    Nodes getGUID(GetGUID getGUIDRequest);

    Nodes getHiveXml(GetHiveXml getHiveXmlRequest);

    Nodes getHiveZip(GetHiveZip getHiveZipRequest);

    Nodes getRefsByDU(GetRefsByDU getRefsByDURequest);

    Nodes getStatus(GetStatus getStatusRequest);

    Nodes getWSVersion(GetWSVersion getWSVersionRequest);

    Nodes heartbeat(Heartbeat heartbeatRequest);

    Nodes removeFav(RemoveFav removeFavRequest);

    Nodes resetConfig(ResetConfig resetConfigRequest);

    Nodes saveConfig(SaveConfig saveConfigRequest);

    Nodes setCstic(SetCstic setCsticRequest);

    Nodes setCstics(SetCstics setCsticsRequest);

    Nodes setCsticWhenPossible(SetCsticWhenPossible setCsticWhenPossible);

    Nodes setFav(SetFav setFavRequest);

    Nodes setIedCstics(SetIedCstics setIedCsticsRequest);

    Nodes setLabelCstics(SetLabelCstics setLabelCsticsRequest);

    Nodes updateFav(UpdateFav updateFavRequest);

    Nodes uploadConfig(UploadConfig uploadConfigRequest);

    Nodes uploadConfigZip(UploadConfigZip uploadConfigZipRequest);
}
