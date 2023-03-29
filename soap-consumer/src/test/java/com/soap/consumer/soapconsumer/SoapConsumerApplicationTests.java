package com.soap.consumer.soapconsumer;

import com.schneider.selectconfig.business.tiers.bllConf_generated.Nodes;
import com.schneider.selectconfig.business.tiers.ssc.CreateConfigForKB;
import com.schneider.selectconfig.business.tiers.ssc.CreateConfigFromRefForDu;
import com.schneider.selectconfig.business.tiers.ssc.GetDUs;
import com.soap.config.BLLClientConfig;
import com.soap.config.BLLWSTemplatesConfig;
import com.soap.config.WebServiceClientInterceptor;
import com.soap.service.BLLService;
import com.soap.service.impl.BLLServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
@ContextConfiguration(classes = {BLLClientConfig.class, BLLWSTemplatesConfig.class, BLLServiceImpl.class, WebServiceClientInterceptor.class})
class SoapConsumerApplicationTests {

	@Autowired
	private BLLService bllService;
	@Test
	void contextLoads() {
	}
	@Test
	void m(){
		CreateConfigForKB createConfigForKB = new CreateConfigForKB();
		createConfigForKB.setKbName("KB_GCR_MTZ2_CB");
		createConfigForKB.setLanguageCode("EN");
		createConfigForKB.setKbVersion("230301.00");
		Nodes nodes = bllService.createConfigForKB(createConfigForKB);
	}
}
